package modelo;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Clase modelo de una ventana que representa una tabla y muestra
 * la informacion de los lectores en deuda
 * 
 * @author Ivan Craco
 */
public class TablaDeuda extends AbstractTableModel {

    /**
     * Array de nombres de las columnas de la tabla
     */
    private static final String[] NOMBRE_COLUMNAS = new String[] {
            "Nombre", "Apellido", "Tipo", "DNI", "Teléfono", "Ejemplares" };

    /**
     * Array de objetos que representa el tipo de objeto de cada columna
     */
    private static final Class<?>[] TIPO_COLUMNAS = new Class<?>[] {
            String.class, String.class, String.class, String.class, String.class, String[].class };

    private int filas;
    private List<Lector> lectores;

    /**
     * Constructor parametrizado
     * 
     * @param filas cantidad de filas
     * @param lectores lista de lectores
     * @param tabla objeto Jtable
     */
    public TablaDeuda(int filas, List<Lector> lectores) {
        this.filas = filas;
        this.lectores = lectores;
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
                return lectores.get(rowIndex).getNombre();
            case 1:
                return lectores.get(rowIndex).getApellido();
            case 2:
                return lectores.get(rowIndex).getTipoLector();
            case 3:
                return lectores.get(rowIndex).getDocumento();
            case 4:
                return lectores.get(rowIndex).getCelular();
            case 5:
                return crearLista(lectores.get(rowIndex));
            default: return ""; 
        }
    }

    /**
     * Retorna un JComboBox para cada lector con informacion de los ejemplares
     * que aun no ha devuelto.
     * 
     * @param lector un objeto lector
     * @return objeto JComboBox con la informacion correspondiente
     */
    public String[] crearLista(Lector lector){
        int contador =  contarPrestamos(lector);
        String[] combo = new String[contador];
        for(int i = 0; i < lector.getPrestamoLector().size(); i++){
            if(Biblioteca.fechaActual().isAfter(lector.getPrestamoLector().get(i).getFechaDevolucion())){
                combo[i] = lector.getPrestamoLector().get(i).getEjemplar().getCodigoDeBarra();
            }
        }
        return combo;
    }

    /**
     * Retorna un entero que identifica la cantidad de obras
     * que debe un lector
     * 
     * @param lector lector en deuda
     * @return int cantidad de obras que debe el lector
     */
    public int contarPrestamos(Lector lector) {
        int contador = 0;
        for(int i = 0; i < lector.getPrestamoLector().size(); i++){
            if(Biblioteca.fechaActual().isAfter(lector.getPrestamoLector().get(i).getFechaDevolucion())){
                contador++;
            }
        }
        return contador;
    }
}
