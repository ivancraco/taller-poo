package modelo;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloTablaObraPopular extends AbstractTableModel{

    private static final String[] NOMBRE_COLUMNAS = new String[] {
        "Autor", "Titulo", "ISBN"};

    private static final Class<?>[] TIPO_COLUMNAS = new Class<?>[] {
        String.class, String.class, String.class};

    private Integer filas;
    private List<Obra> obras;

    public ModeloTablaObraPopular(Integer filas, List<Obra> obras) {
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
        switch(columnIndex) {
            case 0: 
               return obras.get(rowIndex).getPrimerAutor();
            case 1:
               return obras.get(rowIndex).getTitulo();
            case 2:
               return obras.get(rowIndex).getISBN();
            default: return "";
        }
    }
    
}
