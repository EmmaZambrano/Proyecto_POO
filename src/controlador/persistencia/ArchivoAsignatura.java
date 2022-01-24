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
import modelo.Asignatura;
import modelo.Curso;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Nota;

public class ArchivoAsignatura {
    private String nombre;
    private File file;
    private FileInputStream fis;
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    
    public ArchivoAsignatura() {
        this.nombre = "asignaturas.dat";
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
            Logger.getLogger(ArchivoAsignatura.class.getName()).log(Level.SEVERE, null, ex);
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

  
    public boolean ingresarDato(Asignatura asignatura) {
        try {
            fos = new FileOutputStream(file,true);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(asignatura);
            oos.close();
            fos.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /*eliminar todo*/
    public void limpiarArchivo() {
        eliminarArchivo();
        crearArchivo();
    }

    /**obtener todo
     * @return*/
    public ArrayList<Asignatura> obtenerTodosLasAsignaturasForma1() {
        try {
            ArrayList<Asignatura> asignaturas = new ArrayList<>();
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Asignatura asignatura = null;
            do {
                asignatura = (Asignatura) ois.readObject();
                if (asignatura != null) {
                    asignaturas.add(asignatura);
                    
                }else{
                    ois.close();
                    fis.close();
                }
            } while (asignatura != null);
            
            return asignaturas;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoAsignatura.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArchivoAsignatura.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
    
    public ArrayList<Asignatura> obtenerTodosLasAsignaturasForma2(){
        try{
            ArrayList<Asignatura> asignaturas = new ArrayList<>();
            fis = new FileInputStream(file);
            Asignatura asignatura;
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                asignatura = (Asignatura) ois.readObject();
                if (asignatura != null) {
                    asignaturas.add(asignatura);
                }
            }
            ois.close();
            fis.close();
            return asignaturas;
        }catch(FileNotFoundException ex){
            Logger.getLogger(ArchivoAsignatura.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }catch(IOException | ClassNotFoundException ex){
            Logger.getLogger(ArchivoAsignatura.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }

    public void actualizarDatos(Asignatura asignatura) {
        ArrayList <Asignatura> asignaturas = obtenerTodosLasAsignaturasForma2();
        for(int x = 0; x < asignaturas.size(); x++){
            if(asignaturas.get(x).getCodigo().equals(asignatura.getCodigo())){
                asignaturas.remove(x);
                asignaturas.add(x,asignatura);
                break;
            }
        }
        limpiarArchivo();
 
        for(int x = 0 ; x < asignaturas.size(); x++){
            ingresarDato(asignaturas.get(x));
        }
    }

    public void eliminarAsignatura(Asignatura asignatura) {
        ArrayList <Asignatura> asignaturas = obtenerTodosLasAsignaturasForma2();
        for(int x = 0 ; x < asignaturas.size(); x++){
            if(asignaturas.get(x).getCodigo() == asignatura.getCodigo()){
                asignaturas.remove(x);
                break;
            }
        }
        limpiarArchivo();
        
        for(int x = 0 ; x < asignaturas.size(); x++){
            ingresarDato(asignaturas.get(x));
        }
        
    }

}