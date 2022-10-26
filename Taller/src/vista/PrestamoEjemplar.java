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

import modelo.Biblioteca;
import modelo.Ejemplar;
import modelo.Lector;
import modelo.Prestamo;
import modelo.TipoLector;

/**
 * Clase que permite registrar un prestamo por interfaz de usuario.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class PrestamoEjemplar extends JFrame implements ActionListener, ItemListener {

    private Prestamo prestamo = new Prestamo();
    private JComboBox<String> lugarPrestamo;
    private String seleccionado = "";
    private JLabel $funcionario;
    private JTextField funcionario;
    private JLabel $plazo;
    private JTextField plazo;
    private JLabel $codigo;
    private JTextField codigo;
    private JButton confirmar;

    /**
     * Constructor parametrizado.
     * 
     * @param lector lector que se lleva el ejemplar.
     * @param ejemplar ejemplar a prestar.
     */
    public PrestamoEjemplar(Lector lector, Ejemplar ejemplar) {

        prestamo.setLector(lector);
        prestamo.setEjemplar(ejemplar);

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(250, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        $funcionario = new JLabel("Funcionario: ");
        funcionario = new JTextField(15);
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

        // Evento Enter
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
    }

    /**
     * Retorna el codigo de barra del ejemplar que consta de
     * concatenar su id unico mas el codigo.
     * 
     * @return String codigo de barra
     */
    public String cargarCodigo() {
        String idUbicacion = prestamo.getEjemplar().getIDUbicacion();
        String cod = prestamo.getEjemplar().getCodigoDeBarra();
        String codigoBarra = idUbicacion + cod;
        return codigoBarra;
    }

    /**
     * Metodo que valida que el codigo de barra del ejemplar
     * coincida con el cargado en el JTextField.
     * 
     * @param codigo codigo de barra del ejemplar
     */
    public void leerCodigo(String codigo) {
        String codigoBarra = cargarCodigo();
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

            if (!plazo.getText().matches("[0-"+Prestamo.PLAZOMAXIMO+"]{1}")){
                JOptionPane.showMessageDialog(null,
                        "¡ Se espera un número del 1 al 4 !",
                        null,
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }

        // Registra el prestamo
        prestamo.setFechaYHoraPrestamo(Biblioteca.fechaYHoraActual());
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
             
        dispose();
        JOptionPane.showMessageDialog(null,
                "Préstamo realizado con éxito", "Operación exitosa",
                JOptionPane.INFORMATION_MESSAGE);

    }

    /**
     * @return LocalDate fecha devolucion del ejemplar
     */
    public LocalDate fechaDevolucion() {
        LocalDate fechaParseada = Biblioteca.fechaActual();
        if (prestamo.getPlazoDevolucion() > 0) {
            fechaParseada = fechaParseada.plusDays(prestamo.getPlazoDevolucion());
        } 
        return fechaParseada;
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
