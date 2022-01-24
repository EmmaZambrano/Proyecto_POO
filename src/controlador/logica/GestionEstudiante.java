package controlador.logica;

import controlador.persistencia.ArchivoCurso;
import controlador.persistencia.ArchivoDocente;
import controlador.persistencia.ArchivoEstudiante;
import controlador.persistencia.ArchivoGrado;
import controlador.persistencia.ArchivoAsignatura;
import controlador.persistencia.ArchivoNota;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Asignatura;
import modelo.Curso;
import modelo.Estudiante;
import modelo.Nota;

public class GestionEstudiante {
 
    ArrayList <Estudiante> estudiantes;
    ArrayList <Nota> notas;
    ArchivoEstudiante archivoEstudiante;
    ArchivoCurso archivoCurso;
    ArchivoAsignatura archivoAsignatura;
    ArchivoDocente archivoDocente;
    ArchivoGrado archivoGrado;
    ArchivoNota archivoNota;
    
    public GestionEstudiante() {
        this.archivoCurso = new ArchivoCurso();
        this.archivoNota = new ArchivoNota();
        this.archivoAsignatura = new ArchivoAsignatura();
        this.archivoDocente = new ArchivoDocente();
        this.archivoGrado = new ArchivoGrado();
        this.archivoEstudiante = new ArchivoEstudiante();
        defecto();
        cargarDatos();
    }

