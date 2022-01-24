package controlador.logica;

import controlador.persistencia.ArchivoCurso;
import controlador.persistencia.ArchivoDocente;
import controlador.persistencia.ArchivoEstudiante;
import controlador.persistencia.ArchivoGrado;
import controlador.persistencia.ArchivoAsignatura;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Asignatura;
import modelo.Curso;
import modelo.Grado;

public class GestionGrado {

    private  ArrayList <Grado> grados;
    ArchivoEstudiante archivoEstudiante;
    ArchivoCurso archivoCurso;
    ArchivoAsignatura archivoAsignatura;
    ArchivoDocente archivoDocente;
    ArchivoGrado archivoGrado;
    
    public GestionGrado(){
        this.archivoCurso = new ArchivoCurso();
        this.archivoAsignatura = new ArchivoAsignatura();
        this.archivoDocente = new ArchivoDocente();
        this.archivoGrado = new ArchivoGrado();
        this.archivoEstudiante = new ArchivoEstudiante();      
        defecto();
        cargarDatos();
    }
    
    public int cantidadDeGrados() {
        return grados.size();
    }

    public String[] gradosToStringArray() {
        String gradosToString[] = new String[cantidadDeGrados()];
        for (int i = 0; i < grados.size(); i++) {
            gradosToString[i] = grados.get(i).getNombre();
        }
        return gradosToString;
    }

    public boolean crearGrado(int id, String nombre){
        Grado grado = new Grado(nombre,id);
        grados.add(grado);
        archivoGrado.ingresarDato(grado);
        return true;
    }

    public String[] gradosIDToStringArray(int i) {
        Grado grado = grados.get(i);
        String gradoToString[] = new String[3];
        gradoToString[0] = grado.getId()+ "";
        gradoToString[1] = grado.getNombre();
        return gradoToString;
    }

    public String cargarCursosDelGrado(int id) {
        
        String cursos = "Cursos:\n";
        Grado grado = null;
        for (int i = 0; i < grados.size(); i++) {
            if (grados.get(i).getId()== id) {
                grado = grados.get(i);
                break;
            }
        }
        
        System.out.println(grado.getNombre()+"\n\n");
        for (int i = 0; i < grado.getCursos().size(); i++) {
            cursos += grado.getCursos().get(i).toString();
        }
        return cursos;
    }

    public Curso agregarCursoAlGrado(Curso curso, int gradoDI) {
        if (gradoDI > -1 && curso != null) {
            curso.setGrado(grados.get(gradoDI));
            grados.get(gradoDI).getCursos().add(curso);
            Grado grado = grados.get(gradoDI);
            archivoGrado.actualizarGrados(grado);
        }
        return curso;
    }

    public boolean existeGrado(int id) {
        for (int i = 0; i < grados.size(); i++) {
            if (grados.get(i).getId()== id) {
                return true;
            }
        }
        return false;
    }

    private void cargarDatos() {
        this.grados= archivoGrado.obtenerTodosLosGradosForma2();
    }

    private void defecto() {
        Grado grado = null;
        archivoGrado.ingresarDato(grado);
    }

}