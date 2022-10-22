package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Devolucion;
import modelo.Lector;
import modelo.Prestamo;

import java.awt.event.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.*;

public class DevolucionObra extends JFrame implements ActionListener {

    private Devolucion devolucion = new Devolucion();
    private JLabel $codigo;
    private JTextField codigo;
    private Lector lector;
    private JButton conf;

    public DevolucionObra(Lector lector) {

        this.lector = lector;
        $codigo = new JLabel("Código de barra: ");
        codigo = new JTextField(20);
        conf = new JButton("Mono");
        conf.addActionListener(this);

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());
        add($codigo);
        add(codigo);
        add(conf);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        leerCodigo(codigo.getText());

    }

    public void leerCodigo(String codigo) {
        if (lector.getPrestamoLector().size() > 0) {
            Prestamo prestamo;
            for (int i = 0; i < lector.getPrestamoLector().size(); i++) {
                prestamo = lector.getPrestamoLector().get(i);
                String ubicacion = prestamo.getEjemplar().getIDUbicacion();
                String id = prestamo.getEjemplar().getCodigoDeBarra();
                String res = ubicacion + id;
                System.out.println(res);
                if (res.equals(codigo)) {
                    devolucion.setFechaYHoraDevolucion(fechaYHoraActual());
                    if (fechaActual().isAfter(prestamo.getFechaDevolucion())) {
                        multarLector(lector);
                        lector.getPrestamoLector().get(i).getEjemplar().setPrestamoEjemplar(null);
                        lector.getPrestamoLector().remove(i);
                    }
                    break;
                }
            }
            this.dispose();
            JOptionPane.showMessageDialog(null,
            "¡ Wao !",
            null,
            JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public LocalDate fechaActual() {
        String fecha = fechaYHoraActual();
        String str = fecha.substring(0, 10);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaParseada = LocalDate.parse(str, formato);
        return fechaParseada;
    }

    public String fechaYHoraActual() {
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a");
        String nuevoFormato = fechaActual.format(formato);
        return nuevoFormato;
    }

    public void multarLector(Lector lector) {
        lector.getMulta().setCantidad(lector.getMulta().getCantidad() + 1);
        lector.getMulta().setPlazo(15);
        lector.getMulta().setDevolucion(devolucion);           
    }

}
