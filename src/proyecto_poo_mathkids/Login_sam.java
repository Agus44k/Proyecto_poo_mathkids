/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java 
 */
package proyecto_poo_mathkids;


public class Login_sam extends javax.swing.JPanel {

    public Login_sam() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtUserLogin = new javax.swing.JTextField();
        jtxtPassLogin = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtUserLogin.addActionListener(this::jtxtUserLoginActionPerformed);
        jPanel1.add(jtxtUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 260, 30));

        jtxtPassLogin.addActionListener(this::jtxtPassLoginActionPerformed);
        jPanel1.add(jtxtPassLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 260, 30));

        jButton3.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 153, 255));
        jButton3.setText("VOLVER");
        jButton3.addActionListener(this::jButton3ActionPerformed);
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 120, 40));

        jButton2.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 153, 255));
        jButton2.setText("EMPEZAR");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("¿No tienes cuenta?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 120, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("USUARIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        jButton1.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 153, 255));
        jButton1.setText("REGISTRARTE");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 610, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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


    public static String usuarioRegistrado = "";
    public static String contrasenaRegistrada = "";
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String userLogin = jtxtUserLogin.getText().trim();
        String passLogin = new String(jtxtPassLogin.getPassword());

        if (userLogin.isEmpty() || passLogin.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingresa usuario y contraseña", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sql = "SELECT id, nombre_completo FROM usuarios WHERE usuario = ? AND contrasena = ?";

        try (java.sql.Connection conn = ConexionBD.conectar();
             java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, userLogin);
            pstmt.setString(2, passLogin);

            java.sql.ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {

                String nombre = rs.getString("nombre_completo");
                

                PRINCIPAL.usuarioRegistrado = userLogin; 

                javax.swing.JOptionPane.showMessageDialog(this, "¡Bienvenido a MathKids, " + nombre + "!");
        

                jtxtUserLogin.setText("");
                jtxtPassLogin.setText("");


                java.awt.Container parent = this.getParent();  
                if (parent != null && parent.getLayout() instanceof java.awt.CardLayout) {       
                    java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();        
                    layout.show(parent, "cardMenuestudiante"); 
                }
                
            } else {

                javax.swing.JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }

        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error de base de datos: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtxtUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUserLoginActionPerformed
        jtxtUserLogin.setText("");
        jtxtPassLogin.setText("********");
    }//GEN-LAST:event_jtxtUserLoginActionPerformed

    private void jtxtPassLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPassLoginActionPerformed
        jtxtUserLogin.setText("Ingrese su Usuario");
        jtxtPassLogin.setText("");
    }//GEN-LAST:event_jtxtPassLoginActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        java.awt.Container parent = this.getParent();

        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout)
        {
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
                layout.show(parent, "cardInicio");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.awt.Container parent = this.getParent();

        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout)
        {
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
                layout.show(parent, "cardRegistro");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jtxtPassLogin;
    private javax.swing.JTextField jtxtUserLogin;
    // End of variables declaration//GEN-END:variables
}
