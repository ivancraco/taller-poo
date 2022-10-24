package vista.tabla;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import modelo.Biblioteca;
import modelo.Lector;
import modelo.ModeloTablaMulta;
import modelo.RenderizarTabla;

import java.awt.event.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PeriodoMulta extends JFrame {

    private ModeloTablaMulta modelo;
    private JTable tabla;
    private JLabel $desde;
    private JTextField desde;
    private JLabel $hasta;
    private JTextField hasta;
    private JPanel panel;
    private JButton btnBuscar;

    public PeriodoMulta() {

        tabla = new JTable();
        $desde = new JLabel("Desde: ");
        desde = new JTextField(15);
        $hasta = new JLabel("Hasta: ");
        hasta = new JTextField(15);
        btnBuscar = new JButton("Buscar");
        panel = new JPanel();
        panel.add($desde);
        panel.add(desde);
        panel.add($hasta);
        panel.add(hasta);
        panel.add(btnBuscar);
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               armarTabla();
            }

        });

    }

    public List<Lector> lectoresMultadosPorPeriodo() {
        List<Lector> lectores = new ArrayList<Lector>();

        for (int i = 0; i < Biblioteca.lectores().size(); i++) {
            if (Biblioteca.lectores().get(i).getMulta() != null) {
                String fecha = Biblioteca.lectores().get(i).getMulta().getDevolucion().getFechaYHoraDevolucion();
                LocalDate fechaParseda = Biblioteca.parsearFecha(fecha);
                LocalDate fechamax = Biblioteca.parsearFecha(Biblioteca.lectores().get(i).getMulta().getMultadoHasta());

                if (Biblioteca.parsearFecha(desde.getText()).isAfter(fechaParseda) 
                        && Biblioteca.parsearFecha(desde.getText()).isBefore(fechamax) 
                        && Biblioteca.parsearFecha(hasta.getText()).isBefore(fechamax) 
                        && Biblioteca.parsearFecha(hasta.getText()).isAfter(fechaParseda)) {
                    lectores.add(Biblioteca.lectores().get(i));
                }
            }
        }

        return lectores;
    }

    public void armarTabla() {
        modelo = new ModeloTablaMulta(lectoresMultadosPorPeriodo().size(), lectoresMultadosPorPeriodo(), ModeloTablaMulta.PERIODO_MULTA);
        tabla.setModel(modelo);
        tabla.setDefaultRenderer(Object.class, new RenderizarTabla());
        tabla.setRowHeight(30);
        validate();
        repaint();
    }
}
