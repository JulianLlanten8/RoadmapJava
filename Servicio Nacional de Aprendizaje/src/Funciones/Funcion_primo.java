/*
numero primo funcion
 */
package Funciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class Funcion_primo {

    public static void  primo(int numero) {

        int contador = 0;
        for (int i = 1; i < numero; i++) {
            if (numero%i==0) {
                contador++;
            }
            
        }
        if (contador>2) {
            System.out.println("El numero no es primo");
        }
        else{
            System.out.println("El numero es primo");
        }
    }
    public static void main(String[] args) {
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero"));
        primo(numero);
    }
}
