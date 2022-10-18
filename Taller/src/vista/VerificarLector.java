package vista;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Biblioteca;
import modelo.Lector;

import java.awt.Container;
import java.awt.event.*;
import java.util.List;
import java.awt.*;

public class VerificarLector extends JFrame implements ActionListener {

    JLabel tituloDni;
    JTextField dni;
    JButton confirmar;

    public VerificarLector(){

        /* Ventana */
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,120);
        setResizable(false);
        setLocationRelativeTo(null);
        
        tituloDni = new JLabel("DNI lector: ");
        dni = new JTextField(20);
        confirmar = new JButton("Confirmar");

        /* Contenedor */
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(tituloDni);
        c.add(dni);
        c.add(confirmar);

        /* Evento */
        confirmar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(existeLector(Biblioteca.lectores(), dni.getText())){
            new Accion().setVisible(true);
            setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,
                    "El usuario no existe", "Error message",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean existeLector(List<Lector> lectores, String dni) {
         for (Lector lector : lectores) {
            if(lector.getDocumento().equals(dni)){
                return true;
            }
         }
         return false;
    }
    
}
