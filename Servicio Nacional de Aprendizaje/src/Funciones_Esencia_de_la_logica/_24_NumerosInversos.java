/*
24. Construir una función que reciba como parámetro dos enteros de dos dígitos cada uno y
retorne 1 si son inversos. Ejemplo: 83 es inverso de 38 Deberá retornar 0 si no es así.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _24_NumerosInversos {

    public static int Inversos(int numero, int numero2) {
        int verdaderoFalso = 0;
        if (numero < 100 && numero > 9 && numero2 > 9 && numero2 < 100) {
            String digitos=""+numero2%10+numero2 /10;
                int union= Integer.valueOf(digitos);
                JOptionPane.showMessageDialog(null,union);
            if (numero==union) {
                verdaderoFalso=1;
            }
        }
        return verdaderoFalso;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero de dos cifras"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a comparar"));
        JOptionPane.showMessageDialog(null,Inversos(numero, numero2));
    }
}
