package vista.tabla;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
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
import modelo.TablaObraReservada;

/**
 * Clase que muestar en un JTable las obras reservadas
 * a partir de una fecha ingresada.
 * 
 * @author Ivan Craco
 */
public class ObraReservada extends VentanaTabla {

    private TablaObraReservada modelo;
    private JLabel $fecha;
    private JTextField fecha;
    private JTable tabla;
    private JButton confirmar;
    private JPanel panel;

    /**
     * Constructor sin parametros
     * Crea la ventana, inicializa atributos y
     * agrega evento al boton.
     */
    public ObraReservada() {
        super.crearVentana();

        $fecha = new JLabel("Fecha:");
        fecha = new JTextField(15);
        confirmar = new JButton("Confirmar");
        tabla = new JTable();
        panel = new JPanel();
        panel.add($fecha);
        panel.add(fecha);
        panel.add(confirmar);
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);

        confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(ejemplaresReservados().size() == 0 ) {
                    JOptionPane.showMessageDialog(null,
                        "¡ No hay reservas a partir de esa fecha !", "Error",
                        JOptionPane.ERROR_MESSAGE);
                }
                armarTabla();
            }
        });
    }

    /**
     * Retorna una lista de ejemplares que se encuentran reservados
     * a partir de una fecha.
     * 
     * @return listado de ejmplares
     */
    public List<Ejemplar> ejemplaresReservados() {
        List<Ejemplar> resultado = new ArrayList<Ejemplar>();
        for (int i = 0; i < Biblioteca.obras().size(); i++) {
            for (int j = 0; j < Biblioteca.obras().get(i).getEjemplares().size(); j++) {
                if (Biblioteca.obras().get(i).getEjemplares().get(j).getReservaEjemplar() != null) {
                    LocalDate fechaParseada = Biblioteca.parsearFecha(
                            Biblioteca.obras().get(i).getEjemplares().get(j).getReservaEjemplar().getFechaReserva());
                    if (Biblioteca.parsearFecha(fecha.getText()).isBefore(fechaParseada)
                            || Biblioteca.parsearFecha(fecha.getText()).isEqual(fechaParseada)) {
                        resultado.add(Biblioteca.obras().get(i).getEjemplares().get(j));
                    }
                }
            }
        }

        return resultado;
    }

    /**
     * Arma la tabla con los valores del listado de ejemplares.
     */
    public void armarTabla() {
        modelo = new TablaObraReservada(ejemplaresReservados().size(), ejemplaresReservados());
        tabla.setModel(modelo);
        super.armarTabla(tabla);
    }
}
