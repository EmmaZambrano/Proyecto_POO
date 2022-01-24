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
import modelo.Estudiante;
import modelo.Nota;

public class ArchivoEstudiante {

    private String nombre;
    private File file;
    private FileInputStream fis;
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    
    public ArchivoEstudiante() {
        this.nombre = "Estudiantes.dat";
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
            Logger.getLogger(ArchivoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
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

  
    public boolean ingresarDato(Estudiante estudiante) {
        try {
            fos = new FileOutputStream(file,true);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(estudiante);
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

    /** obtener todo
     * @return */
    public ArrayList<Estudiante> obtenerTodosLosEstudiantesForma1() {
        try {
            ArrayList<Estudiante> estudiantes = new ArrayList<>();
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Estudiante estudiante = null;
            do {
                estudiante = (Estudiante) ois.readObject();
                if (estudiante != null) {
                    estudiantes.add(estudiante);
                    
                }else{
                    ois.close();
                    fis.close();
                }
            } while (estudiante != null);
            
            return estudiantes;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArchivoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
    
    public ArrayList<Estudiante> obtenerTodosLosEstudiantesForma2(){
        try{
            ArrayList<Estudiante> estudiantes = new ArrayList<>();
            fis = new FileInputStream(file);
            Estudiante estudiante;
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                estudiante = (Estudiante) ois.readObject();
                if (estudiante != null) {
                    estudiantes.add(estudiante);
                }
            }
            ois.close();
            fis.close();
            return estudiantes;
        }catch(FileNotFoundException ex){
            Logger.getLogger(ArchivoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }catch(IOException | ClassNotFoundException ex){
            Logger.getLogger(ArchivoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }

    public void actualizarDatos(Estudiante estudiante) {
        ArrayList <Estudiante> estudiantes = obtenerTodosLosEstudiantesForma2();
        for(int x = 0; x < estudiantes.size(); x++){
            if(estudiantes.get(x).getIdentificacion() == estudiante.getIdentificacion()){
                estudiantes.remove(x);
                estudiantes.add(x,estudiante);
                break;
            }
        }
        limpiarArchivo();
        
        for(int x = 0 ; x < estudiantes.size(); x++){
            ingresarDato(estudiantes.get(x));
        }    
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        ArrayList <Estudiante> estudiantes = obtenerTodosLosEstudiantesForma2();
        for(int x = 0 ; x < estudiantes.size(); x++){
            if(estudiantes.get(x).getCodigoCarnet() == estudiante.getCodigoCarnet()){
                estudiantes.remove(x);
                break;
            }
        }
        limpiarArchivo();
        for(int x = 0 ; x < estudiantes.size(); x++){
            ingresarDato(estudiantes.get(x));
        }
    }

    public void actualizarAsigEstudiante(Estudiante estudiante, Asignatura asignatura) {
        ArrayList <Estudiante> estudiantes = obtenerTodosLosEstudiantesForma2();
        for(int x = 0 ; x < estudiantes.size(); x++){
            if(estudiantes.get(x).getCodigoCarnet() == estudiante.getCodigoCarnet()){
                for(int y =0; y < estudiantes.get(x).getAsignaturas().size(); y++){
                    if(estudiantes.get(x).getAsignaturas().get(y).getCodigo() == asignatura.getCodigo()){
                        estudiantes.get(x).getAsignaturas().remove(y);
                        estudiantes.get(x).getAsignaturas().add(y,asignatura);
                        break;
                    }
                }
            }
        }
        limpiarArchivo();
        
        for(int x = 0 ; x < estudiantes.size(); x++){
            ingresarDato(estudiantes.get(x));
        }

    }

}