/*
 13. Construir una función que reciba como parámetro un entero y un dígito 
y retorne la cantidad de veces que se encuentra dicho dígito en dicho entero.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _13_DigitoEnNumero_veces {

    public static int busqueda(int entero, int digito) {
        int aparece = 0;
        int auxiliar = 0;
        if (digito < 10 && digito > -1) {
            if (entero == digito) {
                aparece++;
            }
            while (entero > 10) {
                auxiliar = entero % 10; //444=   4
                entero = entero / 10; //444/10= 44,4

                if (entero == digito) {
                    aparece++;
                }
                if (auxiliar == digito) {
                    aparece++;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lo siento pero usted ingreso un digito no valido");
        }

        return aparece;
    }

    public static void main(String[] args) {
        int entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int digito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el digito a buscar"));
        JOptionPane.showMessageDialog(null, "El digito aparece: " + busqueda(entero, digito) + " veces");
    }
}
