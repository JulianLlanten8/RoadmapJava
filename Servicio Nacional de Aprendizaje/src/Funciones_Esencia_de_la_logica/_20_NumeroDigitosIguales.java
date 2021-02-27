/*
20. Construir una función que reciba como parámetro un entero y retorne 1 si en dicho valor todos
los dígitos son iguales. Deberá retornar 0 si no es así.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _20_NumeroDigitosIguales {

    public static int DigitosEnNumero(int numero) {
        int todosiguales = 0;
        int digito = numero % 10;
        while (numero != 0) {
            if (numero == digito) {
                todosiguales = 1;
            } else {
                todosiguales = 0;
            }
            JOptionPane.showMessageDialog(null, numero);
            numero /= 10;
        }

        return todosiguales;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        JOptionPane.showMessageDialog(null, DigitosEnNumero(numero));
    }
}
