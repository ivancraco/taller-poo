package vista;

import javax.swing.JButton;
import javax.swing.JFrame;

import modelo.ModeloTabla;

import java.awt.Container;
import java.awt.*;
import java.awt.event.*;

public class Accion extends JFrame {

    JButton consultaObra;
    JButton consultaIndice;
    JButton devolucion;
    JButton sindevolver;

    public Accion() {

        consultaObra = new JButton("Consultar por Obra");
        consultaObra.setFocusPainted(false);
        consultaIndice = new JButton("Consultar por Índice");
        consultaIndice.setFocusPainted(false);
        devolucion = new JButton("Devolución");
        devolucion.setFocusPainted(false);
        sindevolver = new JButton("Sin devolver");

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
                TablaDeudor o = new TablaDeudor();
                o.setVisible(true);
            }
        });

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(consultaObra);
        container.add(consultaIndice);
        container.add(devolucion);
        container.add(sindevolver);

    }
}
