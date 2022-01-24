package controlador.persistencia;

import controlador.logica.GestionUsuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

public class ArchivoUsuarios {
    
    private String nombre;
    private File file;
    private FileInputStream fis;
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private GestionUsuario gestionUsuarios;
  public ArchivoUsuarios() {
        this.nombre = "usuarios.dat";
        file = new File(nombre);
        this.crearArchivo();
    }

    public boolean crearArchivo() {
        try {

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("El Archivo fue creado");
            } else {
                System.out.println("El Archivo ya existe");
            }
            return true;
        } catch (IOException ex) {
            Logger.getLogger(ArchivoUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean existenciaArchivo(){
        if(file.exists()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean eliminarArchivo() {
        if (file.exists()) {
            file.delete();
            System.out.println("El Archivo fue eliminado");
        } else {
            System.out.println("El Archivo no existe");
        }
        return true;
    }

  
    public boolean ingresarDato(Usuario usuario) {
        try {
            fos = new FileOutputStream(file,true);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(usuario);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /** eliminar todo */
    public void limpiarArchivo() {
        eliminarArchivo();
        crearArchivo();
    }

    /** obtener todo 
     * @return  */
    public ArrayList<Usuario> obtenerTodosLosUsuariosForma1() {
        try {
            ArrayList<Usuario> usuarios = new ArrayList<>();
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Usuario usuario = null;
            do {
                usuario = (Usuario) ois.readObject();
                if (usuario != null) {
                    usuarios.add(usuario);
                    
                }else{
                    ois.close();
                    fis.close();
                }
            } while (usuario != null);
            
            return usuarios;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArchivoUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
    
    public ArrayList<Usuario> obtenerTodosLosUsuariosForma2(){
        try{
            ArrayList<Usuario> usuarios = new ArrayList<>();
            fis = new FileInputStream(file);
            Usuario usuario;
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                usuario = (Usuario) ois.readObject();
                if (usuario != null) {
                    usuarios.add(usuario);
                }
            }
            ois.close();
            fis.close();
            return usuarios;
        }catch(FileNotFoundException ex){
            Logger.getLogger(ArchivoUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }catch(IOException | ClassNotFoundException ex){
            Logger.getLogger(ArchivoUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
  
}