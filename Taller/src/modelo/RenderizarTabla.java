package modelo;

import java.awt.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderizarTabla extends DefaultTableCellRenderer {

    private List<Lector> lectores;

    public RenderizarTabla() {
        setHorizontalAlignment(SwingConstants.CENTER);
    }

    public RenderizarTabla(List<Lector> lectores) {
        this.lectores = lectores;
        setHorizontalAlignment(SwingConstants.CENTER);
    }    

    public JComboBox<String> crearComboBox(Lector lector){
        JComboBox<String> combo = new JComboBox<>();
        for(int i = 0; i < lector.getPrestamoLector().size(); i++){
            if(fechaActual().isAfter(lector.getPrestamoLector().get(i).getFechaDevolucion())){
                combo.addItem(lector.getPrestamoLector().get(i).getEjemplar().getObra().getTitulo());
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

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        if(value instanceof JButton){
            JButton boton = (JButton) value;
            return boton;
        }

        if(value instanceof JComboBox){
            return crearComboBox(lectores.get(row));
        }

        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
