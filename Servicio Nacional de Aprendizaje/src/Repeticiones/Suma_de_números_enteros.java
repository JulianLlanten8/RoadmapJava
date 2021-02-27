/*
2. Diseñe un algoritmo que permita obtener la suma de todos los números enteros existentes en una serie de 1 a n 
y la cantidad de números pares encontrados,siendo n un número digitado por un usuario. 
Solucion:
Entrada de datos; indicamos al usuario hasta que numero desea hacer la suma entre 1 al numero que el digite,
lo almacenamos en una variable de tipo entero junto con otras dos mas que van a ser la inicial y el resultado.
Procesamiento: hacemos el un ciclo el cual va a repetirse hasta que se cumpla el valor ingresado por el usuario,
dentro del ciclo hacemos la suma de los numeros inicial y el indicado el cual se guardara en la variable resultado.
Salida de Datos: mostramos la suma de datos en en pantalla al usuario.
 */
package Repeticiones;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class Suma_de_números_enteros {

    public static void main(String[] args) {
        int numeroIngresado;
        int suma = 0;
        int par;
        int pares = 0;
        numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese el numero hasta donde quiere hacer la suma"));
        for (int i = 0; i < numeroIngresado; i++) {
            suma = i + 1;
            par = suma % 2;
            System.out.println("La suma es: " + suma);
            if (par == 0) {
                pares++;

            }
        }
        JOptionPane.showMessageDialog(null, "La suma de numeros enteros es = " + suma + "\n tiene " + pares + " numeros pares");
    }
}
