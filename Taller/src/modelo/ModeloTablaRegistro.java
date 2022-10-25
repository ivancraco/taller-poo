package modelo;

import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import vista.BajaEjemplar;
import vista.VerificarLector;
import vista.tabla.Registro;

/**
 * Clase que representa un modelo de tabla para mostrar informacion
 * acerca del registro de prestamo o devolucion.
 * 
 * @author Ivan Craco
 */
public class ModeloTablaRegistro extends AbstractTableModel {

    /**
     * Array de nombres de las columnas de la tabla
     */
    private static final String[] NOMBRE_COLUMNAS = new String[] {
            "ID", "Pasillo", "Estantería", "Fila", "Identificador Ejemplar", "", "" };

    /**
     * Array de objetos que representa el tipo de objeto de cada columna
     */
    private static final Class<?>[] TIPO_COLUMNAS = new Class<?>[] {
            String.class, String.class, String.class, String.class, String.class, Object.class, Object.class };

    private int filas;
    private List<Ejemplar> ejemplares;
    private String accion;
    private Registro registo;

    /**
     * Constructor parametrizado
     * @param filas cantidad de filas de la tabla
     * @param ejemplares listado de ejemplares
     * @param accion String accion a realizar
     * @param t objeto Registro
     */
    public ModeloTablaRegistro(int filas, List<Ejemplar> ejemplares, String accion, Registro registo) {
        this.filas = filas;
        this.ejemplares = ejemplares;
        this.accion = accion;
        this.registo = registo;
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
        if (accion.equals(ModeloTabla.PRESTAMO)) {
            if (c == 5)
                return accion;
            if (c == 6)
                return "Dar de Baja";
        } else if (accion.equals(ModeloTabla.RESERVA)) {
            if (c == 5)
                return "Fecha Devolución";
            if (c == 6)
                return accion;
        }
        return NOMBRE_COLUMNAS[c];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String str = ejemplares.get(rowIndex).getIDUbicacion();
        switch (columnIndex) {
            case 0:
                return str;
            case 1:
                return str.substring(0, 2);
            case 2:
                return str.substring(2, 4);
            case 3:
                return str.substring(4, 6);
            case 4:
                return str.substring(6);
            case 5:
                if (accion.equals(ModeloTabla.PRESTAMO)) {
                    return crearBoton(rowIndex, accion);
                } else {
                    return fechasEjemplaresPrestados(rowIndex);
                }
            case 6:
                if (accion.equals(ModeloTabla.PRESTAMO)) {
                    return btnBaja(rowIndex);
                } else {
                    return crearBoton(rowIndex, accion);
                }
            default:
                return "";
        }
    }

    public JButton crearBoton(Integer indice, String accion) {
        JButton button = new JButton("");

        if (ejemplares.get(indice).getPrestamoEjemplar() != null &&
                accion.equals(ModeloTabla.PRESTAMO)) {
            button.setText("En Préstamo");
        } else if (ejemplares.get(indice).getReservaEjemplar() != null &&
                accion.equals(ModeloTabla.RESERVA)) {
            button.setText("Reservado");
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    JOptionPane.showMessageDialog(null,
                            "Reservado para " + ejemplares.get(indice).getReservaEjemplar().getFechaReserva(), "",
                            JOptionPane.ERROR_MESSAGE);
                }
            });
        } else {
            button.setText("Registrar");
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    VerificarLector verificar = new VerificarLector(ejemplares.get(indice), accion);
                    verificar.setVisible(true);
                    registo.dispose();
                }
            });
        }

        return button;

    }

    public String fechasEjemplaresPrestados(Integer indice) {
        LocalDate local;
        if (ejemplares.get(indice).getPrestamoEjemplar() != null) {
            local = ejemplares.get(indice).getPrestamoEjemplar().getFechaDevolucion();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return local.format(formato);
        }
        return "";
    }

    public JButton btnBaja(int indice) {
        JButton button = new JButton("Aceptar");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ejemplares.get(indice).getPrestamoEjemplar() == null) {
                    BajaEjemplar be = new BajaEjemplar(ejemplares, indice);
                    be.setVisible(true);
                    registo.dispose();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "El ejemplar está en préstamo", "",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

        });

        return button;
    }

}
