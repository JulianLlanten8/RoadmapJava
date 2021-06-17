/*
 * Ejecutamos la función del triangulo.
 */

package POORectangulo;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class PerímetroArea_Rectangular {
    public static void main(String[] args) {
        
        Rectangulo re = new Rectangulo();
        
        JOptionPane.showMessageDialog(null, "El perimetro es " + re.perimetro(0, 0));
        JOptionPane.showMessageDialog(null, "El area es " + re.area(0, 0));
        
    }
}
