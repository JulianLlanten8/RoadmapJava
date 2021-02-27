/*
Construir una función que reciba como parámetro un entero y retorne la cantidad de dígitos.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _3_Cantidad_Digitos {

    public static int cuantos_Digitos(int numero) {
        int contador = 0;
        while (numero != 0)
        {
            numero = numero / 10;
            contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        System.out.println("La cantidad de numeros que tiene es:" + cuantos_Digitos(num));
    }
}
