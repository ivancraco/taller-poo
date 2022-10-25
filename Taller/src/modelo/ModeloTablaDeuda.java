package modelo;

import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;

/**
 * Clase modelo de una ventana que representa una tabla y muestra
 * la informacion de los lectores en deuda
 * 
 * @author Ivan Craco
 */
public class ModeloTablaDeuda extends AbstractTableModel {

    /**
     * Array de nombres de las columnas de la tabla
     */
    private static final String[] NOMBRE_COLUMNAS = new String[] {
            "Nombre", "Apellido", "Tipo", "DNI", "Teléfono", "Ejemplares" };

    /**
     * Array de objetos que representa el tipo de objeto de cada columna
     */
    private static final Class<?>[] TIPO_COLUMNAS = new Class<?>[] {
            String.class, String.class, String.class, String.class, String.class, Object.class };

    private int filas;
    private List<Lector> lectores;
    private JTable tabla;

    /**
     * Constructor parametrizado
     * 
     * @param filas cantidad de filas
     * @param lectores lista de lectores
     * @param tabla objeto Jtable
     */
    public ModeloTablaDeuda(int filas, List<Lector> lectores, JTable tabla) {
        this.filas = filas;
        this.lectores = lectores;
        this.tabla = tabla;

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
            TableColumn t = tabla.getColumnModel().getColumn(columnIndex);
                t.setCellEditor(new DefaultCellEditor(crearComboBox(lectores.get(rowIndex))));   
                return t.getCellEditor();
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
    public JComboBox<String> crearComboBox(Lector lector){
        JComboBox<String> combo = new JComboBox<>();
        for(int i = 0; i < lector.getPrestamoLector().size(); i++){
            if(Biblioteca.fechaActual().isAfter(lector.getPrestamoLector().get(i).getFechaDevolucion())){
                combo.addItem(lector.getPrestamoLector().get(i).getEjemplar().getIDUbicacion());
            }
        }
        return combo;
    }
}
