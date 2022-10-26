package vista.tabla;

import javax.swing.JFrame;
import javax.swing.JTable;

import modelo.RenderizarBoton;

/**
 * Clase que crea una ventana con valores por defecto para
 * mantener el mismo ancho y alto de las tablas como de la ventana.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 * 
 */
public class VentanaTabla extends JFrame {
    
     public VentanaTabla() {
           
     }

     /**
      * Metodo que pemite crear una ventana del mismo ancho y alto.
      */
     public void crearVentana() {
          setDefaultCloseOperation(DISPOSE_ON_CLOSE);
          setSize(950, 400);
          setResizable(false);
          setLocationRelativeTo(null);
     }

     /**
      * 
      * @param tabla objeto JTable para establecer valores.
      */
     public void armarTabla(JTable tabla) {
          tabla.setDefaultRenderer(Object.class, new RenderizarBoton());
          tabla.setRowHeight(30);
          validate();
          repaint();
     }

}
