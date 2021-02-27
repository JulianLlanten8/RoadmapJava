/*
27. Construir una función que reciba como parámetro un vector de 10 posiciones enteras
y retorne la posición en la cual se encuentra el mayor de los datos del vector.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class _27_VectorPocionDelNumeroMayor {

    public static int pociciónMayor(int vector[]) {
        int pocicionMayor = 0;
        int j = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
            if (j < vector[i]) {
                j = vector[i];
                pocicionMayor = i;
            }
        }
        return pocicionMayor;
    }

    public static void main(String[] args) {
        int vector[] = new int[10];
        JOptionPane.showMessageDialog(null, "El numero mayor se encuentra en la pocición " + pociciónMayor(vector));
    }
}
