package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CrearAdministrativo extends javax.swing.JPanel {
    Principal principal;
    /**
     * Creates new form CrearEstudiante
     */
    public CrearAdministrativo(Principal principal) {
        this.principal = principal;
        initComponents();
        cargarComboBox();
        CargarTextArea();
        Limpiar();
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
        jLabelTtitulo = new javax.swing.JLabel();
        jButtonEliminarAdministrativo = new javax.swing.JButton();
        jButtonCargarAdministrativo = new javax.swing.JButton();
        jButtonModificarAdministrativo = new javax.swing.JButton();
        jComboBoxBuscarAdministrativo = new javax.swing.JComboBox<>();
        jLabelSeleccion = new javax.swing.JLabel();
        jScrollPanePistas = new javax.swing.JScrollPane();
        jTextAreaAdmin = new javax.swing.JTextArea();
        jLabelHistorialAdmin = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonLimpiarAsig = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

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
        jLabelRh.setText("RH:");
        add(jLabelRh, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 126, -1, -1));

        jLabelTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTelefono.setText("Telefono:");
        add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 77, -1, -1));

        jLabelCCTI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCCTI.setText("T.I/C.C:");
        add(jLabelCCTI, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 177, -1, -1));

        jLabelCodigoCarnet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCodigoCarnet.setText("Codigo carnet:");
        add(jLabelCodigoCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 227, -1, -1));

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
        add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 77, 150, -1));

        jTextFieldRH.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldRH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldRH.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldRH, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 126, 150, -1));

        jTextFieldTICC.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldTICC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldTICC.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldTICC, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 177, 150, -1));

        jTextFieldCodigoCarnet.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigoCarnet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldCodigoCarnet.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldCodigoCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 227, 152, -1));

        jLabelTtitulo.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabelTtitulo.setText("Crear administrativo");
        add(jLabelTtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        jButtonEliminarAdministrativo.setBackground(new java.awt.Color(102, 102, 102));
        jButtonEliminarAdministrativo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEliminarAdministrativo.setText("Eliminar Admin");
        jButtonEliminarAdministrativo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEliminarAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarAdministrativoActionPerformed(evt);
            }
        });
        add(jButtonEliminarAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 320, 150, 50));

        jButtonCargarAdministrativo.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCargarAdministrativo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCargarAdministrativo.setText("Cargar Admin");
        jButtonCargarAdministrativo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCargarAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarAdministrativoActionPerformed(evt);
            }
        });
        add(jButtonCargarAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 140, 50));

        jButtonModificarAdministrativo.setBackground(new java.awt.Color(102, 102, 102));
        jButtonModificarAdministrativo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonModificarAdministrativo.setText("Modificar Admin");
        jButtonModificarAdministrativo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonModificarAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarAdministrativoActionPerformed(evt);
            }
        });
        add(jButtonModificarAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, 160, 50));

        jComboBoxBuscarAdministrativo.setBackground(new java.awt.Color(102, 102, 102));
        jComboBoxBuscarAdministrativo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxBuscarAdministrativo.setToolTipText("");
        add(jComboBoxBuscarAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 270, 155, -1));

        jLabelSeleccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSeleccion.setText("Seleccione un administrativo:");
        add(jLabelSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, -1, -1));

        jTextAreaAdmin.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaAdmin.setColumns(20);
        jTextAreaAdmin.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextAreaAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaAdmin.setRows(5);
        jScrollPanePistas.setViewportView(jTextAreaAdmin);

        add(jScrollPanePistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 530, 173));

        jLabelHistorialAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHistorialAdmin.setText("Historial de administrativos creados");
        add(jLabelHistorialAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, -1, -1));

        jButtonAceptar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAceptar.setText("Guardar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 160, 50));

        jButtonLimpiarAsig.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLimpiarAsig.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLimpiarAsig.setText("Limpiar");
        jButtonLimpiarAsig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarAsigActionPerformed(evt);
            }
        });
        add(jButtonLimpiarAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 150, 50));

        jButtonVolver.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 160, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos-blackberry-wallpapers.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1280, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarAdministrativoActionPerformed
        Eliminar();
    }//GEN-LAST:event_jButtonEliminarAdministrativoActionPerformed

    private void jButtonCargarAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarAdministrativoActionPerformed
        cargarAdministrador();
    }//GEN-LAST:event_jButtonCargarAdministrativoActionPerformed

    private void jButtonModificarAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarAdministrativoActionPerformed
        ModificarAdministrador();
    }//GEN-LAST:event_jButtonModificarAdministrativoActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        CrearAdmin();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonLimpiarAsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarAsigActionPerformed
        Limpiar();
        jTextFieldTICC.setEditable(true);
    }//GEN-LAST:event_jButtonLimpiarAsigActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        principal.irAPanelAdmin();
        Limpiar();
        jTextFieldTICC.setEditable(true);
    
    }//GEN-LAST:event_jButtonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCargarAdministrativo;
    private javax.swing.JButton jButtonEliminarAdministrativo;
    private javax.swing.JButton jButtonLimpiarAsig;
    private javax.swing.JButton jButtonModificarAdministrativo;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxBuscarAdministrativo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCCTI;
    private javax.swing.JLabel jLabelCodigoCarnet;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelHistorialAdmin;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRh;
    private javax.swing.JLabel jLabelSeleccion;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTtitulo;
    private javax.swing.JScrollPane jScrollPanePistas;
    private javax.swing.JTextArea jTextAreaAdmin;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCodigoCarnet;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldRH;
    private javax.swing.JTextField jTextFieldTICC;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables

    private void panelAdmin() {
        Limpiar();
        habilitarComponentes();
        principal.irAPanelAdmin();
    }

    private void Limpiar() {
        this.jTextFieldNombre.setText("");
        this.jTextFieldApellido.setText("");
        this.jTextFieldEdad.setText("");
        this.jTextFieldTelefono.setText("");
        this.jTextFieldRH.setText("");
        this.jTextFieldTICC.setText("");
        this.jTextFieldCodigoCarnet.setText("");
        
    }

    private void CrearAdmin() {
        if(validar()){
            long documento = Long.parseLong(jTextFieldTICC.getText());
            int codigoCarnet = Integer.parseInt(jTextFieldCodigoCarnet.getText());
            int edad = Integer.parseInt(jTextFieldEdad.getText());
            int telefono = Integer.parseInt(jTextFieldTelefono.getText());
            String nombre = jTextFieldNombre.getText();
            String apellido = jTextFieldApellido.getText();
            String rh = jTextFieldRH.getText();
            if (principal.existeAdministrador(documento,codigoCarnet)) {
                boolean hecho=principal.CrearAdministrador(documento,codigoCarnet,edad,telefono,nombre,apellido,rh);
                if(hecho){
                    JOptionPane.showMessageDialog(this,"administrador guardado","crear administrador",JOptionPane.INFORMATION_MESSAGE);
                    Limpiar();
                    cargarComboBox();
                    habilitarComponentes();
                }else{
                    JOptionPane.showMessageDialog(this,"edad erronea","crear administrador",JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this,"administrador ya creado","crear administrador",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"casillas vacias o con formato incorrecto","crear administrador",JOptionPane.WARNING_MESSAGE);
        }
    }

    private boolean validar() {
        if (jTextFieldCodigoCarnet.getText().equals("")) {
            return false;
        } else if (jTextFieldNombre.getText().equals("")) {
            return false;
        } else if (jTextFieldApellido.getText().equals("")) {
            return false;
        } else if (jTextFieldTelefono.getText().equals("")) {
            return false;
        } else if (jTextFieldEdad.getText().equals("")) {
            return false;
        } else if (jTextFieldRH.getText().equals("")) {
            return false;
        } else if (jTextFieldTICC.getText().equals("")) {
            return false;
        } try{
            Integer.parseInt(jTextFieldEdad.getText());
            Integer.parseInt(jTextFieldTelefono.getText());
            Long.parseLong(jTextFieldTICC.getText());
            Integer.parseInt(jTextFieldCodigoCarnet.getText());
            return true;
        }catch(NullPointerException e){
            return false;
        }catch(NumberFormatException e){
            return false;
        }
    }

    private void cargarComboBox() {
        jComboBoxBuscarAdministrativo.setModel(new DefaultComboBoxModel<>(new String[]{"seleccionar docente"} ));
        String administradores[]=new String[principal.cantidadAdministradores()+1]; 
        administradores[0]="seleccionar docente";
        String[] terminarCargar=principal.datosAdministradores();
        for(int i=1;i<administradores.length;i++){
            administradores[i]=terminarCargar[i-1];
        }
        jComboBoxBuscarAdministrativo.setModel(new DefaultComboBoxModel<>(administradores));
        CargarTextArea();
    }

    private void cargarAdministrador() {
        if(jComboBoxBuscarAdministrativo.getSelectedIndex()>0){
            int a=jComboBoxBuscarAdministrativo.getSelectedIndex()-1;
            String administrador[]=principal.traerAdministrador(a);
            jTextFieldNombre.setText(administrador[0]);
            jTextFieldApellido.setText(administrador[1]);
            jTextFieldEdad.setText(administrador[2]);
            jTextFieldTelefono.setText(administrador[3]);
            jTextFieldRH.setText(administrador[4]);
            jTextFieldTICC.setText(administrador[5]);
            jTextFieldCodigoCarnet.setText(administrador[6]);
            activarBotones();
                      
        }else{
            JOptionPane.showMessageDialog(this,"seleccione un administrador","crear administrador",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void Eliminar() {
        borrarPersona();
        Limpiar();
        cargarComboBox();
        JOptionPane.showMessageDialog(this,"borrado exitoso ","crear administrador",JOptionPane.INFORMATION_MESSAGE);
        habilitarComponentes();
    }

    private void borrarPersona() {
        int a=jComboBoxBuscarAdministrativo.getSelectedIndex()-1;
        principal.borrarAdministrador(a);
    }

    private void ModificarAdministrador() {
        borrarPersona();
        CrearAdmin();
        habilitarComponentes();
    }

    private void CargarTextArea() {
        jTextAreaAdmin.setText(principal.cargarTextArea());
    }
    private void  habilitarComponentes(){
     jButtonCargarAdministrativo.setEnabled(true);
     jButtonEliminarAdministrativo.setEnabled(false);
     jButtonModificarAdministrativo.setEnabled(false);
     jButtonVolver.setEnabled(true);
     jComboBoxBuscarAdministrativo.setEnabled(true);
     jTextFieldTICC.setEnabled(true);
    }

    private void activarBotones() {
        jButtonCargarAdministrativo.setEnabled(false);
        jButtonEliminarAdministrativo.setEnabled(true);
        jButtonModificarAdministrativo.setEnabled(true);
        jButtonVolver.setEnabled(true);
        jComboBoxBuscarAdministrativo.setEnabled(false);
        jTextFieldTICC.setEnabled(false);
    }
      
}