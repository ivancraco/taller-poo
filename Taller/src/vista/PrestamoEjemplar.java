package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import modelo.Ejemplar;
import modelo.Lector;
import modelo.Prestamo;

public class PrestamoEjemplar extends JFrame implements ActionListener, ItemListener{

    private Lector lector;
    private Ejemplar ejemplar;
    private String seleccionado = "";
    private Prestamo prestamo = new Prestamo();
    private JTextField funcionario;
    private JLabel $funcionario;
    private JTextField fechaDevolucion;
    private JLabel $fechaDevolucion;
    private JComboBox<String> lugarPrestamo;
    private JTextField plazo;
    private JLabel $plazo;
    private JButton confirmar;


    public PrestamoEjemplar(Lector lector, Ejemplar ejemplar) {

        this.lector = lector;
        this.ejemplar = ejemplar;

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(250, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        $funcionario = new JLabel("Funcionario: ");
        funcionario = new JTextField(15);
        $fechaDevolucion = new JLabel("Fecha Devolución DD/MM/YYYY: ");
        fechaDevolucion = new JTextField(15);
        lugarPrestamo = new JComboBox<String>();
        lugarPrestamo.addItem("Sala");
        lugarPrestamo.addItem("Domicilio");
        lugarPrestamo.addItemListener(this);
        $plazo = new JLabel("Plazo Devolución: ");
        plazo = new JTextField(15);
        confirmar = new JButton("Confirmar");
        confirmar.addActionListener(this);

        setLayout(new FlowLayout());
        add($funcionario);
        add(funcionario);
        add($fechaDevolucion);
        add(fechaDevolucion);
        add(lugarPrestamo);
        add(confirmar);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(funcionario.getText() != "" && fechaDevolucion.getText() != "") {
            /*if(Integer.parseInt(plazo.getText()) >= 0 && Integer.parseInt(plazo.getText()) <= 4){
                prestamo.setPlazoDevolucion(Integer.parseInt(plazo.getText()));
            }*/
            prestamo.setFechaYHoraPrestamo(fechaYHoraActual());
            prestamo.setFuncionario(funcionario.getText());
            prestamo.setFechaDevolucion(fechaDevolucion());
            prestamo.setLugarPrestamo(seleccionado);
            prestamo.setLector(lector);
            prestamo.setEjemplar(ejemplar);
            ejemplar.setPrestamoEjemplar(prestamo);
            lector.getPrestamoLector().add(prestamo);

            dispose();

            JOptionPane.showMessageDialog(null,
                    "Préstamo realizado con éxito", "Operación exitosa",
                    JOptionPane.INFORMATION_MESSAGE);

        }
        
    }

    public String fechaYHoraActual(){
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a");
        String nuevoFormato = fechaActual.format(formato);
        return nuevoFormato;
    }

    public LocalDate fechaDevolucion() {
        String fecha = fechaDevolucion.getText();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaParseada = LocalDate.parse(fecha, formato);
        return fechaParseada;
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == lugarPrestamo) {
            seleccionado = (String) lugarPrestamo.getSelectedItem();
        }

        if(seleccionado.equals("Domicilio")) {
            add($plazo ,4);
            add(plazo, 5);
            validate();
        }else {
            remove($plazo);
            remove(plazo);
            validate();
        }
    }
}
