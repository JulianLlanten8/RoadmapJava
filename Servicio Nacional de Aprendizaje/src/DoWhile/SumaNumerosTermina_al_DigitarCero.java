/*
2. Diseñe un algoritmo que reciba números digitados por el usuario y al final imprima la suma de los números digitados,
el Programa debe terminar cuando el usuario digite 0 (cero). 
 */
package DoWhile;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Familia Llanten
 */
public class SumaNumerosTermina_al_DigitarCero {

    public static void main(String[] args) {
        int NumeroIngresado;
        int NumeroIngresado2;
        int suma = 0;
        int otrasuma;
        JTextArea miArea = new JTextArea(15, 15); //El area de texto a visualizar en pantalla ^.^
        JScrollPane miscroll = new JScrollPane(miArea); //Si salen muchos numeros se muestran con el scroll
        miArea.append("\nOperacion matematica (Suma) \t"); //Los titulos u contenido dentro del area de texto a visualizar
        do {
            NumeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese un nuemero para sumar \t _ +"));
            NumeroIngresado2 = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el segundo numero a adicionar"));
            suma = NumeroIngresado + NumeroIngresado2;
            otrasuma = Integer.parseInt(JOptionPane.showInputDialog("¿Desea hacer otra suma? \n digite cero (0) si no quiere hacer otra suma"));
            miArea.append("\n La suma de los numeros es: " + suma);
        } while (NumeroIngresado != 0 && NumeroIngresado2 != 0 && otrasuma != 0); //El algoritmo termina cuando digita el numero cero.
        JOptionPane.showMessageDialog(null, miscroll, "Suma de numeros Ingresados", JOptionPane.INFORMATION_MESSAGE);
    }
}
