/*
1. Diseñe un algoritmo que permita detectar los números pares Existentes en una serie de 1 a n, siendo n un número digitado por un usuario.

Solucion:
Entrada: Declaro 3 variables tipo entero para almacenar 3 numeros un que va a gurdar el numero par,el indicador del usuraio hasta que numero
quiere ver los nuemros pares y el que va a guardar si el numero es par; todo esto lo procesamos dentro de el ciclo for con una condicion si
el numero y la salida seran los numero pares hasta dicho numero ingresado.
 */
package Repeticiones;

import javax.swing.JOptionPane;

/**
 * @author Julian Llanten
 */
public class NumeroParesConFor {

    public static void main(String[] args) {
        int NumeroIngresado;//En esta variable se guardara el numero introducido.
        int b = 0;//en esta variable se guarda si el numero es par o impar.
        NumeroIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor ingrese hasta que numero desea ver los numeros pares"));
        //Con el siguiente ciclo for se va comprender hasta que numero se va imprimir.
        for (int i = 1; i <= NumeroIngresado; i++) {
            b = i % 2;//si el resto del numero es cero es par sino no es par.
            if (b == 0) {
                System.out.println("los numeros comprendididos desde el inicial hasta el numero diguitado\n " + "son: " + i);
                JOptionPane.showMessageDialog(null,"los numeros comprendididos desde el inicial hasta el numero diguitado\n " + "son: " + i);
            }

        }
    }
}
