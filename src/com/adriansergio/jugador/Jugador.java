package com.adriansergio.jugador;

import Juego.Excepciones;
import javax.swing.JOptionPane;

/**
 *
 * @author abrandarizdominguez & ssahuquilloembade
 */
public class Jugador {

    private String nombre;
    private int puntuacion = 0;
    /*
     * Boolean que indica si es el turno del jugador. Status:
     * false: no es su turno || true: es su turno
     */
    private boolean activo = false;
    /*
     * Boolean quesitos, que indican si el jugador ha adquirido dicho quesito.
     * false: no tiene el quesito || true: tiene el quesito
     */
    private boolean quesitoPro = false;
    private boolean quesitoSis = false;
    private boolean quesitoBds = false;
    private boolean quesitoCod = false;
    private boolean quesitoFol = false;
    private boolean quesitoLms = false;
    private boolean superQuesito = false;

    // Constructor por defecto:
    public Jugador() {

    }

    // Constructor por parámetros:
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    // Métodos de acceso: SETS Y GETS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setQuesitoPro(boolean quesitoPro) {
        this.quesitoPro = quesitoPro;
    }

    public void setQuesitoSis(boolean quesitoSis) {
        this.quesitoSis = quesitoSis;
    }

    public void setQuesitoBds(boolean quesitoBds) {
        this.quesitoBds = quesitoBds;
    }

    public void setQuesitoCod(boolean quesitoCod) {
        this.quesitoCod = quesitoCod;
    }

    public void setQuesitoFol(boolean quesitoFol) {
        this.quesitoFol = quesitoFol;
    }

    public void setQuesitoLms(boolean quesitoLms) {
        this.quesitoLms = quesitoLms;
    }

    public void setSuperQuesito(boolean superQuesito) {
        this.superQuesito = superQuesito;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public boolean isQuesitoPro() {
        return quesitoPro;
    }

    public boolean isQuesitoSis() {
        return quesitoSis;
    }

    public boolean isQuesitoBds() {
        return quesitoBds;
    }

    public boolean isQuesitoCod() {
        return quesitoCod;
    }

    public boolean isQuesitoFol() {
        return quesitoFol;
    }

    public boolean isQuesitoLms() {
        return quesitoLms;
    }

    public boolean isSuperQuesito() {
        return superQuesito;
    }

    /**
     * Método "toString" ajustado para introducir en ficheros.
     *
     * @return String cadena de variables que conforman la clase Jugador.
     */
    @Override
    public String toString() {
        return nombre + "," + puntuacion + "," + activo + "," + quesitoPro + ","
                + quesitoSis + "," + quesitoBds + "," + quesitoCod + ","
                + quesitoFol + "," + quesitoLms + "," + superQuesito;
    }
    
    public void ganar(){
        
            if (quesitoSis&&quesitoPro&&quesitoBds&&quesitoCod&&quesitoFol&&quesitoLms==true){
            JOptionPane.showMessageDialog(null, "ENHORABUENA, HAS GANADO");
        } else {
            }
        
        }

            
        }
        
    


