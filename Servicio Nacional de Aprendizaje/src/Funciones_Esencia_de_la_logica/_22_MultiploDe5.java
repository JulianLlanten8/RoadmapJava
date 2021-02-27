/*
22. Construir una función que reciba como parámetro un entero y retorne 1 si dicho valor es múltiplo de 5.
Deberá retornar 0 si no es así.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _22_MultiploDe5 {

    public static int multiplo(int numero) {
        int verdaderoFalso = 0;
        int multiplo = 5;
        while (multiplo <= numero)
        {
            if (multiplo == numero)
            {
                verdaderoFalso = 1;
            }
            multiplo += 5;

        }
        return verdaderoFalso;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero"));
        JOptionPane.showMessageDialog(null, multiplo(numero));
    }
}
