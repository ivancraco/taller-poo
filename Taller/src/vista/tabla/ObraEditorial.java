package vista.tabla;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import modelo.Biblioteca;
import modelo.TablaObraEditorial;
import modelo.Obra;

import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que permite mostrar en un JTable las obras dada
 * una editorial.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class ObraEditorial extends VentanaTabla {

    private TablaObraEditorial modelo;
    private JTable tabla;
    private JLabel $editorial;
    private JTextField editorial;
    private JButton confirmar;
    private JPanel panel;

    /**
     * Constructor sin parametros
     * Crea la venta e inicializa atributos.
     */
    public ObraEditorial() {
        super.crearVentana();

        tabla = new JTable();
        $editorial = new JLabel("Editorial: ");
        editorial = new JTextField(15);
        confirmar = new JButton("Buscar");
        panel = new JPanel();
        panel.add($editorial);
        panel.add(editorial);
        panel.add(confirmar);

        confirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                armarTabla();
            }

        });

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);

    }

    /**
     * Retorna una lista de obras que forman parte de una
     * editorial que se ingresa en un JTexField.
     * 
     * @return listado de obras
     */
    public List<Obra> ejemplaresEditorial() {
        List<Obra> ejemplares = new ArrayList<>();

        for (int i = 0; i < Biblioteca.obras().size(); i++) {
            if (editorial.getText().toLowerCase()
                    .contains(Biblioteca.obras().get(i).getEdicion().getEditorial().toLowerCase())) {
                ejemplares.add(Biblioteca.obras().get(i));
            }
            ;
        }

        return ejemplares;
    }

    /**
     * Arma la tabla y rellena la informacion con los valores 
     * encontrados.
     */
    public void armarTabla() {
        modelo = new TablaObraEditorial(ejemplaresEditorial().size(), ejemplaresEditorial());
        tabla.setModel(modelo);
        super.armarTabla(tabla);
    }
}
