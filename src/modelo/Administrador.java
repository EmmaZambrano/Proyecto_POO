package modelo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
  * @author Emma Zambrano
 */
public class Administrador extends Persona implements Serializable {
    
    private int codigoCarnet;
    
    public Administrador(){
        super();
        this.codigoCarnet=0;
    }

    public Administrador(int codigoCarnet,String nombre, String apellido, int edad, long telefono, String rh, long identificacion) {
        super(nombre, apellido, edad, telefono, rh, identificacion);
        this.codigoCarnet=codigoCarnet;
    }

    public int getCodigoCarnet() {
        return codigoCarnet;
    }

    public void setCodigoCarnet(int codigoCarnet) {
        this.codigoCarnet = codigoCarnet;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.codigoCarnet;
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
        final Administrador other = (Administrador) obj;
        if (this.codigoCarnet != other.codigoCarnet) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Administrador{" + "codigoCarnet=" + codigoCarnet + '}';
    }
       
}
