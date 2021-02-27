/*
1. Leer 20 números e imprimir cuantos son positivos, cuantos 
negativos y cuantos neutros.
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _1_20Numeros_p_n {

    public static void main(String[] args) {
        int numero = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorNeutros = 0;
        int veces = 0;

        while (veces < 5)
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
            if (numero > 0)
            {
                contadorPositivos++;
                System.out.println(contadorPositivos);
            }
            if (numero < 0)
            {
                contadorNegativos++;
            }
            if (numero == 0)
            {
                contadorNeutros++;
            }
            veces++;
        }
        JOptionPane.showMessageDialog(null, ("los numeros positivos son: " + contadorPositivos + "\n"
                + "los numeros negativos son: " + contadorNegativos + "\n" + "los numeros neutros son: " +  contadorNeutros + "\n"));
    }
}
