/*
12. Construir una función que reciba como parámetro un entero y un digito y retorne 1 si dicho
dígito está en dicho entero y O si no es así.
 */
package Funciones_Esencia_de_la_logica;


import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class _12_DigitoEnNUmero {

    public static int busqueda(int entero, int digito) {
        int aparece = 0;
        int auxiliar = 0;
        
        if (digito < 10 && digito > -1) {

            if (entero == digito) {
                aparece = 1;    
            } else {
                while (entero >= 10) {
                    auxiliar = entero % 10;//22 2
                    entero = entero / 10;//

                    if (entero == digito || auxiliar == digito) {
                        aparece = 1;
                    }
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
        JOptionPane.showMessageDialog(null, "Si el numero aparece 1 sino 0 \n" + busqueda(entero, digito));
    }
}
