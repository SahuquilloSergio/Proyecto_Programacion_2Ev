package com.sergioadrian.juego;

/**
 *
 * @author ssahuquilloembade & abrandarizdominguez
 */
public class Pregunta {
    
    private String tipoPregunta, pregunta, res1, res2, res3, res4;

    public Pregunta() {
    }

    public Pregunta(String tipoPregunta, String pregunta, String res1, String res2, String res3, String res4) {
        this.tipoPregunta = tipoPregunta;
        this.pregunta = pregunta;
        this.res1 = res1;
        this.res2 = res2;
        this.res3 = res3;
        this.res4 = res4;
    }

    public void setTipoPregunta(String tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRes1(String res1) {
        this.res1 = res1;
    }

    public void setRes2(String res2) {
        this.res2 = res2;
    }

    public void setRes3(String res3) {
        this.res3 = res3;
    }

    public void setRes4(String res4) {
        this.res4 = res4;
    }

    public String getTipoPregunta() {
        return tipoPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRes1() {
        return res1;
    }

    public String getRes2() {
        return res2;
    }

    public String getRes3() {
        return res3;
    }

    public String getRes4() {
        return res4;
    }

    @Override
    public String toString() {
        return tipoPregunta + "," + pregunta + "," + res1 + "," + res2 + "," 
                + res3 + "," + res4;
    }
    
    
}
