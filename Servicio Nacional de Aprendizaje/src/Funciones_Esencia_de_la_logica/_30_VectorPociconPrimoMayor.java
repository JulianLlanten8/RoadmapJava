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
public class _30_VectorPociconPrimoMayor {

    public static int vectorPrimos(int vector[]) {
        int mayor = 0;
        int contador = 0;

        for (int j = 0; j < vector.length; j++) {
            vector[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        }
        for (int i = 0; i < vector.length; i++) {
            int j = vector[i];
            for (int numero = 1; numero <= j; numero++) {
                if (j % numero == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                //si es divisible 2 veces es primo
                if (vector[i] > mayor) {
                    //ademas de ser primo es mayor al almacenado anteriormente mayor se actualiza.
                    mayor = vector[i];
                }
            }
            contador = 0; //se reinica contador para saber el sigiente numero primo en el procimo recorrido.
        }

        return mayor;
    }

    public static void main(String[] args) {
        int vector[] = new int[10];
        JOptionPane.showMessageDialog(null, "El numero primo mayor en el arreglo es: " + vectorPrimos(vector));
    }
}
