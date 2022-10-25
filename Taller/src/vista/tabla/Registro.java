package vista.tabla;

import java.util.List;

import javax.swing.*;

import java.awt.BorderLayout;

import modelo.BotonAdapter;
import modelo.Ejemplar;
import modelo.TablaUbicacion;

/**
 * Clase que permite mostrar informacion de las obras y poder
 * realizar un prestamo, una reserva, o dar de baja un ejemplar.
 * 
 * @author Ivan Craco
 */
public class Registro extends VentanaTabla {

    TablaUbicacion modelo;
    private List<Ejemplar> ejemplares;
    private String accion;
    private JTable tabla;
    private BotonAdapter listener;

    /**
     * Constructor parametrizado.
     * 
     * @param ejemplares listado de ejemplares
     * @param accion String accion a realizar
     */
    public Registro(List<Ejemplar> ejemplares, String accion) {
        super.crearVentana();

        this.ejemplares = ejemplares;
        this.accion = accion;
        tabla = new JTable();
        listener = new BotonAdapter(tabla);
        tabla.addMouseListener(listener);

        
        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(950, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    
        armarTabla();
        

    }

    /**
     * @return lista de ejemplares
     */
    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    /**
     * @param ejemplares establece una nueva lista de
     * ejemplares
     */
    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    /**
     * Arma la tabla con los valores del listado de ejemplares.
     */
    private void armarTabla() {
        modelo = new TablaUbicacion(ejemplares.size(), ejemplares, accion, this);
        tabla.setModel(modelo);
        super.armarTabla(tabla);
    }
}