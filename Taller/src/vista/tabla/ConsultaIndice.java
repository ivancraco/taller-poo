package vista.tabla;

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
import modelo.RenderizarTabla;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultaIndice extends VentanaTabla implements ActionListener {

    private ModeloTabla modelo;
    private List<Obra> areas;
    private JLabel $indice;
    private JTextField indice;
    private JButton buscar;
    private JPanel panel;
    private JTable tabla;
    private JTableButtonMouseListener listener;

    public ConsultaIndice() {
        super.crearVentana();

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

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!indice.getText().matches("[a-zA-Z0-9]{3,}")) return;
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
        areas = buscarObra(indice.getText());
        modelo = new ModeloTabla(areas.size(), areas, this);
        tabla.setModel(modelo);
        listener = new JTableButtonMouseListener(tabla);
        super.armarTabla(tabla);
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