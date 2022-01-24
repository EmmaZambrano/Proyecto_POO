package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Asignatura implements Serializable {
    
    private String codigo;
    private String nombre;
    private int creditos;
    private Curso cursos;
    private Docente docente;
    private Estudiante estudiante;
    private ArrayList <Nota>notas;
    
    public Asignatura(){
        this.codigo="";
        this.nombre="";
        this.cursos=null;
        this.docente = null;
        this.estudiante=null;
        this.notas= new ArrayList <>();
    }
    
    public Asignatura(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.cursos =null;
        this.docente = null;
        this.estudiante=null;
        this.notas= new ArrayList <>();
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Curso getCursos() {
        return cursos;
    }

    public void setCursos(Curso cursos) {
        this.cursos = cursos;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    
    @Override
    public String toString() {
        return "nombre: "+ nombre+"---------------codigo: "+ codigo+"\n";
    }
    
    public String toString1() {
        return " Asignatura: "+ nombre+"..............................notas: "+ notas +"\n";
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
        final Asignatura other = (Asignatura) obj;
        if (!this.codigo.equals(other.codigo)) {
            return false;
        }
        if (this.creditos != other.creditos) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.cursos, other.cursos)) {
            return false;
        }
        if (!Objects.equals(this.docente, other.docente)) {
            return false;
        }
        if (!Objects.equals(this.estudiante, other.estudiante)) {
            return false;
        }
        return true;
    }
}
