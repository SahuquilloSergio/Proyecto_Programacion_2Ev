package com.sergioadrian.juego;

import javax.swing.JOptionPane;

/**
 *
 * @author ssahuquilloembade & abrandarizdominguez
 */
public class MTablero {
    
    public void tirarDado(){
       int num = (int) (Math.random()*6+1);
        JOptionPane.showMessageDialog(null, "ha salido un"+num);
    }
}
