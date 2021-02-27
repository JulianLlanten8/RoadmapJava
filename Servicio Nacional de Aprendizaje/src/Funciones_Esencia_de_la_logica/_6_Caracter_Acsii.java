/*
Construir una funcion que reciba como parametro entero y retorne el caracter al cual pertenece ese numero enetero como codigo Acsii
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _6_Caracter_Acsii {

    public static char Ascii(int numero) { //en este caso nos va a devolver un dato tipo char

        char valorAcsii = (char) numero; //convercion a letra # - numero (char)

        return valorAcsii;
    }

    public static void main(String[] args) {
        int num = Ascii(Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero a convertir")));
        JOptionPane.showMessageDialog(null, "La convercion de los numeros a caracter es: " + Ascii(num));
    }
}
