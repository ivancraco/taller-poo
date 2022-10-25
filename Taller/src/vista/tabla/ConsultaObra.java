package vista.tabla;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


import modelo.Biblioteca;
import modelo.ModeloTabla;
import modelo.Obra;
import modelo.RenderizarTabla;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class ConsultaObra extends VentanaTabla implements ActionListener, ItemListener {

    private List<Obra> areas;
    private ModeloTabla modelo;   
    private JComboBox<String> combo;
    private String seleccionado = "Matemática";
    private JPanel panel1;
    private JButton buscar;
    private JTable tabla;
    private JTableButtonMouseListener listener;

 
    public ConsultaObra() {
        super.crearVentana();

        buscar = new JButton("Buscar");

        combo = new JComboBox<String>();
        combo.addItem("Matemática");
        combo.addItem("Programación");
        combo.addItem("AutoAyuda");
        combo.addItem("Administración");
        combo.addItem("Algebra");
        combo.addItem("Arquitectura");
        combo.addItem("Contabilidad");
        combo.addItem("Redes");
        combo.addItem("Turismo");
        combo.addItem("Tecnologia");

        combo.addItemListener(this);

        tabla = new JTable();

        panel1 = new JPanel();
        panel1.add(combo);
        panel1.add(buscar);
        add(panel1, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
        buscar.addActionListener(this);
        listener = new JTableButtonMouseListener(tabla);
        tabla.addMouseListener(listener);
    

    

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

    private List<Obra> buscarObra(String areaTematica) {
        List<Obra> obras = new ArrayList<>();
        for (int i = 0; i < Biblioteca.obras().size(); i++) {
            if (Biblioteca.obras().get(i).getAreaTematica().equals(areaTematica)) {
                obras.add(Biblioteca.obras().get(i));
            }
        }

        return obras;
    }
   
   
    private void armarTabla() {
        areas = buscarObra(seleccionado);
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
