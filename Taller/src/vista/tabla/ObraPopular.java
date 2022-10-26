package vista.tabla;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import modelo.Biblioteca;
import modelo.TablaObraPopular;
import modelo.Obra;
import modelo.Obras;

/**
 * Clase que permite mostrar en un JTable las obras mas 
 * solicitadas por alumnos y docentes y publico en general.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class ObraPopular extends VentanaTabla {

    TablaObraPopular modelo;
    private JTable tabla;
    private String accion;

    /**
     * Constructor parametrizado.
     * 
     * @param accion arma una tabla u otra 
     * dependiendo la accion.
     */
    public ObraPopular(String accion) {
        super.crearVentana();

        tabla = new JTable();
        this.accion = accion;
        add(new JScrollPane(tabla));
        armarTabla();

    }


    /**
     * Retorna una lista ordenada de mayor a menor de 
     * las obras mas solicitadas por alumnos y docentes o
     * por publico en general.
     * 
     * @return listado de obras
     */
    public List<Obra> masSolicitadas() {
          List<Obra> obras = new ArrayList<Obra>();
          if(accion.equals("AD")){
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

    /**
     * Arma la tabla con la informacion del listado de obras.
     */
    public void armarTabla() {
        modelo = new TablaObraPopular(masSolicitadas().size(), masSolicitadas());
        tabla.setModel(modelo);
        super.armarTabla(tabla);
    }

}
