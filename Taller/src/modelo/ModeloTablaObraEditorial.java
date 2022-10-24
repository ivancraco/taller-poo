package modelo;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloTablaObraEditorial extends AbstractTableModel {

    private static final String[] NOMBRE_COLUMNAS = new String[] {
            "Autor", "Título", "Pais", "Edición", "Año", "Idioma" };

    private static final Class<?>[] TIPO_COLUMNAS = new Class<?>[] {
            String.class, String.class, String.class, String.class, String.class, String.class };

    private int filas;
    private List<Obra> ejemplares;

    public ModeloTablaObraEditorial(int filas, List<Obra> ejemplares) {
        this.filas = filas;
        this.ejemplares = ejemplares;
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
        switch(columnIndex) {
            case 0:
               return ejemplares.get(rowIndex).getPrimerAutor();
            case 1: 
               return ejemplares.get(rowIndex).getTitulo();
            case 2:
               return ejemplares.get(rowIndex).getEdicion().getPaisEdicion();
            case 3:
               return ejemplares.get(rowIndex).getEdicion().getNumeroEdicion();
            case 4:
               return ejemplares.get(rowIndex).getEdicion().getAnio();
            case 5:
               return ejemplares.get(rowIndex).getEdicion().getIdioma();
            default: return "";
        }
    }

}
