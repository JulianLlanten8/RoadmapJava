/*
19. Construir una función que reciba como parámetro un entero y retorne 1 si dicho valor es un
número de mínimo 3 dígitos. Deberá retornar 0 si no es así.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _19_CuentaNumerosMayor3 {

    public static int CuantosNumeros(int numero) {
        int masDe3 = 0;
        int cuentaNumeros = 0;

        while (numero != 0) {
            numero /= 10;//operacion para quitar el ultimo digito
            ++cuentaNumeros;
            if (cuentaNumeros >= 3) {
                masDe3 = 1;
            }
        }

        return masDe3;
    }

    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        JOptionPane.showMessageDialog(null, CuantosNumeros(numero1));
    }
}
