package vista.tabla;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.event.*;
import java.awt.*;
import java.time.LocalDate;

import modelo.Biblioteca;
import modelo.Ejemplar;
import modelo.ModeloTablaObraReservada;

public class ObraReservada extends JFrame {

    private ModeloTablaObraReservada modelo;
    private JLabel $fecha;
    private JTextField fecha;
    private JTable tabla;
    private JButton confirmar;
    private JPanel panel;

    public ObraReservada() {

        $fecha = new JLabel("Fecha:");
        fecha = new JTextField(15);
        tabla = new JTable();
        confirmar = new JButton("Confirmar");
        panel = new JPanel();
        panel.add($fecha);
        panel.add(fecha);
        panel.add(confirmar);

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(950, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fechar(fecha.getText());
            }
        });

        setLayout(new FlowLayout());
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    public List<Ejemplar> ejemplaresReservados() {
        List<Ejemplar> resultado = new ArrayList<Ejemplar>();
        for (int i = 0; i < Biblioteca.obras().size(); i++) {
            for (int j = 0; j < Biblioteca.obras().get(i).getEjemplar().size(); j++) {
                if (Biblioteca.obras().get(i).getEjemplar().get(j).getReservaEjemplar() != null) {
                    resultado.add(Biblioteca.obras().get(i).getEjemplar().get(j));
                }
            }
        }

        return resultado;
    }

    public void fechar(String fecha) {
        String s = Biblioteca.fechaYHoraActual();
        String str = s.substring(0, 10);
        LocalDate fechaActualParseada = Biblioteca.parsearFecha(str);
        if (Biblioteca.parsearFecha(fecha).isBefore(fechaActualParseada)) {
            JOptionPane.showMessageDialog(null,
                    "Fecha incorrecta", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }else {
            armarTabla();
        }
    }

    public void armarTabla() {
        modelo = new ModeloTablaObraReservada(ejemplaresReservados().size(), ejemplaresReservados());
        tabla.setModel(modelo);
        tabla.setRowHeight(30);
        validate();
        repaint();
    }
}