package vista;

import controlador.logica.GestionAsignatura;
import controlador.logica.GestionCurso;
import controlador.logica.GestionDocente;
import controlador.logica.GestionEstudiante;
import controlador.logica.GestionGrado;
import controlador.logica.GestionUsuario;
import controlador.logica.GestionAdministrador;
import controlador.persistencia.ArchivoEstudiante;
import controlador.persistencia.ArchivoGrado;
import controlador.persistencia.ArchivoUsuarios;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import modelo.Asignatura;
import modelo.Colegio;
import modelo.Curso;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Grado;
import modelo.Nota;
import modelo.Usuario;
import vista.PanelActivarNotas;


public class Principal extends javax.swing.JFrame {
  
    PanelAdmin panelAdmin;
    CrearEstudiante panelCrearEstudiante;
    InicioSesion inicioSesion;
    CrearDocentes panelCrearDocentes;  
    CrearAsignaturaPanel crearAsignaturaPanel;
    CrearCursoPanel crearCursoPanel;
    CrearGradoPanel crearGradoPanel;
    PanelDocente panelDocente;
    PanelNotas panelNotas;
    CrearAdministrativo crearAdministrativo;
    GestionAsignatura gestionAsignatura;
    GestionCurso gestionCurso;
    GestionDocente gestionDocente;
    GestionGrado gestionGrado;
    GestionEstudiante gestionEstudiante;
    GestionAdministrador gestionAdministrador;
    ArchivoGrado archivoGrado;
    ArchivoUsuarios archivoUsuario;
    verNotasAdminPanel verNotasAdminPanel;
    PanelDeEstudiante panelDeEstudiante;
    VerNotasDocentePanel verNotasDocentePanel;
    GestionUsuario gestionUsuario;
    ArrayList <Grado> grados;
    PanelActivarNotas panelActivarNotas;
    int cantidadAdministradores;
    ArchivoEstudiante ae;
    
