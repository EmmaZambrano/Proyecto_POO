package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CrearDocentes extends javax.swing.JPanel{
    Principal principal;
    Timer actualizar;
    Timer actualizar1;
    
    public CrearDocentes(Principal principal) {
        this.principal = principal;
        initComponents();
        habilitarComponentes();
        cargarDocentesAlComboBox();
        cargarDocentesCreados();
        this.actualizar=new Timer(10000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                actualizar(evt);
            }
            private void actualizar(ActionEvent evt) {
                cargarDatos();
            }
        });
        actualizar.start();
        this.actualizar1=new Timer(5000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                actualizar(evt);
            }
            private void actualizar(ActionEvent evt) {
                cargarDocentesCreados();
            }
        });
        actualizar1.start();
    }
    /**
     * metodo para limpiar los TextFiedl
     */
    private void limpiar(){
        this.jTextFieldNombreDocente.setText("");
        this.jTextFieldApellidoDocente.setText("");
        this.jTextFieldEdadDocente.setText("");
        this.jTextFieldTelefonoDocente.setText("");
        this.jTextFieldRHDocente.setText("");
        this.jTextFieldTICC.setText("");
        this.jTextFieldCodigoCarnet.setText("");
//        this.jComboBoxSeleccionAsignatura.setSelectedIndex(0);
//        this.jComboBoxSeleccionCurso.setSelectedIndex(0);
  //      this.jComboBoxSeleccionDocente.setSelectedIndex(0);
        habilitarComponentes();
    }
    
    protected void irAPanelAdmin(){
        habilitarComponentes();
        limpiar();
        principal.irAPanelAdmin();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelDocente = new javax.swing.JLabel();
        jLabelNombreDocente = new javax.swing.JLabel();
        jLabelApellidoDocente = new javax.swing.JLabel();
        jLabelEdadDocente = new javax.swing.JLabel();
        jLabelRhDocente = new javax.swing.JLabel();
        jLabelTelefonoDocente = new javax.swing.JLabel();
        jTextFieldNombreDocente = new javax.swing.JTextField();
        jTextFieldApellidoDocente = new javax.swing.JTextField();
        jTextFieldEdadDocente = new javax.swing.JTextField();
        jTextFieldTelefonoDocente = new javax.swing.JTextField();
        jTextFieldRHDocente = new javax.swing.JTextField();
        jTextFieldCodigoCarnet = new javax.swing.JTextField();
        jLabelCCTIDocente = new javax.swing.JLabel();
        jLabelCodigoCarnet = new javax.swing.JLabel();
        jTextFieldTICC = new javax.swing.JTextField();
        jButtonAceptarDocente = new javax.swing.JButton();
        jButtonLimpiarDocente = new javax.swing.JButton();
        jButtonVolverDocente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDatosDelDocente = new javax.swing.JTextArea();
        jLabeltitulo = new javax.swing.JLabel();
        jButtonCargarDocente = new javax.swing.JButton();
        jLabelAsignatura1 = new javax.swing.JLabel();
        jComboBoxSeleccionDocente = new javax.swing.JComboBox<>();
        jLabelCurso = new javax.swing.JLabel();
        jComboBoxSeleccionCurso = new javax.swing.JComboBox<>();
        jButtonModificarDocente = new javax.swing.JButton();
        jButtonEliminarDocente = new javax.swing.JButton();
        jComboBoxSeleccionAsignatura = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jButtonEliminarCurso = new javax.swing.JButton();
        jLabelAsignatura2 = new javax.swing.JLabel();
        jButtonAgregarNuevaAsignatura = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelAsignatura4 = new javax.swing.JLabel();
        jTextFieldCursoPaEliminar = new javax.swing.JTextField();
        jTextFieldAsignaturaAEliminar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelAsignatura5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel1.setText("jLabel1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDocente.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabelDocente.setText("Crear docentes");
        add(jLabelDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        jLabelNombreDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombreDocente.setText("Nombre:");
        add(jLabelNombreDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 72, -1, -1));

        jLabelApellidoDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelApellidoDocente.setText("Apellido:");
        add(jLabelApellidoDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 121, -1, -1));

        jLabelEdadDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEdadDocente.setText("Edad:");
        add(jLabelEdadDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 168, -1, -1));

        jLabelRhDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRhDocente.setText("RH:");
        add(jLabelRhDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 121, -1, -1));

        jLabelTelefonoDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTelefonoDocente.setText("Telefono:");
        add(jLabelTelefonoDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 72, -1, -1));

        jTextFieldNombreDocente.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldNombreDocente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldNombreDocente.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldNombreDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 72, 134, -1));

        jTextFieldApellidoDocente.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldApellidoDocente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldApellidoDocente.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldApellidoDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 121, 134, -1));

        jTextFieldEdadDocente.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldEdadDocente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldEdadDocente.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldEdadDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 168, 134, -1));

        jTextFieldTelefonoDocente.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldTelefonoDocente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldTelefonoDocente.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldTelefonoDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 72, 126, -1));

        jTextFieldRHDocente.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldRHDocente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldRHDocente.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldRHDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 121, 126, -1));

        jTextFieldCodigoCarnet.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigoCarnet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldCodigoCarnet.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldCodigoCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 221, 126, -1));

        jLabelCCTIDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCCTIDocente.setText("T.I/C.C:");
        add(jLabelCCTIDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 168, -1, -1));

        jLabelCodigoCarnet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCodigoCarnet.setText("Codigo carnet:");
        add(jLabelCodigoCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 221, -1, -1));

        jTextFieldTICC.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldTICC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldTICC.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldTICC, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 168, 126, -1));

        jButtonAceptarDocente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAceptarDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAceptarDocente.setText("Guardar");
        jButtonAceptarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarDocenteActionPerformed(evt);
            }
        });
        add(jButtonAceptarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 338, 130, 42));

        jButtonLimpiarDocente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLimpiarDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLimpiarDocente.setText("Limpiar");
        jButtonLimpiarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarDocenteActionPerformed(evt);
            }
        });
        add(jButtonLimpiarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 338, 111, 42));

        jButtonVolverDocente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVolverDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolverDocente.setText("Volver");
        jButtonVolverDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverDocenteActionPerformed(evt);
            }
        });
        add(jButtonVolverDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 338, 103, 42));

        jTextAreaDatosDelDocente.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaDatosDelDocente.setColumns(20);
        jTextAreaDatosDelDocente.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextAreaDatosDelDocente.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaDatosDelDocente.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDatosDelDocente);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 72, 590, 235));

        jLabeltitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeltitulo.setText("Docentes:");
        add(jLabeltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, -1, -1));

        jButtonCargarDocente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCargarDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCargarDocente.setText("Cargar Docente");
        jButtonCargarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarDocenteActionPerformed(evt);
            }
        });
        add(jButtonCargarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, -1, 40));

        jLabelAsignatura1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAsignatura1.setText("codigo de la asignatura a eliminar:");
        add(jLabelAsignatura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, -1, 20));

        jComboBoxSeleccionDocente.setBackground(new java.awt.Color(102, 102, 102));
        jComboBoxSeleccionDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jComboBoxSeleccionDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, 153, -1));

        jLabelCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCurso.setText("Curso a dictar:");
        add(jLabelCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 221, -1, -1));

        jComboBoxSeleccionCurso.setBackground(new java.awt.Color(102, 102, 102));
        jComboBoxSeleccionCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jComboBoxSeleccionCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 218, 132, -1));

        jButtonModificarDocente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonModificarDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonModificarDocente.setText("Modificar Docente");
        jButtonModificarDocente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonModificarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarDocenteActionPerformed(evt);
            }
        });
        add(jButtonModificarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, -1, 42));

        jButtonEliminarDocente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonEliminarDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEliminarDocente.setText("Eliminar Docente");
        jButtonEliminarDocente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEliminarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarDocenteActionPerformed(evt);
            }
        });
        add(jButtonEliminarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 390, -1, 42));

        jComboBoxSeleccionAsignatura.setBackground(new java.awt.Color(102, 102, 102));
        jComboBoxSeleccionAsignatura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jComboBoxSeleccionAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 124, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Asignatura a dictar:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jButtonEliminarCurso.setBackground(new java.awt.Color(102, 102, 102));
        jButtonEliminarCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEliminarCurso.setText("Eliminar un curso");
        jButtonEliminarCurso.setToolTipText("");
        jButtonEliminarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCursoActionPerformed(evt);
            }
        });
        add(jButtonEliminarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, -1, 39));

        jLabelAsignatura2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAsignatura2.setText("Seleccione un docente:");
        add(jLabelAsignatura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, -1, -1));

        jButtonAgregarNuevaAsignatura.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAgregarNuevaAsignatura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAgregarNuevaAsignatura.setText("Eliminar una asignatura");
        jButtonAgregarNuevaAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarNuevaAsignaturaActionPerformed(evt);
            }
        });
        add(jButtonAgregarNuevaAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, -1, 39));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 1240, 20));

        jLabelAsignatura4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAsignatura4.setText("codigo del curso a eliminar:");
        add(jLabelAsignatura4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, 20));

        jTextFieldCursoPaEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCursoPaEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldCursoPaEliminar.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldCursoPaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 120, -1));

        jTextFieldAsignaturaAEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldAsignaturaAEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldAsignaturaAEliminar.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldAsignaturaAEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos-blackberry-wallpapers.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1280, 610));

        jLabelAsignatura5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAsignatura5.setText("Seleccione un nuevo curso:");
        add(jLabelAsignatura5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, 20));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 30, 160));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverDocenteActionPerformed
        limpiar();
        jTextFieldTICC.setEditable(true);
        irAPanelAdmin();
    }//GEN-LAST:event_jButtonVolverDocenteActionPerformed

    private void jButtonLimpiarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarDocenteActionPerformed
        limpiar();
        jTextFieldTICC.setEditable(true);
    }//GEN-LAST:event_jButtonLimpiarDocenteActionPerformed

    private void jButtonCargarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarDocenteActionPerformed
        cargarDatosDelDocente();
    }//GEN-LAST:event_jButtonCargarDocenteActionPerformed

    private void jButtonAceptarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarDocenteActionPerformed
        crearDocente();
    }//GEN-LAST:event_jButtonAceptarDocenteActionPerformed

    private void jButtonModificarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarDocenteActionPerformed
        modificarDocente();
    }//GEN-LAST:event_jButtonModificarDocenteActionPerformed

    private void jButtonEliminarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarDocenteActionPerformed
        eliminarDocente();
    }//GEN-LAST:event_jButtonEliminarDocenteActionPerformed

    private void jButtonEliminarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCursoActionPerformed
        eliminarUnCurso();
    }//GEN-LAST:event_jButtonEliminarCursoActionPerformed

    private void jButtonAgregarNuevaAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarNuevaAsignaturaActionPerformed
        eliminarUnaAsignatura();
    }//GEN-LAST:event_jButtonAgregarNuevaAsignaturaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptarDocente;
    private javax.swing.JButton jButtonAgregarNuevaAsignatura;
    private javax.swing.JButton jButtonCargarDocente;
    private javax.swing.JButton jButtonEliminarCurso;
    private javax.swing.JButton jButtonEliminarDocente;
    private javax.swing.JButton jButtonLimpiarDocente;
    private javax.swing.JButton jButtonModificarDocente;
    private javax.swing.JButton jButtonVolverDocente;
    private javax.swing.JComboBox<String> jComboBoxSeleccionAsignatura;
    private javax.swing.JComboBox<String> jComboBoxSeleccionCurso;
    private javax.swing.JComboBox<String> jComboBoxSeleccionDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelApellidoDocente;
    private javax.swing.JLabel jLabelAsignatura1;
    private javax.swing.JLabel jLabelAsignatura2;
    private javax.swing.JLabel jLabelAsignatura4;
    private javax.swing.JLabel jLabelAsignatura5;
    private javax.swing.JLabel jLabelCCTIDocente;
    private javax.swing.JLabel jLabelCodigoCarnet;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelDocente;
    private javax.swing.JLabel jLabelEdadDocente;
    private javax.swing.JLabel jLabelNombreDocente;
    private javax.swing.JLabel jLabelRhDocente;
    private javax.swing.JLabel jLabelTelefonoDocente;
    private javax.swing.JLabel jLabeltitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextAreaDatosDelDocente;
    private javax.swing.JTextField jTextFieldApellidoDocente;
    private javax.swing.JTextField jTextFieldAsignaturaAEliminar;
    private javax.swing.JTextField jTextFieldCodigoCarnet;
    private javax.swing.JTextField jTextFieldCursoPaEliminar;
    private javax.swing.JTextField jTextFieldEdadDocente;
    private javax.swing.JTextField jTextFieldNombreDocente;
    private javax.swing.JTextField jTextFieldRHDocente;
    private javax.swing.JTextField jTextFieldTICC;
    private javax.swing.JTextField jTextFieldTelefonoDocente;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        jComboBoxSeleccionCurso.setModel(new DefaultComboBoxModel<>(new String[]{"Seleccione curso"}));
        String[] itemsCurso = new String[principal.cantidadDeCursos() + 1];
        itemsCurso[0] = "Seleccione curso";
        String[] cursos = principal.cursos();
        for (int i = 1; i < itemsCurso.length; i++) {
            itemsCurso[i] = cursos[i - 1];
        }
        jComboBoxSeleccionCurso.setModel(new DefaultComboBoxModel<>(itemsCurso));
               
        jComboBoxSeleccionAsignatura.setModel(new DefaultComboBoxModel<>(new String[]{"Seleccione asignatura"}));
        String[] itemsAsignatura = new String[principal.cantidadDeAsignaturas()+ 1];
        itemsAsignatura[0] = "Seleccione asignatura";
        String[] asignaturas = principal.Asignaturas();
        for (int i = 1; i < itemsAsignatura.length; i++) {
            itemsAsignatura[i] = asignaturas[i - 1];
        }
        jComboBoxSeleccionAsignatura.setModel(new DefaultComboBoxModel<>(itemsAsignatura));
        
    }
        
    private void cargarDocentesAlComboBox(){
        jComboBoxSeleccionDocente.setModel(new DefaultComboBoxModel<>(new String[]{"Seleccione docente"}));
        String[] itemsDocente = new String[principal.cantidadDeDocentes()+ 1];
        itemsDocente[0] = "Seleccione docente";
        String[] docentes = principal.Docentes();
        for (int i = 1; i < itemsDocente.length; i++) {
            itemsDocente[i] = docentes[i - 1];
        }
        jComboBoxSeleccionDocente.setModel(new DefaultComboBoxModel<>(itemsDocente));
    }
    
    public boolean validar(){
        if(jTextFieldNombreDocente.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del nombre del docente esta vacio","docentes",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(jTextFieldApellidoDocente.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del apellido del docente esta vacio","docentes",JOptionPane.INFORMATION_MESSAGE);            
            return false;
        }else if(jTextFieldEdadDocente.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto de la edad del docente esta vacio","docentes",JOptionPane.INFORMATION_MESSAGE);            
            return false;
        }else if(jTextFieldCodigoCarnet.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del codigo del carnet del docente esta vacio","docentes",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(jTextFieldTICC.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del documento del docente esta vacio","docentes",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(jTextFieldTelefonoDocente.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del telefono del docente esta vacio","docentes",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(jTextFieldRHDocente.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del RH del docente esta vacio","docentes",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if (jComboBoxSeleccionCurso.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, " seleccione un curso para el docente","docentes",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(jComboBoxSeleccionAsignatura.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "seleccione una asignatura para el docente","docentes",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
            try{
                Integer.parseInt(jTextFieldEdadDocente.getText());
                Integer.parseInt(jTextFieldTICC.getText());
                Integer.parseInt(jTextFieldCodigoCarnet.getText());
                Integer.parseInt(jTextFieldTelefonoDocente.getText());
                return true;
            }catch(NullPointerException | NumberFormatException e){
                JOptionPane.showMessageDialog(this, "algun dato esta con el formato incorrecto","docentes",JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
            
        }   
    }

    private void crearDocente() {
        if (validar()){
            long documento = Long.parseLong(jTextFieldTICC.getText());
            int codigoCarnet = Integer.parseInt(jTextFieldCodigoCarnet.getText());
            int edad = Integer.parseInt(jTextFieldEdadDocente.getText());
            long telefono = Integer.parseInt(jTextFieldTelefonoDocente.getText());
            String nombre = jTextFieldNombreDocente.getText();
            String apellido = jTextFieldApellidoDocente.getText();
            String rh = jTextFieldRHDocente.getText();
            int curso = jComboBoxSeleccionCurso.getSelectedIndex() - 1;
            int asignatura = jComboBoxSeleccionAsignatura.getSelectedIndex()-1;
            
            if (!principal.existeDocente(documento,codigoCarnet)) {
                boolean creado = principal.crearDocente(documento,codigoCarnet,edad,telefono,nombre,apellido,rh,curso,asignatura);
                if (creado){
                    limpiar();
                    cargarDocentesAlComboBox();
                    cargarDocentesCreados();
                    JOptionPane.showMessageDialog(this, "Se creo el docente", "Crear docente", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo Crear el docente","crear docente", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                jTextFieldTICC.setText("");
                jTextFieldTICC.requestFocus();
                JOptionPane.showMessageDialog(this, "El docente ya existe", "Crear docente", JOptionPane.INFORMATION_MESSAGE);
            }
        }  
    }

    private void cargarDatosDelDocente() {
        int docenteID = jComboBoxSeleccionDocente.getSelectedIndex();
        if (docenteID > 0) {
            activarBotones();
            jTextFieldTICC.setEditable(false);
            String datosDelDocente[] = principal.DocentePorID(docenteID - 1);
            jTextFieldTICC.setText(datosDelDocente[3]);
            jTextFieldNombreDocente.setText(datosDelDocente[0]);
            jTextFieldApellidoDocente.setText(datosDelDocente[1]);
            jTextFieldEdadDocente.setText(datosDelDocente[4]);
            jTextFieldTelefonoDocente.setText(datosDelDocente[5]);
            jTextFieldRHDocente.setText(datosDelDocente[6]);
            jTextFieldCodigoCarnet.setText(datosDelDocente[2]);
           // cargarAsignatura();
            //cargarCurso();
            cargarDocentesCreados();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un docente", "Docente", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    private void cargarDocentesCreados() {
        jTextAreaDatosDelDocente.setText(principal.cargarDocentesCreados());
    }
       
    private void habilitarComponentes() {
        jButtonEliminarDocente.setEnabled(false);
        jButtonModificarDocente.setEnabled(false);
        jButtonAceptarDocente.setEnabled(true);
        jButtonLimpiarDocente.setEnabled(true);
        jButtonCargarDocente.setEnabled(true);
        jComboBoxSeleccionDocente.setEnabled(true);
    }

    private void activarBotones() {
        jButtonAceptarDocente.setEnabled(false);
        jButtonLimpiarDocente.setEnabled(true);
        jButtonEliminarDocente.setEnabled(true);
        jButtonModificarDocente.setEnabled(true);
        jButtonCargarDocente.setEnabled(false);
        jComboBoxSeleccionDocente.setEnabled(false);
    }
    
    private void eliminarDocente() {
        int docenteID = jComboBoxSeleccionDocente.getSelectedIndex()-1;
        boolean eiminado = principal.eliminarDocente(docenteID);
        if(eiminado){
            JOptionPane.showMessageDialog(this, "se elimino el docente", "docentes", JOptionPane.INFORMATION_MESSAGE);
            habilitarComponentes();
            cargarDocentesAlComboBox();
            cargarDocentesCreados();
            cargarDatos();
            limpiar();
        }else{
            JOptionPane.showMessageDialog(this, "no se elimino el docente", "docentes", JOptionPane.WARNING_MESSAGE);

        }
    }

    private void modificarDocente() {
        int docenteID = jComboBoxSeleccionDocente.getSelectedIndex()-1;
        String nombre = jTextFieldNombreDocente.getText();
        String apellido = jTextFieldApellidoDocente.getText();
        int edad = Integer.parseInt(jTextFieldEdadDocente.getText());
        long documento = Long.parseLong(jTextFieldTICC.getText());
        long telefono = Long.parseLong(jTextFieldTelefonoDocente.getText());
        String rh = jTextFieldRHDocente.getText();
        int codigoCarnet = Integer.parseInt(jTextFieldCodigoCarnet.getText());
        int cursoID = jComboBoxSeleccionCurso.getSelectedIndex();
        int asignaturaID = jComboBoxSeleccionAsignatura.getSelectedIndex();
        boolean modificado = principal.modificarDocente(nombre,apellido,edad,documento,telefono,rh,codigoCarnet,cursoID,asignaturaID,docenteID);
        if(modificado){
            JOptionPane.showMessageDialog(this, "se modifico el docente","docentes",JOptionPane.INFORMATION_MESSAGE);
            cargarDocentesAlComboBox();
            cargarDocentesCreados();
            cargarDatos();
            habilitarComponentes();
            limpiar();
            jTextFieldTICC.setEditable(true);
        }else{
            JOptionPane.showMessageDialog(this, "no se modifico el docente","docentes",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    private void eliminarUnCurso() {
        if(preValidar()){
            int docenteID = jComboBoxSeleccionDocente.getSelectedIndex()-1;
            int codigoCurso = Integer.parseInt(jTextFieldCursoPaEliminar.getText());
            boolean eliminado = principal.eliminarUnCursoDelDocente(codigoCurso,docenteID);
            if(eliminado){
                JOptionPane.showMessageDialog(this, "se elimino el curso del docente ","docentes",JOptionPane.INFORMATION_MESSAGE);
                cargarDocentesCreados();
                limpiar();
                limpiar1();
                jTextFieldTICC.setEditable(true);
            }
        }
    }

    private boolean preValidar() {
        if(jTextFieldCursoPaEliminar.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de codigo del curso vacio ","docentes",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if( jComboBoxSeleccionDocente.getSelectedIndex() ==0 ){
            JOptionPane.showMessageDialog(this, "seleccione un docente","docentes",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
            try{
                Integer.parseInt(jTextFieldCursoPaEliminar.getText());
                return true;
            }catch(NumberFormatException | NullPointerException e){
                JOptionPane.showMessageDialog(this, "el dato esta con el formato incorrecto","docentes",JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
    }

    private void eliminarUnaAsignatura() {
        if(prevalidar()){
            String codigoAsignatura = jTextFieldAsignaturaAEliminar.getText();
            int docenteID = jComboBoxSeleccionDocente.getSelectedIndex()-1;
            boolean eliminado = principal.eliminarUnaAsignaturaDelDocente(codigoAsignatura,docenteID);
            if(eliminado){
                JOptionPane.showMessageDialog(this, "se elimino la asignatura del docente","docente",JOptionPane.INFORMATION_MESSAGE);
                cargarDocentesCreados();
                limpiar2();
            }
        }
    }

    private boolean prevalidar() {
        if(jTextFieldAsignaturaAEliminar.getText().equals("")){
            JOptionPane.showMessageDialog(this, "escriba un codigo de una asignatura","docentes",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    private void limpiar1() {
        jTextFieldCursoPaEliminar.setText("");
    }

    private void limpiar2() {
        jTextFieldAsignaturaAEliminar.setText("");
    }

}