package com.sergioadrian.juego;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
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
    String[] lista;

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
     * Método "añadirPregunta" en el cual a través de un bucle do while en el
     * que se pide el tipo de pregunta, la pregunta y cuatro respuestas; Tras
     * ésto se crea un nuevo objeto de tipo pregunta conformado por estos nuevos
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
        try {
            sc = new Scanner(new File(listaPro));
            pregunta = new ArrayList();
            /*
             * Bucle while que mientras, en el fichero, haya más líneas que leer
             * las incorpora a un Array de tipo String, separando los componentes
             * por un delimitador que se ha asignado previamente. A continuación
             * se añade al ArrayList pregunta.
             */
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                lista = new String[5];
                lista = linea.split(delim);
                Pregunta p = new Pregunta(lista[0], lista[1], lista[2], lista[3], lista[4]);
                pregunta.add(p);
            }
            // Se crean y se inicializan las variables a utilizar en la pregunta.
            int finalRes = 4;
            int principioRes = 1;
            int pre = 0;
            Random num = new Random(System.nanoTime());
            int numRespuesta1;
            int numRespuesta2;
            int numRespuesta3;
            int numRespuesta4;
            /*
             * Se crea otro número aleatorio que seleccionará de forma aleatoria 
             * una pregunta de las almacenadas en el fichero.
             */
            int numPregunta = num.nextInt((pregunta.size() - 1) - pre + 1) + pre;
            // Crea un número aleatorio entre 1 y 4 y se almacena en la variable
            numRespuesta1 = num.nextInt(finalRes - principioRes + 1) + principioRes;
            /*
             * Bucle do while que se emplea en cada una de las respuestas
             * siguientes que generará otro número aleatorio para esa respuesta
             * y seguirá generándolo hasta que no coincida.
             */
            do {
                numRespuesta2 = num.nextInt(finalRes - principioRes + 1) + principioRes;
            } while (numRespuesta1 == numRespuesta2);
            do {
                numRespuesta3 = num.nextInt(finalRes - principioRes + 1) + principioRes;
            } while (numRespuesta1 == numRespuesta3 || numRespuesta2 == numRespuesta3);
            do {
                numRespuesta4 = num.nextInt(finalRes - principioRes + 1) + principioRes;
            } while (numRespuesta1 == numRespuesta4 || numRespuesta2 == numRespuesta4 || numRespuesta3 == numRespuesta4);
            // Se crea una variable auxilar para imprimir las respuestas:
            String[] auxiliar = new String[4];
            String numero1 = Integer.toString(numRespuesta1);
            String res1 = pregunta.get(numPregunta).getRes1();
            auxiliar[0] = numero1 + ") " + res1;
            String numero2 = Integer.toString(numRespuesta2);
            String res2 = pregunta.get(numPregunta).getRes2();
            auxiliar[1] = numero2 + ") " + res2;
            String numero3 = Integer.toString(numRespuesta3);
            String res3 = pregunta.get(numPregunta).getRes3();
            auxiliar[2] = numero3 + ") " + res3;
            String numero4 = Integer.toString(numRespuesta4);
            String res4 = pregunta.get(numPregunta).getRes4();
            auxiliar[3] = numero4 + ") " + res4;
            // Se ordena el array:
            for (int i = 0; i < (auxiliar.length - 1); i++) {
                for (int j = i + 1; j < auxiliar.length; j++) {
                    if (auxiliar[i].compareToIgnoreCase(auxiliar[j]) > 0) {
                        //Intercambiamos valores
                        String variableauxiliar = auxiliar[i];
                        auxiliar[i] = auxiliar[j];
                        auxiliar[j] = variableauxiliar;

                    }
                }
            }

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Pregunta Programación:\n" + pregunta.get(numPregunta).getPregunta()
                    + "\n" + auxiliar[0]
                    + "\n" + auxiliar[1]
                    + "\n" + auxiliar[2]
                    + "\n" + auxiliar[3]));
            // Estructura condicional if/else en la que se indica si se acierta la pregunta.           
            if (opcion == numRespuesta1) {
                JOptionPane.showMessageDialog(null, "Has acertado, vuelves a tirar!");
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado, suerte en la próxima!");
            }
        } catch (IOException ex) {
            Logger.getLogger(Pregunta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            sc.close();
        }
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
