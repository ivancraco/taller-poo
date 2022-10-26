package modelo;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Clase que permite renderizar un boton en un JTable.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class RenderizarBoton extends DefaultTableCellRenderer {

    /**
     * Alinea la informacion de cada casilla al centro
     */
    public RenderizarBoton() {
        setHorizontalAlignment(SwingConstants.CENTER);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        if(value instanceof JButton){
            JButton boton = (JButton) value;
            return boton;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
