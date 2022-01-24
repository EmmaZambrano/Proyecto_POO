package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Docente extends Persona implements Serializable {
    
    private int codigoCarnet;
    private ArrayList<Asignatura> asignaturas;
    private ArrayList <Curso> cursos;
    
    public Docente() {
        this.codigoCarnet = 0;
        this.asignaturas = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public Docente(int codigoCarnet, String nombre, String apellido, int edad,long telefono, String rh, long identificacion) {
        super(nombre, apellido, edad,telefono, rh, identificacion);
        this.codigoCarnet = codigoCarnet;
        this.asignaturas = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public int getCodigoCarnet() {
        return codigoCarnet;
    }

    public void setCodigoCarnet(int codigoCarnet) {
        this.codigoCarnet = codigoCarnet;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
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
        hash = 71 * hash + this.codigoCarnet;
        hash = 71 * hash + Objects.hashCode(this.asignaturas);
        hash = 71 * hash + Objects.hashCode(this.cursos);
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
        final Docente other = (Docente) obj;
        if (this.codigoCarnet != other.codigoCarnet) {
            return false;
        }
        if (!Objects.equals(this.asignaturas, other.asignaturas)) {
            return false;
        }
        if (!Objects.equals(this.cursos, other.cursos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "codigoCarnet: " + codigoCarnet +"--------------------------------- Docente: "+super.getNombre() +" "+ super.getApellido()+"\n\n asignaturas que dicta: "+asignaturas+" \n\ncursos en los que dicta: "+cursos+"\n_______________________________________________________________________________\n";
    }
     
    public String toString1() {
        return "codigoCarnet: " + codigoCarnet +" Docente: "+super.getNombre() +" "+ super.getApellido()+ " asignatura que dicta: "+asignaturas;
    }
    
    public String toString2(){
        String datos= "codigoCarnet: "+codigoCarnet+" docente: "+super.getNombre()+" "+super.getApellido()+"\n";
        return datos;
    }  
}
