package Funciones_Esencia_de_la_logica;


import javax.swing.JOptionPane;

/*
16. Construir una función que reciba como parámetro un entero y retorne 1 si corresponde al código ASCII 
de una letra minúscula (Los códigos ASCII de las letras minúsculas van desde 97 que el código de la letra a hasta 122
que es el código de la letra z). Deberá retornar 0 si no es así.
 */
/**
 * @author Familia Llanten
 */
public class _16_NumeroAletra1o0 {

    public static int Ascii(int numero) {
        int correspode = 0;
        if (numero >= 97 && numero <= 122) {
            correspode = 1;
        }
        char letra = (char) numero;
        JOptionPane.showMessageDialog(null, letra);//Imprime el caracter al que pertenece.
        return correspode;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        JOptionPane.showMessageDialog(null, Ascii(numero));
    }
}
