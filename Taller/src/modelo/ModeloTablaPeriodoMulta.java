package modelo;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloTablaPeriodoMulta extends AbstractTableModel {

    private static final String[] NOMBRE_COLUMNAS = new String[] {
            "Nombre", "Apellido", "DNI", "Correo", ""};

    private static final Class<?>[] TIPO_COLUMNAS = new Class<?>[] {
            String.class, String.class, String.class, String.class, String.class };

    private int filas;
    private List<Lector> lectores;
    private String accion;
    public static final String PERIODO_MULTA = "PeriodoMulta";
    public static final String RANKING_MULTA = "RankingMulta";


    public ModeloTablaPeriodoMulta(int filas, List<Lector> lectores, String accion) {
        this.filas = filas;
        this.lectores = lectores;
        this.accion = accion;
    }

    @Override
    public int getRowCount() {
        return filas;
    }

    @Override
    public int getColumnCount() {
        if(accion.equals(ModeloTablaPeriodoMulta.PERIODO_MULTA)){
            return NOMBRE_COLUMNAS.length - 1;
        }else if(accion.equals(ModeloTablaPeriodoMulta.RANKING_MULTA)){
            return NOMBRE_COLUMNAS.length;
        }else{
            return 0;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return TIPO_COLUMNAS[columnIndex];
    }

    @Override
    public String getColumnName(int c) {
        if(c == 4) {
            return "Cantidad";
        }
        return NOMBRE_COLUMNAS[c];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return lectores.get(rowIndex).getNombre();
            case 1:
                return lectores.get(rowIndex).getApellido();
            case 2:
                return lectores.get(rowIndex).getDocumento();
            case 3:
                return lectores.get(rowIndex).getCorreo();
            case 4:
                return lectores.get(rowIndex).getMulta().getCantidad();   
            default: return "";    
        }
    }

}
