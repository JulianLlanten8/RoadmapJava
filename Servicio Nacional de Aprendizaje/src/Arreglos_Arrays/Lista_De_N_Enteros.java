/*
Escriba un programa en Java que lea una lista de n enteros, calcule el promedio de los datos ingresados, el mayor y el menor de ellos.
 */
package Arreglos_Arrays;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class Lista_De_N_Enteros {

    public static void main(String[] args) {
        int[] n = new int[5];
        int promedio = 0;
        int numeromayor;
        int numeromenor;
        
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero"));
            promedio += n[i];
        }
        System.out.println("El promedio es:" + (promedio / 5));

        numeromayor = n[0];//agarro el numero en la pocicion 0
        numeromenor = n[0];//agarro el numero en la pocicion 0

        for (int i = 1; i < n.length; i++) {
            if (n[i] > numeromayor) { // lo comparo con el arreglo y miro cual de todos es el mayor
                numeromayor = n[i]; //guardo en numero mayor del arreglo

            }
            if (n[i] < numeromenor) { // lo comparo con el arreglo y miro cual de todos es el mayor
                numeromenor = n[i]; //guardo en numero mayor del arreglo

            }
        }
        System.out.println("El numero mayor ingresado es: " + numeromayor);
        System.out.println("El numero menor ingresado es: " + numeromenor);
    }
}
