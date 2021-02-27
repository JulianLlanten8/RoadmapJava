package Funciones_Esencia_de_la_logica;


import javax.swing.JOptionPane;

/*
43. Construir una función que reciba como parámetro una matriz 3x4 entera y 
retorne la cantidad de números primos almacenados en la matriz.
 */
/**
 *
 * @author Familia Llanten
 */
public class _43_Matrix3x4Primos {

    public static int CantiadPrimos(int matrix[][]) {
        int cuantos = 0;
        int divisible = 0;

        //escribo en la matrix los valores
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix1[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores del arreglo"));
            }
        }

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                int numero = matrix[i][j];

                for (int k = 1; k <= numero; k++) {
                    if (numero % k == 0) {
                        divisible++;
                    }
                }
                if (divisible == 2) {
                    cuantos++;
                }
                divisible = 0;//reinicio divisor
            }
        }
        return cuantos;
    }

    public static void main(String[] args) {
        int vector[][] = new int[2][2];
        JOptionPane.showMessageDialog(null, "La cantidad de números primos almacenados en la matriz son: " + CantiadPrimos(vector));
    }
}
