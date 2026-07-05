/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto_poo_mathkids;


/**
 *
 * @author User
 */
public class Tutorial extends javax.swing.JPanel {

    /**
     * Creates new form Tutorial
     */
    public Tutorial() {
        initComponents();
    }
    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnIniciar2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo_tutorial = new javax.swing.JLabel();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciar2.setBackground(new java.awt.Color(107, 181, 255));
        btnIniciar2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnIniciar2.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar2.setText("VOLVER");
        btnIniciar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btnIniciar2.addActionListener(this::btnIniciar2ActionPerformed);
        jPanel2.add(btnIniciar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 120, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GUIA_TUTORIAL_V2.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profesora_tutorial_v2-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 300, -1));

        fondo_tutorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tutoria.png"))); // NOI18N
        jPanel2.add(fondo_tutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        fondo_tutorial.getAccessibleContext().setAccessibleName("fondo_tutorial");
        fondo_tutorial.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar2ActionPerformed

        java.awt.Container parent = this.getParent();
        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout) {
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
            layout.show(parent, "CardConfiguracion");
        }
    }//GEN-LAST:event_btnIniciar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar2;
    private javax.swing.JLabel fondo_tutorial;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables


}
