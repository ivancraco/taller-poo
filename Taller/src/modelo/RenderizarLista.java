package modelo;

import java.awt.Component;

import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

/**
 * Clase que permite renderizar una lista de elemntos en un JTable.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class RenderizarLista extends JList<String> implements TableCellRenderer{

    public RenderizarLista(){
        setAlignmentX(SwingConstants.CENTER);
        setAlignmentY(BOTTOM_ALIGNMENT);
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        if(value instanceof String[]){
            setListData((String[]) value);
        }
        return this;
    }
    
}
