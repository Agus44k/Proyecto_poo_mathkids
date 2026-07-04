/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto_poo_mathkids;


public class soluciones extends javax.swing.JPanel {

    public soluciones() {
        initComponents();
    }
    
        public void cargarNuevaPregunta() { 
            
            String nuevaOperacion = generador.generarNuevaOperacion();    
            jlblPregunta.setText(nuevaOperacion);   
            jtxtRespuesta.setText(""); 
            jlblMensaje.setText("");
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtRespuesta = new javax.swing.JTextField();
        jlblPregunta = new javax.swing.JLabel();
        jbtnRevisar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jlblMensaje = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtRespuesta.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jtxtRespuesta.setForeground(new java.awt.Color(102, 153, 255));
        jtxtRespuesta.addActionListener(this::jtxtRespuestaActionPerformed);

        jlblPregunta.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        jlblPregunta.setForeground(new java.awt.Color(102, 153, 255));
        jlblPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPregunta.setText("\" \"");
        jlblPregunta.setToolTipText("");

        jbtnRevisar.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jbtnRevisar.setForeground(new java.awt.Color(102, 153, 255));
        jbtnRevisar.setText("COMPROBAR");
        jbtnRevisar.addActionListener(this::jbtnRevisarActionPerformed);

        jButton7.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 153, 255));
        jButton7.setText("VOLVER");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        jlblMensaje.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jlblMensaje.setForeground(new java.awt.Color(102, 153, 255));
        jlblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblMensaje.setText("Mensaje");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/resultado.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jlblPregunta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(581, 581, 581)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(627, 627, 627)
                        .addComponent(jbtnRevisar)))
                .addContainerGap(583, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                .addComponent(jlblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jtxtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblMensaje)
                .addGap(53, 53, 53)
                .addComponent(jbtnRevisar)
                .addGap(156, 156, 156)
                .addComponent(jButton7)
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRespuestaActionPerformed

    }//GEN-LAST:event_jtxtRespuestaActionPerformed

    private void jbtnRevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRevisarActionPerformed

        try {   
            int respuestaUsuario = Integer.parseInt(jtxtRespuesta.getText());   
            if (respuestaUsuario == gestor.respuestaCorrecta) {
                gestor.aciertos++;
                jlblMensaje.setText("¡Excelente! Muy bien hecho.");       
            } else {        
                jlblMensaje.setText("¡Uy! Casi. Inténtalo de nuevo.");
            }
            
            gestor.preguntaActual++;
            
            if (gestor.preguntaActual > gestor.MAX_PREGUNTAS) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Juego terminado\nAciertos: " + gestor.aciertos + "/" + gestor.MAX_PREGUNTAS);
                gestor.preguntaActual = 1;
                gestor.aciertos = 0;
                java.awt.Container parent = this.getParent();
                if (parent != null && parent.getLayout() instanceof java.awt.CardLayout) {
                    java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
                    layout.show(parent, "cardMenuestudiante");
                }
                return;
            }
            
            cargarNuevaPregunta();
       
        } catch (NumberFormatException e) {    
            jlblMensaje.setText("Por favor, ingresa solo números.");       
        }
    }//GEN-LAST:event_jbtnRevisarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        java.awt.Container parent = this.getParent();

        if (parent != null && parent.getLayout() instanceof java.awt.CardLayout)
        {
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
                layout.show(parent, "cardJuegos");
        }
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnRevisar;
    private javax.swing.JLabel jlblMensaje;
    private javax.swing.JLabel jlblPregunta;
    private javax.swing.JTextField jtxtRespuesta;
    // End of variables declaration//GEN-END:variables
}
