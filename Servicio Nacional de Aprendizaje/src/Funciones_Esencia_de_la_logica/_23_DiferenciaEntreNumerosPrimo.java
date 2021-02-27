/*
23. Construir una función que reciba como parámetro dos enteros y retorne 1 si la diferencia entre los dos valores es un número primo. 
Deberá retornar 0 si no es así.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _23_DiferenciaEntreNumerosPrimo {

    public static int DiferenciaPrimo(int numero, int numero2) {
        int verdaderoFalso = 0;
        int contador = 0;
        int primo = 0;
        for (int i = 0; numero <= numero2; i++) {
            contador = i;
            numero++;

        }
//        JOptionPane.showMessageDialog(null, contador);//muestra el numero diferencia entre los dos numeros
        for (int i = 1; i <= contador; i++) {
            if (contador % i == 0) {
                primo++;
            }
        }
        if (primo == 2) {
            verdaderoFalso = 1;
        }

        return verdaderoFalso;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero inicial"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero final"));
        JOptionPane.showMessageDialog(null, DiferenciaPrimo(numero, numero2));
    }
}
