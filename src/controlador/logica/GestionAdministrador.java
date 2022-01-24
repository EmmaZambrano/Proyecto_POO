package controlador.logica;
import controlador.persistencia.ArchivoAdmin;
import java.util.ArrayList;
import modelo.Administrador;

public class GestionAdministrador {
    private ArrayList <Administrador> administrador;
    ArchivoAdmin archivoAdmin;
    
    public GestionAdministrador(){
        archivoAdmin = new ArchivoAdmin();
        defecto();
        cargarDatos();
    }

    public boolean existeAdministrador(long documento, int codigoCarnet) {
        for(int i=0;i<administrador.size();i++){
            if((documento==administrador.get(i).getIdentificacion())&&(codigoCarnet==administrador.get(i).getCodigoCarnet())){
                return false;
            }
        }
        return true;
    }

    public boolean CrearAdministrador(long documento, int codigoCarnet, int edad, int telefono, String nombre, String apellido, String rh) {
        Administrador administrador=new Administrador(codigoCarnet,nombre,apellido,edad,telefono,rh,documento);
        if(edad>0){
            this.administrador.add(administrador);
            this.archivoAdmin.ingresarDato(administrador);
            return true;
        }
        return false;
    }

    public int CantidadAdministradores() {
        return administrador.size();
    }

    public String[] datosAdministradores() {
        String Administradores[]=new String[CantidadAdministradores()];
        for(int i=0;i<administrador.size();i++){
            Administradores[i]=administrador.get(i).getNombre();
        }
        return Administradores;
    }

    public String[] traerAdministrador(int a) {
        Administrador administrador= this.administrador.get(a);
        String persona[]=new String[7];
        persona[0]= administrador.getNombre();
        persona[1]= administrador.getApellido();
        persona[2]=administrador.getEdad()+"";
        persona[3]=administrador.getTelefono()+"";
        persona[4]=administrador.getRh();
        persona[5]=administrador.getIdentificacion()+"";
        persona[6]=administrador.getCodigoCarnet()+"";
        return persona;
        
    }

    public void borrarAdministrador(int a) {
        administrador.remove(a);
        archivoAdmin.eliminarAdmin(a);
    }

    public String cargarTextArea() {
        String datos="ADMINISTRADORES\n\n";
        for(int i=0;i<administrador.size();i++){
            datos+="administrador: "+administrador.get(i).getNombre()+"  "+administrador.get(i).getApellido()+"---------------------Identificacion: "+administrador.get(i).getIdentificacion()+"\n";
        }
        return datos;
    }

    public boolean ingresoAdmin(String usuario, int contrasenia){
        for(int i=0;i<administrador.size();i++){
            if((administrador.get(i).getNombre().equals(usuario))&&(administrador.get(i).getCodigoCarnet()==contrasenia)){
                return true;
            }    
        }
        return false;
    }

    private void cargarDatos() {
        this.administrador = archivoAdmin.obtenerTodosLosAdministradoresForma2();
    }

    private void defecto() {
        Administrador admin = null;
        archivoAdmin.ingresarDato(admin);
    }
    
}