    public boolean existeAlumno(long documento, int codigoCarnet) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getIdentificacion()== documento || estudiantes.get(i).getCodigoCarnet() == codigoCarnet) {
                return true;
            }
        }
        return false;
    }

    public Estudiante crearEstudiante(long documento, int codigoCarnet, int edad, long telefono, String nombre, String apellido, Curso curso,String rh) {
        Estudiante estudiante = new Estudiante (codigoCarnet, nombre, apellido, edad,telefono, rh, documento);
        estudiante.setCurso(curso);
        estudiante.setMatricula(true);
        estudiantes.add(estudiante);
        archivoEstudiante.ingresarDato(estudiante);
        return estudiante;
    }

    public int cantidadDeAlumnos() {
        return estudiantes.size();
    }

    public String[] alumnosIDToStringArray(int i) {
        Estudiante estudiante = estudiantes.get(i);
        String alumnoToString[] = new String[8];
        alumnoToString[0] = estudiante.getNombre();
        alumnoToString[1] = estudiante.getApellido();
        alumnoToString[2] = estudiante.getCodigoCarnet()+"";
        alumnoToString[3] = estudiante.getIdentificacion()+"";
        alumnoToString[4] = estudiante.getEdad()+"";
        alumnoToString[5] = estudiante.getTelefono()+"";
        alumnoToString[6] = estudiante.getRh();
        return alumnoToString;
    }

    public String[] alumnosToStringArray() {
        String estudiantesToString[] = new String[cantidadDeAlumnos()];
        for (int i = 0; i < estudiantes.size(); i++) {
            estudiantesToString[i] = estudiantes.get(i).getNombre();
        }
        return estudiantesToString;
    }

    public String cargarAlumnosCreados() {
        String alumnosCreados="";
        alumnosCreados = "Historial de todos los alumnos matriculados:\n\n";
        for (int i = 0; i < estudiantes.size(); i++) {
            alumnosCreados += estudiantes.get(i).toString();
        }
        return alumnosCreados;
    }

    public String[] alumnosToStringArray(int cursoID) {
        String alumnosToString[] = new String[cantidadDeAlumnos()];
        for (int i = 0; i < estudiantes.size(); i++) {
            if(estudiantes.get(i).getCurso().getId() == cursoID){
                alumnosToString[i]=estudiantes.get(i).getNombre();
            }   
        }
        return alumnosToString;
    }

    public String cargarNotasDelAlumno(int codigoCarnet,String codigoAsig) {
       try{
           double promedioMateria=0;
           double promedioGeneral=0;
           double contadorMateria=0;
           double contadorGeneral=0;
           String lasNotas="";
           Estudiante estudiante=null;
           boolean opc=false;
           ArrayList <Nota> notass = new ArrayList<>();
           String colegio = "Colegio EducaYA\n\n ";
           
           for(int x =0 ; x < estudiantes.size(); x++){
               if(estudiantes.get(x).getCodigoCarnet() == codigoCarnet){
                   estudiante = estudiantes.get(x);
               }
           }
           
            for(int x = 0 ; x < estudiante.getNotasFinales().size(); x++){
                if(estudiante.getNotasFinales().get(x).getAsignaturas().getCodigo().equals(codigoAsig)){
                    notass.add(estudiante.getNotasFinales().get(x));
                    opc=true;
                }
            }
            if(opc){
                if(estudiante.getMatricula()){
                    colegio += "estado de la matricula:  valido\n\n";
                }else{
                    colegio +="estado de la matricula:  invalido\n\n";
                }

                colegio += estudiante.getNombre()+" "+estudiante.getApellido()+"------"+estudiante.getCurso().getNombre()+"\n\n";

                for(int x = 0 ; x < notass.size(); x++){
                    lasNotas+= notass.get(x).toString();
                    promedioMateria+= notass.get(x).getNotaFinal();
                    contadorMateria++;
                }

                for(int x = 0 ; x < estudiante.getNotasFinales().size(); x++){
                    promedioGeneral += estudiante.getNotasFinales().get(x).getNotaFinal();
                    contadorGeneral++;
                }
                
                promedioMateria = promedioMateria / contadorMateria;
                promedioGeneral = promedioGeneral/ contadorGeneral;
                String pasandoMateria ="";
                String pasandoAnio="";
                if(promedioMateria > 3.0){
                    pasandoMateria ="-----el estudiante va pasando la materia";
                }else{
                    pasandoMateria ="-----el estudiante va perdiendo la materia";
                }
                if(promedioGeneral > 3.0){
                    pasandoAnio =   "-----el estudiante va pasando el año";
                }else{
                    pasandoAnio="-----el estudiante va perdiendo el año";
                }
                return colegio+lasNotas+"\n\n"+"promedio de la materia: "+promedioMateria+pasandoMateria+"\n\n"+"promedio en general: "+promedioGeneral+pasandoAnio;
            }
        JOptionPane.showMessageDialog(null, "no hay notas para mostrar ya que algun dato no corresponde","notas",JOptionPane.INFORMATION_MESSAGE);
        return null;
        }catch(ArrayIndexOutOfBoundsException  e){
            JOptionPane.showMessageDialog(null,"no se pueden mostrar los datos debido a un error inesperado","estudiantes",JOptionPane.ERROR_MESSAGE);
            return "";
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"no se pueden mostrar los datos del estudiante ya que pueden faltar datos ","estudiantes",JOptionPane.ERROR_MESSAGE);
            return "";
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "error al cargar notas, el estudiante no existe o la asignatura no existe","notas",JOptionPane.INFORMATION_MESSAGE);
            return "";
        }
    }

    public Nota crearNota(int codigoCurso, int codigoAlumno, String codigoAsignatura, String nombreNota, double nota,Asignatura asignatura,Estudiante estudiante) {
        for(int x = 0 ; x < estudiantes.size(); x++){
            if(estudiantes.get(x).getCodigoCarnet() == codigoAlumno){
                if(estudiantes.get(x).getCurso().getId() == codigoCurso){
                    for(int y = 0 ; y < estudiantes.get(x).getAsignaturas().size(); y++){
                        if(estudiantes.get(x).getAsignaturas().get(y).getCodigo().equals(codigoAsignatura)){
                            Nota n = new Nota (nota, nombreNota);
                            n.setAsignaturas(asignatura);
                            n.setEstudiante(estudiante);
                            notas.add(n);
                            archivoNota.ingresarDato(n);
                            return n;
                        }
                    }
                }
            }
        }
        Nota no = null;
        return no;
    }
  
    public String[] notasIDToStringArray(int codigoAlumno,String codigoAsignatura ,int notaID) {
        try{
            ArrayList <Nota> notass = new ArrayList<>();
            Estudiante estudiante = null;
            Asignatura asignatura = null;
            boolean opc=false;
            int a=0;
            for(int x = 0 ; x < estudiantes.size(); x++){
                if(estudiantes.get(x).getCodigoCarnet() == codigoAlumno){
                    estudiante = estudiantes.get(x);
                    opc=true;
                }
            }
            
            for(int x = 0 ; x < estudiante.getNotasFinales().size(); x++){
                if(estudiante.getNotasFinales().get(x).getAsignaturas().getCodigo().equals(codigoAsignatura)){
                    asignatura = estudiante.getNotasFinales().get(x).getAsignaturas();
                    notass.add(estudiante.getNotasFinales().get(x));
                    opc=true;
                }
            }
            if(opc){
                String notasToString [] = new String[10];
                notasToString[1]=estudiante.getCodigoCarnet()+"";
                notasToString[0]= estudiante.getCurso().getId()+"";
                notasToString[2]= asignatura.getCodigo()+"";
                notasToString[3]= asignatura.getNombre();
                notasToString[4]= notass.get(notaID).getNombreNota();
                notasToString[5]= notass.get(notaID).getNotaFinal()+"";
                return notasToString;
            
            }
            JOptionPane.showMessageDialog(null, "alumno no existe","notas",JOptionPane.INFORMATION_MESSAGE);
            return null;
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "error al cargar la nota, algun dato esta mal o esta no existe en el sistema","notas",JOptionPane.ERROR_MESSAGE);
            return null;
       }
    }


    private void cargarDatos() {
        this.estudiantes = archivoEstudiante.obtenerTodosLosEstudiantesForma2();
        this.notas = archivoNota.obtenerTodosLasNotasForma2();
    }

    private void defecto() {
        Estudiante estudiante = null;
        Nota n = null;
        archivoEstudiante.ingresarDato(estudiante);
        archivoNota.ingresarDato(n);
    }

    public Nota agregarNotaAlEstudiante(Nota n,int codigoAlumno,int codigoCurso, String codigoAsignatura) {
        for(int x = 0 ; x < estudiantes.size(); x++){
            if(estudiantes.get(x).getCodigoCarnet() == codigoAlumno){
                for(int y = 0 ; y < estudiantes.get(x).getAsignaturas().size(); y++){
                    if(estudiantes.get(x).getAsignaturas().get(y).getCodigo().equals(codigoAsignatura)){
                        estudiantes.get(x).getNotasFinales().add(n);
                        estudiantes.get(x).getAsignaturas().get(y).getNotas().add(n);
                        Estudiante estudiante = estudiantes.get(x);
                        Asignatura asignatura = estudiantes.get(x).getAsignaturas().get(y);
                        n.setAsignaturas(asignatura);
                        n.setEstudiante(estudiante);
                        archivoEstudiante.actualizarDatos(estudiante);
                        archivoEstudiante.actualizarAsigEstudiante(estudiante, asignatura);
                        archivoNota.actualizarDatos(n);
                        return n;
                    }
                }
            
            }
        }

        return null;
    }

    public void eliminarNotaDelEstudiante(int codigoAlumno, int notaID) {
        for(int x = 0 ; x < estudiantes.size(); x++){
            if(estudiantes.get(x).getCodigoCarnet() == codigoAlumno){
                estudiantes.get(x).getNotasFinales().remove(notaID);
                Estudiante estudiante = estudiantes.get(x);
                archivoEstudiante.actualizarDatos(estudiante);
                break;
            }
            
        }
    }

    public void eliminarNota(int notaID) {
        notas.remove(notaID);
        archivoNota.eliminarNota(notaID);
    }

    public Nota crearNotaSinMover(int codigoCurso, int codigoAlumno, String codigoAsignatura, String nombreNota, double nota, Asignatura asignatura, Estudiante estudiante, int notaID) {
        Nota n = new Nota (nota, nombreNota);
        n.setAsignaturas(asignatura);
        n.setEstudiante(estudiante);
        notas.add(notaID,n);
        archivoNota.ingresarDato(n);
        return n;
    }

    public Nota agregarNotaAlEstudianteSinMover(Nota n, int codigoAlumno, int codigoCurso, String codigoAsignatura, int notaID) {
        for(int x = 0 ; x < estudiantes.size(); x++){
            if(estudiantes.get(x).getCodigoCarnet() == codigoAlumno){
                for(int y = 0 ; y < estudiantes.get(x).getAsignaturas().size(); y++){
                    if(estudiantes.get(x).getAsignaturas().get(y).getCodigo().equals(codigoAsignatura)){
                        estudiantes.get(x).getNotasFinales().add(notaID,n);
                        estudiantes.get(x).getAsignaturas().get(y).getNotas().add(notaID,n);
                        Estudiante estudiante = estudiantes.get(x);
                        Asignatura asignatura = estudiantes.get(x).getAsignaturas().get(y);
                        n.setAsignaturas(asignatura);
                        n.setEstudiante(estudiante);
                        archivoEstudiante.actualizarDatos(estudiante);
                        archivoEstudiante.actualizarAsigEstudiante(estudiante, asignatura);
                        archivoNota.actualizarDatos(n);
                        return n;
                    }
                }
            }
        }
        return null;
    }

    public Estudiante obtenerEstudiante(int estudianteID){
        return estudiantes.get(estudianteID);
    }

    public boolean eliminarEstudiante(Estudiante estudiante,int estudianteID) {
        estudiantes.remove(estudianteID);
        archivoEstudiante.eliminarEstudiante(estudiante);
        return true;
    }  

    public Curso obtenerCursoAnteriorDelEstudiante(int alumnoID) {
        return estudiantes.get(alumnoID).getCurso();
    }

    public ArrayList<Asignatura> obtenerAsignaturasAnterioresEstudiante(int alumnoID) {
        return estudiantes.get(alumnoID).getAsignaturas();
    }

    public ArrayList<Nota> obtenerNotasAnteriores(int alumnoID) {
        return estudiantes.get(alumnoID).getNotasFinales();
    }

    public Estudiante crearEstudianteSinMover(long documento, int codigoCarnet, int edad, long telefono, String nombre, String apellido, Curso cursoAnterior, String rh, int alumnoID,Curso curso) {
        Estudiante estudiante = new Estudiante (codigoCarnet, nombre, apellido, edad,telefono, rh, documento);
        estudiante.setCurso(curso);
        estudiante.setMatricula(true);
        estudiantes.add(alumnoID,estudiante);
        archivoEstudiante.ingresarDato(estudiante);
        return estudiante;
    }

}