package Funciones_Esencia_de_la_logica;


import javax.swing.JOptionPane;

/*
17. Construir una función que reciba como parámetro un entero y retorne 1 si corresponde al código ASCII 
de un dígito (Los códigos ASCII de las letras minúsculas van desde 48 que es el código del dígito 0 hasta 57 que es el código del dígito 9).
Deberá retornar 0 si no es así.
 */
/**
 *
 * @author Familia Llanten
 */
public class _17_AsciiEsundiigito {

    public static int Ascii(int numero) {
        int correspode = 0;
        if (numero >= 0 && numero <= 9 || numero >= 48 && numero <= 57) {
            correspode = 1;
        }
        char letra = (char) numero;
        //JOptionPane.showMessageDialog(null, letra);//Imprime el caracter al que pertenece.
        return correspode;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        JOptionPane.showMessageDialog(null, Ascii(numero));
    }
}
