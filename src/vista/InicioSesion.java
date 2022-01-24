package vista;

import controlador.logica.GestionUsuario;
import javax.swing.JOptionPane;
import modelo.Asignatura;
import modelo.Curso;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Grado;
import java.lang.String;

public class InicioSesion extends javax.swing.JPanel {
    Principal principal;
    /**
     * Creates new form InicioSesion
     */
    public InicioSesion(Principal principal) {
        this.principal=principal;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonIngresar = new javax.swing.JButton();
        jLabelPassword = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jTextFieldPassword = new javax.swing.JPasswordField();
        jComboBoxUsuario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Usuario:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jTextFieldUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 130, -1));

        jButtonIngresar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 100, 40));

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPassword.setText("Contraseña:");
        add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Lucida Calligraphy", 1, 28)); // NOI18N
        jLabelTitulo.setText("Bienvenido");
        add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jButtonSalir.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 100, 40));

        jTextFieldPassword.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldPassword.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 130, -1));

        jComboBoxUsuario.setBackground(new java.awt.Color(102, 102, 102));
        jComboBoxUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "escoja un usuario", "alumno", "docente", "administrativo", "acudiente" }));
        jComboBoxUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUsuarioActionPerformed(evt);
            }
        });
        add(jComboBoxUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 260, 250));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos-blackberry-wallpapers.jpg"))); // NOI18N
        add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 350));
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        ingreso();
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jComboBoxUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
     
    private void ingreso() {
        if(validar()){
            int roll = jComboBoxUsuario.getSelectedIndex() - 1;
            String user = jTextFieldUsuario.getText();
            String password = jTextFieldPassword.getText();
            if(!principal.existeUsuario(roll,user)){
                int opc = JOptionPane.showConfirmDialog(this, "El usuario no existe\n Desea crearlo", "Inicio de sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE); 
                if(opc == 0){
                    boolean crear = principal.crearUsuario(roll,user, password); 
                    if(crear){
                        JOptionPane.showMessageDialog(this, "se creo la cuenta","cuenta",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(this, "No se creo la cuenta","cuenta",JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "digite su login para ingresar","cuenta",JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                boolean validarParaEntrar = principal.validarUsuario(roll,user,password);
                if(validarParaEntrar){
                    switch(jComboBoxUsuario.getSelectedIndex()){
                        case 1:
                            principal.irAlPanelEstudiante();
                            break;
                        case 2:
                            principal.irAPanelDocente();
                            break;
                        case 3:
                            principal.irAPanelAdmin();
                            break;
                        case 4:
                            principal.irAlPanelEstudiante();
                            break;
                    }
                }else
                    JOptionPane.showMessageDialog(this, "el usuario o contraseña o el roll escogido no corresponde verifique","inicio de sesion", JOptionPane.WARNING_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(this,"casillas vacias","ingreso",JOptionPane.WARNING_MESSAGE);
        }
    }

    private boolean validar() {
        if(jComboBoxUsuario.getSelectedIndex()==0){
            return false;
        }else if(jTextFieldUsuario.getText().equals("")){
            return false;
        }else if(jTextFieldPassword.getText().equals("")){
            return false;
        }
        return true;
    }
}