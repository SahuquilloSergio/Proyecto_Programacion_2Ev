package com.adriansergio.jugador;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Turno {

    int num;
    
    /**
     * Método que reproduce un sonido cuando se acierta una pregunta normal.
     */
    public void SonidoAcertarPreguntaNormal() {

        try {
            // Se obtiene un Clip de sonido
            Clip sonido = AudioSystem.getClip();
            // Se carga con un fichero wav
            sonido.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\serxa\\Downloads\\MarioCoin.wav")));
            // Comienza la reproducción
            sonido.start();
            // Espera mientras se esté reproduciendo.
            while (sonido.isRunning()) {
                Thread.sleep(1000);
            }
            // Se cierra el clip.
            sonido.close();
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
    
    /**
     * Método que hace sonar un sonido cuando se falla una pregunta.
     */
    public void SonidoFallarPregunta() {

        try {
            // Se obtiene un Clip de sonido
            Clip sonido = AudioSystem.getClip();
            // Se carga con un fichero wav
            sonido.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\serxa\\Downloads\\Error.wav")));
            // Comienza la reproducción
            sonido.start();
            // Espera mientras se esté reproduciendo.
            while (sonido.isRunning()) {
                Thread.sleep(1000);
            }
            // Se cierra el clip.
            sonido.close();
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

}
