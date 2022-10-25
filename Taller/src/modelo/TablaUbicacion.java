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
public class TablaUbicacion extends AbstractTableModel {

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
    public TablaUbicacion(int filas, List<Ejemplar> ejemplares, String accion, Registro registo) {
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
        if (accion.equals(TablaRegistro.PRESTAMO)) {
            if (c == 5)
                return accion;
            if (c == 6)
                return "Dar de Baja";
        } else if (accion.equals(TablaRegistro.RESERVA)) {
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
                if (accion.equals(TablaRegistro.PRESTAMO)) {
                    return crearBoton(rowIndex, accion);
                } else {
                    return fechasEjemplarPrestado(rowIndex);
                }
            case 6:
                if (accion.equals(TablaRegistro.PRESTAMO)) {
                    return btnBaja(rowIndex);
                } else {
                    return crearBoton(rowIndex, accion);
                }
            default:
                return "";
        }
    }

    /**
     * Retorna un JButton que se le asigna a una fila e implementa
     * actionListener dependiendo de la accion y permite establecer
     * el texto del boton si el ejemplar al que hace referencia ya se ha
     * prestado o reservado.
     * 
     * @param indice representa la posicion actual de la fila
     * @param accion String accion correspondiente
     * @return boton que se renderiza en la fila correspondiente
     */
    public JButton crearBoton(int indice, String accion) {
        JButton button = new JButton("");

        if (ejemplares.get(indice).getPrestamoEjemplar() != null &&
                accion.equals(TablaRegistro.PRESTAMO)) {
            button.setText("En Préstamo");
        } else if (ejemplares.get(indice).getReservaEjemplar() != null &&
                accion.equals(TablaRegistro.RESERVA)) {
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

    /**
     * Retorna la fecha de devolucion en la que el ejemplar ha sido
     * prestado si el prestamo no es nulo.
     * 
     * @param indice entero que hace referencia a la fila actual
     * @return fecha de devolucion en formato cadena si el ejemplar se ha prestado
     */
    public String fechasEjemplarPrestado(int indice) {
        LocalDate local;
        if (ejemplares.get(indice).getPrestamoEjemplar() != null) {
            local = ejemplares.get(indice).getPrestamoEjemplar().getFechaDevolucion();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return local.format(formato);
        }
        return "";
    }

    /**
     * Retorna un JButton con un actionListener que permite
     * abrir una ventana y dar de baja el ejemplar correspondiente.
     *   
     * @param indice posicion actual de la fila de la tabla
     * @return boton con actionListener implementado
     */
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
