/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto_poo_mathkids;



public class RegistroSam extends javax.swing.JPanel {

    private DatabaseManager dbManager;
   
    public RegistroSam() {
        dbManager = new DatabaseManager();
        initComponents();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jtxtUsuarioRegistro = new javax.swing.JTextField();
        jtxtContra = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("USUARIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("CONTRASEÑA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("ROL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("NOMBRE COMPLETO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jButton1.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 153, 255));
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 130, 30));

        jButton2.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 153, 255));
        jButton2.setText("VOLVER");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 110, 30));

        jtxtUsuarioRegistro.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jPanel1.add(jtxtUsuarioRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 260, 30));
        jPanel1.add(jtxtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 252, 260, 30));

        jTextField2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 260, 30));

        jComboBox1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTUDIANTE", "DOCENTE" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 130, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registroletra.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 590, 220));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMAGEN1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        java.awt.Container parent = this.getParent();

        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout)
        {
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
                layout.show(parent, "cardLogin");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String usuario = jtxtUsuarioRegistro.getText().trim();
        String nombre = jTextField2.getText().trim();
        String contra = new String(jtxtContra.getPassword());
        
        if (usuario.isEmpty() || nombre.isEmpty() || contra.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Llena todos los campos", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int id = dbManager.registerStudent(usuario, usuario);
        
        if (id > 0) {
            PRINCIPAL.usuarioRegistrado = usuario;
            PRINCIPAL.contrasenaRegistrada = contra;
            PRINCIPAL.studentId = id;
            
            javax.swing.JOptionPane.showMessageDialog(this, "¡Registro Exitoso! Ahora inicia sesión.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al registrar, intenta con otro usuario", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        java.awt.Container parent = this.getParent();
        
        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout) {   
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
            layout.show(parent, "cardLogin");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField jtxtContra;
    private javax.swing.JTextField jtxtUsuarioRegistro;
    // End of variables declaration//GEN-END:variables
}
