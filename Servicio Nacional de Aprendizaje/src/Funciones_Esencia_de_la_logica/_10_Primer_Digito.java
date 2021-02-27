/*
10. Construir una función que reciba como parámetro un entero y retorne el primer dígito de este entero.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _10_Primer_Digito {

    public static int digitos(int numero) {
        //Mientras que numero sea mayor a 10 tendra 2 digitos
        while (numero > 10) {
            /**
             * Divido el numero hasta que me de solo un digito
             */
            numero = numero / 10;
            JOptionPane.showMessageDialog(null, numero); //muestro el proceso?
        }
        /**
         * Finaliza cuando numero sea menor a 10
         */
        return numero;
    }

    public static void main(String[] args) {
        int nume = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
        JOptionPane.showMessageDialog(null, "El primer digito es: " + digitos(nume));
    }
}
