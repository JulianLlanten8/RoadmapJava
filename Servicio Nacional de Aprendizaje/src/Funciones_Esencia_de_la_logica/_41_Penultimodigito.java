package Funciones_Esencia_de_la_logica;


import javax.swing.JOptionPane;

/*
41. Construir una función que reciba como parámetro un vector de 10 posiciones enteras y
un dígito y que retorne la cantidad de números del vector en donde dicho dígito está de penúltimo.
 */
/**
 *
 * @author Familia Llanten
 */
public class _41_Penultimodigito {

    public static int cuantasvecesUltimoDigito(int vector[], int digito) {
        int veces = 0;
        int pocicion = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los datos al vector"));
        }
        digito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el penultimo digito a buscar"));
        for (int i = 0; i < vector.length; i++) {
            int j = vector[i];
            if (j < 10) {
                JOptionPane.showMessageDialog(null, "el numero ingresdo en esta pocicion no tiene 2 digitos");
            } else if (j > 9) {
                while (j > 9) {
                    j /= 10;
                    pocicion++;
                    j %= 10;
                    if (j == digito) {
                        veces++;
                    }
                }
            }
        }

        return veces;
    }

    public static void main(String[] args) {
        int vector[] = new int[3];
        JOptionPane.showMessageDialog(null, "la cantidad de números del vector en donde dicho dígito está de penúltimo es: " + cuantasvecesUltimoDigito(vector, 0) + " veces");
    }
}
