/*
15. Construir una función que reciba como parámetros dos números enteros 
y retorne 1 si el primer número es múltiplo del segundo y 0 si no.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _15_NumeroEnterosMultiplos {

    public static int multiplo(int numero1, int numero2) {

        int esMultiplo = 0;
        int n = numero2;
        int resultado = 0;

        for (int i = 1; resultado < numero1; i++) {
            n *= i;
//            JOptionPane.showMessageDialog(null, n); //imprime la operacion
            if (n == numero1) {
                esMultiplo = 1;
            } else {
                esMultiplo = 0;
            }
            resultado = n;
            n = numero2;
        }
        return esMultiplo;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        JOptionPane.showMessageDialog(null, "El numero es multiplo?" + multiplo(numero, numero2));

    }
}
