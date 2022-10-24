package vista;

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
import modelo.ModeloTablaPeriodoMulta;
import modelo.RenderTabla;

import java.awt.*;

public class RankingMulta extends JFrame {
    private JTable tabla;
    private JPanel panel;
    private JLabel titulo;

    public RankingMulta() {
        tabla = new JTable();
        titulo = new JLabel("pepe");
        panel = new JPanel();
        panel.add(titulo);

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(1,1));
        // add(panel, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);

        armarTabla();

    }

    public List<Lector> RankingLectoresMultados(){
        List<Lector> lectores = new ArrayList<Lector>();

        Lectores.ordenar();
        for (int i = 0; i < 5; i++) {
            if(Biblioteca.lectores().get(i).getMulta() != null){
                lectores.add(Biblioteca.lectores().get(i));
            }
        }

        return lectores;
    }

    public void armarTabla(){
        ModeloTablaPeriodoMulta modelo = new ModeloTablaPeriodoMulta(RankingLectoresMultados().size(),
        RankingLectoresMultados(), ModeloTablaPeriodoMulta.RANKING_MULTA);
        tabla.setDefaultRenderer(Object.class, new RenderTabla());
        tabla.setModel(modelo);
        tabla.setRowHeight(30);
        validate();
        repaint();
    }
}
