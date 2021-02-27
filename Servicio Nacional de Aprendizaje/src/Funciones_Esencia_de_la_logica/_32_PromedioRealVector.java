/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class _32_PromedioRealVector {

    public static float promediovector(int vector[]) {
        int suma = 0;
        int cuantos = 0;
        float promedio = 0;
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
        JOptionPane.showMessageDialog(null, "El promedio real del vector es: " + promediovector(vector));
    }
}
