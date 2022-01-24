package controlador.logica;

import controlador.persistencia.ArchivoCurso;
import controlador.persistencia.ArchivoDocente;
import controlador.persistencia.ArchivoEstudiante;
import controlador.persistencia.ArchivoGrado;
import controlador.persistencia.ArchivoAsignatura;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Asignatura;
import modelo.Curso;
import modelo.Docente;

public class GestionDocente {
    
    private ArrayList <Docente> docentes;
    ArchivoEstudiante archivoEstudiante;
    ArchivoCurso archivoCurso;
    ArchivoAsignatura archivoAsignatura;
    ArchivoDocente archivoDocente;
    ArchivoGrado archivoGrado;
    
    public GestionDocente(){
        this.archivoCurso = new ArchivoCurso();
        this.archivoAsignatura = new ArchivoAsignatura();
        this.archivoDocente = new ArchivoDocente();
        this.archivoGrado = new ArchivoGrado();
        this.archivoEstudiante = new ArchivoEstudiante();
        defecto();
        cargarDatos();
    }

    public boolean existeDocente(long documento,int codigoCarnet) {
         for (int i = 0; i < docentes.size(); i++) {
            if (docentes.get(i).getIdentificacion()== documento || docentes.get(i).getCodigoCarnet()== codigoCarnet) {
                return true;
            }
        }
        return false;

    }

    public Docente crearDocente(long documento, int codigoCarnet, int edad, long telefono, String nombre, String apellido, String rh, Curso curso, Asignatura asignatura) {
        Docente docente = new Docente(codigoCarnet, nombre, apellido, edad, telefono, rh, documento);
        docentes.add(docente);
        archivoDocente.ingresarDato(docente);
        return docente;
    }

    public String[] DocenteIDToStringArray(int i) {
        Docente docente = docentes.get(i);
        String docenteToString[] = new String[7];
        docenteToString[0] = docente.getNombre();
        docenteToString[1] = docente.getApellido();
        docenteToString[2] = docente.getCodigoCarnet()+"";
        docenteToString[3] = docente.getIdentificacion()+"";
        docenteToString[4] = docente.getEdad()+"";
        docenteToString[5] = docente.getTelefono()+"";
        docenteToString[6] = docente.getRh();
        return docenteToString;
    }
   
    public String cargarDocentesCreados() {
        String docentesCreados = "Historial de todos los Docentes contratados:\n\n";
        for (int i = 0; i < docentes.size(); i++) {
            docentesCreados += docentes.get(i).toString() + "\n";
        }
        
        return docentesCreados;
    }

    public int cantidadDeDocentes() {
        return docentes.size();
    }

    public String[] docentesToStringArray() {
        String docenteToString[] = new String[cantidadDeDocentes()];
        for (int i = 0; i < docentes.size(); i++) {
            docenteToString[i] = docentes.get(i).getNombre();
        }
        return docenteToString;
    }

    private void cargarDatos() {
        this.docentes = archivoDocente.obtenerTodosLosDocentesForma2();
    }

    private void defecto() {
        Docente docente = null;
        archivoDocente.ingresarDato(docente);
    }

    public boolean eliminarDocente(Docente docente,int docenteID) {
        for(int x = 0 ; x < docentes.size(); x++){
            if(docentes.get(docenteID).getAsignaturas().size() != 0){
            docentes.get(docenteID).getAsignaturas().get(x).setDocente(null);
            archivoAsignatura.actualizarDatos(docentes.get(docenteID).getAsignaturas().get(x));
            }
        }
        docentes.remove(docenteID);
        archivoDocente.eliminarDocente(docente);
        return true;
    }

    public boolean modificarAsignaturaDelDocente(Asignatura asignatura, int docenteID) {
        for(int x = 0 ; x < docentes.get(docenteID).getAsignaturas().size(); x++){
            if(docentes.get(docenteID).getAsignaturas().get(x).getCodigo().equals(asignatura.getCodigo())){
                docentes.get(docenteID).getAsignaturas().remove(x);
                docentes.get(docenteID).getAsignaturas().add(x,asignatura);
                archivoDocente.actualizarDatos(docentes.get(docenteID));
                return true;
            }
        }
        return false;
    }

