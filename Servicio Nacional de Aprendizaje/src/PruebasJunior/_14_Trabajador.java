/*
14 Determinar la cantidad de dinero que recibirá un trabajador por 
concepto de horas semanales trabajadas en una empresa, sabiendo que cuando las horas trabajadas exceden de 48, 
el resto se consideran horas extras y que estas se pagan al doble de una hora normal cuando no exceden de 8;
sí las horas extras exceden de 8 se pagan las primeras 8 al doble de una hora normal y el resto al triple.
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _14_Trabajador {

    public static void main(String[] args) {
        int horasTrabajadas = 0;
        int horasExtra = 0;
        int valorHora = 0;

        valorHora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la hora laborada"));
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de horas laboradas"));

        if (horasTrabajadas > 48)
        {
            horasExtra = horasTrabajadas - 48;
            horasTrabajadas -= horasExtra;
            horasExtra = horasExtra + (valorHora * 3);
            horasTrabajadas = ((horasTrabajadas * valorHora) + horasExtra);
        } else if (horasTrabajadas > 0 && horasTrabajadas <= 48)
        {
            horasTrabajadas *= valorHora;
        }
        JOptionPane.showMessageDialog(null, "El valor de las horas trabajadas por el trabajador es de $" + horasTrabajadas);
    }
}
