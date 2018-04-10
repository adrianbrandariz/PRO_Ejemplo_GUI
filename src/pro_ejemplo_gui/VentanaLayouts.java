package pro_ejemplo_gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Hansen
 */
public class VentanaLayouts {

    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;

    public VentanaLayouts() {
        marco = new JFrame("Layout");
        panel = new JPanel();
        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        boton3 = new JButton("Boton 3");
        boton4 = new JButton("Boton 4");
        boton5 = new JButton("Boton 5");
    }

    public void disFlowLayout() {
        // Se le dan las características a los componentes:
        boton1.setBackground(Color.YELLOW);
        boton2.setBackground(Color.BLUE);
        boton3.setBackground(Color.ORANGE);
        boton4.setBackground(Color.GREEN);
        marco.setSize(600, 300);
        // Se aplica el layout:
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        // Se añaden los componentes:
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        // Se hace visible:
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    public void disBoxLayout() {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // Se añaden los componentes:
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        // Se ajusta el marco con sus componentes:
        marco.pack();
        // Se hace visible:
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    public void disBorderLayout() {
        panel.setLayout(new BorderLayout());
        // Se añaden los componentes:
        panel.add(boton1, BorderLayout.NORTH);
        panel.add(boton2, BorderLayout.SOUTH);
        panel.add(boton3, BorderLayout.EAST);
        panel.add(boton4, BorderLayout.WEST);
        panel.add(boton5, BorderLayout.CENTER);
        marco.add(panel);
        // Se ajusta el marco con sus componentes:
        marco.pack();
        // Se hace visible:
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    public void disGridLayout() {
        panel.setLayout(new GridLayout(2, 3));
        // Se añaden los componentes:
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        // Se ajusta el marco con sus componentes:
        marco.pack();
        // Se hace visible:
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
