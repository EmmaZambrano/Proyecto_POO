package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Grado implements Serializable {
    
    private String nombre;
    private int id;
    private ArrayList<Curso> cursos;

    public Grado() {
        cursos = new ArrayList <Curso>();
    }

    public Grado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.cursos = new ArrayList<Curso>();
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

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.cursos);
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
        final Grado other = (Grado) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.cursos, other.cursos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Grado{" + "nombre=" + nombre + ", id=" + id +  '}';
    } 
}