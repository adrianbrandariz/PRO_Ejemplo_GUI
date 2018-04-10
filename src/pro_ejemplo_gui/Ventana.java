package pro_ejemplo_gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author abrandarizdominguez
 */
public class Ventana {

    JFrame marco;
    JPanel panel1, panel2;

    public Ventana() {

        //instanciamos
        marco = new JFrame("GUI 1");
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(800, 400);
        panel1 = new JPanel();
        panel2 = new JPanel();
        marco.setLayout(null);
        //damos caracteristicas
        panel1.setBounds(0, 0, 800, 150);
        panel1.setBackground(Color.blue);
        panel2.setBounds(0, 200, 800, 200);
        panel2.setBackground(Color.ORANGE);

        marco.add(panel1);
        marco.add(panel2);

        marco.setLocationRelativeTo(marco);
        //marco.pack()
        marco.setVisible(true);
    }
}
