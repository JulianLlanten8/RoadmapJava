package Arreglos_Arrays;

import javax.swing.JOptionPane;

/**
 * Guardar e imprimir nombres en Array u Arreglo.
 * @author Familia Llanten
 */
public class Arreglo_de_Ejemplo {

    public static void main(String[] args) {

        String nombres[] = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = JOptionPane.showInputDialog("Por favor ingrese los nombres");
            System.out.println(nombres[i]);
        }
        JOptionPane.showMessageDialog(null,nombres[0]);
    }
}
