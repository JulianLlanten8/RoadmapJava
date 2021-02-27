/*
salario
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class salario {

    public static void main(String[] args) {
        int horastrabajadas = 0;
        int horaExtra = 0;
        int valorHora = 0;

        valorHora = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la hora laborada"));
        horastrabajadas = Integer.parseInt(JOptionPane.showInputDialog("ingrese el total de las horas trabajadas"));

        if (horastrabajadas > 48)
        {
            horaExtra = horastrabajadas - 48;
            horastrabajadas = (horastrabajadas - horaExtra);
            horaExtra += (valorHora * 3);
            horastrabajadas = (horastrabajadas * valorHora) + horaExtra;
        }
        if (horastrabajadas <= 48)
        {
            horastrabajadas *= valorHora;
        }
        JOptionPane.showMessageDialog(null, "El valor de la semana trabajada es de: $" + horastrabajadas);
    }
}
