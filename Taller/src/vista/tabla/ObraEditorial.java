package vista.tabla;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import modelo.Biblioteca;
import modelo.ModeloTablaObraEditorial;
import modelo.Obra;
import modelo.RenderizarTabla;

import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ObraEditorial extends VentanaTabla {

    private ModeloTablaObraEditorial modelo;
    private JTable tabla;
    private JLabel $editorial;
    private JTextField editorial;
    private JButton confirmar;
    private JPanel panel;

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

    public void armarTabla() {
        modelo = new ModeloTablaObraEditorial(ejemplaresEditorial().size(), ejemplaresEditorial());
        tabla.setModel(modelo);
        super.armarTabla(tabla);
    }

}
