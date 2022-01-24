package vista;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearCursoPanel extends javax.swing.JPanel {
    
    Principal principal;
    Timer actualizar;
    /**
     * Creates new form CrearCursoPanel
     */
    public CrearCursoPanel(Principal principal) {
        this.principal = principal;
        initComponents();
        cargarCursosAlComboBox();
        //cargarEstudiantesDelCurso();
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
    }
       
    protected void irAPanelAdmin(){
        jTextAreaCursos.setText("");
        principal.irAPanelAdmin();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombreCurso = new javax.swing.JTextField();
        jTextFieldIDCurso = new javax.swing.JTextField();
        jButtonCrearCurso = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCursos = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButtonCargarCurso = new javax.swing.JButton();
        jLabelAsignatura1 = new javax.swing.JLabel();
        jComboBoxSeleccionCurso = new javax.swing.JComboBox<>();
        jLabelAsignatura2 = new javax.swing.JLabel();
        jComboBoxSeleccionGrado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setText("Crear curso");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jLabel2.setToolTipText("");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jTextFieldNombreCurso.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldNombreCurso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldNombreCurso.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldNombreCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 140, -1));

        jTextFieldIDCurso.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldIDCurso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldIDCurso.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldIDCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 140, -1));

        jButtonCrearCurso.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCrearCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCrearCurso.setText("Guardar");
        jButtonCrearCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCursoActionPerformed(evt);
            }
        });
        add(jButtonCrearCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, 50));

        jButtonLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 120, 50));

        jButtonVolver.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.setToolTipText("");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 120, 50));

        jTextAreaCursos.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaCursos.setColumns(20);
        jTextAreaCursos.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextAreaCursos.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaCursos.setRows(5);
        jScrollPane1.setViewportView(jTextAreaCursos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 660, 300));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Cursos");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, -1, -1));

        jButtonCargarCurso.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCargarCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCargarCurso.setText("Cargar Curso");
        jButtonCargarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarCursoActionPerformed(evt);
            }
        });
        add(jButtonCargarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 410, 130, 50));

        jLabelAsignatura1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAsignatura1.setText("Seleccione un curso:");
        add(jLabelAsignatura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, -1));

        jComboBoxSeleccionCurso.setBackground(new java.awt.Color(102, 102, 102));
        jComboBoxSeleccionCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jComboBoxSeleccionCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 140, -1));

        jLabelAsignatura2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAsignatura2.setText("Seleccione un grado:");
        add(jLabelAsignatura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jComboBoxSeleccionGrado.setBackground(new java.awt.Color(102, 102, 102));
        jComboBoxSeleccionGrado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jComboBoxSeleccionGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 140, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos-blackberry-wallpapers.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        irAPanelAdmin();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonCrearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCursoActionPerformed
        crearCurso();
    }//GEN-LAST:event_jButtonCrearCursoActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonCargarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarCursoActionPerformed
        cargarDatosDelCurso();
    }//GEN-LAST:event_jButtonCargarCursoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargarCurso;
    private javax.swing.JButton jButtonCrearCurso;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxSeleccionCurso;
    private javax.swing.JComboBox<String> jComboBoxSeleccionGrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAsignatura1;
    private javax.swing.JLabel jLabelAsignatura2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaCursos;
    private javax.swing.JTextField jTextFieldIDCurso;
    private javax.swing.JTextField jTextFieldNombreCurso;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        jComboBoxSeleccionGrado.setModel(new DefaultComboBoxModel<>(new String[]{"Seleccione grado"}));
        String[] itemsGrado = new String[principal.cantidadDeGrados()+ 1];
        itemsGrado[0] = "Seleccione grado";
        String[] grados = principal.grados();
        for (int i = 1; i < itemsGrado.length; i++) {
            itemsGrado[i] = grados[i - 1];
        }
        jComboBoxSeleccionGrado.setModel(new DefaultComboBoxModel<>(itemsGrado));
       
    }
    
    private void cargarCursosAlComboBox(){
        jComboBoxSeleccionCurso.setModel(new DefaultComboBoxModel<>(new String[]{"Seleccione curso"}));
        String[] itemsCurso = new String[principal.cantidadDeCursos() + 1];
        itemsCurso[0] = "Seleccione curso";
        String[] cursos = principal.cursos();
        for (int i = 1; i < itemsCurso.length; i++) {
            itemsCurso[i] = cursos[i - 1];
        }
        jComboBoxSeleccionCurso.setModel(new DefaultComboBoxModel<>(itemsCurso));
        
    }

     private void limpiar() {
        jTextFieldIDCurso.setText("");
        jTextFieldNombreCurso.setText("");
//        jComboBoxSeleccionCurso.setSelectedIndex(0);
        jTextFieldIDCurso.setEditable(true);
   }
     
    private boolean validar(){
        if(jTextFieldIDCurso.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del codigo del curso esta vacio","cursos",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(jTextFieldNombreCurso.getText().equals("")){
            JOptionPane.showMessageDialog(this, "campo de texto del nombre del curso esta vacio","cursos",JOptionPane.INFORMATION_MESSAGE);            
            return false;
        }else if(jComboBoxSeleccionGrado.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "seleccione un grado", "Crear Curso", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
            try{
                Integer.parseInt(jTextFieldIDCurso.getText());
                return true;
            }catch(NullPointerException | NumberFormatException e){
                JOptionPane.showMessageDialog(this, "algun dato esta con el formato incorrecto","cursos",JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
    }
    
    private void crearCurso(){
          if (validar()) {
            int id = Integer.parseInt(jTextFieldIDCurso.getText());
            String nombre = jTextFieldNombreCurso.getText();
            int grado = jComboBoxSeleccionGrado.getSelectedIndex() - 1;
            if (!principal.existeCurso(id)) {
                boolean creado = principal.crearCurso(id,nombre,grado);
                if (creado) {
                    limpiar();
                    cargarCursosAlComboBox();
                    JOptionPane.showMessageDialog(this, "Se creo El Curso", "Crear Curso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo Crear el Curso", "Crear Curso", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                jTextFieldIDCurso.setText("");
                jTextFieldIDCurso.requestFocus();
                JOptionPane.showMessageDialog(this, "El Curso ya existe", "Crear Curso", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
    }

    private void cargarDatosDelCurso(){
        int cursoID = jComboBoxSeleccionCurso.getSelectedIndex();
        if (cursoID > 0) {
            String datosDelCurso[] = principal.cursoPorID(cursoID - 1);
            jTextFieldIDCurso.setText(datosDelCurso[0]);
            jTextFieldNombreCurso.setText(datosDelCurso[1]);
            cargarDDatosDelCurso();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un curso", "Cursos", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void cargarDDatosDelCurso() {
        jTextAreaCursos.setText(principal.cargarDDaatosDelCurso(Integer.parseInt(jTextFieldIDCurso.getText())));
    }   
    
}