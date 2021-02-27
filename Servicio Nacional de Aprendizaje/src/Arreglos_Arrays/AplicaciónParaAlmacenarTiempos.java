/*
En una competencia de natación se desea implementar una aplicación para almacenar el tiempo por cada competidor
y además determinar con base en todos los tiempos de los competidores cual es el ganador.
El usuario debe especificar cuantos tiempos (competidores) desea ingresar.
 */
package Arreglos_Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class AplicaciónParaAlmacenarTiempos {

    public static void main(String[] args) {
        int competidores;
        int ganador;
        int pocicion = 0;
        competidores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de competidores"));
        int[] tiempos = new int[competidores];
        for (int i = 1; i < tiempos.length; i++) {
            tiempos[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo del competidor: " + i));
            ganador=tiempos[1];
            if (tiempos[i] < ganador) {
                ganador = tiempos[i];
                pocicion = i;
            }
        }
        JOptionPane.showMessageDialog(null, "El ganador es el competidor # " + pocicion);
    }
}
