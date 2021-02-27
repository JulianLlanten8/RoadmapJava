/*
21. Construir una función que reciba como parámetro un entero y retorne 1 si en dicho valor el primer dígito es igual al último. 
Deberá retornar 0 si no es así.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class _21_PrimerDigitoIgualAlUltimo {

    public static int Iguales(int numero) {
        int verdadero=0;
        int auxiliar=numero%10;
        while (numero!=0) {            
            numero/=10;
            if (numero<10 && numero==auxiliar) {
                verdadero=1;
            }
        }
        return verdadero;
    }
    public static void main(String[]args){
    int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
    JOptionPane.showMessageDialog(null,Iguales(numero));
    }
}
