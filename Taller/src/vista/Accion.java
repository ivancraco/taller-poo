package vista;

import javax.swing.JButton;
import javax.swing.JFrame;

import modelo.ModeloTabla;
import vista.tabla.ConsultaIndice;
import vista.tabla.ConsultaObra;
import vista.tabla.ObraReservada;
import vista.tabla.PeriodoMulta;
import vista.tabla.RankingMulta;
import vista.tabla.Deudor;
import vista.tabla.ObraEditorial;
import vista.tabla.ObraPopular;

import java.awt.Container;
import java.awt.*;
import java.awt.event.*;

public class Accion extends JFrame {

    private JButton consultaObra;
    private JButton consultaIndice;
    private JButton devolucion;
    private JButton sindevolver;
    private JButton masSolicitadosAD;
    private JButton masSolicitadosPG;
    private JButton reservados;
    private JButton obraEditorial;
    private JButton periodoMulta;
    private JButton rankingMulta;

    public Accion() {

        consultaObra = new JButton("Consultar por Obra");
        consultaObra.setFocusPainted(false);
        consultaIndice = new JButton("Consultar por Índice");
        consultaIndice.setFocusPainted(false);
        devolucion = new JButton("Devolución");
        devolucion.setFocusPainted(false);
        sindevolver = new JButton("Sin devolver");
        masSolicitadosAD = new JButton("Solicitados por Alumnos y Docentes");
        masSolicitadosPG = new JButton("Solicitados por P.General");
        reservados = new JButton("reservados");
        obraEditorial = new JButton("Obras de editorial");
        periodoMulta = new JButton("Periodo Multa");
        rankingMulta = new JButton("Ranking Multa");

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(250, 350);
        setResizable(false);
        setLocationRelativeTo(null);

        consultaObra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ConsultaObra o = new ConsultaObra();
                o.setVisible(true);
            }
        });

        consultaIndice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ConsultaIndice o = new ConsultaIndice();
                o.setVisible(true);
            }
        });

        devolucion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VerificarLector o = new VerificarLector(null, ModeloTabla.DEVOLUCION);
                o.setVisible(true);
            }
        });

        sindevolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Deudor o = new Deudor();
                o.setVisible(true);
            }
        });

        masSolicitadosAD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ObraPopular o = new ObraPopular("AD");
                o.setVisible(true);
            }
        });

        masSolicitadosPG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ObraPopular o = new ObraPopular("PG");
                o.setVisible(true);
            }
        });

        reservados.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ObraReservada o = new ObraReservada();
                o.setVisible(true);
            }
        });

        obraEditorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ObraEditorial o = new ObraEditorial();
                o.setVisible(true);
            }
        });

        periodoMulta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PeriodoMulta o = new PeriodoMulta();
                o.setVisible(true);
            }
        });
        
        rankingMulta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RankingMulta o = new RankingMulta();
                o.setVisible(true);
            }
        });

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(consultaObra);
        container.add(consultaIndice);
        container.add(devolucion);
        container.add(sindevolver);
        container.add(masSolicitadosAD);
        container.add(masSolicitadosPG);
        container.add(reservados);
        container.add(obraEditorial);
        container.add(periodoMulta);
        container.add(rankingMulta);

    }
}
