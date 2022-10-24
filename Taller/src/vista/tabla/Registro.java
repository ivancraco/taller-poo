package vista.tabla;

import java.util.List;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

import modelo.Ejemplar;
import modelo.ModeloTablaRegistro;
import modelo.RenderizarTabla;

public class Registro extends JFrame {

    ModeloTablaRegistro modelo;
    private List<Ejemplar> ejemplares;
    private String accion;
    private JTable tabla;
    private JTableButtonMouseListener listener;

    public Registro(List<Ejemplar> ejemplares, String accion) {

        this.ejemplares = ejemplares;
        this.accion = accion;
        tabla = new JTable();
        listener = new JTableButtonMouseListener(tabla);
        tabla.addMouseListener(listener);

        
        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(950, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    
        armarTabla();
        

    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    private void armarTabla() {
        modelo = new ModeloTablaRegistro(ejemplares.size(), ejemplares, accion, this);
        tabla.setDefaultRenderer(Object.class, new RenderizarTabla());
        tabla.setModel(modelo);
        tabla.setRowHeight(30);
        validate();
        repaint();

    }
}

class JTableButtonMouseListener extends MouseAdapter {
    private final JTable table;
    
    public JTableButtonMouseListener(JTable table) {
        this.table = table;
    }

    /**
     * @param e
     */
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