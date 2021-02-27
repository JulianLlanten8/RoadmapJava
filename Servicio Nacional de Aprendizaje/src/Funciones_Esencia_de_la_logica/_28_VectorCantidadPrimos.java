/*
28. construir una funcion que reciba como parametro un vector de 10 pociciónes enteras y 
retorne la cantidad de numeros primos almacenados en el vector.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _28_VectorCantidadPrimos {

    public static int vectorPrimos(int vector[]) {
        int cuantos = 0;
        for (int j = 0; j < vector.length; j++) {
            vector[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        }

        for (int i = 0; i < vector.length; i++) {
            int j = vector[i];
            if (vector[i] % 2 == 1 || vector[i] < 2 && vector[i] > 0) {
                cuantos++;
            }
        }

        return cuantos;
    }

    public static void main(String[] args) {
        int vector[] = new int[10];
        JOptionPane.showMessageDialog(null, "La cantidad de primos en el arreglo son: " + vectorPrimos(vector));
    }
}
