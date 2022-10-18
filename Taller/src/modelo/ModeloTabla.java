package modelo;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import java.awt.event.*;
import java.util.List;

public class ModeloTabla extends AbstractTableModel {
    private static final String[] NOMBRE_COLUMNAS = new String[] {
            "Referencia", "Titulo", "Disponibles", "Préstamo", "Reserva" };

    private static final Class<?>[] TIPO_COLUMNAS = new Class<?>[] {
            String.class, String.class, Integer.class, JButton.class, JButton.class };

    private int filas;
    private int columnas;
    private List<List<Ejemplar>> valor;

    public ModeloTabla(int filas, int columnas, List<List<Ejemplar>> valor) {
        this.filas = filas;
        this.columnas = columnas;
        this.valor = valor;
    }

    public ModeloTabla(int filas, List<List<Ejemplar>> valor) {
        this.filas = filas;
        this.valor = valor;
    }

    public ModeloTabla(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    public ModeloTabla(int filas) {
        this.filas = filas;
    }

    @Override
    public int getRowCount() {
        return filas;
    }

    @Override
    public int getColumnCount() {
        return NOMBRE_COLUMNAS.length;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return TIPO_COLUMNAS[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return valor.get(rowIndex).get(rowIndex).getAreaDeReferencia();
            case 1:
                return valor.get(rowIndex);
            case 2:
                return valor.get(rowIndex).size();
            case 3:
                final JButton button = new JButton("Préstamo");
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(button),
                                "Préstamo");
                    }
                });
                return button;
            case 4:
                final JButton button2 = new JButton("Reserva");
                button2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(button2),
                                "Reserva");
                    }
                });
                return button2;
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int c) {
        return NOMBRE_COLUMNAS[c];
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

}