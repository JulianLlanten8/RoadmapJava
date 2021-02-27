/*
29. Construir una función que reciba como parámetro un vector de 10 posiciones enteras
y retorne la cantidad de números que pertenecen a los 30 primeros elementos de la serie de Fibonacci.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class _29_VectorCuantosPertenecenFibonacci {

    public static int cuantosEnfibonacci(int vector[]) {
        int cuantos = 0;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int i = 0;
        int contador = 30;

        for (int j = 0; j < vector.length; j++) {
            vector[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        }
        for (i = 2; i < contador; ++i)//ciclo hasta que llegue a contador
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            for (int j = 0; j < vector.length; j++) {
                if (vector[j] == n3) {
                    cuantos++;
                }
            }
        }
        return cuantos;
    }

    public static void main(String[] args) {
        int vector[] = new int[10];
        JOptionPane.showMessageDialog(null, cuantosEnfibonacci(vector));
    }
}
