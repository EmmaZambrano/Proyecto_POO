package controlador.persistencia;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Curso;
import modelo.Grado;

public class ArchivoGrado {
    private String nombre;
    private File file;
    private FileInputStream fis;
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    
    public ArchivoGrado() {
        this.nombre = "Grados.dat";
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
            Logger.getLogger(ArchivoGrado.class.getName()).log(Level.SEVERE, null, ex);
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

  
    public boolean ingresarDato(Grado grado) {
        try {
            fos = new FileOutputStream(file,true);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(grado);
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


    public ArrayList<Grado> obtenerTodosLosGradosForma1() {
        try {
            ArrayList<Grado> grados = new ArrayList<>();
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Grado grado = null;
            do {
                grado = (Grado) ois.readObject();
                if (grado != null) {
                    grados.add(grado);
                    
                }else{
                    ois.close();
                    fis.close();
                }
            } while (grado != null);
            
            return grados;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoGrado.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArchivoGrado.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
    
    public ArrayList<Grado> obtenerTodosLosGradosForma2(){
        try{
            ArrayList<Grado> grados = new ArrayList<>();
            fis = new FileInputStream(file);
            Grado grado;
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                grado = (Grado) ois.readObject();
                if (grado != null) {
                    grados.add(grado);
                }
            }
            ois.close();
            fis.close();
            return grados;
        }catch(FileNotFoundException ex){
            Logger.getLogger(ArchivoGrado.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }catch(IOException | ClassNotFoundException ex){
            Logger.getLogger(ArchivoGrado.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }

    public void actualizarGrados(Grado grado) {
        ArrayList <Grado> grados = obtenerTodosLosGradosForma2();
        for(int x = 0; x < grados.size(); x++){
            if(grados.get(x).getId() == grado.getId()){
                grados.remove(x);
                grados.add(x,grado);
                break;
            }
        }
        limpiarArchivo();
        
        for(int x = 0 ; x < grados.size(); x++){
            ingresarDato(grados.get(x));
        }

    }

}