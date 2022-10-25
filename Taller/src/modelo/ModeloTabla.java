package modelo;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import vista.AltaEjemplar;
import vista.tabla.ConsultaIndice;
import vista.tabla.ConsultaObra;
import vista.tabla.Registro;

import java.awt.event.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el modelo de tabla para las ventanas
 * de consulta por area tematica y por indice de obra.
 * 
 * @author Ivan craco
 */
public class ModeloTabla extends AbstractTableModel {

    /**
     * Array de nombres de las columnas de la tabla
     */
    private static final String[] NOMBRE_COLUMNAS = new String[] {
            "Título", "Temática", "Ejemplares Disponibles", "Préstamo", "Reserva", "Nuevo" };

    /**
     * Array de objetos que representa el tipo de objeto de cada columna
     */
    private static final Class<?>[] TIPO_COLUMNAS = new Class<?>[] {
            String.class, String.class, String.class, JButton.class, JButton.class, JButton.class };

    private int filas;
    private int columnas;
    public static List<Obra> obras;
    public final static String PRESTAMO = "Préstamo";
    public final static String RESERVA = "Reserva";
    public final static String DEVOLUCION = "Devolución";
    private ConsultaObra o;
    private ConsultaIndice i;

    /**
     * Constructor parametrizado
     * 
     * @param filas    filas de la tabla
     * @param columnas columnas de la tabla
     * @param obras    lista de obras
     */
    public ModeloTabla(int filas, int columnas, List<Obra> obras) {
        this.filas = filas;
        this.columnas = columnas;
        ModeloTabla.obras = obras;
    }

    /**
     * Constructor parametrizado
     * 
     * @param filas filas de la tabla
     * @param obras lista de obras
     * @param o     objeto de tipo ventana y que representa una tabla
     */
    public ModeloTabla(int filas, List<Obra> obras, ConsultaObra o) {
        this.filas = filas;
        ModeloTabla.obras = obras;
        this.o = o;
    }

    /**
     * Constructor parametrizado
     * 
     * @param filas filas de la tabla
     * @param obras lista de obras
     * @param i     objeto de tipo ventana y que representa una tabla
     */
    public ModeloTabla(int filas, List<Obra> obras, ConsultaIndice i) {
        this.filas = filas;
        ModeloTabla.obras = obras;
        this.i = i;
    }

