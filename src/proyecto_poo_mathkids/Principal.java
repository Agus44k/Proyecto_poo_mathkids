/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_poo_mathkids;


public class PRINCIPAL extends javax.swing.JFrame {
    
    public static String usuarioRegistrado = "";
    public static String contrasenaRegistrada = "";
    public static int studentId = -1;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PRINCIPAL.class.getName());



    public PRINCIPAL() {
        initComponents();
        ConexionBD.conectar();
        MusicaFondo.iniciar();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio_sam = new proyecto_poo_mathkids.Inicio_sam();
        login_sam = new proyecto_poo_mathkids.Login_sam();
        registroSam = new proyecto_poo_mathkids.RegistroSam();
        menu_Estudiantes = new proyecto_poo_mathkids.Menu_Estudiantes();
        juegos = new proyecto_poo_mathkids.Juegos();
        complejidad1 = new proyecto_poo_mathkids.Complejidad();
        soluciones1 = new proyecto_poo_mathkids.soluciones();
        configuracion1 = new proyecto_poo_mathkids.Configuracion();
        creditos1 = new proyecto_poo_mathkids.Creditos();
        tutorial1 = new proyecto_poo_mathkids.Tutorial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(inicio_sam, "cardInicio");
        getContentPane().add(login_sam, "cardLogin");
        getContentPane().add(registroSam, "cardRegistro");
        getContentPane().add(menu_Estudiantes, "cardMenuestudiante");
        getContentPane().add(juegos, "cardJuegos");
        getContentPane().add(complejidad1, "cardDificultad");
        getContentPane().add(soluciones1, "cardJuego");
        getContentPane().add(configuracion1, "CardConfiguracion");
        getContentPane().add(creditos1, "CardCredito");
        getContentPane().add(tutorial1, "cardTutorial");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(() -> new PRINCIPAL().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private proyecto_poo_mathkids.Complejidad complejidad1;
    private proyecto_poo_mathkids.Configuracion configuracion1;
    private proyecto_poo_mathkids.Creditos creditos1;
    private proyecto_poo_mathkids.Inicio_sam inicio_sam;
    private proyecto_poo_mathkids.Juegos juegos;
    private proyecto_poo_mathkids.Login_sam login_sam;
    private proyecto_poo_mathkids.Menu_Estudiantes menu_Estudiantes;
    private proyecto_poo_mathkids.RegistroSam registroSam;
    private proyecto_poo_mathkids.soluciones soluciones1;
    private proyecto_poo_mathkids.Tutorial tutorial1;
    // End of variables declaration//GEN-END:variables
}
