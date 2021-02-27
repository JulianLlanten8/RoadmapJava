/*
Dibujar un asterisco
*
**
***
****
***** salto...
 */
package Repeticiones;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class Arbol_Uno {

    public static void main(String[] args) {

        int columnas = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de columnas"));
        for (int i = 1; i <= columnas; i++)
        {
            for (int espacios = 1; espacios <= i; espacios++)
            {
                System.out.print("      ");
                for (int asteriscos = 1; asteriscos <= espacios; asteriscos++)
                {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }
}
