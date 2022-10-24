package vista;

import java.time.LocalDate;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;

import modelo.Biblioteca;
import modelo.Ejemplar;

public class AltaEjemplar extends JFrame {

    private Ejemplar ejemplar = new Ejemplar();
    private List<Ejemplar> ejemplares;
    private JLabel $formaAdquisicion;
    private JLabel $IDUbicacion;
    private JLabel $item;
    private JLabel $codBarra;
    private JButton btnAceptar;

    private JTextField formaAdquisicion;
    private JTextField IDUbicacion;
    private JTextField item;
    private JTextField codBarra;

    public AltaEjemplar(List<Ejemplar> ejemplares) {

        this.ejemplares = ejemplares;

        $formaAdquisicion = new JLabel("Forma Adquisición: ");
        $IDUbicacion = new JLabel("Ubicación: ");
        $item = new JLabel("Item: ");
        $codBarra = new JLabel("Código Barra: ");
        btnAceptar = new JButton("Aceptar");

        formaAdquisicion = new JTextField(20);
        IDUbicacion = new JTextField(20);
        item = new JTextField(20);
        codBarra = new JTextField(20);

        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                altaEjemplar();
            }

        });

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(250, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());
        add($formaAdquisicion);
        add(formaAdquisicion);
        add($IDUbicacion);
        add(IDUbicacion);
        add($item);
        add(item);
        add($codBarra);
        add(codBarra);
        add(btnAceptar);

    }

    public void altaEjemplar() {
        if (formaAdquisicion.getText().matches("[a-zA-Z0-9]{6,}") &&
                IDUbicacion.getText().matches("[0-9]{7,}") &&
                codBarra.getText().matches("[0-9]{6,}")) {
            String fechaActual = Biblioteca.fechaYHoraActual();
            String str = fechaActual.substring(0, 10);
            LocalDate fechaActualParseada = Biblioteca.parsearFecha(str);

            ejemplar.setFechaAdquisicion(fechaActualParseada);
            ejemplar.setIDUbicacion(IDUbicacion.getText());
            ejemplar.setFormaAdquisicion(formaAdquisicion.getText());
            ejemplar.setItem(item.getText());
            ejemplar.setCodigoDeBarra(codBarra.getText());

            ejemplares.add(ejemplar);

            JOptionPane.showMessageDialog(null,
                    "Agregado correctamente", "",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();

        } else {
            JOptionPane.showMessageDialog(null,
                    "Campos incorrectos", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }
}
