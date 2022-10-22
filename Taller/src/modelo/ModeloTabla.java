package modelo;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import vista.ConsultaIndice;
import vista.ConsultaObra;
import vista.TablaRegistro;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class ModeloTabla extends AbstractTableModel {
    private static final String[] NOMBRE_COLUMNAS = new String[] {
            "Título", "Temática", "Ejemplares Disponibles", "Préstamo", "Reserva" };

    private static final Class<?>[] TIPO_COLUMNAS = new Class<?>[] {
            String.class, String.class, String.class, JButton.class, JButton.class };

    private int filas;
    private int columnas;
    public static List<Obra> obras;
    public final static String PRESTAMO = "Préstamo";
    public final static String RESERVA = "Reserva";
    public final static String DEVOLUCION = "Devolución";
    private ConsultaObra o;
    private ConsultaIndice i;

    public ModeloTabla(int filas, int columnas, List<Obra> obras) {
        this.filas = filas;
        this.columnas = columnas;
        ModeloTabla.obras = obras;
    }

    public ModeloTabla(int filas, List<Obra> obras, ConsultaObra o) {
        this.filas = filas;
        ModeloTabla.obras = obras;
        this.o = o;
    }

    public ModeloTabla(int filas, List<Obra> obras, ConsultaIndice i) {
        this.filas = filas;
        ModeloTabla.obras = obras;
        this.i = i;
    }

    public ModeloTabla(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

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
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return obras.get(rowIndex).getTitulo();
            case 1:
                return obras.get(rowIndex).getAreaDeReferencia();
            case 2:
                return ejemplaresDisponibles(obras.get(rowIndex).getEjemplar());
            case 3:
                final JButton button = new JButton("Préstamo");
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        if (paraPrestar(obras.get(rowIndex).getEjemplar())) {
                            TablaRegistro t = new TablaRegistro(
                                    obras.get(rowIndex).getEjemplar(),
                                    ModeloTabla.PRESTAMO);
                            t.setVisible(true);
                            if(o != null) o.dispose();
                            if(i != null) i.dispose();
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
                final JButton button2 = new JButton("Reserva");
                button2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        if (paraReservar(obras.get(rowIndex).getEjemplar())) {
                            TablaRegistro t = new TablaRegistro(
                                    ejemplaresParaReserva(obras.get(rowIndex).getEjemplar()),
                                    ModeloTabla.RESERVA);
                            t.setVisible(true);
                            if(o != null) o.dispose();
                            if(i != null) i.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "¡ No hay ejemplares prestados !",
                                    null,
                                    JOptionPane.INFORMATION_MESSAGE);
                        }

                    }
                });
                return button2;
            default:
                return "";
        }
    }

    public Integer ejemplaresDisponibles(List<Ejemplar> ejemplares) {
        if (ejemplares == null)
            return 0;
        Integer res = 0;
        for (int i = 0; i < ejemplares.size(); i++) {
            if (ejemplares.get(i).getPrestamoEjemplar() == null) {
                res++;
            }
        }
        return res;
    }

    public List<Ejemplar> ejemplaresParaPrestamo(List<Ejemplar> ejemplares) {
        // List<Ejemplar> res = new ArrayList<>();
        // for (int i = 0; i < ejemplares.size(); i++) {
        //     if (ejemplares.get(i).getPrestamoEjemplar() == null) {
        //         res.add(ejemplares.get(i));
        //     }
        // }
        return ejemplares;
    }

    public List<Ejemplar> ejemplaresParaReserva(List<Ejemplar> ejemplares) {
        List<Ejemplar> res = new ArrayList<>();
        for (int i = 0; i < ejemplares.size(); i++) {
            if (ejemplares.get(i).getPrestamoEjemplar() != null) {
                res.add(ejemplares.get(i));
            }
        }
        return res;
    }

    public boolean paraReservar(List<Ejemplar> ejemplares) {
        if(ejemplares == null) return false;
        for (int i = 0; i < ejemplares.size(); i++) {
            if (ejemplares.get(i).getPrestamoEjemplar() != null) {
                return true;
            }
        }
        return false;
    }

    public boolean paraPrestar(List<Ejemplar> ejemplares) {
        if(ejemplares == null) return false;
        for (int i = 0; i < ejemplares.size(); i++) {
            if (ejemplares.get(i).getPrestamoEjemplar() == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getColumnName(int c) {
        return NOMBRE_COLUMNAS[c];
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

}