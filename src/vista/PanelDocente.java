package vista;

import javax.swing.JOptionPane;

public class PanelDocente extends javax.swing.JPanel {
    private Principal principal;
    /**
     * Creates new form PanelDocente
     */
    public PanelDocente(Principal principal) {
        this.principal= principal;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonMirarAsistencia = new javax.swing.JButton();
        jButtonNotas = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabelTitulo.setText("BIENVENIDO DOCENTE");
        add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jButtonMirarAsistencia.setBackground(new java.awt.Color(102, 102, 102));
        jButtonMirarAsistencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonMirarAsistencia.setText("Mirar estudiante");
        jButtonMirarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMirarAsistenciaActionPerformed(evt);
            }
        });
        add(jButtonMirarAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 180, 50));

        jButtonNotas.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonNotas.setText("Notas");
        jButtonNotas.setMaximumSize(new java.awt.Dimension(91, 25));
        jButtonNotas.setMinimumSize(new java.awt.Dimension(91, 25));
        jButtonNotas.setPreferredSize(new java.awt.Dimension(91, 25));
        jButtonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotasActionPerformed(evt);
            }
        });
        add(jButtonNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 180, 50));

        jButtonSalir.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 180, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/031-libro_opaco.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 310, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos-blackberry-wallpapers.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNotasActionPerformed
        notas();
    }//GEN-LAST:event_jButtonNotasActionPerformed

    private void jButtonMirarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMirarAsistenciaActionPerformed
        principal.irAPanelVerNotaDocente();
    }//GEN-LAST:event_jButtonMirarAsistenciaActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        principal.irAPanelSesion();
    }//GEN-LAST:event_jButtonSalirActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMirarAsistencia;
    private javax.swing.JButton jButtonNotas;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables

    private void notas() {
        if(principal.activarNota()){
            principal.irAPanelNota();
        }else{
            JOptionPane.showMessageDialog(this,"sistema cerrado","acttivacion notas",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}