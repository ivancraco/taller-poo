package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import modelo.Biblioteca;
import modelo.ModeloTabla;
import modelo.Obra;
import modelo.RenderTabla;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultaIndice extends JFrame implements ActionListener {

    private JLabel $indice;
    private JTextField indice;
    private JButton buscar;
    private JPanel panel;
    private JTable tabla;
    private JTableButtonMouseListener listener;

    public ConsultaIndice() {
        $indice = new JLabel("Buscar por Índice: ");
        indice = new JTextField(15);
        buscar = new JButton("Buscar");
        panel = new JPanel();
        panel.add($indice);
        panel.add(indice);
        panel.add(buscar);
        tabla = new JTable();
        listener = new JTableButtonMouseListener(tabla);
        tabla.addMouseListener(listener);
        buscar.addActionListener(this);

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        armarTabla();
    }

    private List<Obra> buscarObra(String indice) {
        List<Obra> obras = new ArrayList<Obra>();
        for (int i = 0; i < Biblioteca.obras().size(); i++) {
            for (int j = 0; j < Biblioteca.obras().get(i).getIndice().size(); j++) {
                if (Biblioteca.obras().get(i).getIndice().get(j)
                        .toLowerCase().contains(indice.toLowerCase())) {
                    obras.add(Biblioteca.obras().get(i));
                }
            }
        }

        return obras;
    }

    private void armarTabla() {
        List<Obra> areas = buscarObra(indice.getText());
        ModeloTabla modelo = new ModeloTabla(areas.size(), areas, this);
        tabla.setDefaultRenderer(Object.class, new RenderTabla());
        tabla.setModel(modelo);
        tabla.setRowHeight(30);
        listener = new JTableButtonMouseListener(tabla);
        validate();
        repaint();

    }

}

class JTableButtonMouseListener extends MouseAdapter {
    private final JTable table;

    public JTableButtonMouseListener(JTable table) {
        this.table = table;
    }

    public void mouseClicked(MouseEvent e) {
        int column = table.getColumnModel().getColumnIndexAtX(e.getX()); // get the coloum of the button
        int row = e.getY() / table.getRowHeight(); // get the row of the button

        /* Checking the row or column is valid or not */
        if (row < table.getRowCount() && row >= 0 && column < table.getColumnCount() && column >= 0) {
            Object value = table.getValueAt(row, column);
            if (value instanceof JButton) {
                /* perform a click event */
                ((JButton) value).doClick();
            }
        }
    }
}