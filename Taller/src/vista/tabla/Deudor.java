package vista.tabla;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import modelo.Biblioteca;
import modelo.Lector;
import modelo.ModeloTablaDeuda;
import modelo.RenderizarTabla;

import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Deudor extends VentanaTabla{

    private ModeloTablaDeuda modelo;
    private JTable tabla;

    public Deudor() {
        super.crearVentana();

        tabla = new JTable();
        
        
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    
        tablaDeuda();

    }

    public List<Lector> deudores() {
        List<Lector> resultado = new ArrayList<Lector>();
       for(int i = 0; i < Biblioteca.lectores().size(); i++) {
           if(Biblioteca.lectores().get(i).getPrestamoLector().size() > 0){
              for(int j = 0; j < Biblioteca.lectores().get(i).getPrestamoLector().size(); i++){
                if(fechaActual().isAfter(Biblioteca.lectores().get(i).getPrestamoLector().get(j).getFechaDevolucion())){
                    resultado.add(Biblioteca.lectores().get(i));
                };
              }
           }
       }
       return resultado;
    }

    public LocalDate fechaActual() {
        String fecha = fechaYHoraActual();
        String str = fecha.substring(0, 10);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaParseada = LocalDate.parse(str, formato);
        return fechaParseada;
    }

    public String fechaYHoraActual() {
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a");
        String nuevoFormato = fechaActual.format(formato);
        return nuevoFormato;
    }

    public void tablaDeuda() {
        modelo = new ModeloTablaDeuda(deudores().size(), deudores(), this.tabla);
        tabla.setModel(modelo);
        super.armarTabla(tabla);
    }
}
