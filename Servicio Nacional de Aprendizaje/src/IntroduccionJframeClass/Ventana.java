package IntroduccionJframeClass;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JLabel;

/*
Ventana
 */

/**
 * @author Familia Llanten
 */

public class Ventana extends JFrame {

    Ventana() {
        this.setTitle("Default");//Titulo de la ventana
        this.setSize(400, 400);//Tamaño de la ventana
        this.setLocationRelativeTo(this);
        this.setVisible(true);//Visible en pantalla Si
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Al dar click en cerrrar cierra la ventana

        Componentes();
    }

    private void Componentes() {

        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        this.getContentPane().add(panel);

        JLabel etiqueta = new JLabel();
        etiqueta.setForeground(Color.CYAN);
        etiqueta.setText("Soy una Etiqueta de color Cyan");
        etiqueta.setFont(new Font("Monotype Corsiva", 0, 20));//fuente del panel
//        etiqueta.setOpaque(true);
//        etiqueta.setBackground(Color.WHITE); //sirve para cambiar el fondo de la etiqueta
        panel.add(etiqueta);
    }

    public static void main(String[] args) {
        Ventana myventana = new Ventana();//Instancio la clase Frame
        myventana.setTitle("Titulo");
    }
}
