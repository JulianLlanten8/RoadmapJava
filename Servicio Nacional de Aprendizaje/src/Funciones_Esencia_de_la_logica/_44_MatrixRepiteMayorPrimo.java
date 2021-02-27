package Funciones_Esencia_de_la_logica;


import javax.swing.JOptionPane;

/*
44. Construir una función que reciba como parámetro una matriz 3x4 entera y 
retorne la cantidad de veces que se repite el mayor número primo de la matriz.
 */
/**
 *
 * @author Familia Llanten
 */
public class _44_MatrixRepiteMayorPrimo {

    public static int PrimosMayor(int matrix[][]) {
        int repite = 0;
        int mayor = 0;
        int divisible = 0;

        //escribo en la matrix los valores
        for (int[] matrix1 : matrix)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                matrix1[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores del arreglo"));
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
                    if (mayor < matrix[i][j])
                    {
                        mayor = matrix[i][j];
                    }
                }
                divisible = 0;//reinicio divisor
            }
        }
        for (int j = 0; j < matrix.length; j++)
        {
            for (int k = 0; k < matrix[0].length; k++)
            {
                if (mayor == matrix[j][j])
                {
                    JOptionPane.showMessageDialog(null, "numeros " + matrix[j][k]);
                    repite++;
                }
            }
        }
        return repite;
    }

    public static void main(String[] args) {
        int vector[][] = new int[4][4];
        JOptionPane.showMessageDialog(null, "El numero primo mayor se repite: " + PrimosMayor(vector));
    }
}
