package modelo;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Clase que representa el modelo de tabla para mostrar informacion
 * referida a obras que se encuentran reservadas.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class TablaObraReservada extends AbstractTableModel {

    /**
     * Array de nombres de las columnas de la tabla
     */
    private static final String[] NOMBRE_COLUMNAS = new String[] {
            "Autor", "Titulo", "Fecha Reserva" };

    /**
     * Array de objetos que representa el tipo de objeto de cada columna
     */
    private static final Class<?>[] TIPO_COLUMNAS = new Class<?>[] {
            String.class, String.class, String.class };

    private int filas;
    private List<Ejemplar> ejemplares;

    /**
     * Constructor parametrizado
     * @param filas cantidad de filas de la tabla
     * @param ejemplares listado de ejemplares
     */
    public TablaObraReservada(int filas, List<Ejemplar> ejemplares) {
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
        switch (columnIndex) {
            case 0:
                return ejemplares.get(rowIndex).getObra().getPrimerAutor();
            case 1:
                return ejemplares.get(rowIndex).getObra().getTitulo();
            case 2:
                return ejemplares.get(rowIndex).getReservaEjemplar().getFechaReserva();
            default:
                return "";
        }

    }

}
