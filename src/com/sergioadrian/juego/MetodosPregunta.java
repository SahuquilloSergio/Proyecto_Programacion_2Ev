package com.sergioadrian.juego;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ssahuquilloembade & abrandarizdominguez
 */
public class MetodosPregunta {

    PrintWriter f;
    String listaPro = "FicheroPreguntasPRO.txt";
    ArrayList<Pregunta> pregunta;
    Scanner sc;
    String delim = ",";
    String linea;
    int bucle;
    File fichero = new File("C:\\Users\\Hansen\\Documents\\NetBeansProjects\\PRO_Proyecto_2ev\\FicheroPreguntasPRO.txt");

    /*
       * Si op=0 añade "pro" en tipoPregunta de Pregunta, etc etc
       * Pendiente para DLC.
     */
//    String[] opciones = {"PRO", "SI", "BD", "COD", "FOL", "LMSXI"};
//    public void añadir() {
//        try {
//            f = new PrintWriter(new FileWriter(new File(rutaFicheroPreguntas), true));
//            sc = new Scanner(new File(rutaFicheroPreguntas));
//            do {
//                pregunta = new ArrayList();
//                String tipoPregunta;
//                int op = JOptionPane.showOptionDialog(null, "¿Tipo de pregunta?", "Selecciona un boton", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
//                switch (op) {
//                    case 1: ;
//                }
//                Pregunta p = new Pregunta();
//                pregunta.add(p);
//                f.println(p);
//                bucle = JOptionPane.showConfirmDialog(null, "¿Añadir mas?");
//            } while (bucle == 0);
//
//        } catch (IOException ex) {
//            Logger.getLogger(Pregunta.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            f.close();
//            sc.close();
//        }
//    }
    public void visualizar() {
        String resposta;
        try {
            sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                resposta = sc.nextLine();
                System.out.println(resposta);
            }
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.getMessage());
        } finally {
            sc.close();
        }
    }

}
