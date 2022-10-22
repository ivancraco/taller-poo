package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import modelo.Biblioteca;
import modelo.ModeloTabla;
import modelo.Obra;
import modelo.RenderTabla;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class ConsultaObra extends JFrame implements ActionListener, ItemListener {

    private JComboBox<String> combo;
    private String seleccionado = "Matemática";
    private JPanel panel1;
    JTextField buscador;
    JButton buscar;
    JTextArea resultado;
    Container c;
    JTable tabla;
    JTableButtonMouseListener listener;

 
    public ConsultaObra() {

        buscar = new JButton("Buscar");

        combo = new JComboBox<String>();
        combo.addItem("Matemática");
        combo.addItem("Programación");
        combo.addItemListener(this);

        tabla = new JTable();
        tabla.setEnabled(false);

        panel1 = new JPanel();
        panel1.add(combo);
        panel1.add(buscar);
        add(panel1, BorderLayout.NORTH);

        add(new JScrollPane(tabla), BorderLayout.CENTER);
        buscar.addActionListener(this);
        listener = new JTableButtonMouseListener(tabla);
        tabla.addMouseListener(listener);
    

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 300);
        setResizable(false);
        setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        armarTabla();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == combo) {
            seleccionado = (String) combo.getSelectedItem();
        }

    }

    // private List<List<Ejemplar>> ejemplaresDeObra(String areaTematica) {
    //     List<List<Ejemplar>> ejemplares = new ArrayList<>();
    //     for (int i = 0; i < Biblioteca.obras().size(); i++) {
    //         if (Biblioteca.obras().get(i).getAreaTematica().equals(areaTematica)) {
    //             List<Ejemplar> res = new ArrayList<>();
    //             res = Biblioteca.obras().get(i).getEjemplar();
    //             ejemplares.add(res);
    //             // text.append(Biblioteca.obras().get(i).getEjemplar().get(0).getAreaDeReferencia());
    //             // resultado.append(Biblioteca.obras().get(i).getEjemplar().get(0).getAreaDeReferencia());

    //         }
    //     }

    //     return ejemplares;
    // }

    private List<Obra> buscarObra(String areaTematica) {
        List<Obra> obras = new ArrayList<>();
        for (int i = 0; i < Biblioteca.obras().size(); i++) {
            if (Biblioteca.obras().get(i).getAreaTematica().equals(areaTematica)) {
                obras.add(Biblioteca.obras().get(i));
                // text.append(Biblioteca.obras().get(i).getEjemplar().get(0).getAreaDeReferencia());
                // resultado.append(Biblioteca.obras().get(i).getEjemplar().get(0).getAreaDeReferencia());

            }
        }

        return obras;
    }
   
   
    private void armarTabla() {
        List<Obra> areas = buscarObra(seleccionado);
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
        int row    = e.getY()/table.getRowHeight(); //get the row of the button

        /*Checking the row or column is valid or not*/
        if (row < table.getRowCount() && row >= 0 && column < table.getColumnCount() && column >= 0) {
            Object value = table.getValueAt(row, column);
            if (value instanceof JButton) {
                /*perform a click event*/
                ((JButton)value).doClick();
            }
        }
    }
}
