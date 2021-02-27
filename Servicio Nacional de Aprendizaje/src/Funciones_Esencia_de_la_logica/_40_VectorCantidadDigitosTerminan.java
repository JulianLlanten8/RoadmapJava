package Funciones_Esencia_de_la_logica;


import javax.swing.JOptionPane;

/*
40. Construir una función que reciba como parámetro un vector de 10 posiciones enteras y un dígito y 
que retorne la cantidad de números del vector que terminan en dicho dígito.
 */
/**
 *
 * @author Familia Llanten
 */
public class _40_VectorCantidadDigitosTerminan {

    public static int catidadTerminan(int vector[], int digito) {
        int catidad = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los numeros al vector"));
        }
        digito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el digito a buscar en el vector"));
        for (int i = 0; i < vector.length; i++) {
            int j = vector[i];
            if (j % 10 == digito) {
                catidad++;
            }
        }

        return catidad;
    }

    public static void main(String[] args) {
        int vector[] = new int[3];
        JOptionPane.showMessageDialog(null, catidadTerminan(vector, 0));
    }
}
