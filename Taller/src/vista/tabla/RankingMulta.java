package vista.tabla;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import modelo.Biblioteca;
import modelo.Lector;
import modelo.Lectores;
import modelo.TablaMulta;

import java.awt.*;

/**
 * Clase que muestra en un JTable el ranking de lectores
 * por cantidad de multas aplicadas.
 * 
 * @author Ivan Craco
 */
public class RankingMulta extends VentanaTabla {

    private TablaMulta modelo;
    private JTable tabla;
    private JPanel panel;
    private JLabel titulo;

    /**
     * Constructor sin parametros.
     * Crea la ventana, inicializa atributos y
     * los agrega al contenedor.
     */
    public RankingMulta() {
        super.crearVentana();

        tabla = new JTable();
        titulo = new JLabel("pepe");
        panel = new JPanel();
        panel.add(titulo);

        setLayout(new GridLayout(1,1));
        // add(panel, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);

        armarTabla();

    }

    /**
     * Retorna una lista ordena de mayor a menor
     * de lectores por cantidad de multas aplicadas.
     * 
     * @return listado de lectores
     */
    public List<Lector> RankingLectoresMultados(){
        List<Lector> lectores = new ArrayList<Lector>();

        Lectores.ordenar();
        for (int i = 0; i < 10; i++) {
            if(Biblioteca.lectores().get(i).getMulta() != null){
                lectores.add(Biblioteca.lectores().get(i));
            }
        }

        return lectores;
    }

    /**
     * Arma la tabla con los valores del listado de lectores.
     */
    public void armarTabla(){
        modelo = new TablaMulta(RankingLectoresMultados().size(),
        RankingLectoresMultados(), TablaMulta.RANKING_MULTA);
        tabla.setModel(modelo);
        super.armarTabla(tabla);
    }
}
