/*
15 Una frutería ofrece peras con descuento según la siguiente tabla:
 de 0 – 2 peras 0%
 de 3 – 5 peras 10%
 de 6 – 10 peras15%
 de 11 peras en adelante 18%.
Leer los siguientes datos: Número de peras compradas y Valor compra.
Determinar cuánto pagará una persona que compre peras en esa frutería.
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _15_Fruteria {

    public static void main(String[] args) {
        int numeroPeras = 0;
        int valorCompra = 0;
        int descuento = 0;

        numeroPeras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de peras que desea comprar"));
        valorCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de las " + numeroPeras + " peras"));

        if (numeroPeras > 0 && numeroPeras <= 2)
        {
            descuento = valorCompra / 100 * 0;
        } else if (numeroPeras > 2 && numeroPeras <= 5)
        {
            descuento = valorCompra / 100 * 10;
        } else if (numeroPeras > 5 && numeroPeras <= 10)
        {
            descuento = valorCompra / 100 * 15;
        } else if (numeroPeras > 10)
        {
            descuento = valorCompra / 100 * 18;
        }
        JOptionPane.showMessageDialog(null, "El valor de las peras es de: $" + (valorCompra - descuento));
    }
}
