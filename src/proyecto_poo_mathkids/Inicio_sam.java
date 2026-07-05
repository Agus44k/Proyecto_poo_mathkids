/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto_poo_mathkids;

public class Inicio_sam extends javax.swing.JPanel {

    public Inicio_sam() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnIniciar = new javax.swing.JButton();
        jbtnConfiguracion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnIniciar.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        jbtnIniciar.setForeground(new java.awt.Color(102, 153, 255));
        jbtnIniciar.setText("INICIAR");
        jbtnIniciar.addActionListener(this::jbtnIniciarActionPerformed);
        jPanel1.add(jbtnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, -1, -1));

        jbtnConfiguracion.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        jbtnConfiguracion.setForeground(new java.awt.Color(102, 153, 255));
        jbtnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/configuracion.png"))); // NOI18N
        jbtnConfiguracion.addActionListener(this::jbtnConfiguracionActionPerformed);
        jPanel1.add(jbtnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 643, 100, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarActionPerformed
        java.awt.Container parent = this.getParent();
        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout)
        {
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
                layout.show(parent, "cardLogin");
        }
    }//GEN-LAST:event_jbtnIniciarActionPerformed

    private void jbtnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfiguracionActionPerformed
                  
        java.awt.Container parent = this.getParent();              
        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout) {                           
        java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();                            
        layout.show(parent, "CardConfiguracion"); 
                }
    }//GEN-LAST:event_jbtnConfiguracionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnConfiguracion;
    private javax.swing.JButton jbtnIniciar;
    // End of variables declaration//GEN-END:variables
}
