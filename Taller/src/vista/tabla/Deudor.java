package vista.tabla;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import modelo.Biblioteca;
import modelo.Lector;
import modelo.TablaDeuda;
import modelo.RenderizarLista;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que muestra en un JTable la informacion de los lectores que
 * deben obras.
 * 
 * @author Ivan Craco
 */
public class Deudor extends VentanaTabla{

    private TablaDeuda modelo;
    private JTable tabla;

    /**
     * Constructor sin parametros.
     * Crea la tabla y agrega un JTable a la misma.
     */
    public Deudor() {
        super.crearVentana();
        tabla = new JTable();
        add(new JScrollPane(tabla), BorderLayout.CENTER);
        tablaDeuda();
    }

    /**
     * Retorna una lista de lectores que deben obras en el momento
     * de armar la tabla.
     * 
     * @return listado de lectores en deuda
     */
    public List<Lector> deudores() {
        List<Lector> resultado = new ArrayList<Lector>();
       for(int i = 0; i < Biblioteca.lectores().size(); i++) {
           if(Biblioteca.lectores().get(i).getPrestamoLector().size() > 0){
              for(int j = 0; j < Biblioteca.lectores().get(i).getPrestamoLector().size(); i++){
                if(Biblioteca.fechaActual().isAfter(Biblioteca.lectores().get(i).getPrestamoLector().get(j).getFechaDevolucion())){
                    resultado.add(Biblioteca.lectores().get(i));
                };
              }
           }
       }
       return resultado;
    }

    // public LocalDate fechaActual() {
    //     String fecha = fechaYHoraActual();
    //     String str = fecha.substring(0, 10);
    //     DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //     LocalDate fechaParseada = LocalDate.parse(str, formato);
    //     return fechaParseada;
    // }

    // public String fechaYHoraActual() {
    //     LocalDateTime fechaActual = LocalDateTime.now();
    //     DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a");
    //     String nuevoFormato = fechaActual.format(formato);
    //     return nuevoFormato;
    // }

    /**
     * Arma la tabla con los valores correspondientes
     * a la busqueda de deudores.
     */
    public void tablaDeuda() {
        modelo = new TablaDeuda(deudores().size(), deudores());
        tabla.setModel(modelo);
        // super.armarTabla(tabla);
        tabla.setDefaultRenderer(String[].class, new RenderizarLista());
        tabla.setRowHeight(100);
        tabla.getColumnModel().getColumn(5).setPreferredWidth(350);
    }
}
