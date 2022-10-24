package modelo;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloTablaObraReservada extends AbstractTableModel {

    private static final String[] NOMBRE_COLUMNAS = new String[] {
            "Autor", "Titulo", "Fecha Reserva"};

    private static final Class<?>[] TIPO_COLUMNAS = new Class<?>[] {
            String.class, String.class, String.class};

    private int filas;
    private List<Ejemplar> ejemplares;

    public ModeloTablaObraReservada(int filas, List<Ejemplar> ejemplares) {
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
    public Class<?> getColumnClass(int columnIndex) {
        return TIPO_COLUMNAS[columnIndex];
    }

    @Override
    public String getColumnName(int c) {
        return NOMBRE_COLUMNAS[c];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: 
               return ejemplares.get(rowIndex).getObra().getPrimerAutor();
            case 1:
               return ejemplares.get(rowIndex).getObra().getTitulo();
            case 2:
               return ejemplares.get(rowIndex).getReservaEjemplar().getFechaReserva();
            default: return "";
        }

    }

}
