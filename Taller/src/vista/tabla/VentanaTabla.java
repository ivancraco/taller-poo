package vista.tabla;

import javax.swing.JFrame;
import javax.swing.JTable;

import modelo.RenderizarTabla;

public class VentanaTabla extends JFrame {
    
     public VentanaTabla() {
           
     }

     public void crearVentana() {
          setDefaultCloseOperation(DISPOSE_ON_CLOSE);
          setSize(950, 400);
          setResizable(false);
          setLocationRelativeTo(null);
     }

     public void armarTabla(JTable tabla) {
          tabla.setDefaultRenderer(Object.class, new RenderizarTabla());
          tabla.setRowHeight(30);
          validate();
          repaint();
     }

}
