/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mientras;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class Ejercicio_Uno {

    public static void main(String[] args) {
        int numero;
        int inicial = 0;
        int resultado = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero hasta donde quiere ver los numeros primos"));
        while (inicial <= numero) {
            if (numero % 3 == 0) {
                resultado++;
            }
            numero--;
        }
        JOptionPane.showMessageDialog(null, "Ahi: " + resultado + " numeros multiplos de 3");
    }
}
