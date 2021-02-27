/*
Construir una funcion que reciba como parametro un numero entero y
retorne su ultimo digito.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _1_Funcion_Ultimo_Digito {

    public static int ultimo(int numero) {
        int resultado = numero % 10;
        return resultado;
    }
    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero"));
        System.out.println("El ultimo digito es: "+ultimo(num));
    }
}
