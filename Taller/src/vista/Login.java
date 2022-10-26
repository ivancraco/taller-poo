package vista;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Login extends JFrame implements ActionListener {

    private final String USER = "admin";
    private final String PASS = "123456";

    private javax.swing.JPanel BackGround;
    private javax.swing.JPanel botonIngreso;
    private javax.swing.JLabel botonIngresoTxt;
    private javax.swing.JLabel contrasenia;
    private javax.swing.JPasswordField ingresoContrasenia;
    private javax.swing.JTextField ingresoUsuario;
    private javax.swing.JLabel inicioSesion;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JSeparator separadorContrasenia;
    private javax.swing.JSeparator separadorUsuario;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel jLabelLogoUNER;

    public Login() {

        super("Inicio de Sesión");
        initComponents();
    }

    /**
     * 
     */
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        inicioSesion = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        ingresoUsuario = new javax.swing.JTextField();
        separadorUsuario = new javax.swing.JSeparator();
        contrasenia = new javax.swing.JLabel();
        ingresoContrasenia = new javax.swing.JPasswordField();
        separadorContrasenia = new javax.swing.JSeparator();
        botonIngreso = new javax.swing.JPanel();
        botonIngresoTxt = new javax.swing.JLabel();
        jLabelBG = new javax.swing.JLabel();
        jLabelLogoUNER = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        setSize(950, 400);
        // setSize(950, 500);

        BackGround.setBackground(new Color(255, 255, 255));
        BackGround.setMinimumSize(new java.awt.Dimension(950, 500));
        BackGround.setLayout(null);

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("w1.png")));
        jLabelBG.setBounds(630, 0, 320, 500);
        BackGround.add(jLabelBG);

        jLabelLogoUNER.setIcon(new javax.swing.ImageIcon(getClass().getResource("w2.png")));
        jLabelLogoUNER.setBounds(0, 430, 120, 64);
        BackGround.add(jLabelLogoUNER);

        inicioSesion.setBackground(new java.awt.Color(255, 255, 255));
        inicioSesion.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        inicioSesion.setForeground(new java.awt.Color(0, 0, 0));
        inicioSesion.setText("INICIAR SESIÓN");
        inicioSesion.setToolTipText("");
        inicioSesion.setBounds(20, 50, 250, 40);
        BackGround.add(inicioSesion);

        usuario.setBackground(new java.awt.Color(255, 255, 255));
        usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setText("USUARIO");
        usuario.setBounds(20, 130, 100, 30);
        BackGround.add(usuario);

        ingresoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        ingresoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        ingresoUsuario.setText("Ingrese su Usuario");
        ingresoUsuario.setBorder(null);
        ingresoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingresoUsuarioMousePressed(evt);
            }

        });
        ingresoUsuario.setBounds(20, 170, 420, 20);
        BackGround.add(ingresoUsuario);

        separadorUsuario.setForeground(Color.BLACK);
        separadorUsuario.setBounds(20, 190, 470, 2);
        BackGround.add(separadorUsuario);

        contrasenia.setBackground(new java.awt.Color(255, 255, 255));
        contrasenia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        contrasenia.setForeground(new java.awt.Color(0, 0, 0));
        contrasenia.setText("CONTRASEÑA");
        contrasenia.setBounds(20, 220, 130, 30);
        BackGround.add(contrasenia);

        ingresoContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        ingresoContrasenia.setForeground(new java.awt.Color(204, 204, 204));
        ingresoContrasenia.setText("********");
        ingresoContrasenia.setBorder(null);
        ingresoUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ingresoUsuarioFocusGained(evt);
            }
        });
        ingresoContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingresoContraseniaMousePressed(evt);
            }
        });
        ingresoContrasenia.setBounds(20, 260, 420, 20);
        BackGround.add(ingresoContrasenia);

        separadorContrasenia.setForeground(Color.BLACK);
        separadorContrasenia.setBounds(20, 280, 470, 2);
        BackGround.add(separadorContrasenia);

        botonIngreso.setBackground(new java.awt.Color(114, 201, 229));

        botonIngresoTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonIngresoTxt.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonIngresoTxt.setText("INGRESAR");
        botonIngresoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngresoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIngresoTxtMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonIngresoTxtMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonIngresoTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout botonIngresoLayout = new javax.swing.GroupLayout(botonIngreso);
        botonIngreso.setLayout(botonIngresoLayout);
        botonIngresoLayout.setHorizontalGroup(
                botonIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonIngresoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE));
        botonIngresoLayout.setVerticalGroup(
                botonIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonIngresoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE));

        botonIngreso.setBounds(20, 320, 150, 40);
        BackGround.add(botonIngreso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();

        add(BackGround);

    }

    protected void ingresoUsuarioFocusGained(FocusEvent evt) {
        if (ingresoUsuario.getText().equals("Ingrese su Usuario")) {
            ingresoUsuario.setText("");
            ingresoUsuario.setForeground(Color.black);
        }
    }

    protected void ingresoUsuarioMousePressed(MouseEvent evt) {
        if (ingresoUsuario.getText().equals("Ingrese su Usuario")) {
            ingresoUsuario.setText("");
            ingresoUsuario.setForeground(Color.black);
        }
        if (String.valueOf(ingresoContrasenia.getPassword()).isEmpty()) {
            ingresoContrasenia.setText("********");
            ingresoContrasenia.setForeground(Color.gray);
        }
    }

    protected void ingresoContraseniaMousePressed(MouseEvent evt) {
        if (ingresoUsuario.getText().isEmpty()) {
            ingresoUsuario.setText("Ingrese su Usuario");
            ingresoUsuario.setForeground(Color.gray);
        }
        if (String.valueOf(ingresoContrasenia.getPassword()).equals("********")) {
            ingresoContrasenia.setText("");
            ingresoContrasenia.setForeground(Color.black);
        }
    }

    protected void botonIngresoTxtMouseExited(MouseEvent evt) {
        botonIngreso.setBackground(new Color(114, 201, 229));
    }

    protected void botonIngresoTxtMouseEntered(MouseEvent evt) {
        botonIngreso.setBackground(new Color(13, 124, 200));
    }

    protected void botonIngresoTxtMouseClicked(MouseEvent evt) {

        String strPass = String.valueOf(ingresoContrasenia.getPassword());

        if (ingresoUsuario.getText().equals(USER) && strPass.equals(PASS)) {
            new Accion().setVisible(true);
            // JOptionPane.showMessageDialog(this,
            // "Usuario: " + ingresoUsuario.getText()+ " " +
            // "Contrasenia: " + String.valueOf(ingresoContrasenia.getPassword()));
            this.dispose();
        } else
            JOptionPane.showMessageDialog(null,
                    "Datos inválidos", "Error message",
                    JOptionPane.ERROR_MESSAGE);

        ingresoUsuario.setText("Ingrese su Usuario");
        ingresoUsuario.setForeground(Color.gray);

        ingresoContrasenia.setText("********");
        ingresoContrasenia.setForeground(Color.gray);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}
