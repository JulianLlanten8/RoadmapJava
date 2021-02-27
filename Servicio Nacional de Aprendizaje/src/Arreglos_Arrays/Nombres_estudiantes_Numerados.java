package Arreglos_Arrays;

import javax.swing.JOptionPane;

/**
 * Lista de alumnos enumerada.
 *
 * @author Familia Llanten
 */
public class Nombres_estudiantes_Numerados {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de estudiantes del curso"));
        String nombres[] = new String[5];

        for (int i = 1; i <= numero; i++) {
            nombres[i] = JOptionPane.showInputDialog("ingrese el nombre del estudiante" + i + ":");

        }
        for (int i = 1; i <= numero; i++) {
            JOptionPane.showMessageDialog(null, "La lista de estudiantes es: \n" + i + ". "+ nombres[i]);
        }
    }
}
