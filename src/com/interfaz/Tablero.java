/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaz;
import com.sergioadrian.juego.MetodosPregunta;
import com.sergioadrian.juego.MTablero;
import java.io.File;

/**
 *
 * @author serxa
 */
public class Tablero extends javax.swing.JFrame {

    /**
     * Creates new form Tablero
     */
    public Tablero() {
        initComponents();
    }
    MetodosPregunta M1 = new MetodosPregunta();
    MTablero T1 = new MTablero();
    File FicheroPRO = new File("FicheroPreguntasPRO.txt");
    File FicheroSI = new File("FicheroPreguntasSI.txt");
    File FicheroLMSXI = new File("FicheroPreguntasLMSXI.txt");
    File FicheroBD = new File("FicheroPreguntasBD.txt");
    File FicheroFOL = new File("FicheroPreguntasFOL.txt");
    File FicheroCOD = new File("FicheroPreguntasCOD.txt");
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Casilla1 = new javax.swing.JButton();
        Casilla22 = new javax.swing.JButton();
        Casilla29 = new javax.swing.JButton();
        Casilla36 = new javax.swing.JButton();
        Casilla8 = new javax.swing.JButton();
        Casilla15 = new javax.swing.JButton();
        Casilla2 = new javax.swing.JButton();
        Casilla3 = new javax.swing.JButton();
        Casilla4 = new javax.swing.JButton();
        Casilla5 = new javax.swing.JButton();
        Casilla6 = new javax.swing.JButton();
        Casilla7 = new javax.swing.JButton();
        Casilla9 = new javax.swing.JButton();
        Casilla10 = new javax.swing.JButton();
        Casilla11 = new javax.swing.JButton();
        Casilla12 = new javax.swing.JButton();
        Casilla13 = new javax.swing.JButton();
        Casilla14 = new javax.swing.JButton();
        Casilla21 = new javax.swing.JButton();
        Casilla20 = new javax.swing.JButton();
        Casilla19 = new javax.swing.JButton();
        Casilla18 = new javax.swing.JButton();
        Casilla17 = new javax.swing.JButton();
        Casilla16 = new javax.swing.JButton();
        Casilla23 = new javax.swing.JButton();
        Casilla24 = new javax.swing.JButton();
        Casilla25 = new javax.swing.JButton();
        Casilla26 = new javax.swing.JButton();
        Casilla27 = new javax.swing.JButton();
        Casilla28 = new javax.swing.JButton();
        Casilla42 = new javax.swing.JButton();
        Casilla41 = new javax.swing.JButton();
        Casilla40 = new javax.swing.JButton();
        Casilla39 = new javax.swing.JButton();
        Casilla38 = new javax.swing.JButton();
        Casilla37 = new javax.swing.JButton();
        Casilla35 = new javax.swing.JButton();
        Casilla34 = new javax.swing.JButton();
        Casilla33 = new javax.swing.JButton();
        Casilla30 = new javax.swing.JButton();
        Casilla31 = new javax.swing.JButton();
        Casilla32 = new javax.swing.JButton();
        dado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Casilla1.setBackground(new java.awt.Color(102, 51, 0));
        Casilla1.setForeground(new java.awt.Color(0, 0, 0));
        Casilla1.setText("QUESITO");
        Casilla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla1MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 193, -1, -1));

        Casilla22.setBackground(new java.awt.Color(255, 204, 0));
        Casilla22.setForeground(new java.awt.Color(0, 0, 0));
        Casilla22.setText("QUESITO");
        Casilla22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla22MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        Casilla29.setBackground(new java.awt.Color(255, 0, 255));
        Casilla29.setForeground(new java.awt.Color(0, 0, 0));
        Casilla29.setText("QUESITO");
        Casilla29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla29MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla29, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 80, 30));

        Casilla36.setBackground(new java.awt.Color(51, 204, 0));
        Casilla36.setForeground(new java.awt.Color(0, 0, 0));
        Casilla36.setText("QUESITO");
        Casilla36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla36MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 325, 80, 30));

        Casilla8.setBackground(new java.awt.Color(0, 51, 153));
        Casilla8.setForeground(new java.awt.Color(0, 0, 0));
        Casilla8.setText("QUESITO");
        Casilla8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla8MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        Casilla15.setBackground(new java.awt.Color(255, 102, 0));
        Casilla15.setForeground(new java.awt.Color(0, 0, 0));
        Casilla15.setText("QUESITO");
        Casilla15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla15MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        Casilla2.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla amarilla.jpg")); // NOI18N
        Casilla2.setText("jButton8");
        getContentPane().add(Casilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 175, 50, 20));

        Casilla3.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla blanca.jpg")); // NOI18N
        Casilla3.setText("jButton9");
        Casilla3.setPreferredSize(new java.awt.Dimension(50, 25));
        Casilla3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla3MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, 50, 20));

        Casilla4.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla naranja.jpg")); // NOI18N
        Casilla4.setText("jButton10");
        Casilla4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla4MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 135, 50, 20));

        Casilla5.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla verde.jpg")); // NOI18N
        Casilla5.setText("jButton11");
        Casilla5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla5MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 115, 50, 20));

        Casilla6.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla blanca.jpg")); // NOI18N
        Casilla6.setText("jButton12");
        Casilla6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla6MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 95, 50, 20));

        Casilla7.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla rosa.jpg")); // NOI18N
        Casilla7.setText("jButton13");
        Casilla7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla7MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 75, 50, 20));

        Casilla9.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla rosa.jpg")); // NOI18N
        Casilla9.setText("jButton14");
        Casilla9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla9MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla9, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 30, 50, 20));

        Casilla10.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla blanca.jpg")); // NOI18N
        Casilla10.setText("jButton15");
        Casilla10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla10MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 50, 20));

        Casilla11.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla amarilla.jpg")); // NOI18N
        Casilla11.setText("jButton16");
        Casilla11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla11MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 50, 20));

        Casilla12.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla marron.jpg")); // NOI18N
        Casilla12.setText("jButton17");
        Casilla12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla12MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 50, 20));

        Casilla13.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla blanca.jpg")); // NOI18N
        Casilla13.setText("jButton18");
        Casilla13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla13MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 50, 20));

        Casilla14.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla verde.jpg")); // NOI18N
        Casilla14.setText("jButton19");
        Casilla14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla14MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 50, 20));

        Casilla21.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla marron.jpg")); // NOI18N
        Casilla21.setText("jButton20");
        Casilla21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla21MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 50, 20));

        Casilla20.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla blanca.jpg")); // NOI18N
        Casilla20.setText("jButton21");
        Casilla20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla20MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 50, 20));

        Casilla19.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla azul.jpg")); // NOI18N
        Casilla19.setText("jButton22");
        Casilla19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla19MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 50, 20));

        Casilla18.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla rosa.jpg")); // NOI18N
        Casilla18.setText("jButton23");
        Casilla18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla18MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 50, 20));

        Casilla17.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla blanca.jpg")); // NOI18N
        Casilla17.setText("jButton24");
        Casilla17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla17MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 50, 20));

        Casilla16.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla verde.jpg")); // NOI18N
        Casilla16.setText("jButton25");
        Casilla16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla16MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 50, 20));

        Casilla23.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla marron.jpg")); // NOI18N
        Casilla23.setText("jButton1");
        Casilla23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla23MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla23, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 50, 20));

        Casilla24.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla blanca.jpg")); // NOI18N
        Casilla24.setText("jButton2");
        Casilla24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla24MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 50, 20));

        Casilla25.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla verde.jpg")); // NOI18N
        Casilla25.setText("jButton3");
        Casilla25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla25MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla25, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 50, 20));

        Casilla26.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla naranja.jpg")); // NOI18N
        Casilla26.setText("jButton4");
        Casilla26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla26MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 50, 20));

        Casilla27.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla blanca.jpg")); // NOI18N
        Casilla27.setText("jButton5");
        Casilla27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla27MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla27, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 50, 20));

        Casilla28.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla azul.jpg")); // NOI18N
        Casilla28.setText("jButton6");
        Casilla28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla28MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 50, 20));

        Casilla42.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla amarilla.jpg")); // NOI18N
        Casilla42.setText("jButton7");
        Casilla42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla42MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla42, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, 50, 20));

        Casilla41.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla blanca.jpg")); // NOI18N
        Casilla41.setText("jButton26");
        Casilla41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla41MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla41, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 234, 50, 20));

        Casilla40.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla rosa.jpg")); // NOI18N
        Casilla40.setText("jButton27");
        Casilla40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla40MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla40, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 252, 50, 20));

        Casilla39.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla azul.jpg")); // NOI18N
        Casilla39.setText("jButton28");
        Casilla39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla39MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla39, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 270, 50, 20));

        Casilla38.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla blanca.jpg")); // NOI18N
        Casilla38.setText("jButton29");
        Casilla38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla38MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla38, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 288, 50, 20));

        Casilla37.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla naranja.jpg")); // NOI18N
        Casilla37.setText("jButton30");
        Casilla37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla37MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla37, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 306, 50, 20));

        Casilla35.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla naranja.jpg")); // NOI18N
        Casilla35.setText("jButton31");
        Casilla35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla35MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla35, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 354, 50, 20));

        Casilla34.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla blanca.jpg")); // NOI18N
        Casilla34.setText("jButton32");
        Casilla34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla34MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla34, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 375, 50, 20));

        Casilla33.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla amarilla.jpg")); // NOI18N
        Casilla33.setText("jButton33");
        Casilla33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla33MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 50, 20));

        Casilla30.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla azul.jpg")); // NOI18N
        Casilla30.setText("jButton34");
        Casilla30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla30MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla30, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 60, 20));

        Casilla31.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla blanca.jpg")); // NOI18N
        Casilla31.setText("jButton35");
        Casilla31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla31MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla31, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 50, 20));

        Casilla32.setIcon(new javax.swing.ImageIcon("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\PRO_Proyecto_2ev\\Media\\casilla marron.jpg")); // NOI18N
        Casilla32.setText("jButton36");
        Casilla32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Casilla32MouseClicked(evt);
            }
        });
        getContentPane().add(Casilla32, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 50, 20));

        dado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dadoMouseClicked(evt);
            }
        });
        getContentPane().add(dado, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 60, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Casilla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla1MouseClicked
        M1.leerPregunta(FicheroSI);
    }//GEN-LAST:event_Casilla1MouseClicked

    private void Casilla3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla3MouseClicked
        T1.tirarDado();
    }//GEN-LAST:event_Casilla3MouseClicked

    private void Casilla4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla4MouseClicked
        M1.leerPregunta(FicheroCOD);
    }//GEN-LAST:event_Casilla4MouseClicked

    private void Casilla5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla5MouseClicked
        M1.leerPregunta(FicheroLMSXI);
    }//GEN-LAST:event_Casilla5MouseClicked

    private void Casilla6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla6MouseClicked
        T1.tirarDado();
    }//GEN-LAST:event_Casilla6MouseClicked

    private void Casilla7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla7MouseClicked
        M1.leerPregunta(FicheroFOL);
    }//GEN-LAST:event_Casilla7MouseClicked

    private void Casilla8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla8MouseClicked
        M1.leerPregunta(FicheroBD);
    }//GEN-LAST:event_Casilla8MouseClicked

    private void Casilla9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla9MouseClicked
        M1.leerPregunta(FicheroFOL);
    }//GEN-LAST:event_Casilla9MouseClicked

    private void Casilla10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla10MouseClicked
        T1.tirarDado();
    }//GEN-LAST:event_Casilla10MouseClicked

    private void Casilla11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla11MouseClicked
        M1.leerPregunta(FicheroPRO);
    }//GEN-LAST:event_Casilla11MouseClicked

    private void Casilla12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla12MouseClicked
        M1.leerPregunta(FicheroSI);
    }//GEN-LAST:event_Casilla12MouseClicked

    private void Casilla13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla13MouseClicked
        T1.tirarDado();
    }//GEN-LAST:event_Casilla13MouseClicked

    private void Casilla14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla14MouseClicked
        M1.leerPregunta(FicheroLMSXI);
    }//GEN-LAST:event_Casilla14MouseClicked

    private void Casilla15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla15MouseClicked
        M1.leerPregunta(FicheroCOD);
    }//GEN-LAST:event_Casilla15MouseClicked

    private void Casilla16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla16MouseClicked
        M1.leerPregunta(FicheroLMSXI);
    }//GEN-LAST:event_Casilla16MouseClicked

    private void Casilla17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla17MouseClicked
        T1.tirarDado();
    }//GEN-LAST:event_Casilla17MouseClicked

    private void Casilla18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla18MouseClicked
        M1.leerPregunta(FicheroFOL);
    }//GEN-LAST:event_Casilla18MouseClicked

    private void Casilla19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla19MouseClicked
        M1.leerPregunta(FicheroBD);
    }//GEN-LAST:event_Casilla19MouseClicked

    private void Casilla20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla20MouseClicked
        T1.tirarDado();
    }//GEN-LAST:event_Casilla20MouseClicked

    private void Casilla21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla21MouseClicked
        M1.leerPregunta(FicheroSI);
    }//GEN-LAST:event_Casilla21MouseClicked

    private void Casilla22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla22MouseClicked
        M1.leerPregunta(FicheroPRO);
    }//GEN-LAST:event_Casilla22MouseClicked

    private void Casilla23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla23MouseClicked
        M1.leerPregunta(FicheroSI);
    }//GEN-LAST:event_Casilla23MouseClicked

    private void Casilla24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla24MouseClicked
        T1.tirarDado();
    }//GEN-LAST:event_Casilla24MouseClicked

    private void Casilla25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla25MouseClicked
        M1.leerPregunta(FicheroLMSXI);
    }//GEN-LAST:event_Casilla25MouseClicked

    private void Casilla26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla26MouseClicked
        M1.leerPregunta(FicheroCOD);
    }//GEN-LAST:event_Casilla26MouseClicked

    private void Casilla27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla27MouseClicked
        T1.tirarDado();
    }//GEN-LAST:event_Casilla27MouseClicked

    private void Casilla28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla28MouseClicked
        M1.leerPregunta(FicheroBD);
    }//GEN-LAST:event_Casilla28MouseClicked

    private void Casilla29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla29MouseClicked
        M1.leerPregunta(FicheroFOL);
    }//GEN-LAST:event_Casilla29MouseClicked

    private void Casilla30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla30MouseClicked
        M1.leerPregunta(FicheroBD);
    }//GEN-LAST:event_Casilla30MouseClicked

    private void Casilla31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla31MouseClicked
        T1.tirarDado();
    }//GEN-LAST:event_Casilla31MouseClicked

    private void Casilla32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla32MouseClicked
        M1.leerPregunta(FicheroSI);
    }//GEN-LAST:event_Casilla32MouseClicked

    private void Casilla33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla33MouseClicked
        M1.leerPregunta(FicheroPRO);
    }//GEN-LAST:event_Casilla33MouseClicked

    private void Casilla34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla34MouseClicked
        T1.tirarDado();
    }//GEN-LAST:event_Casilla34MouseClicked

    private void Casilla35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla35MouseClicked
        M1.leerPregunta(FicheroCOD);
    }//GEN-LAST:event_Casilla35MouseClicked

    private void Casilla36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla36MouseClicked
        M1.leerPregunta(FicheroLMSXI);
    }//GEN-LAST:event_Casilla36MouseClicked

    private void Casilla37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla37MouseClicked
        M1.leerPregunta(FicheroCOD);
    }//GEN-LAST:event_Casilla37MouseClicked

    private void Casilla38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla38MouseClicked
        T1.tirarDado();
    }//GEN-LAST:event_Casilla38MouseClicked

    private void Casilla39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla39MouseClicked
        M1.leerPregunta(FicheroBD);
    }//GEN-LAST:event_Casilla39MouseClicked

    private void Casilla40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla40MouseClicked
        M1.leerPregunta(FicheroFOL);
    }//GEN-LAST:event_Casilla40MouseClicked

    private void Casilla41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla41MouseClicked
        T1.tirarDado();
    }//GEN-LAST:event_Casilla41MouseClicked

    private void Casilla42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla42MouseClicked
        M1.leerPregunta(FicheroPRO);
    }//GEN-LAST:event_Casilla42MouseClicked

    private void dadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dadoMouseClicked
        T1.tirarDado();
    }//GEN-LAST:event_dadoMouseClicked

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Casilla1;
    private javax.swing.JButton Casilla10;
    private javax.swing.JButton Casilla11;
    private javax.swing.JButton Casilla12;
    private javax.swing.JButton Casilla13;
    private javax.swing.JButton Casilla14;
    private javax.swing.JButton Casilla15;
    private javax.swing.JButton Casilla16;
    private javax.swing.JButton Casilla17;
    private javax.swing.JButton Casilla18;
    private javax.swing.JButton Casilla19;
    private javax.swing.JButton Casilla2;
    private javax.swing.JButton Casilla20;
    private javax.swing.JButton Casilla21;
    private javax.swing.JButton Casilla22;
    private javax.swing.JButton Casilla23;
    private javax.swing.JButton Casilla24;
    private javax.swing.JButton Casilla25;
    private javax.swing.JButton Casilla26;
    private javax.swing.JButton Casilla27;
    private javax.swing.JButton Casilla28;
    private javax.swing.JButton Casilla29;
    private javax.swing.JButton Casilla3;
    private javax.swing.JButton Casilla30;
    private javax.swing.JButton Casilla31;
    private javax.swing.JButton Casilla32;
    private javax.swing.JButton Casilla33;
    private javax.swing.JButton Casilla34;
    private javax.swing.JButton Casilla35;
    private javax.swing.JButton Casilla36;
    private javax.swing.JButton Casilla37;
    private javax.swing.JButton Casilla38;
    private javax.swing.JButton Casilla39;
    private javax.swing.JButton Casilla4;
    private javax.swing.JButton Casilla40;
    private javax.swing.JButton Casilla41;
    private javax.swing.JButton Casilla42;
    private javax.swing.JButton Casilla5;
    private javax.swing.JButton Casilla6;
    private javax.swing.JButton Casilla7;
    private javax.swing.JButton Casilla8;
    private javax.swing.JButton Casilla9;
    private javax.swing.JButton dado;
    // End of variables declaration//GEN-END:variables
}
