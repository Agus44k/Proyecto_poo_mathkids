package proyecto_poo_mathkids;

import javax.sound.sampled.*;

public class MusicaFondo {
    private static Clip clip;
    private static boolean sonando = false;

    public static void iniciar() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(
                MusicaFondo.class.getResourceAsStream("/Sonido/neutro.wav")
            );
            clip = AudioSystem.getClip();
            clip.open(audio);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            sonando = true;
        } catch (Exception e) {
            System.out.println("Error al iniciar musica: " + e.getMessage());
        }
    }

    public static void toggle() {
        if (clip == null) return;
        if (sonando) {
            clip.stop();
            sonando = false;
        } else {
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            sonando = true;
        }
    }
}
