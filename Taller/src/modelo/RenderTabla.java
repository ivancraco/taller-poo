package modelo;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderTabla extends DefaultTableCellRenderer {

    public RenderTabla() {
        setHorizontalAlignment(SwingConstants.CENTER);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        if(value instanceof JButton){
            JButton boton = (JButton) value;
            return boton;
        }

        if(value instanceof JComboBox){
            JComboBox<String> combo = new JComboBox<String>();
            // combo.addItem((String)value);
            return combo;
        }

        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
