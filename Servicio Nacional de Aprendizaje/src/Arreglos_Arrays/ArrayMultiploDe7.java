/*
Desarrolle un programa que recorra un arreglo de enteros, evalúe si sus datos son múltiplos de 7 y los muestre en pantalla.
 */
package Arreglos_Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class ArrayMultiploDe7 {

    public static void main(String[] args) {
        int numeros[] = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese los numeros"));
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 7 == 0) {
                System.out.println(numeros[i]+" Sus datos son múltiplos de 7");
            } else {
                System.out.println(numeros[i]+" Sus datos no son múltiplos de 7");
            }
        }
    }
}
