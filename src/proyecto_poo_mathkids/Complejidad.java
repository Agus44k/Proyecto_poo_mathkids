/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto_poo_mathkids;

/**
 *
 * @author User
 */
public class Complejidad extends javax.swing.JPanel {

    /**
     * Creates new form Complejidad
     */
    public Complejidad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nivel.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facil.png"))); // NOI18N
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 226, 245), 3, true));
        jButton5.addActionListener(this::jButton5ActionPerformed);
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 130, 170));

        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/normal.png"))); // NOI18N
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 226, 245), 3, true));
        jButton6.addActionListener(this::jButton6ActionPerformed);
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 130, 170));

        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dificil.png"))); // NOI18N
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 226, 245), 3, true));
        jButton7.addActionListener(this::jButton7ActionPerformed);
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 130, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMAGEN2.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -30, 780, 530));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        gestor.dificultadActual = 1; 
        gestor.preguntaActual = 1;
        gestor.aciertos = 0;

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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       gestor.dificultadActual = 2;
       gestor.preguntaActual = 1;
       gestor.aciertos = 0;

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
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       gestor.dificultadActual = 3;
       gestor.preguntaActual = 1;
       gestor.aciertos = 0;

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
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
