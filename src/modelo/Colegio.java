package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
  * @author Emma Zambrano
 */
public class Colegio implements Serializable{
    
    private String nombre;
    private String horario;
    private Persona duenio;
    private ArrayList <Grado> grados;
    private ArrayList <Estudiante>estudiantes;
    private ArrayList <Docente> docentes;
    private ArrayList <Curso> cursos;
    private ArrayList <Asignatura> asignaturas;
    
    public Colegio(){
    }

    public Colegio(String nombre, Persona duenio, String horario) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.horario = horario;
        this.cursos = new ArrayList<Curso>();
        this.grados = new ArrayList <Grado>();
        this.estudiantes = new ArrayList <Estudiante>();
        this.docentes = new ArrayList <Docente>();
        this.asignaturas = new ArrayList <Asignatura>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    public ArrayList<Grado> getGrados() {
        return grados;
    }

    public void setGrados(ArrayList<Grado> grados) {
        this.grados = grados;
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

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.horario);
        hash = 29 * hash + Objects.hashCode(this.duenio);
        hash = 29 * hash + Objects.hashCode(this.grados);
        hash = 29 * hash + Objects.hashCode(this.estudiantes);
        hash = 29 * hash + Objects.hashCode(this.docentes);
        hash = 29 * hash + Objects.hashCode(this.cursos);
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
        final Colegio other = (Colegio) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        if (!Objects.equals(this.duenio, other.duenio)) {
            return false;
        }
        if (!Objects.equals(this.grados, other.grados)) {
            return false;
        }
        if (!Objects.equals(this.estudiantes, other.estudiantes)) {
            return false;
        }
        if (!Objects.equals(this.docentes, other.docentes)) {
            return false;
        }
        if (!Objects.equals(this.cursos, other.cursos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Colegio{" + "nombre=" + nombre + ", horario=" + horario + ", duenio=" + duenio + ", grados=" + grados + ", estudiantes=" + estudiantes + ", docentes=" + docentes + ", cursos=" + cursos + '}';
    }
    
}
