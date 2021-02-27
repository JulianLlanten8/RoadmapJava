/*
 Construir una funcion que reciba como parametro un numero entero y
retorne sus ultimos  2 digitos.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class _2_Ultimos_digitos {

    public static int digitos(int numero) {
        int resultado = numero % 100;
        return resultado;
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero"));
        System.out.println("Los ultimos 2 digitos son: " + digitos(num));
    }
}
