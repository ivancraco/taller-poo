package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Biblioteca;
import modelo.Devolucion;
import modelo.Lector;
import modelo.Multa;
import modelo.Prestamo;

import java.awt.event.*;
import java.awt.*;

/**
 * Clase que permite registrar la devolucion de un ejemplar
 * por interfaz de usuario.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class DevolucionEjemplar extends JFrame implements ActionListener {

    private Devolucion devolucion = new Devolucion();
    private JLabel $codigo;
    private JTextField codigo;
    private Lector lector;
    private JButton conf;
    private JLabel $funcionario;
    private JTextField funcionario;

    /**
     * Constructor parametrizado.
     * 
     * @param lector lector que devuelve el ejemplar.
     */
    public DevolucionEjemplar(Lector lector) {

        this.lector = lector;
        $codigo = new JLabel("Código de barra: ");
        codigo = new JTextField(20);
        $funcionario = new JLabel("Funcionario: ");
        funcionario = new JTextField(15);
        conf = new JButton("Confirmar");
        conf.addActionListener(this);

        codigo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    leerCodigo(codigo.getText());
                    
                }
            }
        });

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(250, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());
        add($codigo);
        add(codigo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (funcionario.getText().matches("[a-zA-Z]{4,}")){
            this.dispose();
            JOptionPane.showMessageDialog(null,
                    "¡ Devolución realizada con éxito !",
                    null,
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,
                    "¡ datos incorrectos !",
                    null,
                    JOptionPane.INFORMATION_MESSAGE);
        }
         

    }

    /**
     * Permite registrar la devolucion del ejemplar por lectura
     * de codigo de barra.
     * 
     * @param codigo String codigo de barra.
     */
    public void leerCodigo(String codigo) {
        if (lector.getPrestamoLector().size() > 0) {
            Prestamo prestamo;
            for (int i = 0; i < lector.getPrestamoLector().size(); i++) {
                prestamo = lector.getPrestamoLector().get(i);
                String ubicacion = prestamo.getEjemplar().getIDUbicacion();
                String id = prestamo.getEjemplar().getCodigoDeBarra();
                String res = ubicacion + id;
                if (res.equals(codigo)) {
                    devolucion.setFechaYHoraDevolucion(Biblioteca.fechaYHoraActual());
                    if (Biblioteca.fechaActual().isAfter(prestamo.getFechaDevolucion())) {
                        multarLector(lector);
                    }
                    lector.getPrestamoLector().get(i).getEjemplar().setPrestamoEjemplar(null);
                    lector.getPrestamoLector().remove(i);
                    add($funcionario);
                    add(funcionario);
                    add(conf);
                    validate();
                    break;
                }
            }
        }
    }

    /**
     * Permite registrar una multa al lector si
     * la devolucion pasa la fecha estipulada.
     * 
     * @param lector lector que devuelve el ejemplar.
     */
    public void multarLector(Lector lector) {
        int cant = 0;
        if(lector.getMulta() != null) {
            cant = lector.getMulta().getCantidad();
        }
        lector.setMulta(new Multa(15, devolucion));
        lector.getMulta().setCantidad(cant + 1);
    }

}
