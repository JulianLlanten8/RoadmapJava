/*
25. Construir una función que reciba como parámetro un entero y un dígito menor o igual a 5 
y retorne el dígito del número que se encuentre en la posición especificada por el dígito que llegó como parámetro.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _25_PocicionSegunDigito {

    public static int pocicion(int numero, int digito) {
        int auxiliar = numero;
        int encontrado = 0;
        int contador = 0;
        while (auxiliar != 0) {            
            auxiliar %= 10;
            contador++;
            if (contador == digito) {
                encontrado = auxiliar;
            } 
            numero /= 10;
            auxiliar = numero;
//            JOptionPane.showMessageDialog(null,auxiliar);
        }
        
        return encontrado;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int digito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        JOptionPane.showMessageDialog(null,"El numero en la pocicion "+digito+" es: "+ pocicion(numero, digito));
    }
}
