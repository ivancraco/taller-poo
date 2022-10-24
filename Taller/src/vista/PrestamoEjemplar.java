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
import modelo.TipoLector;

public class PrestamoEjemplar extends JFrame implements ActionListener, ItemListener {

    // private Lector lector;
    // private Ejemplar ejemplar;
    private String seleccionado = "";
    private Prestamo prestamo = new Prestamo();
    private JTextField funcionario;
    private JLabel $funcionario;
    // private JTextField fechaDevolucion;
    // private JLabel $fechaDevolucion;
    private JComboBox<String> lugarPrestamo;
    private JTextField plazo;
    private JLabel $plazo;
    private JLabel $codigo;
    private JTextField codigo;
    private JButton confirmar;

    public PrestamoEjemplar(Lector lector, Ejemplar ejemplar) {

        prestamo.setLector(lector);
        prestamo.setEjemplar(ejemplar);
        // this.lector = lector;
        // this.ejemplar = ejemplar;

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(250, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        $funcionario = new JLabel("Funcionario: ");
        funcionario = new JTextField(15);
        // $fechaDevolucion = new JLabel("Fecha Devolución DD/MM/YYYY: ");
        // fechaDevolucion = new JTextField(15);
        lugarPrestamo = new JComboBox<String>();
        lugarPrestamo.addItem("Sala");
        lugarPrestamo.addItem("Domicilio");
        lugarPrestamo.addItemListener(this);
        $plazo = new JLabel("Plazo Devolución: ");
        plazo = new JTextField(15);
        plazo.setText("0");
        $codigo = new JLabel("Código de barra: ");
        codigo = new JTextField(20);
        this.codigo.setText(cargarCodigo());
        confirmar = new JButton("Confirmar");
        confirmar.addActionListener(this);

        codigo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    leerCodigo(codigo.getText());
                }
            }
        });

        setLayout(new FlowLayout());
        add($codigo);
        add(codigo);
        // add($funcionario);
        // add(funcionario);
        // add($fechaDevolucion);
        // add(fechaDevolucion);
        // add(lugarPrestamo);
        // add(confirmar);

    }

    public String cargarCodigo() {
        String idUbicacion = prestamo.getEjemplar().getIDUbicacion();
        String cod = prestamo.getEjemplar().getCodigoDeBarra();
        String codigoBarra = idUbicacion + cod;
        return codigoBarra;
    }

    public void leerCodigo(String codigo) {
        String idUbicacion = prestamo.getEjemplar().getIDUbicacion();
        String cod = prestamo.getEjemplar().getCodigoDeBarra();
        String codigoBarra = idUbicacion + cod;
        if (codigo.equals(codigoBarra)) {
            add($funcionario);
            add(funcionario);
            add(lugarPrestamo);
            add(confirmar);
            validate();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!funcionario.getText().matches("[a-zA-Z]{4,}")) {
            JOptionPane.showMessageDialog(null,
                    "¡ Se espera al menos 4 letras para el nombre del funcionario !",
                    null,
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (!plazo.getText().matches("[0-4]*")){
            JOptionPane.showMessageDialog(null,
                    "¡ No es número !",
                    null,
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        prestamo.setFechaYHoraPrestamo(fechaYHoraActual());
        prestamo.setFuncionario(funcionario.getText());
        prestamo.setPlazoDevolucion(Integer.parseInt(plazo.getText()));
        prestamo.setFechaDevolucion(fechaDevolucion());
        prestamo.setLugarPrestamo(seleccionado);
        prestamo.getLector().getPrestamoLector().add(prestamo);
        prestamo.getEjemplar().setPrestamoEjemplar(prestamo);
        if(prestamo.getLector().getTipoLector().equals(TipoLector.PUBLICO_GENERAL)){
            prestamo.getEjemplar().getObra().setSolicitadasPublicoGeneral(
            prestamo.getEjemplar().getObra().getSolicitadasPublicoGeneral() + 1);
        }else {
            prestamo.getEjemplar().getObra().setSolicitadasAlumnosDocentes(
            prestamo.getEjemplar().getObra().getSolicitadasAlumnosDocentes() + 1);
        }
           
        
        // prestamo.setLector(lector);
        // prestamo.setEjemplar(ejemplar);
        // ejemplar.setPrestamoEjemplar(prestamo);
        // lector.getPrestamoLector().add(prestamo);
        dispose();
        JOptionPane.showMessageDialog(null,
                "Préstamo realizado con éxito", "Operación exitosa",
                JOptionPane.INFORMATION_MESSAGE);

    }

    public String fechaYHoraActual() {
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a");
        String nuevoFormato = fechaActual.format(formato);
        return nuevoFormato;
    }

    public LocalDate fechaDevolucion() {
        String fecha = fechaYHoraActual();
        String str = fecha.substring(0, 10);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaParseada = LocalDate.parse(str, formato);
        if (prestamo.getPlazoDevolucion() > 0) {
            fechaParseada = fechaParseada.plusDays(prestamo.getPlazoDevolucion());
            return fechaParseada;
        } else {
            return fechaParseada;
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == lugarPrestamo) {
            seleccionado = (String) lugarPrestamo.getSelectedItem();
        }

        if (seleccionado.equals("Domicilio")) {
            add($plazo, 4);
            add(plazo, 5);
            validate();
        } else {
            remove($plazo);
            remove(plazo);
            validate();
        }
    }
}
