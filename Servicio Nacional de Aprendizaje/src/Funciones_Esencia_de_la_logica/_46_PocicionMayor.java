package Funciones_Esencia_de_la_logica;


import javax.swing.JOptionPane;

/*
46. Construir una función que reciba como parámetro una matriz 4x4 entera y retorne 
el número de la fila en donde se encuentre por primera vez el número mayor de la matriz.
 */
/**
 *
 * @author Familia Llanten
 */
public class _46_PocicionMayor {

    public static int PocicionMayor(int matrix[][]) {
        int pocicion = 0;
        int mayor = 0;

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
                if (mayor < matrix[i][j])
                {
                    mayor = matrix[i][j];
                    pocicion = i;
                }
                JOptionPane.showMessageDialog(null, "pocicion: " + pocicion);
            }
        }
        return pocicion;
    }

    public static void main(String[] args) {
        int vector[][] = new int[4][4];
        JOptionPane.showMessageDialog(null, "El numero mayor esta en la fila: " + PocicionMayor(vector));
    }
}
