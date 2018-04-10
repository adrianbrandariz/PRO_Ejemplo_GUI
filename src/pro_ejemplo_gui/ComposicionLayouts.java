package pro_ejemplo_gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Hansen
 */
public class ComposicionLayouts {
    JFrame marco;
    JPanel ppanel, panel1, panel2, panel3;
    JLabel etUsuario, etPass;
    JButton boton1, blimpiar;
    JTextField jtUsuario;
    JPasswordField jpPass;

    public ComposicionLayouts() {
        marco = new JFrame("Ejercicio Composición:");
        ppanel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        etUsuario = new JLabel("Usuario:");
        etPass = new JLabel("Contraseña:");
        boton1 = new JButton("Añadir");
        blimpiar = new JButton("Limpiar");
        jpPass = new JPasswordField(4);
        jtUsuario = new JTextField(10);
    }
    
    public void composicion() {
        marco.setSize(600, 300);
        // Se aplica el layout:
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new FlowLayout());
        panel3.setLayout(new FlowLayout());
        // Se añaden los componentes:
        panel1.add(etUsuario);
        panel1.add(jtUsuario);
        panel2.add(etPass);
        panel2.add(jpPass);
        panel3.add(boton1);
        panel3.add(blimpiar);
        ppanel.add(panel1);
        ppanel.add(panel2);
        ppanel.add(panel3);
        marco.add(ppanel);
        marco.pack(); // Se ajusta la ventana
        // Se hace visible:
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
