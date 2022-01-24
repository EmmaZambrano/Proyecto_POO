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
import modelo.Estudiante;
import modelo.Grado;
import modelo.Nota;

public class GestionCurso {
    ArrayList<Curso> cursos;
    ArchivoEstudiante archivoEstudiante;
    ArchivoCurso archivoCurso;
    ArchivoAsignatura archivoAsignatura;
    ArchivoDocente archivoDocente;
    ArchivoGrado archivoGrado;
    
    public GestionCurso() {
        this.archivoCurso = new ArchivoCurso();
        this.archivoAsignatura = new ArchivoAsignatura();
        this.archivoDocente = new ArchivoDocente();
        this.archivoGrado = new ArchivoGrado();
        this.archivoEstudiante = new ArchivoEstudiante();
        defecto();
        cargarDatos();
    }

    public String[] cursosToStringArray() {
        String cursosToString[] = new String[cantidadDeCursos()];
        for (int i = 0; i < cursos.size(); i++){
            cursosToString[i] = cursos.get(i).getNombre();
        }
        return cursosToString;
    }

    public int cantidadDeCursos() {
        return cursos.size();
    }

    public boolean existeCurso(int id) {
         for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    public Curso crearCurso(int id, String nombre,Grado grado,Docente docente) {
        Curso curso = new Curso(nombre, id);
        curso.setGrado(grado);
        curso.setDirectorGrupo(docente);
        cursos.add(curso);
        archivoCurso.ingresarDato(curso);
        return curso;
    }

    public String[] cursoIDToStringArray(int i) {
        Curso curso = cursos.get(i);
        String cursoToString[] = new String[3];
        cursoToString[0] = curso.getId()+ "";
        cursoToString[1] = curso.getNombre();
        return cursoToString;
    }

    public String cargarDATOSDelCurso(int id) {
        String estudiante = "Estudiantes del curso:\n\n";
        Curso curso = null;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId()== id) {
                curso = cursos.get(i);
                break;
            }
        }
        for (int i = 0; i < curso.getEstudiantes().size(); i++) {
            estudiante += curso.getEstudiantes().get(i).toString1();
        }
        
