/*
31. Construir una función que reciba como parámetro un vector de 10 posiciones enteras y retorne el promedio entero del vector.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class _31_PromedioVector {

    public static int promediovector(int vector[]) {
        int suma = 0;
        int cuantos = 0;
        int promedio = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        }
        for (int i = 0; i < vector.length; i++) {
            int j = vector[i];//extraigo el valor de vector.
            suma += j;//5+4+8
            cuantos++;
        }
        JOptionPane.showMessageDialog(null, suma);
        promedio += suma / cuantos;
        return promedio;
    }

    public static void main(String[] args) {

        int vector[] = new int[5];
        JOptionPane.showMessageDialog(null, "El promedio entero del vector es: " + promediovector(vector));
    }
}
