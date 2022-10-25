package modelo;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Clase que representa un modelo de tabla para mostrar informacion de
 * obras populares.
 * 
 * @author Ivan craco
 */
public class ModeloTablaObraPopular extends AbstractTableModel {

    /**
     * Array de nombres de las columnas de la tabla
     */
    private static final String[] NOMBRE_COLUMNAS = new String[] {
            "Autor", "Titulo", "ISBN" };

    /**
     * Array de objetos que representa el tipo de objeto de cada columna
     */    
    private static final Class<?>[] TIPO_COLUMNAS = new Class<?>[] {
            String.class, String.class, String.class };

    private int filas;
    private List<Obra> obras;

    /**
     * Constructor parametrizado
     * @param filas cantidad de filas de la tabla
     * @param obras listado de obras
     */
    public ModeloTablaObraPopular(int filas, List<Obra> obras) {
        this.filas = filas;
        this.obras = obras;
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
    public String getColumnName(int c) {
        return NOMBRE_COLUMNAS[c];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return TIPO_COLUMNAS[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return obras.get(rowIndex).getPrimerAutor();
            case 1:
                return obras.get(rowIndex).getTitulo();
            case 2:
                return obras.get(rowIndex).getISBN();
            default:
                return "";
        }
    }

}
