package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Nota implements Serializable {
    
    private String nombreNota;
    private double notaFinal;
    private Asignatura asignaturas;
    private Estudiante estudiante;
    
    public Nota(double notaFinal,String nombreNota) {
        this.notaFinal = notaFinal;
        this.nombreNota=nombreNota;
        this.asignaturas=null;
        this.estudiante=null;
    }
    
    public Nota(){
        this.nombreNota="";
        this.notaFinal=0;
        this.asignaturas=null;
        this.estudiante=null;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getNombreNota() {
        return nombreNota;
    }

    public void setNombreNota(String nombreNota) {
        this.nombreNota = nombreNota;
    }

    public Asignatura getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    

    @Override
    public String toString() {
        return "asignatura: "+asignaturas+" nombre de la nota: " + nombreNota + " nota..........................................." + notaFinal +"\n";
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nombreNota);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.notaFinal) ^ (Double.doubleToLongBits(this.notaFinal) >>> 32));
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
        final Nota other = (Nota) obj;
        if (Double.doubleToLongBits(this.notaFinal) != Double.doubleToLongBits(other.notaFinal)) {
            return false;
        }
        if (!Objects.equals(this.nombreNota, other.nombreNota)) {
            return false;
        }
        return true;
    }
    
}
