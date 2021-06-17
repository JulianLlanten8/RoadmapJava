package POOTriangulo;
/*
 * rectagulo Perimetro y Area.
 */

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class PerímetroArea_Triangulo {
    public static void main(String[] args) {

        Triangulo tri = new Triangulo();

        JOptionPane.showMessageDialog(null, "El perimetro es " + tri.perimetro(0, 0));
        JOptionPane.showMessageDialog(null, "El area es " + tri.area(0, 0));
    }
}
