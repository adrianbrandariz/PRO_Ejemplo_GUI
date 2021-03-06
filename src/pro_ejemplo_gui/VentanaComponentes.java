package pro_ejemplo_gui;

import javax.swing.*;

/**
 *
 * @author abrandarizdominguez
 */
public class VentanaComponentes {

    JFrame marco;
    JPanel panel;
    JLabel etUsuario, etPass;
    JButton boton1, blimpiar;
    JTextField jtUsuario;
    JPasswordField jpPass;

    public VentanaComponentes() {
        marco = new JFrame(" ventana componentes");
        panel = new JPanel();
        etUsuario = new JLabel("Usuario");
        etPass = new JLabel("Contraseña");
        boton1 = new JButton("Añadir");
        blimpiar = new JButton("Limpiar");
        jpPass = new JPasswordField(4);
        jtUsuario = new JTextField(10);

        marco.setSize(600, 600);
        panel.add(etUsuario);
        panel.add(jtUsuario);
        panel.add(etPass);
        panel.add(jpPass);
        panel.add(boton1);
        panel.add(blimpiar);
        marco.add(panel);

        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        marco.pack();
    }
}
