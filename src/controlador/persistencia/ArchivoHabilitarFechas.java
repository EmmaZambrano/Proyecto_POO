package controlador.persistencia;

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
import modelo.Docente;
import modelo.Grado;

public class ArchivoHabilitarFechas {
      private String nombre;
    private File file;
    private FileInputStream fis;
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    
    public ArchivoHabilitarFechas() {
        this.nombre = "fechas.dat";
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
            Logger.getLogger(ArchivoHabilitarFechas.class.getName()).log(Level.SEVERE, null, ex);
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

  
    public boolean ingresarDato(boolean fecha) {
        try {
            fos = new FileOutputStream(file,true);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(fecha);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**eliminar todo*/
    public void limpiarArchivo() {
        eliminarArchivo();
        crearArchivo();
    }
    
    public boolean actualizarDatos(boolean activar){
        boolean habilitar = obtenerTodosLasFechasForma2();
        habilitar = activar;
        limpiarArchivo();
        return ingresarDato(habilitar);
    }
           
    public boolean obtenerTodosLasFechasForma2(){
        try{
            boolean habilitar=true;
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                habilitar = (boolean) ois.readObject();                
            }
            ois.close();
            fis.close();
            return habilitar;
        }catch(FileNotFoundException ex){
            Logger.getLogger(ArchivoDocente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }catch(IOException | ClassNotFoundException ex){
            Logger.getLogger(ArchivoDocente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}