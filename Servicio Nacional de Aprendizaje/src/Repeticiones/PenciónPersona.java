/*
4. Suponga que el cálculo de la pensión de una persona se realiza de la Siguiente manera: por cada año de servicio 
se paga $80 si el empleado ingresó en o después de 1995 y $100 si ingresó antes, dicho valor (80 o 100) 
se multiplica por el número de cada año más la edad que tenía en el año (ej. (100*1994+32)+(100*1995+33)+...), 
el descuento de seguridad social salud es del 12%. El programa debe recibir el año de ingreso y la edad del empleado en el año de ingreso,
devolver el sueldo o mesada bruta, la mesada neta y el valor del descuento por salud.
Soluion:
Un añoservicio=$80*año+años siingreso>=1995 siingreso<=1995 $100*año+años.(resultados-resultado*12/100)
 */
package Repeticiones;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class PenciónPersona {

    public static void main(String[] args) {
        int añosalida;
        int añoIngreso;
        int edadIngreso;
        int mesadaBruta;
        int descuentoSalud = 0;
        int ciclo = 1;
        int totalPension = 0;
        
        añoIngreso = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el año de ingreso del empleado"));
        añosalida = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el año de finalizacion del empleado"));
        if (añoIngreso > 1995) {
            edadIngreso = Integer.parseInt(JOptionPane.showInputDialog("Porfavor la edad que tenia el empleado cuando ingreso"));
            mesadaBruta = 80;
            for (añoIngreso = añoIngreso; añoIngreso <= añosalida; añoIngreso++, edadIngreso++, ciclo++) {

                totalPension = (mesadaBruta * añoIngreso) + (edadIngreso);
                descuentoSalud = totalPension * 12 / 100;//es para ver el descuento a la pencion
                totalPension = totalPension - descuentoSalud;//le resto el descuento de salud ala pencion
                ciclo += totalPension;//pencion incremental
            }
            JOptionPane.showMessageDialog(null, "descuemto es $" + descuentoSalud);
            JOptionPane.showMessageDialog(null, "el total de la pension es $" + ciclo);

        } else if (añoIngreso <= 1995) {
            edadIngreso = Integer.parseInt(JOptionPane.showInputDialog("porfavor la edad que tenia el empleado cuando ingreso"));
            añosalida = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el año de finalizacion del empleado"));
            mesadaBruta = 100;
            for (añoIngreso = añoIngreso; añoIngreso <= añosalida; añoIngreso++, edadIngreso++, ciclo++) {

                totalPension = (mesadaBruta * añoIngreso) + (edadIngreso);
                descuentoSalud = totalPension * 12 / 100;//es para ver el descuento a la pencion
                totalPension = totalPension - descuentoSalud;//le resto el descuento de salud ala pencion
                ciclo += totalPension;//pencion incremental
                JOptionPane.showMessageDialog(null, "su pencion en el año: " + añoIngreso + " es $" + totalPension);//imprimo el año y el total de la pencion
                JOptionPane.showMessageDialog(null, "el descuento es:  $" + descuentoSalud);//imprimo el descuento.
            }
            JOptionPane.showMessageDialog(null, "el total de la pension es $" + ciclo);
        }
    }
}
