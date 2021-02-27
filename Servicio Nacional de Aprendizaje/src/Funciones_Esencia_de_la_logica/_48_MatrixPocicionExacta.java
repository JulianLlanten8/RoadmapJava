/*
48. Construir una función que reciba como parámetro una matriz 4x4 entera y 
retorne la posición exacta en donde se encuentre almacenado el mayor número primo.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class _48_MatrixPocicionExacta {

    public static String PocicionExactaPrimo(int matrix[][]) {
        String pocicion = "";
        int divisible = 0;
        int primo = 0;

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los numeros ala matrix"));
            }
        }

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                int numero = matrix[i][j];
                for (int k = 1; k <= numero; k++)
                {
                    if (numero % k == 0)
                    {
                        divisible++;
                    }
                }
                if (divisible == 2)
                {
                    if (primo < matrix[i][j])
                    {
                        primo = matrix[i][j];
                        JOptionPane.showMessageDialog(null, primo);
                        pocicion = "";//limpia lo escrito anteriormente
                        pocicion += "La pocion exacta del # primo mayor es:\n fila " + i + " columna" + j;
                    }
                }
                divisible = 0;
            }
        }
        return pocicion;
    }

    public static void main(String[] args) {
        int vector[][] = new int[3][3];
        JOptionPane.showMessageDialog(null, PocicionExactaPrimo(vector));
    }
}
