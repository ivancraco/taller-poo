package vista.tabla;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import modelo.Biblioteca;
import modelo.Lector;
import modelo.Lectores;
import modelo.ModeloTablaMulta;
import modelo.RenderizarTabla;

import java.awt.*;

public class RankingMulta extends VentanaTabla {

    private ModeloTablaMulta modelo;
    private JTable tabla;
    private JPanel panel;
    private JLabel titulo;

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

    public void armarTabla(){
        modelo = new ModeloTablaMulta(RankingLectoresMultados().size(),
        RankingLectoresMultados(), ModeloTablaMulta.RANKING_MULTA);
        tabla.setModel(modelo);
        super.armarTabla(tabla);
    }
}