    /** Creates new form Principal */
    public Principal() throws IOException, ClassNotFoundException {
        this.setResizable(false);
        this.setTitle("Colegio");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gestionAsignatura = new GestionAsignatura();
        ae = new ArchivoEstudiante();
        gestionCurso = new GestionCurso();
        gestionDocente = new GestionDocente();
        gestionGrado = new GestionGrado();
        gestionEstudiante = new GestionEstudiante();
        gestionAdministrador=new GestionAdministrador();
        archivoGrado = new ArchivoGrado();
        archivoUsuario = new ArchivoUsuarios();
        this.panelCrearEstudiante = new CrearEstudiante(this);
        this.panelAdmin = new PanelAdmin(this);
        this.inicioSesion = new InicioSesion(this);
        this.panelCrearDocentes = new CrearDocentes(this);
        this.crearAsignaturaPanel = new CrearAsignaturaPanel(this);
        this.crearCursoPanel = new CrearCursoPanel(this);
        this.crearGradoPanel = new CrearGradoPanel(this);
        this.panelDocente = new PanelDocente(this);
        this.panelNotas = new PanelNotas(this);
        this.verNotasAdminPanel = new verNotasAdminPanel(this);
        this.panelDeEstudiante = new PanelDeEstudiante(this);
        this.verNotasDocentePanel = new VerNotasDocentePanel(this);
        this.gestionUsuario = new GestionUsuario();
        this.crearAdministrativo =new CrearAdministrativo(this);
        this.grados= new ArrayList<>();
        this.panelActivarNotas=new PanelActivarNotas(this);
        LayoutManager layoutManager = getContentPane().getLayout();
        initComponents();
        setLayout(layoutManager);
        irAPanelSesion();
        
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new Principal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    // End of variables declaration//GEN-END:variables
    /**
     * metodo para ir al panel de inicio de sesion
     */
    protected void irAPanelSesion(){
        quitarTodosLosPaneles();
        inicioSesion.setVisible(true);
        inicioSesion.setEnabled(true);
        add(inicioSesion);
        pack();
        setLocationRelativeTo(null);
    }
    /**
     * metodo para ir al panel de administrador
     */
    protected void irAPanelAdmin(){
        quitarTodosLosPaneles();
        panelAdmin.setVisible(true);
        panelAdmin.setEnabled(true); 
        add(panelAdmin);
        pack();
        setLocationRelativeTo(null);
    }
    /**
     * metodo para quitar todos los paneles
     */
    protected void quitarTodosLosPaneles(){
        this.remove(panelAdmin);
        this.remove(panelCrearEstudiante);
        this.remove(panelCrearDocentes);
        this.remove(inicioSesion);
        this.remove(crearAsignaturaPanel);
        this.remove(crearCursoPanel);
        this.remove(crearGradoPanel);
        this.remove(panelDocente);
        this.remove(panelNotas);
        this.remove(verNotasAdminPanel);
        this.remove(panelDeEstudiante);
        this.remove(verNotasDocentePanel);
        this.remove(crearAdministrativo);
        this.remove(panelActivarNotas);
    }
    /**
     * metodo para ir al panel de crear estudiantes
     */
    protected void irACrearEstudiante() {
        quitarTodosLosPaneles();
        panelCrearEstudiante.setVisible(true);     
        panelCrearEstudiante.setEnabled(true);
        add(panelCrearEstudiante);
        pack();
        setLocationRelativeTo(null);
    }
    
    protected void irAPanelVerNotaDocente(){
        quitarTodosLosPaneles();
        verNotasDocentePanel.setVisible(true);     
        verNotasDocentePanel.setEnabled(true);
        add(verNotasDocentePanel);
        pack();
        setLocationRelativeTo(null);
    } 
    
    protected void irACrearDocente() {
        quitarTodosLosPaneles();
        panelCrearDocentes.setVisible(true);     
        panelCrearDocentes.setEnabled(true);
        add(panelCrearDocentes);
        pack();
        setLocationRelativeTo(null);
     }
    /**
     * metodo para ir al panel de crear asignatura
     */
    protected void irACrearAsignatura(){
        quitarTodosLosPaneles();
        crearAsignaturaPanel.setVisible(true);
        crearAsignaturaPanel.setEnabled(true);
        add(crearAsignaturaPanel);
        pack();
        setLocationRelativeTo(null);
    }
    /**
     * metodo para ir al panel de crear curso
     */
    protected void irACrearCurso(){
        quitarTodosLosPaneles();
        crearCursoPanel.setVisible(true);
        crearCursoPanel.setEnabled(true);
        add(crearCursoPanel);
        pack();
        setLocationRelativeTo(null);
    }
    /**
     * metodo para ir al panel de crear grado
     */
    protected void irACrearGrado(){
        quitarTodosLosPaneles();
        crearGradoPanel.setVisible(true);
        crearGradoPanel.setEnabled(true);
        add(crearGradoPanel);
        pack();
        setLocationRelativeTo(null);
    }
    /**
     * metodo para ir al panel de crear docente
     */
    protected void irAPanelDocente(){
        quitarTodosLosPaneles();
        panelDocente.setVisible(true);
        panelDocente.setEnabled(true);
        add(panelDocente);
        pack();
        setLocationRelativeTo(null);
    }
    /**
     * metodo para ir al panel de crear nota
     */
    protected void irAPanelNota(){
        quitarTodosLosPaneles();
        panelNotas.setVisible(true);
        panelNotas.setEnabled(true);
        add(panelNotas);
        pack();
        setLocationRelativeTo(null);
    }
    protected void irAPanelCrearAdmin(){
        quitarTodosLosPaneles();
        crearAdministrativo.setVisible(true);
        crearAdministrativo.setEnabled(true); 
        add(crearAdministrativo);
        pack();
        setLocationRelativeTo(null);
    }
    protected void irActivarNotas() {
        quitarTodosLosPaneles();
        panelActivarNotas.setVisible(true);
        panelActivarNotas.setEnabled(true); 
        add(panelActivarNotas);
        pack();
        setLocationRelativeTo(null);
    }
    /**
     * metodo para ir al panel de asistencia
     */
   
    protected int cantidadDeGrados() {
        return gestionGrado.cantidadDeGrados();
    }

    protected String[] grados() {
        return gestionGrado.gradosToStringArray();
    }

    protected boolean crearGrado(int id, String nombre) {
        return  gestionGrado.crearGrado(id,nombre);
    }

    protected String[] gradoPorID(int i) {
        return gestionGrado.gradosIDToStringArray(i);
    }

    protected String cargarCursosDelGrado(int id){
        return gestionGrado.cargarCursosDelGrado(id);
    }

    protected int cantidadDeCursos() {
        return gestionCurso.cantidadDeCursos();
    }

    protected String[] cursos() {
        return gestionCurso.cursosToStringArray();
    }

    protected boolean existeCurso(int id) {
        return gestionCurso.existeCurso(id);
    }

    protected boolean crearCurso(int id, String nombre, int gradoDI) {
        Curso curso =  gestionCurso.crearCurso(id,nombre,null,null);
        curso =  gestionGrado.agregarCursoAlGrado(curso,gradoDI);
        return true;
    }

    protected String[] cursoPorID(int i) {
        return gestionCurso.cursoIDToStringArray(i);
    }
    
    protected String cargarDDaatosDelCurso(int id) {
        return gestionCurso.cargarDATOSDelCurso(id);
    }

    protected int cantidadDeAsignaturas() {
        return gestionAsignatura.cantidadDeAsignaturas();
    }

    protected String[] Asignaturas() {
        return gestionAsignatura.asignaturasToStringArray();
    }

    protected boolean existeAsignatura(String id) {
        return gestionAsignatura.existeAsignatura(id);
    }

    protected boolean crearAsignatura(String id, String nombre, int creditos, int cursoDI) {
        Asignatura asignatura =  gestionAsignatura.crearAsignatura(id,nombre,creditos,null,null);
        asignatura =  gestionCurso.agregarAsignaturaAlCurso(asignatura,cursoDI);
        return true;
    }
 
    protected String[] asignaturaPorID(int i) {
        return gestionAsignatura.asignaturasIDToStringArray(i);
    }

    protected boolean existeEstudiante(long documento,int codigoCarnet) {
        return gestionEstudiante.existeAlumno(documento,codigoCarnet);
    }
 
    protected boolean crearEstudiante(long documento, int codigoCarnet, int edad, int telefono, String nombre, String apellido, String rh, int cursoID) {
        Estudiante estudiante =  gestionEstudiante.crearEstudiante(documento,codigoCarnet,edad,telefono,nombre,apellido,null,rh);
        estudiante =  gestionCurso.agregarEstudianteAlCurso(estudiante,cursoID);
        estudiante = gestionCurso.agregarAsignaturasAlEstudiante(estudiante,cursoID);
        return true;
    }
   
    protected String[] AlumnoPorID(int i) {
        return gestionEstudiante.alumnosIDToStringArray(i);
    }

    protected String[] alumnos() {
        return gestionEstudiante.alumnosToStringArray();
    }

    protected int cantidadDeAlumnos() {
        return gestionEstudiante.cantidadDeAlumnos();
    }

    protected boolean existeDocente(long documento,int codigoCarnet) {
        return gestionDocente.existeDocente(documento,codigoCarnet);
    }

    protected boolean crearDocente(long documento, int codigoCarnet, int edad, long telefono, String nombre, String apellido, String rh, int cursoID,int asignaturaID) {
        Docente docente =  gestionDocente.crearDocente(documento,codigoCarnet,edad,telefono,nombre,apellido,rh,null,null);
        Asignatura asignatura = gestionAsignatura.obtenerAsignatura(asignaturaID);
        docente =  gestionCurso.agregarDocenteAlCurso(docente,cursoID);
        docente = gestionDocente.agregarAsignaturaAlDocente(docente,asignatura);
        return true;
    }
    
    protected void eliminarDocente(Docente docente){
        gestionCurso.eliminarDocenteDelCurso(docente);
        gestionDocente.eliminarDocente(docente);
    }
 
    protected String[] DocentePorID(int i) {
        return gestionDocente.DocenteIDToStringArray(i);
    }

    protected String cargarAlumnosCreados() {
        return gestionEstudiante.cargarAlumnosCreados();
    }

    protected String cargarDocentesCreados() {
        return gestionDocente.cargarDocentesCreados();
    }

    protected int cantidadDeDocentes() {
        return gestionDocente.cantidadDeDocentes();
    }

    protected String[] Docentes() {
        return gestionDocente.docentesToStringArray();
    }

    protected String cargarAsignaturasCreadas() {
        return gestionAsignatura.asignaturasCreadas();
    }

    protected void irAlPanelEstudiante() {
        quitarTodosLosPaneles();
        panelDeEstudiante.setVisible(true);     
        panelDeEstudiante.setEnabled(true);
        add(panelDeEstudiante);
        pack();
        setLocationRelativeTo(null);
    }

    protected boolean existeGrado(int id) {
        return gestionGrado.existeGrado(id);
    }

    protected String[] alumnos(int x) {
        return gestionEstudiante.alumnosToStringArray(x);
    }

    protected String cargarNotasDelAlumno(int codigoCarnet, String codigoAsig) {
        return gestionEstudiante.cargarNotasDelAlumno(codigoCarnet,codigoAsig);
    }
    
    protected void irAPanelVerNotas(){
        quitarTodosLosPaneles();
        verNotasAdminPanel.setVisible(true);
        verNotasAdminPanel.setEnabled(true);
        add(verNotasAdminPanel);
        pack();
        setLocationRelativeTo(null);
    }

    protected boolean crearNotaDelEstudiante(int codigoCurso, int codigoAlumno, String codigoAsignatura, String nombreNota, double nota) {
        Nota n = gestionEstudiante.crearNota(codigoCurso,codigoAlumno,codigoAsignatura,nombreNota,nota,null,null); 
        if(n != null){
            n = gestionEstudiante.agregarNotaAlEstudiante(n,codigoAlumno,codigoCurso,codigoAsignatura);
            return true;
        }
        return false;
    }

    protected boolean crearUsuario(int roll,String user, String password) {
        return gestionUsuario.crearUsuario(roll,user, password);
    }

    protected boolean crearArchivo() {
        return archivoUsuario.crearArchivo();
    }

    public boolean existeAdministrador(long documento, int codigoCarnet) {
        return gestionAdministrador.existeAdministrador(documento,codigoCarnet);
    }

    public boolean CrearAdministrador(long documento, int codigoCarnet, int edad, int telefono, String nombre, String apellido, String rh) {
        return gestionAdministrador.CrearAdministrador(documento,codigoCarnet,edad,telefono,nombre,apellido,rh); 
    }

    public int cantidadAdministradores() {
        return gestionAdministrador.CantidadAdministradores();
    }

    public String[] datosAdministradores() {
        return gestionAdministrador.datosAdministradores();
    }

    public String[] traerAdministrador(int a) {
        return gestionAdministrador.traerAdministrador(a);
    }

    public void borrarAdministrador(int a ) {
        gestionAdministrador.borrarAdministrador(a);
    }

    public String cargarTextArea() {
        return gestionAdministrador.cargarTextArea();
    }

    public boolean existeAdmin(String usuario, int contrasenia) {
        return gestionAdministrador.ingresoAdmin(usuario,contrasenia);
        
    }

    protected String[] AlumnoPorID(int codigoAlumno,String codigoAsignatura,int notaID) {
        return gestionEstudiante.notasIDToStringArray(codigoAlumno,codigoAsignatura,notaID);
    }

    protected boolean existeUsuario(int roll, String user) {
        return gestionUsuario.existeUsuario(roll,user);
    }

    protected boolean validarUsuario(int roll, String user, String password) {
        return gestionUsuario.validarParaEntrar(roll,user,password);
    }

    protected boolean activarNota() {
        boolean activacion= panelActivarNotas.informacionActivacion();
        return activacion;
    }

    protected boolean eliminarNota(int codigoAlumno, String codigoAsignatura, int notaID) {
        gestionEstudiante.eliminarNotaDelEstudiante(codigoAlumno,notaID);
        gestionEstudiante.eliminarNota(notaID);
        return true;
    }

    protected boolean crearNotaSinMover(int codigoCurso, int codigoAlumno, String codigoAsignatura, String nombreNota, double nota, int notaID) {
        Nota n = gestionEstudiante.crearNotaSinMover(codigoCurso,codigoAlumno,codigoAsignatura,nombreNota,nota,null,null,notaID); 
        n = gestionEstudiante.agregarNotaAlEstudianteSinMover(n,codigoAlumno,codigoCurso,codigoAsignatura,notaID);
        return true;
    }

    protected boolean eliminarDocente(int docenteID) {
        Docente docente = gestionDocente.obtenerDocente(docenteID);
        gestionCurso.eliminarDocenteDelCurso(docente);
       // gestionAsignatura.eliminarDocenteDeLaAsignatura(docente);
        gestionDocente.eliminarDocente(docente,docenteID);
        return true;
    }

    protected boolean eliminarEstudiante(int estudianteID) {
        Estudiante estudiante = gestionEstudiante.obtenerEstudiante(estudianteID);
        gestionCurso.eliminarEstudianteDelCurso(estudiante);
        gestionEstudiante.eliminarEstudiante(estudiante,estudianteID);
        return true;
    }

    protected boolean modificarAlumno(String nombre, String apellido, int edad, long documento, long telefono, int codigoCarnet, String rh, int cursoID, int alumnoID) {
        Curso cursoAnterior = gestionEstudiante.obtenerCursoAnteriorDelEstudiante(alumnoID);
        ArrayList <Asignatura> asignaturasAnteriores = gestionEstudiante.obtenerAsignaturasAnterioresEstudiante(alumnoID);
        ArrayList <Nota> notasAnteriores = gestionEstudiante.obtenerNotasAnteriores(alumnoID);
        eliminarEstudiante(alumnoID);
        Estudiante alumno = gestionEstudiante.crearEstudianteSinMover(documento, codigoCarnet, edad, telefono, nombre, apellido, cursoAnterior, rh,alumnoID,cursoAnterior);
        if(cursoID > 0){
            alumno = gestionCurso.agregarEstudianteAlCurso(alumno, cursoID-1);
            alumno = gestionCurso.agregarAsignaturasAlEstudiante(alumno, cursoID-1);
        }else{
            for(int x = 0 ; x < asignaturasAnteriores.size(); x++){
                alumno.getAsignaturas().add(asignaturasAnteriores.get(x));
            }
            
            for(int x = 0 ;x < notasAnteriores.size(); x++){
                alumno.getNotasFinales().add(notasAnteriores.get(x));
            }
            ae.actualizarDatos(alumno);
        }
        
        return true;
    }

    protected boolean modificarDocente(String nombre, String apellido, int edad, long documento, long telefono, String rh,int codigoCarnet ,int cursoID, int asignaturaID, int docenteID) {
        ArrayList<Curso> cursosAnteriores = gestionDocente.obtenerCursoDelDocente(docenteID);
        ArrayList<Asignatura> asignaturasAnteriores= gestionDocente.obtenerAsignaturasDelDocente(docenteID);
        eliminarDocente(docenteID);
        Docente docente =  gestionDocente.crearDocente(documento,codigoCarnet,edad,telefono,nombre,apellido,rh,null,null);
        if(cursoID > 0){
           docente = gestionCurso.agregaCursosAnteriores(docente, cursosAnteriores);
           docente =  gestionCurso.agregarDocenteAlCurso1(docente,cursoID-1);
        }else{
            docente = gestionCurso.agregaCursosAnteriores(docente, cursosAnteriores);
        }
        if(asignaturaID >0){
            Asignatura asignaturaNueva = gestionAsignatura.obtenerAsignatura(asignaturaID-1);
            docente = gestionDocente.agregarAsignaturasAnterioresAlDocente(docente, asignaturasAnteriores);
            docente = gestionDocente.agregarAsignaturaAlDocente1(docente,asignaturaNueva); 
        }else{
            docente = gestionDocente.agregarAsignaturasAnterioresAlDocente(docente, asignaturasAnteriores);
        }
        return true;
    }

    protected boolean eliminarUnCursoDelDocente(int idCurso, int docenteID) {
        boolean opc;
        boolean opc1;
        opc = gestionDocente.eliminarUnCursoDelDocente(idCurso,docenteID);
        Docente docente = gestionDocente.obtenerDocente(docenteID);
        opc1 = gestionCurso.eliminarDocenteDeUnCurso(docente,idCurso);
        if(opc && opc1){
            return true;
        }else{
            return false;
        }
    }

    protected boolean eliminarUnaAsignaturaDelDocente(String codigoAsignatura,int docenteID) {
        boolean opc = gestionDocente.eliminarUnaAsignaturaDelDocente(codigoAsignatura,docenteID);
        if(opc){
            return true;
        }else{
            return false;
        }
    }

}