        String docente = "Docentes que dictan en el curso:\n\n";
      //  Curso curso = null;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId()== id) {
                curso = cursos.get(i);
                break;
            }
        }
        for (int i = 0; i < curso.getDocentes().size(); i++) {
            docente += curso.getDocentes().get(i).toString2();
        }
        
        String asignatura = "Asignaturas a ver en el curso:\n\n";
        //Curso curso = null;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId()== id) {
                curso = cursos.get(i);
                break;
            }
        }
        for (int i = 0; i < curso.getAsignaturas().size(); i++) {
            asignatura += curso.getAsignaturas().get(i).toString();
        }
               
        return estudiante+"\n"+docente +"\n"+asignatura; 
    }

    public Asignatura agregarAsignaturaAlCurso(Asignatura asignatura, int cursoDI) {
        if (cursoDI > -1 && asignatura != null) {
            if(cursos.get(cursoDI).getEstudiantes().size() == 0){
                asignatura.setCursos(cursos.get(cursoDI));
                cursos.get(cursoDI).getAsignaturas().add(asignatura);
                Curso curso = cursos.get(cursoDI);
                archivoCurso.actualizarDatos(curso);
                archivoAsignatura.actualizarDatos(asignatura);
            }else{
                JOptionPane.showMessageDialog(null, "no se agrego la asigantura al curso ya que hay estuidiantes en el curso","asignatura",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        return asignatura;
    }

    public Estudiante agregarEstudianteAlCurso(Estudiante estudiante, int cursoID) {
        if (cursoID > -1 && estudiante != null) {
            estudiante.setCurso(cursos.get(cursoID));
            cursos.get(cursoID).getEstudiantes().add(estudiante);
            Curso curso = cursos.get(cursoID);
            archivoCurso.actualizarDatos(curso);
            archivoEstudiante.actualizarDatos(estudiante);
        }
       
        return estudiante;   
    }

    public Docente agregarDocenteAlCurso(Docente docente, int cursoID) {
        if (cursoID > -1 && docente != null) {
            docente.getCursos().add(cursos.get(cursoID));
            cursos.get(cursoID).getDocentes().add(docente);
            Curso curso = cursos.get(cursoID);
            archivoCurso.actualizarDatos(curso);
            archivoDocente.actualizarDatos(docente);
        }
        return docente;
    }
    
    public Docente agregarDocenteAlCurso1(Docente docente, int cursoID) {
        if (cursoID > -1 && docente != null) {
            for(int x = 0 ; x < docente.getCursos().size(); x++){
                if(docente.getCursos().get(x).getId() == cursos.get(cursoID).getId()){
                    JOptionPane.showMessageDialog(null, "el docente ya dicta en ese curso","docente",JOptionPane.INFORMATION_MESSAGE);
                    return docente;
                }
            }
            docente.getCursos().add(cursos.get(cursoID));
            cursos.get(cursoID).getDocentes().add(docente);
            Curso curso = cursos.get(cursoID);
            archivoCurso.actualizarDatos(curso);
            archivoDocente.actualizarDatos(docente);
        }
        return docente;
    }
    
    public Estudiante agregarAsignaturasAlEstudiante(Estudiante estudiante, int cursoID) {
        if(cursoID > -1 && estudiante != null){
            Asignatura asignatura = null;
            ArrayList <Asignatura> asignaturas = new ArrayList <>();    
            asignaturas= cursos.get(cursoID).getAsignaturas();
            for(int x = 0 ; x < asignaturas.size(); x++){
                    asignatura = asignaturas.get(x);
                    estudiante.getAsignaturas().add(asignatura);
            }
            archivoEstudiante.actualizarDatos(estudiante);
        }
        return estudiante;
    }

    private void cargarDatos() {
        this.cursos= archivoCurso.obtenerTodosLosCursosForma2();
    }

    private void defecto() {
        Curso curso = null;
        archivoCurso.ingresarDato(curso);
    }

    public ArrayList<Curso> array() {
        return cursos;
    }

    public boolean eliminarDocenteDelCurso(Docente docente) {
        for(int x = 0 ; x < cursos.size(); x++){
            for(int y = 0 ; y < cursos.get(x).getDocentes().size(); y++){
                if(cursos.get(x).getDocentes().get(y).getCodigoCarnet() == docente.getCodigoCarnet()){
                    cursos.get(x).getDocentes().remove(y);
                    archivoCurso.actualizarDatos(cursos.get(x));
                }
            }
        }
        return true;
    }

    public boolean eliminarEstudianteDelCurso(Estudiante estudiante) {
        for(int x = 0 ; x < cursos.size(); x++){
            for(int y = 0 ; y < cursos.get(x).getEstudiantes().size();y++){
                if(cursos.get(x).getEstudiantes().get(y).getCodigoCarnet() == estudiante.getCodigoCarnet()){
                    cursos.get(x).getEstudiantes().remove(y);
                    archivoCurso.actualizarDatos(cursos.get(x));
                    return true;
                }
            }
        }
        return false;
    }

    public Docente modificarDocenteDelCurso(Docente docente, Curso cursoAnterior, int cursoID) {
      //  docente.setCursos(cursos.get(cursoID));
        archivoDocente.actualizarDatos(docente);
        for(int x = 0 ; x < cursos.size(); x++){
            if(cursos.get(x).getId() == cursoAnterior.getId()){
               for(int y = 0 ; y < cursos.get(x).getDocentes().size(); y++){
                   if(cursos.get(x).getDocentes().get(y).getIdentificacion() == docente.getIdentificacion()){
                       cursos.get(x).getDocentes().remove(y);
                       archivoCurso.actualizarDatos(cursos.get(x));
                       break;
                   }
               }
            }
        }
        return docente;
    }

    public Docente agregarDocenteAlCursoParaDictar(Docente docente, Curso cursoAnterior) {
        for(int x = 0 ; x < cursos.size(); x++){
            if(cursos.get(x).getId() == cursoAnterior.getId()){
                cursos.get(x).getDocentes().add(docente);
                archivoCurso.actualizarDatos(cursos.get(x));
                return docente;
            }
        }
        return docente;
    }

    public Docente agregaCursosAnteriores(Docente docente, ArrayList<Curso> cursosAnteriores) {
        for(int x = 0 ; x < cursosAnteriores.size(); x++){
            Curso curso = cursosAnteriores.get(x);
            docente.getCursos().add(curso);
        }
        
        for(int x = 0 ; x < cursos.size(); x++){
            for(int y = 0 ; y < cursosAnteriores.size(); y++){
                if(cursos.get(x).getId() == cursosAnteriores.get(y).getId()){
                    cursos.get(x).getDocentes().add(docente);
                    archivoCurso.actualizarDatos(cursos.get(x));
                }
            }
        }
        
        archivoDocente.actualizarDatos(docente);
        return docente;
    }

    public Curso obtenerCurso(int cursoID) {
        return cursos.get(cursoID);
    }

    public boolean eliminarDocenteDeUnCurso(Docente docente,int idCurso) {
        for(int x = 0 ; x < cursos.size(); x++){
            if(cursos.get(x).getId() == idCurso){
                for(int y = 0 ; y < cursos.get(x).getDocentes().size(); x++){
                    if(cursos.get(x).getDocentes().get(y).getCodigoCarnet() == docente.getCodigoCarnet()){
                        cursos.get(x).getDocentes().remove(y);
                        archivoCurso.actualizarDatos(cursos.get(x));
                        return true;
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "el curso no tiene a ese docente registrado","docentes",JOptionPane.INFORMATION_MESSAGE);
        return false;
    }
}