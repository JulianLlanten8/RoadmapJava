/*
Arbol de Navidad
 */
package Repeticiones;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class Asteriscos_Incrementales {

    public static void main(String[] args) {

        int columnas = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de columnas"));
        for (int espacios = 1; espacios <= columnas; espacios++) {

            System.out.print("             ");

            for (int asteriscos = 1; asteriscos <= espacios; asteriscos++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
