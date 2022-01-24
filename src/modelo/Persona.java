package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Persona implements Serializable{
       
    private String nombre;
    private String apellido;
    private int edad;
    private long telefono;
    private String rh;
    private long identificacion;
    
    public Persona(){
        this.nombre="";
        this.apellido="";
        this.edad=0;
        this.telefono=0;
        this.rh="";
        this.identificacion=0;
               
    }

    public Persona(String nombre, String apellido, int edad,long telefono, String rh, long identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.rh = rh;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.apellido);
        hash = 97 * hash + this.edad;
        hash = (int) (97 * hash + this.telefono);
        hash = 97 * hash + Objects.hashCode(this.rh);
        hash = (int) (97 * hash + this.identificacion);
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
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
      
        if (this.telefono != other.telefono) {
            return false;
        }
        if (this.identificacion != other.identificacion) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.rh, other.rh)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad +  ", telefono=" + telefono + ", Dirección=" + rh + ", identificacion=" + identificacion + '}';
    }
        
}