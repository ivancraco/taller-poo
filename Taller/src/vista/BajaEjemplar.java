package vista;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.*;
import java.time.LocalDate;

import modelo.Biblioteca;
import modelo.Ejemplar;

/**
 * Clase que permite dar de baja un ejemplar.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class BajaEjemplar extends JFrame {

    private List<Ejemplar> ejemplares;
    private int indice;
    private JLabel $motivoBaja;
    private JLabel $ubicacionBaja;
    private JTextField motivoBaja;
    private JTextField ubicacionBaja;
    private JButton btnBaja;

    /**
     * Constructor parametrizado.
     * 
     * @param ejemplares listado de ejemplares de una obra.
     * @param indice posicion del ejemplar en la lista.
     */
    public BajaEjemplar(List<Ejemplar> ejemplares, int indice) {

        this.ejemplares = ejemplares;
        this.indice = indice;
        $motivoBaja = new JLabel("Motivo Baja:");
        $ubicacionBaja = new JLabel("Ubicación Baja:");
        motivoBaja = new JTextField(20);
        ubicacionBaja = new JTextField(20);
        btnBaja = new JButton("Aceptar");

        btnBaja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bajaEjemplar();
            }

        });

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(250, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());
        add($motivoBaja);
        add(motivoBaja);
        add($ubicacionBaja);
        add(ubicacionBaja);
        add(btnBaja);
    }

    /**
     * Metodo que permite dar de baja un ejemplar de una
     * obra en particular
     */
    public void bajaEjemplar() {
        String fechaActual = Biblioteca.fechaYHoraActual();
        String str = fechaActual.substring(0, 10);
        LocalDate fechaActualParseada = Biblioteca.parsearFecha(str);
        ejemplares.get(indice).setFechaBaja(fechaActualParseada);
        ejemplares.get(indice).setMotivoBaja(motivoBaja.getText());
        ejemplares.get(indice).setUbicacionBaja(ubicacionBaja.getText());

        ejemplares.remove(ejemplares.get(indice));

        JOptionPane.showMessageDialog(null,
                "Eliminado correctamente", "",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
}
