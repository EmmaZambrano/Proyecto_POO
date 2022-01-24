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
import modelo.Estudiante;
import modelo.Nota;

public class ArchivoNota {
      private String nombre;
    private File file;
    private FileInputStream fis;
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    
    public ArchivoNota() {
        this.nombre = "Notas.dat";
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
            Logger.getLogger(ArchivoNota.class.getName()).log(Level.SEVERE, null, ex);
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

  
    public boolean ingresarDato(Nota nota) {
        try {
            fos = new FileOutputStream(file,true);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(nota);
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
    public ArrayList<Nota> obtenerTodosLasNotassForma1() {
        try {
            ArrayList<Nota> notas = new ArrayList<>();
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Nota nota = null;
            do {
                nota = (Nota) ois.readObject();
                if (nota != null) {
                    notas.add(nota);
                    
                }else{
                    ois.close();
                    fis.close();
                }
            } while (nota != null);
            
            return notas;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoNota.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArchivoNota.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
    
    public ArrayList<Nota> obtenerTodosLasNotasForma2(){
        try{
            ArrayList<Nota> notas = new ArrayList<>();
            fis = new FileInputStream(file);
            Nota nota;
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                nota = (Nota) ois.readObject();
                if (nota != null) {
                    notas.add(nota);
                }
            }
            ois.close();
            fis.close();
            return notas;
        }catch(FileNotFoundException ex){
            Logger.getLogger(ArchivoNota.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }catch(IOException | ClassNotFoundException ex){
            Logger.getLogger(ArchivoNota.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }

    public void actualizarDatos(Nota n) {
        ArrayList <Nota> notas = obtenerTodosLasNotasForma2();
        for(int x = 0; x < notas.size(); x++){
            if(notas.get(x).getNombreNota().equals(n.getNombreNota()) && notas.get(x).getNotaFinal() == n.getNotaFinal()){
                notas.remove(x);
                notas.add(x,n);
                break;
            }
        }
        limpiarArchivo();
 
        for(int x = 0 ; x < notas.size(); x++){
            ingresarDato(notas.get(x));
        }
    }
    
    public void eliminarNota(int notaID) {
        ArrayList <Nota> notas = obtenerTodosLasNotasForma2();
        notas.remove(notaID);
        limpiarArchivo();
        for(int x = 0 ; x < notas.size(); x++){
            ingresarDato(notas.get(x));
        }
        
    }
    
    public void modificarNotaSinMover(Nota n, int notaID){
        ArrayList<Nota> notas = obtenerTodosLasNotasForma2();
        for (int i = 0; i < notas.size(); i++) {
            if (n.getNombreNota().equals(notas.get(i).getNombreNota()) && n.getNotaFinal() == notas.get(i).getNotaFinal()) {
                notas.remove(i);
                notas.add(i,n);
                break;
            }
        }
        limpiarArchivo();
        for (int i = 0; i < notas.size(); i++) {
            ingresarDato(notas.get(i));
        }
           
    }
}