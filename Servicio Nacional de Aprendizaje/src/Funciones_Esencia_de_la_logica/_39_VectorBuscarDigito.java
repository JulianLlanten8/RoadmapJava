package Funciones_Esencia_de_la_logica;


import javax.swing.JOptionPane;

/*
39. Construir una función que reciba como parámetros un vector de 10 posiciones enteras y un dígito y 
que retorne la cantidad de veces que dicho dígito se encuentra en el vector.
No se olvide que un mismo dígito puede estar varias veces en un solo número.
 */
/**
 *
 * @author Familia Llanten
 */
public class _39_VectorBuscarDigito {

    public static int buscarDigito(int vector[], int digito) {
        int vecesAparece = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los datos al vector"));
        }
        digito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el digito a buscar"));
        for (int i = 0; i < vector.length; i++) {
            int j = vector[i];

            while (j != 0) {

                if (j % 10 == digito) {
                    vecesAparece++;
                }
                j /= 10;
            }
        }

        return vecesAparece;
    }

    public static void main(String[] args) {
        int vector[] = new int[10];
        JOptionPane.showMessageDialog(null, buscarDigito(vector, 0));
    }
}
