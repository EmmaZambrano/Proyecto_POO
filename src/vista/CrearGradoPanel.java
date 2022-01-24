package vista;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class CrearGradoPanel extends javax.swing.JPanel {
    Principal principal;
    /**
     * Creates new form CrearGradoPanel
     */
    public CrearGradoPanel(Principal principal) {
        this.principal = principal;
        initComponents();
        cargarGrados();
    }
    
    protected void irAPanelAdmin(){
        principal.irAPanelAdmin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombreGrado = new javax.swing.JTextField();
        jTextFieldIDGrado = new javax.swing.JTextField();
        jButtonCrearGrado = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaGrados = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxBuscarGrado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButtonCargarGrado = new javax.swing.JButton();
        JButtonLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        jLabel1.setText("Crear Grado");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jTextFieldNombreGrado.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldNombreGrado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldNombreGrado.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldNombreGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 140, -1));

        jTextFieldIDGrado.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldIDGrado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldIDGrado.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldIDGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 140, -1));

        jButtonCrearGrado.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCrearGrado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCrearGrado.setText("Guardar");
        jButtonCrearGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearGradoActionPerformed(evt);
            }
        });
        add(jButtonCrearGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 107, 50));

        jButtonVolver.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 110, 50));

        jTextAreaGrados.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaGrados.setColumns(20);
        jTextAreaGrados.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextAreaGrados.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaGrados.setRows(5);
        jScrollPane1.setViewportView(jTextAreaGrados);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 510, 120));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("cursos del grado:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        jComboBoxBuscarGrado.setBackground(new java.awt.Color(102, 102, 102));
        jComboBoxBuscarGrado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxBuscarGrado.setToolTipText("");
        add(jComboBoxBuscarGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 140, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Seleccione un grado:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        jButtonCargarGrado.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCargarGrado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCargarGrado.setText("Cargar Grado");
        jButtonCargarGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarGradoActionPerformed(evt);
            }
        });
        add(jButtonCargarGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, 140, 50));

        JButtonLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        JButtonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JButtonLimpiar.setText("Limpiar");
        JButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLimpiarActionPerformed(evt);
            }
        });
        add(JButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 110, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos-blackberry-wallpapers.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearGradoActionPerformed
        crearGrado();
    }//GEN-LAST:event_jButtonCrearGradoActionPerformed

    private void jButtonCargarGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarGradoActionPerformed

            cargarDatosDelGrado(); 
    }//GEN-LAST:event_jButtonCargarGradoActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        principal.irAPanelAdmin();
        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void JButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLimpiarActionPerformed
        limpiar();
        jTextFieldIDGrado.setEditable(true);
    }//GEN-LAST:event_JButtonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonLimpiar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonCargarGrado;
    private javax.swing.JButton jButtonCrearGrado;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxBuscarGrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaGrados;
    private javax.swing.JTextField jTextFieldIDGrado;
    private javax.swing.JTextField jTextFieldNombreGrado;
    // End of variables declaration//GEN-END:variables
    
    protected void cargarGrados() {
        jComboBoxBuscarGrado.setModel(new DefaultComboBoxModel<>(new String[]{"Seleccione un grado"}));
        String[] items = new String[principal.cantidadDeGrados() + 1];
        items[0] = "Seleccione un grado: ";
        String[] grados = principal.grados();
        for (int i = 1; i < items.length; i++) {
            items[i] = grados[i - 1];
        }
        jComboBoxBuscarGrado.setModel(new DefaultComboBoxModel<>(items));
    }
    
    private void limpiar() {
        jTextFieldIDGrado.setText("");
        jTextFieldNombreGrado.setText("");
    }

    private void crearGrado(){
        if (validar()) {
            int id = Integer.parseInt(jTextFieldIDGrado.getText());
            String nombre = jTextFieldNombreGrado.getText();
            if(!principal.existeGrado(id)){
                boolean creado = principal.crearGrado(id,nombre);
                if (creado) {
                    JOptionPane.showMessageDialog(this, "El grado se creo", "Registro grado", JOptionPane.INFORMATION_MESSAGE);
                    cargarGrados();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "El grado no pudo ser creado", "Registro grado", JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "El grado ya existe", "Registro grado", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private boolean validar() {
        if(jTextFieldNombreGrado.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del nombre del grado esta vacio","grados" ,JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(jTextFieldIDGrado.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del id del grado esta vacio","grados" ,JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
            try{
                Integer.parseInt(jTextFieldIDGrado.getText());
                return true;
            }catch(NullPointerException | NumberFormatException e){
                JOptionPane.showMessageDialog(this, "algun dato esta escrito con el formato incorrecto","grados" ,JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
    }

    private void cargarDatosDelGrado(){
        int gradoID = jComboBoxBuscarGrado.getSelectedIndex();
        if (gradoID > 0) {
            jTextFieldIDGrado.setEditable(false);
            String datosDelGrado[] = principal.gradoPorID(gradoID - 1);
            jTextFieldIDGrado.setText(datosDelGrado[0]);
            jTextFieldNombreGrado.setText(datosDelGrado[1]);
            cargarCursosDelGrado();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un grado", "Grados", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void cargarCursosDelGrado() {
        jTextAreaGrados.setText(principal.cargarCursosDelGrado(Integer.parseInt(jTextFieldIDGrado.getText())));
    }

}