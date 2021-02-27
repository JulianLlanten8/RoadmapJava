/*
Construir una función que reciba un entero y le calcule su factorial sabiendo que el factorial de un número 
es el resultado de multiplicar sucesivamente todos los enteros comprendidos entre 1 y el número dado. 
El factorial de 0 es 1. No están definidos los factoriales de números negativos.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _9_FactorialNumero {

    public static int factorial(int numero) {
        int factor = numero;
        if (numero > -1) {
            for (int i = numero - 1; i > 0; i--) {
                factor = factor * i; //ej: 5*4,20*3,60*2,120*1=120
                JOptionPane.showMessageDialog(null, factor);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos pero, el numero debe ser positivo");
        }
        return factor;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero \n para saber el factorial"));
        JOptionPane.showMessageDialog(null, "El factorial del numero " + numero + " es: " + factorial(numero));
    }
}
