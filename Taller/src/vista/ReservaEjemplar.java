package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Biblioteca;
import modelo.Ejemplar;
import modelo.Lector;
import modelo.Reserva;

import java.awt.event.*;
import java.awt.*;
import java.time.LocalDate;

public class ReservaEjemplar extends JFrame implements ActionListener {

    private Reserva reserva = new Reserva();
    private LocalDate fecha;
    private JLabel $fec;
    private JTextField fec;
    private JButton confirmar;

    public ReservaEjemplar(Lector lector, Ejemplar ejemplar) {
        reserva.setLector(lector);
        reserva.setEjemplar(ejemplar);
        $fec = new JLabel("Fecha Reserva DD/MM/YYYY: ");
        fec = new JTextField(10);
        confirmar = new JButton("Confirmar");
        confirmar.addActionListener(this);

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());
        add($fec);
        add(fec);
        add(confirmar);

    }

    // public String fechaReserva() {
    // String fecha = fec.getText();
    // DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    // LocalDate fechaParseada = LocalDate.parse(fecha, formato);
    // String nuevoFormato = fechaParseada.format(formato);
    // return nuevoFormato;
    // }

    @Override
    public void actionPerformed(ActionEvent e) {
        reserva.setFechaReserva(Biblioteca.fechaString(reserva.getEjemplar()
                .getPrestamoEjemplar().getFechaDevolucion()));
        reserva.getLector().getReservaLector().add(reserva);
        reserva.getEjemplar().setReservaEjemplar(reserva);

        dispose();

        JOptionPane.showMessageDialog(null,
                "¡ Reserva realizada con éxito !", "Operación exitosa",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
