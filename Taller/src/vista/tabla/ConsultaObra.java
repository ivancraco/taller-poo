package vista.tabla;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


import modelo.Biblioteca;
import modelo.BotonAdapter;
import modelo.TablaRegistro;
import modelo.Obra;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

/**
 * Clase que permite consultar obras por area tematica y muestra la informacion
 * en un JTable con los valores que encuentra.
 * 
 * @author Ivan Craco
 */
public class ConsultaObra extends VentanaTabla implements ActionListener, ItemListener {

    private List<Obra> areas;
    private TablaRegistro modelo;   
    private JComboBox<String> combo;
    private String seleccionado = "Matemática";
    private JPanel panel1;
    private JButton buscar;
    private JTable tabla;
    private BotonAdapter listener;


    /**
     * Constructor sin parametros.
     * Crea la venta, inicializa atributos, agrega items al JComboBox
     * y agrega los componentes a la ventan.
     */
    public ConsultaObra() {
        super.crearVentana();

        buscar = new JButton("Buscar");

        combo = new JComboBox<String>();
        combo.addItem("Matemática");
        combo.addItem("Programación");
        combo.addItem("AutoAyuda");
        combo.addItem("Administración");
        combo.addItem("Algebra");
        combo.addItem("Arquitectura");
        combo.addItem("Contabilidad");
        combo.addItem("Redes");
        combo.addItem("Turismo");
        combo.addItem("Tecnologia");

        combo.addItemListener(this);

        tabla = new JTable();

        panel1 = new JPanel();
        panel1.add(combo);
        panel1.add(buscar);
        add(panel1, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
        buscar.addActionListener(this);
        listener = new BotonAdapter(tabla);
        tabla.addMouseListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        armarTabla();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == combo) {
            seleccionado = (String) combo.getSelectedItem();
        }

    }

    /**
     * Retorna un listado de obras que coinciden con el
     * area tematica seleccionada del JComboBox.
     * 
     * @param areaTematica item seleccionado del JComboBox
     * @return listado de obras
     */
    private List<Obra> buscarObra(String areaTematica) {
        List<Obra> obras = new ArrayList<>();
        for (int i = 0; i < Biblioteca.obras().size(); i++) {
            if (Biblioteca.obras().get(i).getAreaTematica().equals(areaTematica)) {
                obras.add(Biblioteca.obras().get(i));
            }
        }

        return obras;
    }
   

    /**
     * Arma la tabla con los valores correspondientes
     * a la busqueda.
     */
    private void armarTabla() {
        areas = buscarObra(seleccionado);
        modelo = new TablaRegistro(areas.size(), areas, this);
        tabla.setModel(modelo);
        listener = new BotonAdapter(tabla);
        super.armarTabla(tabla);
    }

}
