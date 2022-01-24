package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CrearEstudiante extends javax.swing.JPanel {
    Principal principal;
    Timer actualizar;
    /**
     * Creates new form CrearEstudiante
     */
    public CrearEstudiante(Principal principal) {
        this.principal = principal;
        initComponents();
        habilitarComponentes();
        cargarAlumnosAlComboBox();
        cargarAlumnosCreados();
        this.actualizar=new Timer(10000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                actualizar(evt);
            }
            private void actualizar(ActionEvent evt) {
                cargarDatos();
                cargarAlumnosCreados();
            }
        });
        actualizar.start();
    }
    
    private void limpiar(){
        this.jTextFieldNombre.setText("");
        this.jTextFieldApellido.setText("");
        this.jTextFieldEdad.setText("");
        this.jTextFieldTelefono.setText("");
        this.jTextFieldRH.setText("");
        this.jTextFieldTICC.setText("");
        this.jTextFieldCodigoCarnet.setText("");
        this.jTextFieldTICC.setEditable(true);
        habilitarComponentes();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelRh = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelCCTI = new javax.swing.JLabel();
        jLabelCodigoCarnet = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldRH = new javax.swing.JTextField();
        jTextFieldTICC = new javax.swing.JTextField();
        jTextFieldCodigoCarnet = new javax.swing.JTextField();
        jButtonVolver = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonEliminarAlumno = new javax.swing.JButton();
        jButtonCargarAlumno = new javax.swing.JButton();
        jButtonModificarAumno = new javax.swing.JButton();
        jComboBoxBuscarAlumno = new javax.swing.JComboBox<>();
        jLabelSeleccion = new javax.swing.JLabel();
        jComboBoxSeleccionCursoPanelEstu = new javax.swing.JComboBox<>();
        jLabelCurso = new javax.swing.JLabel();
        jScrollPanePistas = new javax.swing.JScrollPane();
        jTextAreaAlumnos = new javax.swing.JTextArea();
        jLabelHistorialAlumno = new javax.swing.JLabel();
        jButtonCrearAlumno = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombre.setText("Nombre:");
        add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 76, -1, -1));

        jLabelApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelApellido.setText("Apellido:");
        add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 122, -1, -1));

        jLabelEdad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEdad.setText("Edad:");
        add(jLabelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 171, -1, -1));

        jLabelRh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRh.setText("Direccion:");
        add(jLabelRh, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 126, -1, -1));

        jLabelTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTelefono.setText("Telefono:");
        add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 77, -1, -1));

        jLabelCCTI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCCTI.setText("T.I/C.C:");
        add(jLabelCCTI, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 171, -1, -1));

        jLabelCodigoCarnet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCodigoCarnet.setText("Codigo carnet:");
        add(jLabelCodigoCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 218, -1, -1));

        jTextFieldNombre.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 76, 150, -1));

        jTextFieldApellido.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldApellido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldApellido.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 122, 150, -1));

        jTextFieldEdad.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldEdad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldEdad.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 171, 150, -1));

        jTextFieldTelefono.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldTelefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldTelefono.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 77, 150, -1));

        jTextFieldRH.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldRH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldRH.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldRH, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 126, 150, -1));

        jTextFieldTICC.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldTICC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldTICC.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldTICC, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 171, 150, -1));

        jTextFieldCodigoCarnet.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigoCarnet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldCodigoCarnet.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldCodigoCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 218, 152, -1));

        jButtonVolver.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 118, 50));

        jButtonLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 108, 50));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setText("Crear estudiante");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 11, -1, -1));

        jButtonEliminarAlumno.setBackground(new java.awt.Color(102, 102, 102));
        jButtonEliminarAlumno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEliminarAlumno.setText("Eliminar Alumno");
        jButtonEliminarAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarAlumnoActionPerformed(evt);
            }
        });
        add(jButtonEliminarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 149, 48));

        jButtonCargarAlumno.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCargarAlumno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCargarAlumno.setText("Cargar Alumno");
        jButtonCargarAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCargarAlumno.setVerifyInputWhenFocusTarget(false);
        jButtonCargarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarAlumnoActionPerformed(evt);
            }
        });
        add(jButtonCargarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 149, 47));

        jButtonModificarAumno.setBackground(new java.awt.Color(102, 102, 102));
        jButtonModificarAumno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonModificarAumno.setText("Modificar Alumno");
        jButtonModificarAumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonModificarAumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarAumnoActionPerformed(evt);
            }
        });
        add(jButtonModificarAumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, 48));

        jComboBoxBuscarAlumno.setBackground(new java.awt.Color(102, 102, 102));
        jComboBoxBuscarAlumno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxBuscarAlumno.setToolTipText("");
        add(jComboBoxBuscarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 155, -1));

        jLabelSeleccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSeleccion.setText("Seleccione un alumno:");
        add(jLabelSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        jComboBoxSeleccionCursoPanelEstu.setBackground(new java.awt.Color(102, 102, 102));
        jComboBoxSeleccionCursoPanelEstu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxSeleccionCursoPanelEstu.setToolTipText("");
        jComboBoxSeleccionCursoPanelEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSeleccionCursoPanelEstuActionPerformed(evt);
            }
        });
        add(jComboBoxSeleccionCursoPanelEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 215, 150, -1));

        jLabelCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCurso.setText("Curso:");
        add(jLabelCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 218, -1, -1));

        jTextAreaAlumnos.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaAlumnos.setColumns(20);
        jTextAreaAlumnos.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextAreaAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaAlumnos.setRows(5);
        jScrollPanePistas.setViewportView(jTextAreaAlumnos);

        add(jScrollPanePistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 76, 521, 420));

        jLabelHistorialAlumno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHistorialAlumno.setText("Historial de alumnos creados");
        add(jLabelHistorialAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 41, -1, -1));

        jButtonCrearAlumno.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCrearAlumno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCrearAlumno.setText("Guardar");
        jButtonCrearAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearAlumnoActionPerformed(evt);
            }
        });
        add(jButtonCrearAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 110, 50));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 352, 660, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos-blackberry-wallpapers.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        habilitarComponentes();
        limpiar();
        jTextFieldTICC.setEditable(true);
        principal.irAPanelAdmin();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarAlumnoActionPerformed
        eliminarAlumno();
    }//GEN-LAST:event_jButtonEliminarAlumnoActionPerformed

    private void jButtonCargarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarAlumnoActionPerformed
        cargaDatosDelAlumno();
    }//GEN-LAST:event_jButtonCargarAlumnoActionPerformed

    private void jButtonModificarAumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarAumnoActionPerformed
        modificarAlumno();
    }//GEN-LAST:event_jButtonModificarAumnoActionPerformed

    private void jButtonCrearAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearAlumnoActionPerformed
        crearAlumno();
    }//GEN-LAST:event_jButtonCrearAlumnoActionPerformed

    private void jComboBoxSeleccionCursoPanelEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSeleccionCursoPanelEstuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSeleccionCursoPanelEstuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargarAlumno;
    private javax.swing.JButton jButtonCrearAlumno;
    private javax.swing.JButton jButtonEliminarAlumno;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonModificarAumno;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxBuscarAlumno;
    private javax.swing.JComboBox<String> jComboBoxSeleccionCursoPanelEstu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCCTI;
    private javax.swing.JLabel jLabelCodigoCarnet;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelHistorialAlumno;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRh;
    private javax.swing.JLabel jLabelSeleccion;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JScrollPane jScrollPanePistas;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaAlumnos;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCodigoCarnet;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldRH;
    private javax.swing.JTextField jTextFieldTICC;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        jComboBoxSeleccionCursoPanelEstu.setModel(new DefaultComboBoxModel<>(new String[]{"Seleccione curso"}));
        String[] itemsCurso = new String[principal.cantidadDeCursos() + 1];
        itemsCurso[0] = "Seleccione curso";
        String[] cursos = principal.cursos();
        for (int i = 1; i < itemsCurso.length; i++) {
            itemsCurso[i] = cursos[i - 1];
        }
        jComboBoxSeleccionCursoPanelEstu.setModel(new DefaultComboBoxModel<>(itemsCurso));   
    }
    
    private void cargarAlumnosAlComboBox(){
        jComboBoxBuscarAlumno.setModel(new DefaultComboBoxModel<>(new String[]{"Seleccione alumno"}));
        String[] itemsAlumno = new String[principal.cantidadDeAlumnos() + 1];
        itemsAlumno[0] = "Seleccione alumno";
        String[] alumnos = principal.alumnos()
                ;
        for (int i = 1; i < itemsAlumno.length; i++) {
            itemsAlumno[i] = alumnos[i - 1];
        }
        jComboBoxBuscarAlumno.setModel(new DefaultComboBoxModel<>(itemsAlumno));
    }
    
    private boolean validar(){
         if (jTextFieldCodigoCarnet.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "campo de texto del codigo del carnet del estudiante esta vacio", "estudiante", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (jTextFieldNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "campo de texto del nombre del estudiante esta vacio", "estudiante", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (jTextFieldApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "campo de texto del apellido del estudiante esta vacio", "estudiante", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (jTextFieldTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "campo de texto del telefono del estudiante esta vacio", "estudiante", JOptionPane.WARNING_MESSAGE);            
            return false;
        } else if (jTextFieldEdad.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "campo de texto de la edad del estudiante esta vacio", "estudiante", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (jTextFieldRH.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "campo de texto del RH del docente esta vacio", "estudiante", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (jTextFieldTICC.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "campo de texto del documento del estudiante esta vacio", "estudiante", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if( jComboBoxSeleccionCursoPanelEstu.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "por favor escoja un curso para el alumno","matricular alumnos",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
             try {
                Integer.parseInt(jTextFieldEdad.getText());
                Integer.parseInt(jTextFieldTelefono.getText());
                Integer.parseInt(jTextFieldTICC.getText());
                Integer.parseInt(jTextFieldCodigoCarnet.getText());
                return true;
            } catch (NullPointerException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "algun dato esta escrito con el formato incorrecto", "estudiante", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
    }

    private void crearAlumno() {
        if (validar()) {
            long documento = Long.parseLong(jTextFieldTICC.getText());
            int codigoCarnet = Integer.parseInt(jTextFieldCodigoCarnet.getText());
            int edad = Integer.parseInt(jTextFieldEdad.getText());
            int telefono = Integer.parseInt(jTextFieldTelefono.getText());
            String nombre = jTextFieldNombre.getText();
            String apellido = jTextFieldApellido.getText();
            String rh = jTextFieldRH.getText();
            int curso = jComboBoxSeleccionCursoPanelEstu.getSelectedIndex() - 1;
            
            if (!principal.existeEstudiante(documento,codigoCarnet)) {
                boolean creado = principal.crearEstudiante(documento,codigoCarnet,edad,telefono,nombre,apellido,rh,curso);
                if (creado) {
                    limpiar();
                    cargarAlumnosAlComboBox();
                    cargarAlumnosCreados();
                    JOptionPane.showMessageDialog(this, "Se guardo el estudiante", "Crear estudiante", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo Crear el estudiante","crear estudiante", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                jTextFieldTICC.setText("");
                jTextFieldTICC.requestFocus();
                JOptionPane.showMessageDialog(this, "El estudiante ya existe", "Crear estudiante", JOptionPane.INFORMATION_MESSAGE);
            }
        }   
    }

    private void cargaDatosDelAlumno() {
        int alumnosID = jComboBoxBuscarAlumno.getSelectedIndex();
        if (alumnosID > 0) {
            activarBotones();
            String datosDelCurso[] = principal.AlumnoPorID(alumnosID - 1);
            jTextFieldTICC.setText(datosDelCurso[3]);
            jTextFieldNombre.setText(datosDelCurso[0]);
            jTextFieldApellido.setText(datosDelCurso[1]);
            jTextFieldEdad.setText(datosDelCurso[4]);
            jTextFieldTelefono.setText(datosDelCurso[5]);
            jTextFieldRH.setText(datosDelCurso[6]);
            jTextFieldCodigoCarnet.setText(datosDelCurso[2]);
            habilitarBotones(true);
            cargarAlumnosCreados();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un grado", "Grados", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void cargarAlumnosCreados() {
        jTextAreaAlumnos.setText(principal.cargarAlumnosCreados());
    }

    private void habilitarBotones(boolean habilitado) {
        jButtonCargarAlumno.setEnabled(!habilitado);
        jButtonCrearAlumno.setEnabled(!habilitado);
        jButtonModificarAumno.setEnabled(habilitado);
        jButtonEliminarAlumno.setEnabled(habilitado);
        jComboBoxBuscarAlumno.setEnabled(false);
        jTextFieldTICC.setEditable(false);
    }

    public void habilitarComponentes(){
        jButtonEliminarAlumno.setEnabled(false);
        jButtonModificarAumno.setEnabled(false);        
        jButtonCrearAlumno.setEnabled(true);
        jButtonLimpiar.setEnabled(true);
        jButtonCargarAlumno.setEnabled(true);
        jComboBoxBuscarAlumno.setEnabled(true);
        jTextFieldTICC.setEditable(true);
    }
    public void activarBotones(){
        
        jButtonCrearAlumno.setEnabled(false);
        jButtonLimpiar.setEnabled(true);
        jButtonEliminarAlumno.setEnabled(true);
        jButtonModificarAumno.setEnabled(true);
        jComboBoxBuscarAlumno.setEnabled(false);
        
    }
    
    private void eliminarAlumno() {
        int estudianteID = jComboBoxBuscarAlumno.getSelectedIndex()-1;
        boolean eliminado = principal.eliminarEstudiante(estudianteID);
        if(eliminado){
            JOptionPane.showMessageDialog(this, "se elimino el estudiante ","estudiante",JOptionPane.INFORMATION_MESSAGE);
            habilitarComponentes();
            cargarAlumnosAlComboBox();
            cargarAlumnosCreados();
            cargarDatos();
            limpiar();
            jTextFieldTICC.setEditable(true);
        }else{
            JOptionPane.showMessageDialog(this, "no se elimino el estudiante ","estudiante",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void modificarAlumno() {
        int alumnoID = jComboBoxBuscarAlumno.getSelectedIndex()-1;
        int cursoID = jComboBoxSeleccionCursoPanelEstu.getSelectedIndex();
        String nombre = jTextFieldNombre.getText();
        String apellido = jTextFieldApellido.getText();
        int edad = Integer.parseInt(jTextFieldEdad.getText());
        long documento = Long.parseLong(jTextFieldTICC.getText());
        long telefono = Long.parseLong(jTextFieldTelefono.getText());
        int codigoCarnet = Integer.parseInt(jTextFieldCodigoCarnet.getText());
        String rh = jTextFieldRH.getText();
        boolean modificado = principal.modificarAlumno(nombre,apellido,edad,documento,telefono,codigoCarnet,rh,cursoID,alumnoID);
        if(modificado){
            JOptionPane.showMessageDialog(this, "se modifico el estudiante","estudiantes",JOptionPane.INFORMATION_MESSAGE);
            cargarAlumnosAlComboBox();
            cargarAlumnosCreados();
            cargarDatos();
            habilitarComponentes();
            limpiar();
            jTextFieldTICC.setEditable(true);
        }else{
            JOptionPane.showMessageDialog(this, "no se modifico el estudiante","estudiantes",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
