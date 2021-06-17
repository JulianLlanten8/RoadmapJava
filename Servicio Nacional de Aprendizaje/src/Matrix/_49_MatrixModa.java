package Matrix;

/*
49. Construir una función que reciba una matriz 5x5 y retorne el valor de su moda. 
La moda de un conjunto de datos es el dato que mas se repite.
 */
import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _49_MatrixModa {

    public static int modaMatrix(int matrix[][]) {

        int moda = 0;
        int muestra = 0;
        int maximoNumRepeticiones = 0;

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los datos ala matrix"));
            }

        }
        muestra = matrix[0][0];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                int numRepeticiones = 0;
                for (int k = 0; k < matrix[0].length; k++)
                {
                    for (int l = 0; l < matrix.length; l++)
                    {
                        if (matrix[k][l] == muestra)
                        {
                            if (numRepeticiones > maximoNumRepeticiones)
                            {
                                moda = matrix[k][l];
                                maximoNumRepeticiones = numRepeticiones;
                            }
                        }
                    }
                }
            }
        }
        return moda;
    }

    public static void main(String[] args) {
        int vector[][] = new int[2][3];
        JOptionPane.showMessageDialog(null, "la moda de la matrix es: " + modaMatrix(vector));
    }
}
