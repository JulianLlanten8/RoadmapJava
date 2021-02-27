/*
Escriba un programa en Java que dada una lista de enteros y un valor x por parte del usuario, diga cuántas veces x aparece en la lista. 
El programa como salida debe mostrar la lista ingresada por el usuario e indicar cuántas veces aparece el valor X y en cuáles posiciones.
 */
package Arreglos_Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class BuscarXnumeroenLista {

    public static void main(String[] args) {
        int[] listaN = new int[5];
        int x;
        int aparece = 0;

        for (int i = 0; i < listaN.length; i++) {
            listaN[i] = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese los numeros"));
        }
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar en la lista"));
        for (int i = 0; i < listaN.length; i++) {
            if (listaN[i] == x) {
                aparece++;
                System.out.println("El numero " + x + " aparece " + aparece + " veces, en las pociciones " + i);
            }
        }
    }
}
