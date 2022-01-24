package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CrearAsignaturaPanel extends javax.swing.JPanel {
    Principal principal;
    Timer actualizar;
   
    public CrearAsignaturaPanel(Principal principal) {
        this.principal = principal;
        initComponents();
        cargarAsignaturasCreadas();
//        cargarAsignaturasAlComboBox();
        desabilitarBotones(true);
        this.actualizar=new Timer(10000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                actualizar(evt);
            }

            private void actualizar(ActionEvent evt) {
                cargarDatos();
                cargarAsignaturasCreadas();
            }

        });
        actualizar.start();
    }
    /**
     * metodo para ir al panel del administrador
     */
    protected void irAPanelAdmin(){
        principal.irAPanelAdmin();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombreAsig = new javax.swing.JLabel();
        jLabelCreditosAsig = new javax.swing.JLabel();
        jTextFieldCodigoAsig = new javax.swing.JTextField();
        jTextFieldNombreAsig = new javax.swing.JTextField();
        jTextFieldCreditosAsig = new javax.swing.JTextField();
        jButtonAceptarAsig = new javax.swing.JButton();
        jButtonLimpiarAsig = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxSeleccionCursoo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAsignaturas = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        JlabelCodigo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombreAsig.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombreAsig.setText("Nombre:");
        add(jLabelNombreAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabelCreditosAsig.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCreditosAsig.setText("Creditos:");
        add(jLabelCreditosAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jTextFieldCodigoAsig.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigoAsig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldCodigoAsig.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldCodigoAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 165, -1));

        jTextFieldNombreAsig.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldNombreAsig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldNombreAsig.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldNombreAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 165, -1));

        jTextFieldCreditosAsig.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCreditosAsig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldCreditosAsig.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldCreditosAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 165, -1));

        jButtonAceptarAsig.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAceptarAsig.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAceptarAsig.setText("Guardar");
        jButtonAceptarAsig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarAsigActionPerformed(evt);
            }
        });
        add(jButtonAceptarAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 110, 50));

        jButtonLimpiarAsig.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLimpiarAsig.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLimpiarAsig.setText("Limpiar");
        jButtonLimpiarAsig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarAsigActionPerformed(evt);
            }
        });
        add(jButtonLimpiarAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 110, 50));

        jButtonVolver.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 110, 50));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel7.setText("Crear asignatura");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jComboBoxSeleccionCursoo.setBackground(new java.awt.Color(102, 102, 102));
        jComboBoxSeleccionCursoo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jComboBoxSeleccionCursoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 165, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Curso:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jTextAreaAsignaturas.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaAsignaturas.setColumns(20);
        jTextAreaAsignaturas.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextAreaAsignaturas.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaAsignaturas.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAsignaturas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 463, 270));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Historial de asignaturas creadas");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        JlabelCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JlabelCodigo.setText("Codigo:");
        add(JlabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos-blackberry-wallpapers.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 446));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        irAPanelAdmin();
        limpiar();
        jTextFieldCodigoAsig.setEditable(true);
        desabilitarBotones(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonLimpiarAsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarAsigActionPerformed
        limpiar();
        jTextFieldCodigoAsig.setEditable(true);
    }//GEN-LAST:event_jButtonLimpiarAsigActionPerformed

    private void jButtonAceptarAsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarAsigActionPerformed
        crearAsignatura();
    }//GEN-LAST:event_jButtonAceptarAsigActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelCodigo;
    private javax.swing.JButton jButtonAceptarAsig;
    private javax.swing.JButton jButtonLimpiarAsig;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxSeleccionCursoo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCreditosAsig;
    private javax.swing.JLabel jLabelNombreAsig;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAsignaturas;
    private javax.swing.JTextField jTextFieldCodigoAsig;
    private javax.swing.JTextField jTextFieldCreditosAsig;
    private javax.swing.JTextField jTextFieldNombreAsig;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        jComboBoxSeleccionCursoo.setModel(new DefaultComboBoxModel<>(new String[]{"Seleccione un curso"}));
        String[] items = new String[principal.cantidadDeCursos()+ 1];
        items[0] = "Seleccione un curso: ";
        String[] cursos = principal.cursos();
        for (int i = 1; i < items.length; i++) {
            items[i] = cursos[i - 1];
        }
        jComboBoxSeleccionCursoo.setModel(new DefaultComboBoxModel<>(items));
        
    }
    /*
    private void cargarAsignaturasAlComboBox(){
        jComboBoxSeleccionAsignatura.setModel(new DefaultComboBoxModel<>(new String[]{"Seleccione una asignatura"}));
        String[] items1 = new String[principal.cantidadDeAsignaturas()+ 1];
        items1[0] = "Seleccione una asignatura: ";
        String[] grados = principal.Asignaturas();
        for (int i = 1; i < items1.length; i++) {
            items1[i] = grados[i - 1];
        }
        jComboBoxSeleccionAsignatura.setModel(new DefaultComboBoxModel<>(items1));
        
    }*/
    
    private void limpiar(){
        this.jTextFieldCodigoAsig.setText("");
        this.jTextFieldNombreAsig.setText("");
        this.jTextFieldCreditosAsig.setText("");
//        this.jComboBoxSeleccionCursoo.setSelectedIndex(0);
//        this.jComboBoxSeleccionAsignatura.setSelectedIndex(0);
        desabilitarBotones(true);
    }

    private boolean validar(){
        if(jTextFieldCodigoAsig.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del codigo de la asignatura esta vacio","asignaturas",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(jTextFieldNombreAsig.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del nombre de la asignatura esta vacio","asignaturas",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(jTextFieldCreditosAsig.getText().equals("")){
                JOptionPane.showMessageDialog(this, "campo de texto de los creitos de la asignatura esta vacio","asignaturas",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if( jComboBoxSeleccionCursoo.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "seleccione un curso","cursos", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
             try{
               Integer.parseInt(jTextFieldCreditosAsig.getText());
               return true;
            }catch(NullPointerException | NumberFormatException e){
                JOptionPane.showMessageDialog(this, "algun dato esta con el formato incorrecto","asignaturas",JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
    }
    
    private void crearAsignatura(){
        if (validar()) {
            String id = jTextFieldCodigoAsig.getText();
            String nombre = jTextFieldNombreAsig.getText();
            int creditos = Integer.parseInt(jTextFieldCreditosAsig.getText());
            int curso = jComboBoxSeleccionCursoo.getSelectedIndex() - 1;

            if (!principal.existeAsignatura(id)) {
                boolean creado = principal.crearAsignatura(id,nombre,creditos,curso);
                if (creado) {
                    limpiar();
//                    cargarAsignaturasAlComboBox();
                    cargarAsignaturasCreadas();
                    JOptionPane.showMessageDialog(this, "Se creo la asignatura", "Crear asignatura", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo Crear la asignatura", "Crear asignatura", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                jTextFieldCodigoAsig.setText("");
                jTextFieldCodigoAsig.requestFocus();
                JOptionPane.showMessageDialog(this, "La asignatura ya existe", "Crear asignatura", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
    }
        
    private void cargarDatosDeLaAsignatura() {
//        int asigID = jComboBoxSeleccionAsignatura.getSelectedIndex();
        int asigID =0;
        if (asigID > 0) {
            jTextFieldCodigoAsig.setEditable(false);
            String datosDeLaAsig[] = principal.asignaturaPorID(asigID - 1);
            jTextFieldCodigoAsig.setText(datosDeLaAsig[0]);
            jTextFieldNombreAsig.setText(datosDeLaAsig[1]);
            jTextFieldCreditosAsig.setText(datosDeLaAsig[2]);
            cargarAsignaturasCreadas();
            desabilitarBotones(false);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una asignatura", "Asignatura", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void cargarAsignaturasCreadas() {
        jTextAreaAsignaturas.setText(principal.cargarAsignaturasCreadas());
    }

    private void desabilitarBotones(boolean opc){
        //jComboBoxSeleccionAsignatura.setEnabled(opc);
        jButtonAceptarAsig.setEnabled(opc);
        //jButtonModificarAsignatura.setEnabled(!opc);
        //jButtonEliminarAsignatura.setEnabled(!opc);
        jTextFieldCodigoAsig.setEnabled(opc);
    }
}
