package vista;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.*;
import java.awt.*;

public class Login extends JFrame implements ActionListener {
    private final String USER = "admin";
    private final String PASS = "123456";
    private JTextField user;
    private JPasswordField pass;
    private JButton confirm;
    private JLabel icon;
    private JLabel usuario;
    private JLabel contra;
    private Icon i;
    private JPanel panel1;
    private JPanel panel2;

    public Login() {
        Container c = getContentPane();
        user = new JTextField(18);
        pass = new JPasswordField(18);
        usuario = new JLabel();
        usuario.setText("Usuario: ");
        contra = new JLabel();
        contra.setText("Contraseña: ");
        confirm = new JButton("Confirmar");
        panel1 = new JPanel();
        panel2 = new JPanel();
        

        ImageIcon image = new ImageIcon("img/icon.png");
       
        icon = new JLabel();
        icon.setSize(120, 120);
        i = new ImageIcon(image.getImage().getScaledInstance(icon.getWidth(), icon.getHeight(), DO_NOTHING_ON_CLOSE));
        icon.setIcon(i);
        panel1.add(icon);
        panel2.add(usuario);
        panel2.add(user);
        panel2.add(contra);
        panel2.add(pass);
        panel2.add(confirm);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(250, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        
        c.setLayout(new GridLayout(2,1));
        c.add(panel1);
        c.add(panel2);

        confirm.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String strPass = String.valueOf(pass.getPassword());

        if (user.getText().equals(USER) && strPass.equals(PASS)) {
            new Accion().setVisible(true);
            this.dispose();
        } else
            JOptionPane.showMessageDialog(null,
                    "Datos inválidos", "Error message",
                    JOptionPane.ERROR_MESSAGE);

    }
}
