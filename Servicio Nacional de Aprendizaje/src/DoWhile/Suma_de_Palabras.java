/*
3. Cree un algoritmo que permita digitar palabras y al final Imprima la concatenación de las palabras digitadas, 
el programa debe terminar cuando el usuario digite la palabra "terminar".
 */
package DoWhile;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Familia Llanten
 */
public class Suma_de_Palabras {

    public static void main(String[] args) {
        String palabra1 = "\n";
        String palabra2 = "\n";
        String otra = "\n";

        JTextArea miArea = new JTextArea(15, 20); //El area de texto a visualizar en pantalla ^.^
        JScrollPane miscroll = new JScrollPane(miArea); //Si salen muchos numeros se muestran con el scroll
        miArea.append("\nConcatenación de palabras\t (Suma)"); //Los titulos u contenido dentro del area de texto a visualizar
        do {
            palabra1 = (JOptionPane.showInputDialog("Porfavor ingrese la palabra para sumar"));
            palabra2 = (JOptionPane.showInputDialog("Porfavor ingrese la segunada palabra a concatenar"));
            otra = (JOptionPane.showInputDialog("¿Desea hacer otra suma? \n Digite \"\"terminar\"\" si, no quiere hacer otra suma"));

            miArea.append("\n Concatenación de palabras " + palabra1 + palabra2);

        } while (!palabra1.equals("terminar") && !palabra2.equals("terminar") && !otra.equals("terminar")); //El algoritmo termina cuando digita "terminar".
        JOptionPane.showMessageDialog(null, miscroll, "Concatenación de palabras Ingresadas", JOptionPane.INFORMATION_MESSAGE);
    }
}
