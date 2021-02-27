/*
Construir una funcion 5*5 y retorne el valor de su moda . 
La moda de un conjunto de datos es el dato que mas se repite
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _49_Matriz_Valor_Moda {

    public static String moda(int matrix[][]) {
        int muestra = 0;
        int repite = 0;
        int valorQueMasRepite = 0;
        String modaa = "";

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores de la matriz"));
            }
        }
        muestra = matrix[0][0];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                if (matrix[i][j] == muestra)
                {
                    repite++;
                    if (repite>valorQueMasRepite)
                    {
                        modaa="";
                        valorQueMasRepite=repite;
                         modaa += "El valor con mayor frecuencia o moda en los datos, es: "+matrix[i][j];
                    }
                } 
                else{
                    modaa="No existe moda en el conjunto de datos";
                }
                muestra=matrix[i][j];
            }
        }
        return modaa;
    }
    public static void main(String[] args) {
        int vector[][]=new int[3][3];
        JOptionPane.showMessageDialog(null,moda(vector));
    }
}
