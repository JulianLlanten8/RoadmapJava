package Funciones_Esencia_de_la_logica;


import javax.swing.JOptionPane;

/*
45. Construir una función que reciba como parámetros una matriz 4x4 entera y un valor entero y retorne 
la cantidad de veces que se repite dicho valor en la matriz.
 */
/**
 *
 * @author Familia Llanten
 */
public class _45_RepiteNumeroEnMatrix {

    public static int PrimosMayor(int matrix[][], int valor) 
    {
        int repite = 0;

        //escribo en la matrix los valores
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                matrix1[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores del arreglo"));
            }
        }
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar"));

        for (int j = 0; j < matrix.length; j++) 
        {
            for (int k = 0; k < matrix[0].length; k++) 
            {
                if (valor == matrix[j][j]) 
                {
                    JOptionPane.showMessageDialog(null, "numeros " + matrix[j][k]);
                    repite++;
                }
            }
        }
        return repite;
    }

    public static void main(String[] args) 
    {
        int vector[][] = new int[3][3];
        JOptionPane.showMessageDialog(null, "El valor ingresado se repite: " + PrimosMayor(vector, 0));
    }
}
