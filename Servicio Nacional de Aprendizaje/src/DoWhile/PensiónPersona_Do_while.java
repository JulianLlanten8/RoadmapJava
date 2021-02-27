/*
Suponga que el cálculo de la pensión de una persona se realiza de la siguiente manera: 
por cada año de servicio se paga $80 si el empleado ingresó en o después de 1995 y $100 si ingresó antes, dicho valor (80 o 100)
se multiplica por el número de cada año más la edad que tenía en el año (ej. (100*1994+32)+(100*1995+33)+...), el descuento de seguridad social en salud es del 12%.
El programa debe recibir el año de ingreso y la edad del empleado en el año de ingreso, devolver el sueldo o mesada bruta, la mesada neta y el valor del descuento por salud.
Ejemplo: Para una persona que ingresó en el 2009 y que tenía 44 años en dicho año,
su mesada o sueldo bruto para el 2011 es $482.630, el descuento por salud es $57.904 y por lo tanto su sueldo o mesada neta es $424.630.

 */
package DoWhile;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class PensiónPersona_Do_while {

    public static void main(String[] args) {
        int añosalida;
        int añoIngreso;
        int edadIngreso;
        int mesadaBruta;
        int descuentoSalud = 0;
        int pencionIncremental = 0;
        int totalPension = 0;

        añoIngreso = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el año de ingreso del empleado"));
        añosalida = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el año de finalizacion del empleado"));

        if (añoIngreso > 1995) {
            edadIngreso = Integer.parseInt(JOptionPane.showInputDialog("Porfavor la edad que tenia el empleado cuando ingreso"));
            mesadaBruta = 80;
            do {
                totalPension = (mesadaBruta * añoIngreso) + (edadIngreso);
                descuentoSalud = totalPension * 12 / 100;//es para ver el descuento a la pencion
                totalPension = totalPension - descuentoSalud;//le resto el descuento de salud ala pencion
                añoIngreso++;
                pencionIncremental += totalPension;//pencion incremental
                pencionIncremental++;
            } while (añoIngreso <= añosalida);
            JOptionPane.showMessageDialog(null, "Descuemto  total es: $" + descuentoSalud);
            JOptionPane.showMessageDialog(null, "El total de la pension es: $" + pencionIncremental);
        } else if (añoIngreso <= 1995) {
            edadIngreso = Integer.parseInt(JOptionPane.showInputDialog("porfavor la edad que tenia el empleado cuando ingreso"));
            añosalida = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el año de finalizacion del empleado"));
            mesadaBruta = 100;
            do {
                totalPension = (mesadaBruta * añoIngreso) + (edadIngreso);
                descuentoSalud = totalPension * 12 / 100;//es para ver el descuento a la pencion
                totalPension = totalPension - descuentoSalud;//le resto el descuento de salud ala pencion
                añoIngreso++;
                pencionIncremental += totalPension;//pencion incremental
                pencionIncremental++;
            } while (añoIngreso <= añosalida);
            JOptionPane.showMessageDialog(null, "Descuento total es $" + descuentoSalud);
            JOptionPane.showMessageDialog(null, "El total de la pension es $" + pencionIncremental);
        }
    }
}