    /**
     * Constructor parametrizado
     * 
     * @param filas    filas de la tabla
     * @param columnas columnas de la tabla
     */
    public ModeloTabla(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    /**
     * Constructor parametrizado
     * 
     * @param filas filas de la tabla
     */
    public ModeloTabla(int filas) {
        this.filas = filas;
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
        return NOMBRE_COLUMNAS[c];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return obras.get(rowIndex).getTitulo();
            case 1:
                return obras.get(rowIndex).getAreaDeReferencia();
            case 2:
                return ejemplaresDisponibles(obras.get(rowIndex).getEjemplar());
            case 3:
                final JButton button = new JButton("Confirmar");
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        if (paraPrestar(obras.get(rowIndex).getEjemplar())) {
                            Registro t = new Registro(
                                    obras.get(rowIndex).getEjemplar(),
                                    ModeloTabla.PRESTAMO);
                            t.setVisible(true);
                            if (o != null)
                                o.dispose();
                            if (i != null)
                                i.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "¡ Operación no disponible !",
                                    null,
                                    JOptionPane.INFORMATION_MESSAGE);
                        }

                    }
                });
                return button;
            case 4:
                final JButton button2 = new JButton("Confirmar");
                button2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        if (paraReservar(obras.get(rowIndex).getEjemplar())) {
                            Registro t = new Registro(
                                    ejemplaresParaReserva(obras.get(rowIndex).getEjemplar()),
                                    ModeloTabla.RESERVA);
                            t.setVisible(true);
                            if (o != null)
                                o.dispose();
                            if (i != null)
                                i.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "¡ No hay ejemplares prestados !",
                                    null,
                                    JOptionPane.INFORMATION_MESSAGE);
                        }

                    }
                });
                return button2;
            case 5:
                final JButton btn = new JButton("Agregar");
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        AltaEjemplar ae = new AltaEjemplar(obras.get(rowIndex).getEjemplar());
                        ae.setVisible(true);
                        if (o != null)
                            o.dispose();
                        if (i != null)
                            i.dispose();
                    }

                });
                return btn;
            default:
                return "";
        }
    }

    /**
     * Retorna la cantidad de ejemplares disponibles evaluando
     * el atributo prestamo de cada ejemplar de la lista.
     * 
     * @param ejemplares lista de ejemplares
     * @return cantidad de ejemplares disponibles
     */
    public int ejemplaresDisponibles(List<Ejemplar> ejemplares) {
        if (ejemplares == null)
            return 0;
        int res = 0;
        for (int i = 0; i < ejemplares.size(); i++) {
            if (ejemplares.get(i).getPrestamoEjemplar() == null) {
                res++;
            }
        }
        return res;
    }

    /**
     * Retorna los ejemplares de la biblioteca que estan disponibles para
     * reservar cuando la fecha de devolucion del prestamo es mayor o
     * igual a la fecha actual del sistema.
     * 
     * @param ejemplares lista de ejemplares
     * @return lista de ejemplares que cumplen con la condicion
     */
    public List<Ejemplar> ejemplaresParaReserva(List<Ejemplar> ejemplares) {
        List<Ejemplar> res = new ArrayList<>();
        LocalDate local;
        for (int i = 0; i < ejemplares.size(); i++) {
            if (ejemplares.get(i).getPrestamoEjemplar() != null) {
                local = ejemplares.get(i).getPrestamoEjemplar().getFechaDevolucion();
                String fechaYHoraActual = Biblioteca.fechaYHoraActual();
                String fechaActual = fechaYHoraActual.substring(0, 10);
                LocalDate fechaActualParseada = Biblioteca.parsearFecha(fechaActual);
                if (local.isAfter(fechaActualParseada) || local.isEqual(fechaActualParseada)) {
                    res.add(ejemplares.get(i));
                }
            }
        }
        return res;
    }

    /**
     * Retorna un condicional para saber si un ejemplar en particular
     * esta disponible para reservar.
     * 
     * @param ejemplares lista de ejemplares
     * @return condicional con la informacion correspondiente
     */
    public boolean paraReservar(List<Ejemplar> ejemplares) {
        if (ejemplares == null)
            return false;
        LocalDate local;
        for (int i = 0; i < ejemplares.size(); i++) {
            if (ejemplares.get(i).getPrestamoEjemplar() != null) {
                local = ejemplares.get(i).getPrestamoEjemplar().getFechaDevolucion();
                String fechaYHoraActual = Biblioteca.fechaYHoraActual();
                String fechaActual = fechaYHoraActual.substring(0, 10);
                LocalDate fechaActualParseada = Biblioteca.parsearFecha(fechaActual);
                if (local.isBefore(fechaActualParseada)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna verdadero si hay un ejemplar para realizar un prestamo.
     * 
     * @param ejemplares lista de ejemplares
     * @return condicional con la informacion correspondiente
     */
    public boolean paraPrestar(List<Ejemplar> ejemplares) {
        if (ejemplares == null)
            return false;
        for (int i = 0; i < ejemplares.size(); i++) {
            if (ejemplares.get(i).getPrestamoEjemplar() == null) {
                return true;
            }
        }
        return false;
    }

    /**
     * 
     * @return int filas de la tabla
     */
    public int getFilas() {
        return filas;
    }

    /**
     * 
     * @param filas establece una nueva cantidad de filas
     *              de tipo int
     */
    public void setFilas(int filas) {
        this.filas = filas;
    }

    /**
     * 
     * @return int cantidad de columnas de la tabla
     */
    public int getColumnas() {
        return columnas;
    }

    /**
     * 
     * @param columnas establece una nueva cantidad
     *                 de columnas de tipo int;
     */
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

}