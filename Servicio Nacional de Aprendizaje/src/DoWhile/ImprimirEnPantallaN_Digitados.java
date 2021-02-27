/*
1. Diseñe un algoritmo que reciba números digitados por el usuario y los imprima en pantalla,
el programa debe terminar Cuando el usuario digite un número negativo.
 */
package DoWhile;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Familia Llanten
 */
public class ImprimirEnPantallaN_Digitados {

    public static void main(String[] args) {
        int NumeroIngresado = 0;
        JTextArea miArea = new JTextArea(15, 15); //El area de texto a visualizar en pantalla ^.^
        JScrollPane miscroll = new JScrollPane(miArea); //Si salen muchos numeros se muestran con el scroll
        miArea.append("Numero Ingresado \t"); //Los titulos u contenido dentro del area de texto a visualizar
        do {
            NumeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese sus numeros positivos"));
            miArea.append("\n" + NumeroIngresado);
        } while (NumeroIngresado > 0); //El algoritmo termina cuando digitamos un numero negativo numero menor a cero.
        JOptionPane.showMessageDialog(null, miscroll, "Todos los numero ingresados por el usuario", JOptionPane.INFORMATION_MESSAGE);
    }
}
