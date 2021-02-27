/*
33. Construir una función que reciba como parámetros un vector de 10 posiciones enteras y un valor entero
y retorné 1 si dicho valor entero se encuentra en el vector. Deberá retornar 0 si no es así.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class _33_BuscarEnteroEnVector {

    public static int BuscadorEnVector(int vector[], int entero) {
        int retorno = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus numeros"));
        }

        entero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a buscar en el arreglo"));
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == entero) {
                //si el vector en esa pocición es igual al numero entero entonces es 1
                retorno = 1;
            }
        }
        return retorno;
    }

    public static void main(String[] args) {
        int vector[] = new int[10];
        JOptionPane.showMessageDialog(null, BuscadorEnVector(vector, 0));
    }
}
