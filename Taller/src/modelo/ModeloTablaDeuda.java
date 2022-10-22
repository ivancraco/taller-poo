package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaDeuda extends AbstractTableModel {

    private static final String[] NOMBRE_COLUMNAS = new String[] {
            "Nombre", "Apellido", "Tipo", "DNI", "Teléfono", "Ejemplares" };

    private static final Class<?>[] TIPO_COLUMNAS = new Class<?>[] {
            String.class, String.class, String.class, String.class, String.class, JComboBox.class };

    private Integer filas;
    private List<Lector> lectores;

    public ModeloTablaDeuda(Integer filas, List<Lector> lectores) {

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
                return crearComboBox(lectores.get(rowIndex));   
            default: return ""; 
        }
    }

    public JComboBox<String> crearComboBox(Lector lector){
        JComboBox<String> combo = new JComboBox<>();
        for(int i = 0; i < lector.getPrestamoLector().size(); i++){
            if(fechaActual().isAfter(lector.getPrestamoLector().get(i).getFechaDevolucion())){
                combo.addItem(lector.getPrestamoLector().get(i).getEjemplar().getIDUbicacion());
            }
        }

        return combo;
    }

    public LocalDate fechaActual() {
        String fecha = fechaYHoraActual();
        String str = fecha.substring(0, 10);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaParseada = LocalDate.parse(str, formato);
        return fechaParseada;
    }

    public String fechaYHoraActual() {
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a");
        String nuevoFormato = fechaActual.format(formato);
        return nuevoFormato;
    }

}
