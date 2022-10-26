package modelo;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JTable;

/**
 * Clase que permite agregar evento a botones dentro de una tabla.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class BotonAdapter extends MouseAdapter{
        private final JTable table;
        
        public BotonAdapter(JTable table) {
            this.table = table;
        }
    
        /**
         * Evento de mouse caundo se realza un click
         */
        public void mouseClicked(MouseEvent e) {
            // Obtiene la columna del boton
            int column = table.getColumnModel().getColumnIndexAtX(e.getX());

            // Obtiene la fila del boton
            int row = e.getY()/table.getRowHeight();
    
            /* Checkea si la fila y la columna es valida */
            if (row < table.getRowCount() && row >= 0 && column < table.getColumnCount() && column >= 0) {
                Object value = table.getValueAt(row, column);
                if (value instanceof JButton) {
                    /*perform a click event*/
                    ((JButton)value).doClick();
                }
            }
        }
}
