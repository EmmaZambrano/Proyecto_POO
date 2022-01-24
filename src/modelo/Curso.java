package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Curso implements Serializable {
    
    private String nombre;
    private int id;
    private ArrayList <Estudiante> estudiantes;
    private ArrayList <Docente> docentes;
    private ArrayList <Asignatura> asignaturas;
    private Grado grado;
    private Docente directorGrupo;
    
    public Curso(){
        this.nombre="";
        this.id=0;
        this.estudiantes = new ArrayList<Estudiante>();
        this.docentes = new ArrayList<Docente>();
        this.asignaturas= new ArrayList<Asignatura>();
        this.grado=null;
        this.directorGrupo=null;
    }
    
    public Curso(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.estudiantes = new ArrayList <Estudiante>();
        this.docentes = new ArrayList <Docente>();
        this.asignaturas = new ArrayList<Asignatura>();
        this.grado = null;
        this.directorGrupo=null;
    }

    public Docente getDirectorGrupo() {
        return directorGrupo;
    }

    public void setDirectorGrupo(Docente directorGrupo) {
        this.directorGrupo = directorGrupo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(ArrayList<Docente> docentes) {
        this.docentes = docentes;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        String toString = "nombre: " + nombre + "   id----------" + id+"\n";
        return toString;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.estudiantes);
        hash = 59 * hash + Objects.hashCode(this.docentes);
        hash = 59 * hash + Objects.hashCode(this.asignaturas);
        hash = 59 * hash + Objects.hashCode(this.grado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.estudiantes, other.estudiantes)) {
            return false;
        }
        if (!Objects.equals(this.docentes, other.docentes)) {
            return false;
        }
        if (!Objects.equals(this.asignaturas, other.asignaturas)) {
            return false;
        }
        if (!Objects.equals(this.grado, other.grado)) {
            return false;
        }
        return true;
    }

    public String toString1() {
        String toString = "Curso: "+nombre+" \n";
        return toString;
    } 
}
