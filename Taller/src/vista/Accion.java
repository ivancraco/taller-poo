package vista;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Container;
import java.awt.*;
import java.awt.event.*;

public class Accion extends JFrame implements ActionListener {

    JButton consulta;
    JButton devolucion;

    public Accion() {

        consulta = new JButton("Consulta");
        consulta.setFocusPainted(false);
        devolucion = new JButton("Devolución");
        devolucion.setFocusPainted(false);

        /* Ventana */
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(280, 75);
        setResizable(false);
        setLocationRelativeTo(null);

        

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(consulta);
        container.add(devolucion);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
