/*
construir una funcion que reciba un numero y retorne la cantidad de digitos primos
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _5_DigitosPrimos {

    public static int contar_Digitos_Primos(int numero) {

        int contadorPrimos = 0;
        int primo = 0;

        while (numero != 0) {
            int digito = numero % 10;//elijo el ultimo digito

            //lo modulo sucesivamente hasta llegar a el.
            for (int i = 1; i <= digito; i++) {
                if (digito % i == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                //si solo salen 2 diviciones exactas (0) el digito es primo.
                contadorPrimos++;
            }
            numero /= 10;//diminuyo un digito
            primo = 0;//reinicio primo
        }

        return contadorPrimos;
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        JOptionPane.showMessageDialog(null, "El numero ingresado tiene " + contar_Digitos_Primos(num) + " # primo");
    }
}