    public Docente agregarAsignaturaAlDocente(Docente docente, Asignatura asignatura) {
        if(docente != null && asignatura != null){
            docente.getAsignaturas().add(asignatura);
            asignatura.setDocente(docente);
            archivoDocente.actualizarDatos(docente);
            archivoAsignatura.actualizarDatos(asignatura);
            return docente; 
        }
        return null;
    }
    
   
    public Docente agregarAsignaturaAlDocente1(Docente docente, Asignatura asignatura) {
        if(docente != null && asignatura != null){
            for(int x = 0 ; x < docente.getAsignaturas().size(); x++){
                if(docente.getAsignaturas().get(x).getCodigo().equals(asignatura.getCodigo())){
                    JOptionPane.showMessageDialog(null, "el docente ya dicta esa asignatura","docente",JOptionPane.INFORMATION_MESSAGE);
                    return docente;
                }
            }
            docente.getAsignaturas().add(asignatura);
            asignatura.setDocente(docente);
            archivoDocente.actualizarDatos(docente);
            archivoAsignatura.actualizarDatos(asignatura);
        }
        
        return docente;
    }
  
    public ArrayList<Asignatura> obtenerAsignaturasDelDocente(int docenteID) {
        return docentes.get(docenteID).getAsignaturas();
    }

    public ArrayList<Curso> obtenerCursoDelDocente(int docenteID) {
        return docentes.get(docenteID).getCursos();
    }

    public Docente obtenerDocente(int docenteID) {
        return docentes.get(docenteID);
    }

    public int obtenerIDDelArrayListDelDocente(Docente docente) {
        for(int x = 0 ; x < docentes.size(); x++){
            if(docentes.get(x).getIdentificacion() == docente.getIdentificacion()){
                return x;
            }
        }
        return -1;
    }

    public void eliminarDocente(Docente docente) {
        for(int x =0; x < docentes.size(); x++){
            if(docentes.get(x).getCodigoCarnet() == docente.getCodigoCarnet()){
                docentes.remove(x);
                archivoDocente.eliminarDocente(docente);
                break;
            }
        }
    }

    public Docente agregarAsignaturasAnterioresAlDocente(Docente docente, ArrayList<Asignatura> asignaturasAnteriores) {
        for(int x = 0 ; x < docentes.size(); x++){
            if(docentes.get(x).getCodigoCarnet() == docente.getCodigoCarnet()){
                for(int y = 0 ; y < asignaturasAnteriores.size(); y++){
                    Asignatura asignatura = asignaturasAnteriores.get(y);
                    docentes.get(x).getAsignaturas().add(asignatura);
                }
                archivoDocente.actualizarDatos(docentes.get(x));
                return docente;
            }
        }
        return docente;
    }

    public boolean eliminarUnCursoDelDocente(int idCurso, int docenteID) {
        for(int x = 0 ; x < docentes.get(docenteID).getCursos().size(); x++){
            if(docentes.get(docenteID).getCursos().get(x).getId() == idCurso ){
                docentes.get(docenteID).getCursos().remove(x);
                archivoDocente.actualizarDatos(docentes.get(docenteID));
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "el curso no existe o el docente no dicta en ese curso","curso",JOptionPane.INFORMATION_MESSAGE);
        return false;
    }

    public boolean eliminarUnaAsignaturaDelDocente(String codigoAsignatura, int docenteID) {
        if(docentes.get(docenteID).getAsignaturas().size() != 0){
            for(int x = 0 ; x < docentes.get(docenteID).getAsignaturas().size(); x++){
                if(docentes.get(docenteID).getAsignaturas().get(x).getCodigo().equals(codigoAsignatura)){
                    docentes.get(docenteID).getAsignaturas().remove(x);
                    archivoDocente.actualizarDatos(docentes.get(docenteID));
                    return true;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "el docente no dicta esa asignatura o esta no existe","docentes",JOptionPane.INFORMATION_MESSAGE);
        return false;
    }
}
   


    
    
    
    
    
    

