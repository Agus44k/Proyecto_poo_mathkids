/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto_poo_mathkids;



public class RegistroSam extends javax.swing.JPanel {
   
    public RegistroSam() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jtxtUsuarioRegistro = new javax.swing.JTextField();
        jtxtContra = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("USUARIO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("CONTRASEÑA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("NOMBRE COMPLETO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        jButton1.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 153, 255));
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 130, 30));

        jButton2.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 153, 255));
        jButton2.setText("VOLVER");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 110, 30));

        jtxtUsuarioRegistro.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jPanel1.add(jtxtUsuarioRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 260, 30));
        jPanel1.add(jtxtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 260, 30));

        jTextField2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 260, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        

        String sql = "INSERT INTO usuarios (usuario, nombre_completo, contrasena, rol) VALUES (?, ?, ?, ?)";

        try (java.sql.Connection conn = ConexionBD.conectar();
             java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Asignar valores
            pstmt.setString(1, usuario);
            pstmt.setString(2, nombre);
            pstmt.setString(3, contra);

            pstmt.executeUpdate(); // Guarda en la base de datos

            javax.swing.JOptionPane.showMessageDialog(this, "¡Registro Exitoso! Ahora inicia sesión.");
            

            jtxtUsuarioRegistro.setText("");
            jTextField2.setText("");
            jtxtContra.setText("");



            java.awt.Container parent = this.getParent();
            if (parent != null && parent.getLayout() instanceof java.awt.CardLayout) {   
                java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
                layout.show(parent, "cardLogin");
            }

        } catch (java.sql.SQLException e) {

            if (e.getMessage() != null && e.getMessage().contains("UNIQUE constraint failed")) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ese usuario ya existe. ¡Intenta con otro!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al registrar: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField jtxtContra;
    private javax.swing.JTextField jtxtUsuarioRegistro;
    // End of variables declaration//GEN-END:variables
}
