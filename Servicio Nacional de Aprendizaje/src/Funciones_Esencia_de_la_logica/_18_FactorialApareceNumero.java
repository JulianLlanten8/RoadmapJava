/*
18. Construir una función que reciba como parámetro un valor entero y retornar 1 si dicho valor es el factorial
de alguno de los dígitos del número. Deberá retornar 0 si no es así. 
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _18_FactorialApareceNumero {
        public static int factorial(int numero,int numero2) {
        int factor = numero;
        int aparece= 0;
        if (numero > -1) {
            for (int i = numero - 1; i > 0; i--) {
                factor = factor * i; //ej: 5*4,20*3,60*2,120*1=120
                //JOptionPane.showMessageDialog(null, factor);// imprime el recorrido
                if (factor == numero2) {
                    aparece=1;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos pero, el numero debe ser positivo");
        }
        return aparece;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero \n para saber el factorial"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero \n para saber el factorial"));
        
        JOptionPane.showMessageDialog(null, "El factorial del numero " + numero + " aparece: " + factorial(numero,numero2));
    }
}
