/*
11. Construir una función que reciba como parámetro un entero y un dígito y
retorne 1 si dicho entero es múltiplo de dicho dígito y 0 si no es así.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _11_MultiploDeDigito {
    public static int multiplo(int entero,int digito){
        int resultado=0;
        int esMultiplo=0;
        //si el digito es mayor a 10 tiene mas de dos digitos #error
        if (digito<10 && digito>0) { 
            for (int i = 1; resultado <entero; i++) {
                resultado=digito*i;
                //JOptionPane.showMessageDialog(null,resultado); //explico el proceso?
                if (resultado==entero) {
                    //si el resultado de la multiplicacion es igual al entero introducido entonces vale 1
                    esMultiplo=1;
                }else{
                    //sino vale 0
                    esMultiplo=0;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Lo siento usted ingreso mas de un digito");
        }
    return esMultiplo;
    }
    public static void main(String[] args){
        int entero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int digito=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un digito"));
        
        JOptionPane.showMessageDialog(null,"retorno: "+multiplo(entero, digito));
    }
}
