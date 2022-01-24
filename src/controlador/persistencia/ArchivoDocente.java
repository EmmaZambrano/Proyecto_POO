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
import javax.swing.JOptionPane;
import modelo.Asignatura;
import modelo.Curso;
import modelo.Docente;

public class ArchivoDocente {
     private String nombre;
    private File file;
    private FileInputStream fis;
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;

    public ArchivoDocente() {
        this.nombre = "docentes.dat";
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
            Logger.getLogger(ArchivoDocente.class.getName()).log(Level.SEVERE, null, ex);
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

  
    public boolean ingresarDato(Docente docente) {
        try {
            fos = new FileOutputStream(file,true);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(docente);
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

    /**obtener todo
     * @return */
    public ArrayList<Docente> obtenerTodosLosDocentesForma1() {
        try {
            ArrayList<Docente> docentes = new ArrayList<>();
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Docente docente = null;
            do {
                docente = (Docente) ois.readObject();
                if (docente != null) {
                    docentes.add(docente);
                    
                }else{
                    ois.close();
                    fis.close();
                }
            } while (docente != null);
            
            return docentes;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoDocente.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArchivoDocente.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
    
    public ArrayList<Docente> obtenerTodosLosDocentesForma2(){
        try{
            ArrayList<Docente> docentes = new ArrayList<>();
            fis = new FileInputStream(file);
            Docente docente;
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                docente = (Docente) ois.readObject();
                if (docente != null) {
                    docentes.add(docente);
                }
            }
            ois.close();
            fis.close();
            return docentes;
        }catch(FileNotFoundException ex){
            Logger.getLogger(ArchivoDocente.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }catch(IOException | ClassNotFoundException ex){
            Logger.getLogger(ArchivoDocente.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }

    public void actualizarDatos(Docente docente) {
        ArrayList <Docente> docentes = obtenerTodosLosDocentesForma2();
        for(int x = 0; x < docentes.size(); x++){
            if(docentes.get(x).getIdentificacion() == docente.getIdentificacion()){
                docentes.remove(x);
                docentes.add(x,docente);
                break;
            }
        }
        limpiarArchivo();
        for(int x = 0 ; x < docentes.size(); x++){
            ingresarDato(docentes.get(x));
        }
    }

    public void eliminarDocente(Docente docente) {
        ArrayList <Docente> docentes = obtenerTodosLosDocentesForma2();
        for(int x = 0 ; x < docentes.size(); x++){
            if( docentes.get(x).getCodigoCarnet() == docente.getCodigoCarnet()){
                docentes.remove(x);
                break;
            }
        }
        limpiarArchivo();
        for(int x = 0 ; x < docentes.size(); x++){
            ingresarDato(docentes.get(x));
        }
    }

}