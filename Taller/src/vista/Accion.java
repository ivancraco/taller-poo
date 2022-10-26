package vista;

import javax.swing.*;

import modelo.TablaRegistro;

import java.awt.event.*;

import vista.tabla.*;
// import modelo.ModeloTabla;


public class Accion extends JFrame{
    
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JButton jButtonEjeDevolver;
    private javax.swing.JButton jButtonEjeReservados;
    private javax.swing.JButton jButtonEjeSinDevolver;
    private javax.swing.JButton jButtonLectorMasMultado;
    private javax.swing.JButton jButtonLectorMultaPeriodo;
    private javax.swing.JButton jButtonObrasEditorial;
    private javax.swing.JButton jButtonObrasIndice;
    private javax.swing.JButton jButtonObrasPopularesAD;
    private javax.swing.JButton jButtonObrasPopularesPG;
    private javax.swing.JButton jButtonObrasTematica;
    




    public Accion(){

        super("Menú Biblioteca");
        initComponents();
    }

    private void initComponents() {

        jLabelBG = new javax.swing.JLabel();
        jButtonEjeDevolver = new javax.swing.JButton();
        jButtonEjeSinDevolver = new javax.swing.JButton();
        jButtonEjeReservados = new javax.swing.JButton();
        jButtonObrasTematica = new javax.swing.JButton();
        jButtonObrasIndice = new javax.swing.JButton();
        jButtonObrasEditorial = new javax.swing.JButton();
        jButtonObrasPopularesAD = new javax.swing.JButton();
        jButtonObrasPopularesPG = new javax.swing.JButton();
        jButtonLectorMultaPeriodo = new javax.swing.JButton();
        jButtonLectorMasMultado = new javax.swing.JButton();
        
        //Ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        setSize(966, 539);

        //Backgronf
        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("w3.png")));
        jLabelBG.setBounds(0, 0, 950, 500);
        jLabelBG.setLayout(null);


        //Botones
        jButtonEjeDevolver.setBackground(new java.awt.Color(13, 124, 200));
        jButtonEjeDevolver.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonEjeDevolver.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEjeDevolver.setText("DEVOLVER");
        jButtonEjeDevolver.setBorder(null);
        jButtonEjeDevolver.setFocusPainted(false);
        jButtonEjeDevolver.setBounds(160, 62, 150, 40);
        jButtonEjeDevolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEjeDevolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEjeDevolverMouseClicked(evt);
            }

            private void jButtonEjeDevolverMouseClicked(MouseEvent evt) {
                VerificarLector o = new VerificarLector(null, TablaRegistro.DEVOLUCION);
                o.setVisible(true);
            }
        });
        jLabelBG.add(jButtonEjeDevolver);

        jButtonEjeSinDevolver.setBackground(new java.awt.Color(13, 124, 200));
        jButtonEjeSinDevolver.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonEjeSinDevolver.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEjeSinDevolver.setText("SIN DEVOLVER");
        jButtonEjeSinDevolver.setBorder(null);
        jButtonEjeSinDevolver.setFocusPainted(false);
        jButtonEjeSinDevolver.setBounds(160, 120, 150, 40);
        jButtonEjeSinDevolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEjeSinDevolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEjeSinDevolverMouseClicked(evt);
            }

            private void jButtonEjeSinDevolverMouseClicked(MouseEvent evt) {
                Deudor o = new Deudor();
                o.setVisible(true);
            }
        });
        jLabelBG.add(jButtonEjeSinDevolver);

        jButtonEjeReservados.setBackground(new java.awt.Color(13, 124, 200));
        jButtonEjeReservados.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonEjeReservados.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEjeReservados.setText("RESERVADOS");
        jButtonEjeReservados.setBorder(null);
        jButtonEjeReservados.setFocusPainted(false);
        jButtonEjeReservados.setBounds(160, 178, 150, 40);
        jButtonEjeReservados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEjeReservados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEjeReservadosMouseClicked(evt);
            }

            private void jButtonEjeReservadosMouseClicked(MouseEvent evt) {
                ObraReservada o = new ObraReservada();
                o.setVisible(true);
            }
        });
        jLabelBG.add(jButtonEjeReservados);

        jButtonObrasTematica.setBackground(new java.awt.Color(90, 205, 245));
        jButtonObrasTematica.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonObrasTematica.setForeground(new java.awt.Color(255, 255, 255));
        jButtonObrasTematica.setText("TEMÁTICA");
        jButtonObrasTematica.setBorder(null);
        jButtonObrasTematica.setFocusPainted(false);
        jButtonObrasTematica.setBounds(640, 113, 150, 40);
        jButtonObrasTematica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonObrasTematica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonObrasTematicaMouseClicked(evt);
            }

            private void jButtonObrasTematicaMouseClicked(MouseEvent evt) {
                ConsultaObra o = new ConsultaObra();
                o.setVisible(true);
            }
        });
        jLabelBG.add(jButtonObrasTematica);

        jButtonObrasIndice.setBackground(new java.awt.Color(90, 205, 245));
        jButtonObrasIndice.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonObrasIndice.setForeground(new java.awt.Color(255, 255, 255));
        jButtonObrasIndice.setText("ÍNDICE");
        jButtonObrasIndice.setBorder(null);
        jButtonObrasIndice.setFocusPainted(false);
        jButtonObrasIndice.setBounds(640, 170, 150, 40);
        jButtonObrasIndice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonObrasIndice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonObrasIndiceMouseClicked(evt);
            }

            private void jButtonObrasIndiceMouseClicked(MouseEvent evt) {
                ConsultaIndice o = new ConsultaIndice();
                o.setVisible(true);
            }
        });
        jLabelBG.add(jButtonObrasIndice);

        jButtonObrasEditorial.setBackground(new java.awt.Color(90, 205, 245));
        jButtonObrasEditorial.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonObrasEditorial.setForeground(new java.awt.Color(255, 255, 255));
        jButtonObrasEditorial.setText("EDITORIAL");
        jButtonObrasEditorial.setBorder(null);
        jButtonObrasEditorial.setFocusPainted(false);
        jButtonObrasEditorial.setBounds(640, 227, 150, 40);
        jButtonObrasEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonObrasEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonObrasEditorialMouseClicked(evt);
            }

            private void jButtonObrasEditorialMouseClicked(MouseEvent evt) {
                ObraEditorial o = new ObraEditorial();
                o.setVisible(true);
            }
        });
        jLabelBG.add(jButtonObrasEditorial);

        jButtonObrasPopularesAD.setBackground(new java.awt.Color(90, 205, 245));
        jButtonObrasPopularesAD.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonObrasPopularesAD.setForeground(new java.awt.Color(255, 255, 255));
        jButtonObrasPopularesAD.setText("DOCENTES Y ALU.");
        jButtonObrasPopularesAD.setBorder(null);
        jButtonObrasPopularesAD.setFocusPainted(false);
        jButtonObrasPopularesAD.setBounds(640, 329, 150, 40);
        jButtonObrasPopularesAD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonObrasPopularesAD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonObrasPopularesADMouseClicked(evt);
            }

            private void jButtonObrasPopularesADMouseClicked(MouseEvent evt) {
                ObraPopular o = new ObraPopular("AD");
                o.setVisible(true);
            }
        });
        jLabelBG.add(jButtonObrasPopularesAD);

        jButtonObrasPopularesPG.setBackground(new java.awt.Color(90, 205, 245));
        jButtonObrasPopularesPG.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonObrasPopularesPG.setForeground(new java.awt.Color(255, 255, 255));
        jButtonObrasPopularesPG.setText("PÚBLICO GRAL.");
        jButtonObrasPopularesPG.setBorder(null);
        jButtonObrasPopularesPG.setFocusPainted(false);
        jButtonObrasPopularesPG.setBounds(640, 386, 150, 40);
        jButtonObrasPopularesPG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonObrasPopularesPG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonObrasPopularesPGMouseClicked(evt);
            }

            private void jButtonObrasPopularesPGMouseClicked(MouseEvent evt) {
                ObraPopular o = new ObraPopular("PG");
                o.setVisible(true);
            }
        });
        jLabelBG.add(jButtonObrasPopularesPG);

        jButtonLectorMultaPeriodo.setBackground(new java.awt.Color(65, 186, 179));
        jButtonLectorMultaPeriodo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonLectorMultaPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLectorMultaPeriodo.setText("PERIODO MULTA");
        jButtonLectorMultaPeriodo.setBorder(null);
        jButtonLectorMultaPeriodo.setFocusPainted(false);
        jButtonLectorMultaPeriodo.setBounds(160, 316, 150, 40);
        jButtonLectorMultaPeriodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLectorMultaPeriodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLectorMultaPeriodoMouseClicked(evt);
            }

            private void jButtonLectorMultaPeriodoMouseClicked(MouseEvent evt) {
                PeriodoMulta o = new PeriodoMulta();
                o.setVisible(true);
            }
        });
        jLabelBG.add(jButtonLectorMultaPeriodo);

        jButtonLectorMasMultado.setBackground(new java.awt.Color(65, 186, 179));
        jButtonLectorMasMultado.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonLectorMasMultado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLectorMasMultado.setText("RANKING MULTAS");
        jButtonLectorMasMultado.setBorder(null);
        jButtonLectorMasMultado.setFocusPainted(false);
        jButtonLectorMasMultado.setBounds(160, 370, 150, 40);
        jButtonLectorMasMultado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLectorMasMultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLectorMasMultadoMouseClicked(evt);
            }

            private void jButtonLectorMasMultadoMouseClicked(MouseEvent evt) {
                RankingMulta o = new RankingMulta();
                o.setVisible(true);
            }
        });
        jLabelBG.add(jButtonLectorMasMultado);
        
        add(jLabelBG);

    }
    
}
