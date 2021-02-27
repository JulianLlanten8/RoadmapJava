package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/*
37. Construir una función que reciba como parámetros dos enteros, el primero actuará como base y el segundo como exponente y 
retorne el resultado de elevar dicha base a dicho exponente.
 */
/**
 * @author Familia Llanten
 */
public class _36_EnteroSerieFibonacci {

    public static int FibonaciihastaNumero(int numero) {
        int coincide = 0;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese un numero")); //ingreso del numero entero

        for (int i = 2; i < numero; ++i)//ciclo hasta que llegue a contador
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, FibonaciihastaNumero(0)); //retorna el valor 0 o 1 si lo encontro en la serie
    }
}
