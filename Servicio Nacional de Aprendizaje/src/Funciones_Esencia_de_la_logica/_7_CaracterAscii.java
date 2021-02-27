/*
 construir una función que reciba como parametro un carácter y retorne el codigo ASCII asociado a el.
 */
package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class _7_CaracterAscii {

    public static int Ascii(char letra) {

        int codigo = (int) letra;//convierte la letra a entero ASCII

        return codigo;
    }

    public static void main(String[] args) {
        char letra = JOptionPane.showInputDialog(null, "Ingresa el dato").charAt(0);
        JOptionPane.showMessageDialog(null, Ascii(letra));
    }
}
