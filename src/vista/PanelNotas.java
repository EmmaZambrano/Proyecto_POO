package vista;

import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class PanelNotas extends javax.swing.JPanel {
    Principal principal;
    private int x;
    /**
     * Creates new form PanelNotas
     */
    public PanelNotas(Principal principal) {
        this.principal= principal;
        initComponents();
        jTextFieldAsignatura.setEditable(false);
        botones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombreNota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNota = new javax.swing.JTextField();
        jButton2Limpiar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCodigoCurso = new javax.swing.JTextField();
        jTextFieldCodigoAlumno = new javax.swing.JTextField();
        jTextFieldCodigoAsignatura = new javax.swing.JTextField();
        jTextFieldCodigoAlumnoCarga = new javax.swing.JTextField();
        jTextFieldIDDeLaNotaACargar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonCargarNotas = new javax.swing.JButton();
        jButtonModificarNota = new javax.swing.JButton();
        jTextFieldAsignatura = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCodigoAsigCargar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabelTitulo.setText("NOTAS");
        add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("codigo del curso:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("codigo del alumno:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre de la nota:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jTextFieldNombreNota.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldNombreNota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldNombreNota.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNombreNota.setToolTipText("");
        add(jTextFieldNombreNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 118, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nota:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        jTextFieldNota.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldNota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldNota.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 118, -1));

        jButton2Limpiar.setBackground(new java.awt.Color(102, 102, 102));
        jButton2Limpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2Limpiar.setText("Limpiar");
        jButton2Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2LimpiarActionPerformed(evt);
            }
        });
        add(jButton2Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 104, 47));

        jButtonVolver.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 101, 47));

        jButtonAceptar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAceptar.setText("Guardar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 109, 47));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("codigo de la asignatura:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jTextFieldCodigoCurso.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigoCurso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldCodigoCurso.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldCodigoCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 118, -1));

        jTextFieldCodigoAlumno.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigoAlumno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldCodigoAlumno.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldCodigoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 118, -1));

        jTextFieldCodigoAsignatura.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigoAsignatura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldCodigoAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldCodigoAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 118, -1));

        jTextFieldCodigoAlumnoCarga.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigoAlumnoCarga.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldCodigoAlumnoCarga.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldCodigoAlumnoCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 96, -1));

        jTextFieldIDDeLaNotaACargar.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldIDDeLaNotaACargar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldIDDeLaNotaACargar.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldIDDeLaNotaACargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 96, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("codigo del alumno:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 128, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ID de la nota:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 179, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Datos para cargar notas");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 78, -1, 20));

        jButtonCargarNotas.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCargarNotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCargarNotas.setText("Cargar Nota");
        jButtonCargarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarNotasActionPerformed(evt);
            }
        });
        add(jButtonCargarNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, 46));

        jButtonModificarNota.setBackground(new java.awt.Color(102, 102, 102));
        jButtonModificarNota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonModificarNota.setText("Modificar Nota");
        jButtonModificarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarNotaActionPerformed(evt);
            }
        });
        add(jButtonModificarNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 140, 46));

        jTextFieldAsignatura.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldAsignatura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldAsignatura.setText("------------------");
        add(jTextFieldAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 118, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Asignatura:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Codigo de la asignatura:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, 30));

        jTextFieldCodigoAsigCargar.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigoAsigCargar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldCodigoAsigCargar.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldCodigoAsigCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 96, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos-blackberry-wallpapers.jpg"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        crearNotasDelEstudiante();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        botones();
        limpiar();
        principal.irAPanelDocente();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButton2LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2LimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton2LimpiarActionPerformed

    private void jButtonCargarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarNotasActionPerformed
       cargarNotasDelEstudiante();
    }//GEN-LAST:event_jButtonCargarNotasActionPerformed

    private void jButtonModificarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarNotaActionPerformed
        modificarNota();
    }//GEN-LAST:event_jButtonModificarNotaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2Limpiar;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCargarNotas;
    private javax.swing.JButton jButtonModificarNota;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldAsignatura;
    private javax.swing.JTextField jTextFieldCodigoAlumno;
    private javax.swing.JTextField jTextFieldCodigoAlumnoCarga;
    private javax.swing.JTextField jTextFieldCodigoAsigCargar;
    private javax.swing.JTextField jTextFieldCodigoAsignatura;
    private javax.swing.JTextField jTextFieldCodigoCurso;
    private javax.swing.JTextField jTextFieldIDDeLaNotaACargar;
    private javax.swing.JTextField jTextFieldNombreNota;
    private javax.swing.JTextField jTextFieldNota;
    // End of variables declaration//GEN-END:variables

    private void crearNotasDelEstudiante() {
        if (validar()) {
            int codigoCurso = Integer.parseInt(jTextFieldCodigoCurso.getText());
            int codigoAlumno = Integer.parseInt(jTextFieldCodigoAlumno.getText());
            String codigoAsignatura = jTextFieldCodigoAsignatura.getText();
            String nombreNota = jTextFieldNombreNota.getText();
            double nota = Double.parseDouble(jTextFieldNota.getText());
            boolean creado = principal.crearNotaDelEstudiante(codigoCurso,codigoAlumno,codigoAsignatura,nombreNota,nota);
            if (creado) {
                limpiar();
                JOptionPane.showMessageDialog(this, "Se agrego la nota al estudiante", "Notas", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "no se agrego la nota al estudiante", "Notas", JOptionPane.INFORMATION_MESSAGE);
            } 
        } 
    }

    private boolean validar() {
        if(jTextFieldCodigoCurso.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del codigo del curso esta vacio","notas" ,JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(jTextFieldCodigoAlumno.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del codigo del alumno esta vacio","notas" ,JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(jTextFieldCodigoAsignatura.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del codigo de la asignatura esta vacio","notas" ,JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(jTextFieldNombreNota.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del nombre de la nota esta vacio","notas" ,JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(jTextFieldNota.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto de la nota esta vacio","notas" ,JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else {
            try{
                Integer.parseInt(jTextFieldCodigoCurso.getText());
                Integer.parseInt(jTextFieldCodigoAlumno.getText());
                Double.parseDouble(jTextFieldNota.getText());
                return true;
            }catch(NullPointerException | NumberFormatException e){
                JOptionPane.showMessageDialog(this, "algun dato esta escrito con el formato incorrecto","notas" ,JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
    }

    private void limpiar() {
        this.jTextFieldCodigoCurso.setText("");
        this.jTextFieldCodigoAlumno.setText("");
        this.jTextFieldCodigoAsignatura.setText("");
        this.jTextFieldNombreNota.setText("");
        this.jTextFieldNota.setText("");
        this.jTextFieldIDDeLaNotaACargar.setText("");
        this.jTextFieldCodigoAlumnoCarga.setText("");
        this.jTextFieldCodigoAsigCargar.setText("");
        jTextFieldCodigoAlumno.setEditable(true);
        jTextFieldCodigoAsignatura.setEditable(true);
        jTextFieldCodigoCurso.setEditable(true);
        jTextFieldAsignatura.setText("------------------");
        botones();
    }

    private void cargarNotasDelEstudiante() {
         try{
            botones2();
            int codigoAlumno=0,notaID=0;
            String codigoAsignatura="";
            codigoAlumno = Integer.parseInt(jTextFieldCodigoAlumnoCarga.getText());
            codigoAsignatura = jTextFieldCodigoAsigCargar.getText();
            notaID = Integer.parseInt(jTextFieldIDDeLaNotaACargar.getText());
            
            if (codigoAlumno > 0  && notaID > -1 ){
                jTextFieldCodigoAlumno.setEditable(false);
                jTextFieldCodigoAsignatura.setEditable(false);
                jTextFieldCodigoCurso.setEditable(false);
               // activarBotones(false);
                String notas[] = principal.AlumnoPorID(codigoAlumno,codigoAsignatura,notaID-1);
                jTextFieldCodigoAlumno.setText(notas[1]);
                jTextFieldCodigoAsignatura.setText(notas[2]);
                jTextFieldCodigoCurso.setText(notas[0]);
                jTextFieldNombreNota.setText(notas[4]);
                jTextFieldNota.setText(notas[5]);
                jTextFieldAsignatura.setText(notas[3]);
            } else {
                JOptionPane.showMessageDialog(this, "escriba correcto los datos para ver la informacion", "Notas", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(NullPointerException | NumberFormatException e){
            JOptionPane.showMessageDialog(this, "no se pudo cargar la nota ya que no existe o algun dato esta mal","Notas",JOptionPane.ERROR_MESSAGE);
            botones();
        }
    }

    private void modificarNota() {
        int codigoAlumno= Integer.parseInt(jTextFieldCodigoAlumno.getText());
        String codigoAsignatura = jTextFieldCodigoAsignatura.getText();
        int notaID = Integer.parseInt(jTextFieldIDDeLaNotaACargar.getText());
        principal.eliminarNota(codigoAlumno,codigoAsignatura,notaID-1);
        int codigoCurso = Integer.parseInt(jTextFieldCodigoCurso.getText());
        String nombreNota = jTextFieldNombreNota.getText();
        double nota = Double.parseDouble(jTextFieldNota.getText());
        if(validar()){
            boolean creado = principal.crearNotaSinMover(codigoCurso,codigoAlumno,codigoAsignatura,nombreNota,nota,notaID-1);
            if(creado){
                JOptionPane.showMessageDialog(this, "se modifico la nota","notas",JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                botones();
            }else{
                JOptionPane.showMessageDialog(this, "no se modifico la nota","notas",JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "algun dato esta mal escrito","notas",JOptionPane.INFORMATION_MESSAGE);
        } 
    }
    
    private void botones(){
        jButtonAceptar.setEnabled(true);
        jButtonModificarNota.setEnabled(false);
        jButtonCargarNotas.setEnabled(true);
    }
    
    private void botones2(){
        jButtonAceptar.setEnabled(false);
        jButtonCargarNotas.setEnabled(true);
        jButtonModificarNota.setEnabled(true);
    }
     
}