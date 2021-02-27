/*
17. En un almacén de llantas se ha establecido una promoción de 
las llantas marca “Ponchadas”, dicha promoción consiste en lo siguiente:
Sí se compran menos de 5 llantas el precio es de $30.000 cada 
una, de $25.000 sí se compran de 5 a 10 y de $20.000 sí se 
compran más de 10 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _17_AlmacenLlantas {

    public static void main(String[] args) {
        int llantas = 0;
        int valorLlanta = 0;
        String marcaLlanta = "";

        llantas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de llantas que va a llevar"));
        marcaLlanta = JOptionPane.showInputDialog("Ingrese la marca de la llanta");
        marcaLlanta = marcaLlanta.toLowerCase();

        if ("ponchadas".equals(marcaLlanta) && llantas > 0 && llantas < 5)
        {
            valorLlanta = 30000;
        } else if ("ponchadas".equals(marcaLlanta) && llantas > 4 && llantas <= 10)
        {
            valorLlanta = 25000;
        } else if ("ponchadas".equals(marcaLlanta) && llantas > 10)
        {
            valorLlanta = 20000;
        } else
        {
            valorLlanta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de las llantas"));
        }
        JOptionPane.showMessageDialog(null, "EL valor de la llanta es de: $" + (valorLlanta * llantas));
    }
}
