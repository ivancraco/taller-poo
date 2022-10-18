package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.*;


import modelo.Biblioteca;
import modelo.Ejemplar;
import modelo.ModeloTabla;
import modelo.RenderTabla;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class Buscador extends JFrame implements ActionListener, ItemListener {

    private JComboBox<String> combo;
    private String seleccionado = "Matemática";
    private JPanel panel1;
    private JPanel panel2;
    JTextField buscador;
    JButton buscar;
    JTextArea resultado;
    Container c;
    JTable tabla;
    TableModel mimodelo;
    JTableButtonMouseListener listener;

    /*
     * private String[] columnas = { "Ejemplar", "Titulo" };
     * private Object[][] datosFila = {
     * { "Pepe", "El pepe de la gente" },
     * { "Pope", "El elegido" }
     * };
     */

     

    public Buscador() {

        buscar = new JButton("Buscar");

        combo = new JComboBox<String>();
        combo.addItem("Matemática");
        combo.addItem("Programación");
        combo.addItemListener(this);

       // mimodelo = new ModeloTabla(3, 5, "f");
        tabla = new JTable();

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.add(combo);
        panel1.add(buscar);
        panel2.add(tabla);
        add(panel1, BorderLayout.NORTH);

        add(new JScrollPane(tabla), BorderLayout.CENTER);
        buscar.addActionListener(this);
        listener = new JTableButtonMouseListener(tabla);
        tabla.addMouseListener(listener);
        /*
         * panel = new JPanel();
         * panel.add(resultado);
         * add(panel, BorderLayout.CENTER);
         */

        /* Ventana */
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650, 300);
        setResizable(false);
        setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        armarTabla();
        /*
         * buscarObra(seleccionado);
         * panel.repaint();
         */
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == combo) {
            seleccionado = (String) combo.getSelectedItem();
        }

    }

    private List<List<Ejemplar>> ejemplaresDeObra(String areaTematica) {
        List<List<Ejemplar>> ejemplares = new ArrayList<>();
        for (int i = 0; i < Biblioteca.obras().size(); i++) {
            if (Biblioteca.obras().get(i).getAreaTematica().equals(areaTematica)) {
                List<Ejemplar> res = new ArrayList<>();
                res = Biblioteca.obras().get(i).getEjemplar();
                ejemplares.add(res);
                // text.append(Biblioteca.obras().get(i).getEjemplar().get(0).getAreaDeReferencia());
                // resultado.append(Biblioteca.obras().get(i).getEjemplar().get(0).getAreaDeReferencia());

            }
        }

        return ejemplares;
    }
   
   
    private void armarTabla() {
        List<List<Ejemplar>> areas = ejemplaresDeObra(seleccionado);
        ModeloTabla modelo = new ModeloTabla(areas.size(),areas);
        // modelo.setValueAt("modelo", 1, 2);
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
