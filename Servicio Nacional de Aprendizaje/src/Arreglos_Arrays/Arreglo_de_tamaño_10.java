package Arreglos_Arrays;

import javax.swing.JOptionPane;

/**
 * Arreglo de tamaño 10 que solicita al usuario ingresar numeros. Luego muestara
 * Todos los numeros ingresados. Luego muestra los numeros almaceados en
 * pociciones pares. Por ultimo los numeros impares contenidos.
 *
 * @author Familia Llanten.
 */
public class Arreglo_de_tamaño_10 {

    public static void main(String[] args) {

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese los numeros"));
            System.out.println(numeros[i]);
        }
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                System.out.println("La pocion de los numeros pares es: " + numeros[i]);
            }
        }
    }
}
