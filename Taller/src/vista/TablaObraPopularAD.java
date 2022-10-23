package vista;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import modelo.Biblioteca;
import modelo.ModeloTablaObraPopular;
import modelo.Obra;
import modelo.Obras;
import modelo.RenderTabla;

public class TablaObraPopularAD extends JFrame {

    private JTable tabla;
    private String valor;
    // private List<Obra> obras;

    public TablaObraPopularAD(String valor) {

        tabla = new JTable();
        valor = this.valor;
        add(new JScrollPane(tabla));

        /* Ventana */
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(950, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        armarTabla();

    }

    
    public List<Obra> masSolicitadas() {
          List<Obra> obras = new ArrayList<Obra>();
          if(valor.equals("AD")){
              Obras.ordenarLista1();
              for(int i = 0; i < 2; i++){
                if(Biblioteca.obras().get(i).getSolicitadasAlumnosDocentes() > 0){
                    obras.add(Biblioteca.obras().get(i));
                }
             }
          }else {
              Obras.ordenarLista2();
              for(int i = 0; i < 2; i++){
                if(Biblioteca.obras().get(i).getSolicitadasPublicoGeneral() > 0){
                    obras.add(Biblioteca.obras().get(i));
                }
             }
          }
          return obras;
    }

    public void armarTabla() {
        ModeloTablaObraPopular modelo = new ModeloTablaObraPopular(masSolicitadas().size(), masSolicitadas());
        tabla.setDefaultRenderer(Object.class, new RenderTabla());
        tabla.setModel(modelo);
        tabla.setRowHeight(30);
        validate();
        repaint();
    }

}
