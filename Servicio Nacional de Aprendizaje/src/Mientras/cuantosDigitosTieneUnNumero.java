/*
cuantos numeros tiene un numero n
 */
package Mientras;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class cuantosDigitosTieneUnNumero {
    public static void main(String[] args) {
        int numero;
        int cero=0;
        int tiene=0;
        numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
        while (numero>=cero) {            
            numero=numero/10;
            tiene++;
            numero--;
        }JOptionPane.showMessageDialog(null, "El numero tiene: "+tiene+" digitos");
    }
}
