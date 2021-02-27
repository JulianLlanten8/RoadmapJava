/*
Construir una función que reciba como parámetro un entero y retorne la cantidad de dígitos pares.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class _4_Cantidad_NumerosYpares {

    public static int contar_Digitos_pares(int numero) {

        int contadorpares = 0;

        while (numero != 0) {
            numero = numero / 10;//saca el ultimo digito del numero ingreasdo
            int digito = numero;//el utimo digito es numero
            
            if (digito % 2 == 0) {
            /*el modulo de digito entre dos nos devuelve 0 si es par, de lo contrario es primo */
                contadorpares++;
            }
        }
        return contadorpares;
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        System.out.println("El numero ingresado tiene: " + contar_Digitos_pares(num) + " Pares");
        JOptionPane.showMessageDialog(null, "El numero ingresado tiene " + contar_Digitos_pares(num) + " # pares");
    }
}
