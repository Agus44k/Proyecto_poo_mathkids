/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto_poo_mathkids;

/**
 *
 * @author User
 */
public class Menu_Estudiantes extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Estudiantes
     */
    public Menu_Estudiantes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnIniciar2 = new javax.swing.JButton();
        jbtnConfiguracion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logro.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 226, 245), 3, true));
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, 140, 220));

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/juego.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 226, 245), 3, true));
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 140, 220));

        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reto.png"))); // NOI18N
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 226, 245), 3, true));
        jButton5.addActionListener(this::jButton5ActionPerformed);
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 150, 220));

        btnIniciar2.setBackground(new java.awt.Color(107, 181, 255));
        btnIniciar2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnIniciar2.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar2.setText("VOLVER");
        btnIniciar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btnIniciar2.addActionListener(this::btnIniciar2ActionPerformed);
        jPanel1.add(btnIniciar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 690, 120, 30));

        jbtnConfiguracion.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        jbtnConfiguracion.setForeground(new java.awt.Color(102, 153, 255));
        jbtnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/configuracion.png"))); // NOI18N
        jbtnConfiguracion.addActionListener(this::jbtnConfiguracionActionPerformed);
        jPanel1.add(jbtnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/que quieres hacer.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1370, -1));

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
           layout.show(parent, "cardJuegos"); 
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StringBuilder msg = new StringBuilder("=== TOP PUNTAJES ===\n\n");
        msg.append("No hay puntajes aun");
        
        javax.swing.JOptionPane.showMessageDialog(this, msg.toString(), "Logros", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        gestor.operacionActual = "reto";
        gestor.preguntaActual = 1;
        gestor.aciertos = 0;
        gestor.dificultadActual = 3; 

        java.awt.Container parent = this.getParent();
        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout) {
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
            layout.show(parent, "cardJuego"); 
    
    
            for (java.awt.Component comp : parent.getComponents()) {      
                if (comp instanceof soluciones) {            
                    ((soluciones) comp).cargarNuevaPregunta();
            break;
        }
    }
}
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnIniciar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar2ActionPerformed
       
            java.awt.Container parent = this.getParent();
            if (parent != null && parent.getLayout() instanceof java.awt.CardLayout) {   
                java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
                layout.show(parent, "cardLogin");
            }
    }//GEN-LAST:event_btnIniciar2ActionPerformed

    private void jbtnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfiguracionActionPerformed

        java.awt.Container parent = this.getParent();
        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout) {
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
            layout.show(parent, "CardConfiguracion");
        }
    }//GEN-LAST:event_jbtnConfiguracionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnConfiguracion;
    // End of variables declaration//GEN-END:variables
}
