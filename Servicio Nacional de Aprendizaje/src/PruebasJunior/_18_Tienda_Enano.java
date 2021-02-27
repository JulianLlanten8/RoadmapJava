/*
18 Una persona que va de compras a la tienda “Enano, S.A.”, decide llevar un control sobre lo que va comprando, para saber 
la cantidad de dinero que tendrá que pagar al llegar a la caja. 
La tienda tiene una promoción del 20% de descuento sobre aquellos artículos cuya etiqueta sea roja.
Determinar la cantidad de dinero que esta persona deberá pagar.
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _18_Tienda_Enano {

    public static void main(String[] args) {
        int precio = 0;
        int total = 0;
        String colorEtiqueta = "";
        int pregunta = 0;

        while (pregunta != 1)
        {
            colorEtiqueta = JOptionPane.showInputDialog(("Ingrese el color de la etiqueta"));
            colorEtiqueta = colorEtiqueta.toLowerCase();
            precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio ($) del articulo"));
            if (colorEtiqueta == "rojo")
            {
                precio -= ((precio / 100) * 20);
            }
            total += precio;
            pregunta = JOptionPane.showConfirmDialog(null, "desea ingresar otro articulo");
        }
        JOptionPane.showMessageDialog(null, "El valor total a pagar es de $" + total);
    }
}
