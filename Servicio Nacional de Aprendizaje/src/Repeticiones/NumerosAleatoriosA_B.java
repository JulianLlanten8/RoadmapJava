/*
5.Escribir una aplicación que permita: generar los números enteros impares entre a y b
 */
package Repeticiones;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class NumerosAleatoriosA_B {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int aleatorio;
        int cuantos;
        int valorEntero;
        cuantos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros aleatorios quieres?"));
        a = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el numero inicial"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el numero Final"));
        for (int i = 1; i <= cuantos; i++) {

            if (a > b) {
                valorEntero = (int) (Math.random() * (a - b + 1) + b);//utilizo (int) para convertir el random en entero
                JOptionPane.showMessageDialog(null, "= " + valorEntero);
                System.out.println("= " + valorEntero);
            }
            if (a < b) {
                valorEntero = (int) (Math.random() * (b - a + 1) + a);
                JOptionPane.showMessageDialog(null, "= " + valorEntero);
                System.out.println("= " + valorEntero);
            }
            if (a == b) {
                JOptionPane.showMessageDialog(null, "Los dos numeros son iguales");
            } 
            //int valorEntero = (int)(Math.random()*(a-b+1)+M);Formula utilizada para sacar numeros aleatorios enteros.

        }
    }

}
