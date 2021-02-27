/*
14. Construir una función que reciba como parámetros dos números enteros y retorne el valor del mayor.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class _14_NumeroMayor {

    public static int numeroMayor(int numero1, int numero2) {
        int mayor = 0;

        if (numero1 > numero2) {
            mayor = numero1;
        } else {
            mayor = numero2;
        }
        return mayor;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo numero"));
        JOptionPane.showMessageDialog(null, "El numero mayor es: " + numeroMayor(numero, numero2));
    }
}
