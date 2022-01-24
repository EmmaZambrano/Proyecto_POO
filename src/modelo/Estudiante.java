package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Estudiante extends Persona implements Serializable {
 
    private int codigoCarnet;
    private ArrayList<Nota> notasFinales;
    private Curso curso;
    private ArrayList <Asignatura> asignaturas;
    double promedio;
    double puesto;
    boolean matricula;
 
    public Estudiante() {
        super();
        this.codigoCarnet=0;
        this.notasFinales= new ArrayList<Nota>();
        this.curso = null;
        this.asignaturas= new ArrayList <Asignatura>();
        this.promedio=0;
        this.puesto=0;
        this.matricula = false;
    }

    public Estudiante(int codigoCarnet,String nombre, String apellido, int edad, long telefono, String rh, long identificacion) {
        super(nombre, apellido, edad, telefono, rh, identificacion);
        this.codigoCarnet = codigoCarnet;
        this.curso = null;
        this.asignaturas= new ArrayList <Asignatura>();
        this.notasFinales= new ArrayList<Nota>();
        this.promedio=0;
        this.puesto=0;
        this.matricula=false;
    }
  
    public int getCodigoCarnet() {
        return codigoCarnet;
    }

    public void setCodigoCarnet(int codigoCarnet) {
        this.codigoCarnet = codigoCarnet;
    }
 
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public ArrayList<Nota> getNotasFinales() {
        return notasFinales;
    }

    public void setNotasFinales(ArrayList<Nota> notasFinales) {
        this.notasFinales = notasFinales;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getPuesto() {
        return puesto;
    }

    public void setPuesto(double puesto) {
        this.puesto = puesto;
    }

    public boolean getMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }
        
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.codigoCarnet;
        hash = 37 * hash + Objects.hashCode(this.notasFinales);
        hash = 37 * hash + Objects.hashCode(this.curso);
        hash = 37 * hash + Objects.hashCode(this.asignaturas);
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
        final Estudiante other = (Estudiante) obj;
        if (this.codigoCarnet != other.codigoCarnet) {
            return false;
        }
        if (!Objects.equals(this.notasFinales, other.notasFinales)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Objects.equals(this.asignaturas, other.asignaturas)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        String toString ="\ncodigoCarnet: " + codigoCarnet +"-------Nombre: "+super.getNombre()+"  "+super.getApellido()+" documento: "+super.getIdentificacion() +" asignaturas a ver en el curso:\n\n"+asignaturas+"\n"; 
        return toString;
    }

    public String toString1(){
        return "estudiante: "+super.getNombre()+"  "+super.getApellido()+"---------------------------codigo: "+codigoCarnet+"\n";
    }
    
    public String toString2(){
        return "nombre: "+super.getNombre()+" apellido: "+super.getApellido()+ "asignatura: "+asignaturas+"\n";
    }
    
}