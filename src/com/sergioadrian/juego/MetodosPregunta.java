package com.sergioadrian.juego;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ssahuquilloembade & abrandarizdominguez
 */
public class MetodosPregunta {

    PrintWriter pw;
    String listaPro = "FicheroPreguntasPRO.txt";
    String listaSis = "FicheroPreguntasSI.txt";
    String listaBds = "FicheroPreguntasBD.txt";
    String listaLmsxi = "FicheroPreguntasLMSXI.txt";
    String listaFol = "FicheroPreguntasFOL.txt";
    String listaCod = "FicheroPreguntasCOD.txt";
    ArrayList<Pregunta> pregunta;
    Scanner sc;
    String delim = ",";
    String linea;
    int bucle;

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
    /**
     * Método "añadirPregunta" en el cual a través de un bucle do while en el que
     * se pide el tipo de pregunta, la pregunta y cuatro respuestas; Tras ésto
     * se crea un nuevo objeto de tipo pregunta conformado por estos nuevos
     * parámetros y se escribe en el fichero.
     */
    public void añadirPreguntaPro() {
        try {
            pw = new PrintWriter(new FileWriter(new File(listaPro), true));
            sc = new Scanner(new File(listaPro));
            // Bucle do while en el que se piden los valores de las variables.
            do {
                pregunta = new ArrayList();
                String preg = JOptionPane.showInputDialog("Pregunta: ");
                String res1 = JOptionPane.showInputDialog("Respuesta 1: ");
                String res2 = JOptionPane.showInputDialog("Respuesta 2: ");
                String res3 = JOptionPane.showInputDialog("Respuesta 3: ");
                String res4 = JOptionPane.showInputDialog("Respuesta 4: ");
                Pregunta p = new Pregunta(preg, res1, res2, res3, res4);
                pregunta.add(p);
                pw.println(p);
                bucle = JOptionPane.showConfirmDialog(null, "¿Añadir mas?");
            } while (bucle == 0);
        } catch (IOException ex) {
            Logger.getLogger(Pregunta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
            sc.close();
        }
    }
    
    public void añadirPreguntaSis() {
        try {
            pw = new PrintWriter(new FileWriter(new File(listaSis), true));
            sc = new Scanner(new File(listaSis));
            // Bucle do while en el que se piden los valores de las variables.
            do {
                pregunta = new ArrayList();
                String preg = JOptionPane.showInputDialog("Pregunta: ");
                String res1 = JOptionPane.showInputDialog("Respuesta 1: ");
                String res2 = JOptionPane.showInputDialog("Respuesta 2: ");
                String res3 = JOptionPane.showInputDialog("Respuesta 3: ");
                String res4 = JOptionPane.showInputDialog("Respuesta 4: ");
                Pregunta p = new Pregunta(preg, res1, res2, res3, res4);
                pregunta.add(p);
                pw.println(p);
                bucle = JOptionPane.showConfirmDialog(null, "¿Añadir mas?");
            } while (bucle == 0);
        } catch (IOException ex) {
            Logger.getLogger(Pregunta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
            sc.close();
        }
    }
    
    public void añadirPreguntaBds() {
        try {
            pw = new PrintWriter(new FileWriter(new File(listaBds), true));
            sc = new Scanner(new File(listaBds));
            // Bucle do while en el que se piden los valores de las variables.
            do {
                pregunta = new ArrayList();
                String preg = JOptionPane.showInputDialog("Pregunta: ");
                String res1 = JOptionPane.showInputDialog("Respuesta 1: ");
                String res2 = JOptionPane.showInputDialog("Respuesta 2: ");
                String res3 = JOptionPane.showInputDialog("Respuesta 3: ");
                String res4 = JOptionPane.showInputDialog("Respuesta 4: ");
                Pregunta p = new Pregunta(preg, res1, res2, res3, res4);
                pregunta.add(p);
                pw.println(p);
                bucle = JOptionPane.showConfirmDialog(null, "¿Añadir mas?");
            } while (bucle == 0);
        } catch (IOException ex) {
            Logger.getLogger(Pregunta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
            sc.close();
        }
    }
    
    public void añadirPreguntaLmsxi() {
        try {
            pw = new PrintWriter(new FileWriter(new File(listaBds), true));
            sc = new Scanner(new File(listaBds));
            // Bucle do while en el que se piden los valores de las variables.
            do {
                pregunta = new ArrayList();
                String preg = JOptionPane.showInputDialog("Pregunta: ");
                String res1 = JOptionPane.showInputDialog("Respuesta 1: ");
                String res2 = JOptionPane.showInputDialog("Respuesta 2: ");
                String res3 = JOptionPane.showInputDialog("Respuesta 3: ");
                String res4 = JOptionPane.showInputDialog("Respuesta 4: ");
                Pregunta p = new Pregunta(preg, res1, res2, res3, res4);
                pregunta.add(p);
                pw.println(p);
                bucle = JOptionPane.showConfirmDialog(null, "¿Añadir mas?");
            } while (bucle == 0);
        } catch (IOException ex) {
            Logger.getLogger(Pregunta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
            sc.close();
        }
    }
    
    public void añadirPreguntaFol() {
        try {
            pw = new PrintWriter(new FileWriter(new File(listaFol), true));
            sc = new Scanner(new File(listaFol));
            // Bucle do while en el que se piden los valores de las variables.
            do {
                pregunta = new ArrayList();
                String preg = JOptionPane.showInputDialog("Pregunta: ");
                String res1 = JOptionPane.showInputDialog("Respuesta 1: ");
                String res2 = JOptionPane.showInputDialog("Respuesta 2: ");
                String res3 = JOptionPane.showInputDialog("Respuesta 3: ");
                String res4 = JOptionPane.showInputDialog("Respuesta 4: ");
                Pregunta p = new Pregunta(preg, res1, res2, res3, res4);
                pregunta.add(p);
                pw.println(p);
                bucle = JOptionPane.showConfirmDialog(null, "¿Añadir mas?");
            } while (bucle == 0);
        } catch (IOException ex) {
            Logger.getLogger(Pregunta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
            sc.close();
        }
    }
    
    public void añadirPreguntaCod() {
        try {
            pw = new PrintWriter(new FileWriter(new File(listaCod), true));
            sc = new Scanner(new File(listaCod));
            // Bucle do while en el que se piden los valores de las variables.
            do {
                pregunta = new ArrayList();
                String preg = JOptionPane.showInputDialog("Pregunta: ");
                String res1 = JOptionPane.showInputDialog("Respuesta 1: ");
                String res2 = JOptionPane.showInputDialog("Respuesta 2: ");
                String res3 = JOptionPane.showInputDialog("Respuesta 3: ");
                String res4 = JOptionPane.showInputDialog("Respuesta 4: ");
                Pregunta p = new Pregunta(preg, res1, res2, res3, res4);
                pregunta.add(p);
                pw.println(p);
                bucle = JOptionPane.showConfirmDialog(null, "¿Añadir mas?");
            } while (bucle == 0);
        } catch (IOException ex) {
            Logger.getLogger(Pregunta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
            sc.close();
        }
    }
    
    public void leerPreguntaPro() {
        
    }
    
    public void leerPreguntaSis() {
        
    }
    
    public void leerPreguntaBds() {
        
    }
    
    public void leerPreguntaLmsxi() {
        
    }
    
    public void leerPreguntaFol() {
        
    }
    
    public void leerPreguntaCod() {
        
    }

    public void visualizar() {
        pregunta = new ArrayList();
        String ac = "";
        try {
            sc = new Scanner(new File(listaPro));
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                String[] l = linea.split(",");
                for (int i = 0; i < l.length; i += 5) {
                    pregunta.add(new Pregunta(l[i], l[i + 1], l[i + 2], l[i + 3], l[i + 4]));
                }
            }
            for (int j = 0; j < pregunta.size(); j++) {
                ac = ac + ("Pregunta " + (j + 1) + "---> "
                        + "Pregunta: " + pregunta.get(j).getPregunta()
                        + "Respuesta 1: " + pregunta.get(j).getRes1()
                        + "Respuesta 2: " + pregunta.get(j).getRes2()
                        + "Respuesta 3: " + pregunta.get(j).getRes3()
                        + "Respuesta 4: " + pregunta.get(j).getRes4() + "\n");
            }
            JOptionPane.showMessageDialog(null, ac);
        } catch (IOException ex) {
            Logger.getLogger(Pregunta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            sc.close();
        }
    }
}
