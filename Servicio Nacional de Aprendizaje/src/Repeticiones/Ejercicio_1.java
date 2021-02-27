/*
desarrollar un programa en java que muestre al usuario el numero
de estudiantes de un curso , luego pregunte el numbre de cada uno de ellos.
finalmente, debe de mostrar un listado con todos los estudiantes.
 */
package Repeticiones;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        int estudiantes;
        String lista = "", nombre;

        estudiantes = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite el numero de estudiantes"));
        for (int n = 1; n <= estudiantes; n++) {
            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante");
            lista = lista + "El estudiante: " + n + " "+ nombre + "\n";
            JOptionPane.showMessageDialog(null, lista);

        }
    }
}
