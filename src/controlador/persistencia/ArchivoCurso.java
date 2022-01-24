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

public class ArchivoCurso {
    private String nombre;
    private File file;
    private FileInputStream fis;
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    
    public ArchivoCurso() {
        this.nombre = "Curso.dat";
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
            Logger.getLogger(ArchivoCurso.class.getName()).log(Level.SEVERE, null, ex);
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

  
    public boolean ingresarDato(Curso curso) {
        try {
            fos = new FileOutputStream(file,true);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(curso);
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
     * @return*/
    public ArrayList<Curso> obtenerTodosLosCursosForma1() {
        try {
            ArrayList<Curso> cursos = new ArrayList<>();
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Curso curso = null;
            do {
                curso = (Curso) ois.readObject();
                if (curso != null) {
                    cursos.add(curso);
                    
                }else{
                    ois.close();
                    fis.close();
                }
            } while (curso != null);
            
            return cursos;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoCurso.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArchivoCurso.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
    
    public ArrayList<Curso> obtenerTodosLosCursosForma2(){
        try{
            ArrayList<Curso> cursos = new ArrayList<>();
            fis = new FileInputStream(file);
            Curso curso;
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                curso = (Curso) ois.readObject();
                if (curso != null) {
                    cursos.add(curso);
                }
            }
            ois.close();
            fis.close();
            return cursos;
        }catch(FileNotFoundException ex){
            Logger.getLogger(ArchivoCurso.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }catch(IOException | ClassNotFoundException ex){
            Logger.getLogger(ArchivoCurso.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }    

    public void actualizarDatos(Curso curso) {
        ArrayList <Curso> cursos = obtenerTodosLosCursosForma2();
        for(int x = 0; x < cursos.size(); x++){
            if(cursos.get(x).getId() == curso.getId()){
                cursos.remove(x);
                cursos.add(x,curso);
                break;
            }
        }
        limpiarArchivo();
        
        for(int x = 0 ; x < cursos.size(); x++){
            ingresarDato(cursos.get(x));
        }
    }
}