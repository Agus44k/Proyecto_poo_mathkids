/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto_poo_mathkids;

/**
 *
 * @author User
 */
public class Juegos extends javax.swing.JPanel {

    /**
     * Creates new form Juegos
     */
    public Juegos() {
        initComponents();
    }
    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnIniciar2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/suma.png"))); // NOI18N
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 226, 245), 3, true));
        jButton5.addActionListener(this::jButton5ActionPerformed);
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 170, 170));

        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/division.png"))); // NOI18N
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 226, 245), 3, true));
        jButton4.addActionListener(this::jButton4ActionPerformed);
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, 170, 170));

        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/multiplicacion.png"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 226, 245), 3, true));
        jButton3.addActionListener(this::jButton3ActionPerformed);
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 170, 170));

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/resta.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 226, 245), 3, true));
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 170, 170));

        btnIniciar2.setBackground(new java.awt.Color(107, 181, 255));
        btnIniciar2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnIniciar2.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar2.setText("VOLVER");
        btnIniciar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btnIniciar2.addActionListener(this::btnIniciar2ActionPerformed);
        jPanel1.add(btnIniciar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 690, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccionar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1392, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        gestor.operacionActual = "suma";
        java.awt.Container parent = this.getParent();

        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout)
        {
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
                layout.show(parent, "cardDificultad");
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        gestor.operacionActual = "resta";
        java.awt.Container parent = this.getParent();

        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout)
        {
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
                layout.show(parent, "cardDificultad");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        gestor.operacionActual = "multiplicacion";
        java.awt.Container parent = this.getParent();

        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout)
        {
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
                layout.show(parent, "cardDificultad");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        gestor.operacionActual = "division";
        java.awt.Container parent = this.getParent();

        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout)
        {
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
                layout.show(parent, "cardDificultad");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnIniciar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar2ActionPerformed

        java.awt.Container parent = this.getParent();
        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout) {
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
            layout.show(parent, "cardMenuestudiante");
        }
    }//GEN-LAST:event_btnIniciar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
