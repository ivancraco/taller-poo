package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.Biblioteca;
import modelo.Ejemplar;
import modelo.Lector;
import modelo.ModeloTabla;
import modelo.Reserva;

import java.awt.Container;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.awt.*;

public class VerificarLector extends JFrame implements ActionListener {

    JLabel tituloDni;
    JTextField dni;
    JButton confirmar;
    JButton consultaObra;
    JButton consultaIndice;
    JButton devolucion;
    JPanel acciones;
    private Ejemplar ejemplar;
    private String accion;

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
            if (tieneMultas(lector)) {
                JOptionPane.showMessageDialog(null,
                        "El lector debe libros", "Error",
                        JOptionPane.ERROR_MESSAGE);

                this.dispose();
                return;
            }
            if (tieneMultas(lector) && !accion.equals(ModeloTabla.DEVOLUCION)) {
                JOptionPane.showMessageDialog(null,
                        "Lector multado hasta " + multas(lector), "Error",
                        JOptionPane.ERROR_MESSAGE);
                this.dispose();
                return;
            }
            if (accion.equals(ModeloTabla.PRESTAMO)) {
                PrestamoEjemplar registrar = new PrestamoEjemplar(lector, ejemplar);
                registrar.setVisible(true);
                this.dispose();
            }
            if (accion.equals(ModeloTabla.RESERVA)) {
                Reserva reserva = new Reserva();
                reserva.setLector(lector);
                reserva.setEjemplar(ejemplar);
                reserva.setFechaReserva(Biblioteca.fechaString(reserva.getEjemplar()
                        .getPrestamoEjemplar().getFechaDevolucion()));
                reserva.getLector().getReservaLector().add(reserva);
                reserva.getEjemplar().setReservaEjemplar(reserva);
                JOptionPane.showMessageDialog(null,
                    " wao ", "Error",
                    JOptionPane.ERROR_MESSAGE);
                this.dispose();
            }
            if (accion.equals(ModeloTabla.DEVOLUCION)) {
                DevolucionObra dev = new DevolucionObra(lector);
                dev.setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "El usuario no existe", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public Lector existeLector(List<Lector> lectores, String dni) {
        for (Lector lector : lectores) {
            if (lector.getDocumento().equals(dni)) {
                return lector;
            }
        }
        return null;
    }

    public boolean tieneMultas(Lector lector) {
        if (lector.getMulta() == null)
            return false;
        return lector.getMulta().isMultado();
    }

    public String multas(Lector lector) {
        LocalDate local = fechaActual(lector);
        int plazo = lector.getMulta().getCantidad() * lector.getMulta().getPlazo();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        local = local.plusDays(plazo);
        return local.format(formato);
    }

    public LocalDate fechaActual(Lector lector) {
        String fecha = lector.getMulta().getDevolucion().getFechaYHoraDevolucion();
        String str = fecha.substring(0, 10);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaParseada = LocalDate.parse(str, formato);
        return fechaParseada;
    }

}
