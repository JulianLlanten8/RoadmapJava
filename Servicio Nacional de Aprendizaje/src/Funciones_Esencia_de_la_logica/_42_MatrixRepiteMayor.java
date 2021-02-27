package Funciones_Esencia_de_la_logica;


import javax.swing.JOptionPane;

/*
42. Construir una función que reciba como parámetro una matriz de 3x4 entera y 
retorne la cantidad de veces que se repite el mayor dato de la matriz.
 */
/**
 *
 * @author Familia Llanten
 */
public class _42_MatrixRepiteMayor {

    public static int MatrixMayor(int matrix[][]) {

        int mayor = 0;
        int veces = -1;
        //recorro la matrix para escribirla
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el un numero"));
            }
        }
        //recorro la matrix para busacr el numero mayor
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (mayor < matrix[i][j]) {
                    mayor = matrix[i][j];
                    JOptionPane.showMessageDialog(null, "El mayor " + mayor);
                }
            }
        }
        //recorro la matrix para saber si ahi otro numero igual
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (mayor == matrix[i][j]) {
                    veces++;
                }
            }
        }
        return veces;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][4];
        JOptionPane.showMessageDialog(null, "El numero se repite " + MatrixMayor(matrix) + " veces");
    }
}
