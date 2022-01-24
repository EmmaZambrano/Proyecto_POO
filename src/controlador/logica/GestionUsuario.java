package controlador.logica;

import controlador.persistencia.ArchivoUsuarios;
import java.util.ArrayList;
import modelo.Usuario;

public class GestionUsuario {
    
    ArrayList <Usuario> usuarios;
    ArchivoUsuarios archivoUsuarios;
    
    public GestionUsuario(){
        archivoUsuarios = new ArchivoUsuarios();
        defecto();
        cargarDatos();
    }
    
    private void cargarDatos(){
        usuarios = archivoUsuarios.obtenerTodosLosUsuariosForma2();
    }
    
    
    public boolean crearUsuario(int roll,String user,String password){
        Usuario usuario = new Usuario(roll,user,password);
        usuarios.add(usuario);
        return archivoUsuarios.ingresarDato(usuario);
    }

    public boolean existeUsuario(int roll, String user) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getRoll()==roll && usuarios.get(i).getUser().equals(user)){
                return true;
            }
        }
        return false;
    }

    public boolean validarParaEntrar(int roll, String user, String password) {
        for(int x = 0 ; x < usuarios.size(); x++){
            if(usuarios.get(x).getRoll() == roll && usuarios.get(x).getUser().equals(user) && usuarios.get(x).getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    private void defecto() {
        Usuario usuario = null;
        archivoUsuarios.ingresarDato(usuario);
    }
    
}