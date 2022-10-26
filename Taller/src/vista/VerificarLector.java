package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Biblioteca;
import modelo.Ejemplar;
import modelo.Lector;
import modelo.TablaRegistro;
import modelo.Reserva;

import java.awt.Container;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.awt.*;

/**
 * Clase que permite verificar si un lector existe en la
 * bilioteca y a partir de ahi realizar las diferentes acciones.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class VerificarLector extends JFrame implements ActionListener {

    private JLabel tituloDni;
    private JTextField dni;
    private JButton confirmar;
    private Ejemplar ejemplar;
    private String accion;

    /**
     * Constructor parametrizado.
     * @param ejemplar ejemplar para realizar prestamo y reserva.
     * @param accion accion a realizar
     */
    public VerificarLector(Ejemplar ejemplar, String accion) {

        this.accion = accion;
        this.ejemplar = ejemplar;

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(250, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        tituloDni = new JLabel("DNI lector: ");
        dni = new JTextField(20);
        confirmar = new JButton("Confirmar");

        /* Contenedor */
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(tituloDni);
        c.add(dni);
        c.add(confirmar);

        /* Evento */
        confirmar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Lector lector = existeLector(Biblioteca.lectores(), dni.getText());
        if (lector != null) {
            if (accion.equals(TablaRegistro.DEVOLUCION)) {
                DevolucionEjemplar dev = new DevolucionEjemplar(lector);
                dev.setVisible(true);
                this.dispose();
                return;
            }
            if (tieneMultas(lector)) {
                JOptionPane.showMessageDialog(null,
                        "El lector debe libros", "Error",
                        JOptionPane.ERROR_MESSAGE);

                this.dispose();
                return;
            }
            if (tieneMultas(lector) && !accion.equals(TablaRegistro.DEVOLUCION)) {
                JOptionPane.showMessageDialog(null,
                        "Lector multado hasta " + multas(lector), "Error",
                        JOptionPane.ERROR_MESSAGE);
                this.dispose();
                return;
            }
            if (accion.equals(TablaRegistro.PRESTAMO)) {
                PrestamoEjemplar registrar = new PrestamoEjemplar(lector, ejemplar);
                registrar.setVisible(true);
                this.dispose();
                return;
            }
            if (accion.equals(TablaRegistro.RESERVA)) {
                realizarReserva(lector);
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "El usuario no existe", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Retorna el lector si coincide con el dni
     * @param lectores listado de lectores de la biblioteca
     * @param dni String dni ingresado por interfaz de usuario
     * @return lector o nulo
     */
    public Lector existeLector(List<Lector> lectores, String dni) {
        for (Lector lector : lectores) {
            if (lector.getDocumento().equals(dni)) {
                return lector;
            }
        }
        return null;
    }

    /**
     * Retorna un boolean para determinar si un lector
     * esta multado o no.
     * 
     * @param lector lector
     * @return boolean
     */
    public boolean tieneMultas(Lector lector) {
        if (lector.getMulta() == null)
            return false;
        return lector.getMulta().isMultado();
    }

   /**
    * Retorna la fecha maxima de multa para el lector.
    * El mismo no puede retirar libros hasta que se cumpla el plazo.
    * @param lector lector
    * @return String fecha multa
    */
    public String multas(Lector lector) {
        LocalDate local = fechaActual(lector);
        int plazo = lector.getMulta().getCantidad() * lector.getMulta().getPlazo();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        local = local.plusDays(plazo);
        return local.format(formato);
    }

    /**
     * Permite realizar una reserva si el lector existe 
     * y el ejemplar esta en prestamo.
     * 
     * @param lector lector
     */
    public void realizarReserva(Lector lector) {
        Reserva reserva = new Reserva();
        reserva.setLector(lector);
        reserva.setEjemplar(ejemplar);
        reserva.setFechaReserva(Biblioteca.fechaString(reserva.getEjemplar()
                .getPrestamoEjemplar().getFechaDevolucion()));
        reserva.getLector().getReservaLector().add(reserva);
        reserva.getEjemplar().setReservaEjemplar(reserva);
        JOptionPane.showMessageDialog(null,
                "¡ Reserva realizada con éxito !", "Error",
                JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }

    /**
     * Retorna la fecha de devolucion del ejemplar
     * con la multa aplicada al lector que lo devuelve.
     * 
     * @param lector lector
     * @return LocalDate fecha devolucion
     */
    public LocalDate fechaActual(Lector lector) {
        String fecha = lector.getMulta().getDevolucion().getFechaYHoraDevolucion();
        String str = fecha.substring(0, 10);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaParseada = LocalDate.parse(str, formato);
        return fechaParseada;
    }

}
