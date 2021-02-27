/*
algoritmo tablas del 1 al 5 y 1 al 10
 */
package Repeticiones;

import javax.swing.JOptionPane;
/**
 * @author Familia Llanten
 */
public class Tablas {

    public static void main(String[] args) {
        String resultado = "";
        for (int i = 1; i <= 5; i++) {

            for (int b = 1; b <= 10; b++) {
                resultado += i + "x" + b + "= " + i * b + "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);
            resultado = "";
        }
    }
}
