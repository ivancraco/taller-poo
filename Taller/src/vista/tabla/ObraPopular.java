package vista.tabla;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import modelo.Biblioteca;
import modelo.ModeloTablaObraPopular;
import modelo.Obra;
import modelo.Obras;
import modelo.RenderizarTabla;

public class ObraPopular extends VentanaTabla {

    ModeloTablaObraPopular modelo;
    private JTable tabla;
    private String valor;
    // private List<Obra> obras;

    public ObraPopular(String valor) {
        super.crearVentana();

        tabla = new JTable();
        this.valor = valor;
        add(new JScrollPane(tabla));

        armarTabla();

    }

    
    public List<Obra> masSolicitadas() {
          List<Obra> obras = new ArrayList<Obra>();
          if(valor.equals("AD")){
              Obras.ordenarLista1();
              for(int i = 0; i < 5; i++){
                if(Biblioteca.obras().get(i).getSolicitadasAlumnosDocentes() > 0){
                    obras.add(Biblioteca.obras().get(i));
                }
             }
          }else {
              Obras.ordenarLista2();
              for(int i = 0; i < 5; i++){
                if(Biblioteca.obras().get(i).getSolicitadasPublicoGeneral() > 0){
                    obras.add(Biblioteca.obras().get(i));
                }
             }
          }
          return obras;
    }

    public void armarTabla() {
        modelo = new ModeloTablaObraPopular(masSolicitadas().size(), masSolicitadas());
        tabla.setModel(modelo);
        super.armarTabla(tabla);
    }

}
