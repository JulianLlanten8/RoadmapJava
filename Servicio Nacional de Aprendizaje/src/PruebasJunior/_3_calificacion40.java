/*
3. Suponga que se tiene un conjunto de calificaciones de un grupo de 40 alumnos.
Realizar un algoritmo para calcular la calificación media y la calificación mas baja de todo el grupo.
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _3_calificacion40 {

    public static void main(String[] args) {
        int calificaciones[] =
        {
            5, 5, 5, 4, 5, 5, 4, 5, 2, 3, 4, 3, 5, 2, 5, 5, 5, 1, 5, 3, 5, 2, 4, 4, 2, 3, 5, 3, 5
        };
        int baja = 1000000;
        int suma = 0;
        float media = 0;
        for (int i = 0; i < 20; i++)
        {
            if (baja > calificaciones[i])
            {
                baja = calificaciones[i];
            }
            suma += calificaciones[i];
        }
        media = suma / 20;
        JOptionPane.showMessageDialog(null, "la calificacion media es: " + media + " la calificacion mas baja es: " + baja);
    }
}
