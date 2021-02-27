/*
 Desarrollar un algoritmo que solicite un numero y liste los numeros del 1 hasta el numero solicitado.
 */
package Repeticiones;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class For {

    public static void main(String[] args) {
        for (int i = 18; i > 10; i = i - 2) {
            JOptionPane.showMessageDialog(null, "numero: " + i);
        }
        JOptionPane.showMessageDialog(null, "Muchas gracias por utilizar nueestro algoritmo ♪ ┏(*^v^*)┛  ♪\n ");
    }
}
