/*
2. Leer 15 números negativos y convertirlos a positivos e imprimir 
dichos números.
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _2_convertirEnPositivos {

    public static void main(String[] args) {
        int numero = 0;
        int veces = 0;
        String texto = "";

        while (veces < 15)
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero a convertir"));
            if (numero < 0)
            {
                numero *= -1;
                texto += numero + "\n";
                veces++;
            }
        }
        JOptionPane.showMessageDialog(null, "Los numero convertidos en enteros son:\n" + texto);
    }
}
