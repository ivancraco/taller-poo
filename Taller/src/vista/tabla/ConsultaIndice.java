package vista.tabla;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import modelo.Biblioteca;
import modelo.BotonAdapter;
import modelo.TablaRegistro;
import modelo.Obra;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clas que perimte consultar obras por indice y muestra
 * la informacion en un JTable.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class ConsultaIndice extends VentanaTabla implements ActionListener {

    private TablaRegistro modelo;
    private List<Obra> areas;
    private JLabel $indice;
    private JTextField indice;
    private JButton buscar;
    private JPanel panel;
    private JTable tabla;
    private BotonAdapter listener;

    /**
     * Constructor sin Parametros.
     * Crea la venta e iniciliza los atributos de la clase.
     */
    public ConsultaIndice() {
        super.crearVentana();

        $indice = new JLabel("Buscar por Indice: ");
        indice = new JTextField(15);
        buscar = new JButton("Buscar");
        panel = new JPanel();
        panel.add($indice);
        panel.add(indice);
        panel.add(buscar);
        tabla = new JTable();
        listener = new BotonAdapter(tabla);
        tabla.addMouseListener(listener);
        buscar.addActionListener(this);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!indice.getText().matches("[a-zA-Z0-9]{3,}")) return;
        armarTabla();
    }

    /**
     * Retorna un listado de obras que coinciden con el indice 
     * ingresado en el JTextField.
     * 
     * @param indice String texto ingresado en un JTextField
     * @return listado de obras
     */
    private List<Obra> buscarObra(String indice) {
        List<Obra> obras = new ArrayList<Obra>();
        for (int i = 0; i < Biblioteca.obras().size(); i++) {
            for (int j = 0; j < Biblioteca.obras().get(i).getIndice().size(); j++) {
                if (Biblioteca.obras().get(i).getIndice().get(j)
                        .toLowerCase().contains(indice.toLowerCase())) {
                    obras.add(Biblioteca.obras().get(i));
                }
            }
        }

        return obras;
    }

    /**
     * Busca las obras y arma la tabla con la informacion que encuentra
     */
    private void armarTabla() {
        areas = buscarObra(indice.getText());
        modelo = new TablaRegistro(areas.size(), areas, this);
        tabla.setModel(modelo);
        listener = new BotonAdapter(tabla);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(100);
        super.armarTabla(tabla);
    }

}