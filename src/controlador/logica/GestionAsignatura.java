package controlador.logica;

import controlador.persistencia.ArchivoCurso;
import controlador.persistencia.ArchivoDocente;
import controlador.persistencia.ArchivoEstudiante;
import controlador.persistencia.ArchivoGrado;
import controlador.persistencia.ArchivoAsignatura;
import controlador.persistencia.ArchivoNota;
import java.util.ArrayList;
import modelo.Asignatura;
import modelo.Curso;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Nota;

public class GestionAsignatura {
    
    ArrayList <Asignatura> asignaturas;
    ArchivoEstudiante archivoEstudiante;
    ArchivoCurso archivoCurso;
    ArchivoAsignatura archivoAsignatura;
    ArchivoDocente archivoDocente;
    ArchivoGrado archivoGrado;
    ArchivoNota archivoNota;

    public GestionAsignatura() {
        this.archivoCurso = new ArchivoCurso();
        this.archivoNota = new ArchivoNota();
        this.archivoAsignatura = new ArchivoAsignatura();
        this.archivoDocente = new ArchivoDocente();
        this.archivoGrado = new ArchivoGrado();
        this.archivoEstudiante = new ArchivoEstudiante();
        defecto();
        cargarDatos();
    }

    public int cantidadDeAsignaturas() {
        return asignaturas.size();
    }

    public String[] asignaturasToStringArray() {
        String asignaturasToString[] = new String[cantidadDeAsignaturas()];
        for (int i = 0; i < asignaturas.size(); i++) {
            asignaturasToString[i] = asignaturas.get(i).getNombre()+" "+asignaturas.get(i).getCodigo();
        }
        return asignaturasToString;
    }
    
    public boolean existeAsignatura(String id) {
         for (int i = 0; i < asignaturas.size(); i++) {
            if (asignaturas.get(i).getCodigo().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public Asignatura crearAsignatura(String id, String nombre, int creditos, Curso curso,Docente docente) {
        Asignatura asignatura= new Asignatura (id,nombre,creditos);
        asignatura.setCursos(curso);
        asignatura.setDocente(docente);
        asignaturas.add(asignatura);    
        archivoAsignatura.ingresarDato(asignatura);
        return asignatura;
    }

    public String[] asignaturasIDToStringArray(int i) {
        Asignatura asignatura = asignaturas.get(i);
        String cursoToString[] = new String[3];
        cursoToString[0] = asignatura.getCodigo();
        cursoToString[1] = asignatura.getNombre();
        cursoToString[2] = asignatura.getCreditos()+"";
        return cursoToString;
    }

    public String asignaturasCreadas() {
        String asignaturasCreadas = "Historial de todas las Asignaturas registradas:\n";
        for (int i = 0; i < asignaturas.size(); i++) {
            asignaturasCreadas += asignaturas.get(i).toString();
        }
        
        return asignaturasCreadas;
    }

    private void cargarDatos() {
        this.asignaturas= archivoAsignatura.obtenerTodosLasAsignaturasForma2();
    }

    private void defecto() {
        Asignatura asignatura = null;
        archivoAsignatura.ingresarDato(asignatura);
    }

    public Nota agregarNotaALaAsignatura(Nota n, String codigoAsignatura){
        if (n != null) {
            for(int x = 0 ; x < asignaturas.size(); x++){
                if(asignaturas.get(x).getCodigo().equals(codigoAsignatura)){
                    n.setAsignaturas(asignaturas.get(x));
                    asignaturas.get(x).getNotas().add(n);
                    Asignatura asignatura = asignaturas.get(x);
                    archivoAsignatura.actualizarDatos(asignatura);
                    archivoNota.actualizarDatos(n);
                    return n;    
                }
            }
        }
        return null;
    }
   
    public Asignatura obtenerAsignatura(int asignaturaID) {
        Asignatura asignatura = asignaturas.get(asignaturaID);
        return asignatura;
    }

    public boolean eliminarDocenteDeLaAsignatura(Docente docente) {
        for(int x = 0 ; x < asignaturas.size(); x++){
            if(asignaturas.get(x).getDocente() != null){
                if(asignaturas.get(x).getDocente().getCodigoCarnet() == docente.getCodigoCarnet()){
                    asignaturas.get(x).setDocente(null);
                    archivoAsignatura.actualizarDatos(asignaturas.get(x));
                }
            }
        }
        return true;
    }  

    public Asignatura obtenerAsignaturaParaModificarla(int asignaturaID) {
        Asignatura asignatura = asignaturas.get(asignaturaID);
        return asignatura;
    }

    public Docente modificarAsignaturaDelDocente(Docente docente, Asignatura asignaturaAnterior, int asignaturaID) {
       // docente.setAsignaturas(asignaturas.get(asignaturaID));
        asignaturas.get(asignaturaID).setDocente(docente);
        archivoDocente.actualizarDatos(docente);
        archivoAsignatura.actualizarDatos(asignaturas.get(asignaturaID));
        for( int x = 0 ;x < asignaturas.size(); x++){
            if(asignaturas.get(x).getCodigo().equals(asignaturaAnterior.getCodigo())){
                asignaturas.get(x).setDocente(null);
                archivoAsignatura.actualizarDatos(asignaturas.get(x));
                break;
            }
        }
        return docente;
    }

}
