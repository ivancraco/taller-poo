package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import modelo.Biblioteca;
import modelo.ModeloTablaObraEditorial;
import modelo.Obra;
import modelo.RenderTabla;

import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TablaObraEditorial extends JFrame {

    private JTable tabla;
    private JLabel $editorial;
    private JTextField editorial;
    private JButton confirmar;

    public TablaObraEditorial() {

        tabla = new JTable();
        $editorial = new JLabel("Editorial: ");
        editorial = new JTextField(15);
        confirmar = new JButton("Buscar");

        confirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                armarTabla();
            }

        });

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(700, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());
        add($editorial);
        add(editorial);
        add(confirmar);
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
        ModeloTablaObraEditorial modelo = new ModeloTablaObraEditorial(ejemplaresEditorial().size(),
                ejemplaresEditorial());
        tabla.setModel(modelo);
        tabla.setDefaultRenderer(Object.class, new RenderTabla());

        tabla.setRowHeight(30);
        validate();
        repaint();
    }

}
