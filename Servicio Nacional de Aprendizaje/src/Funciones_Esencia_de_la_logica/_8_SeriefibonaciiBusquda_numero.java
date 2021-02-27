/*
Construir una funcion que reciba un parametro entero y retorne 1 si dicho enttero esta en los 30 primeros elementos
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _8_SeriefibonaciiBusquda_numero {

    public static int encontrar_enserie(int numero) {
        int coincide = 0;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int i = 0;
        int contador = 30;

        for (i = 2; i < contador; ++i)//ciclo hasta que llegue a contador
        {
            n3 = n1 + n2;

            if (numero == n3) {
                //si N3 concide la variable coincide vale uno;
                coincide = 1;
            }
            n1 = n2;
            n2 = n3;
        }
        return coincide;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese un numero")); //ingreso del numero entero
        JOptionPane.showMessageDialog(null, encontrar_enserie(numero)); //retorna el valor 0 o 1 si lo encontro en la serie
    }
}
