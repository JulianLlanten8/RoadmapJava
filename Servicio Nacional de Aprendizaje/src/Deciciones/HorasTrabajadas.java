/*
 EJERCICIO 3
Se desea obtener la nómina semanal salario neto- de los empleados de una empresa cuyo trabajo se paga por horas y del modo siguiente:
las horas inferiores o iguales a 35 horas (normales) se pagan a una tarifa determinada 
que se debe introducir por teclado al igual que el número de horas y el nombre del trabajador; 
las horas superiores a 35 se pagarán como extras a un promedio de 1,5 horas normales;
los impuestos a deducir a los trabajadores varían en función de su sueldo mensual:
- Sueldo <= 2000, libre de impuestos.
- Las siguientes 2200 euros al 20 por 100. 
- El resto, al 30 por 100

 */
package Deciciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class HorasTrabajadas {

    public static void main(String[] args) {
        int valorhora, horas;
        float Sueldo;
        String nombre;

        JOptionPane.showMessageDialog(null, "Bienvenido Al Programa De Nominas  ");
        nombre = JOptionPane.showInputDialog("Porfavor Ingrese el Nombre del empleado");
        horas = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Las Horas Laboradas Del Empleado Durante la semana"));
        valorhora = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite El Valor De La Hora"));
        if (horas <= 35) {
            Sueldo = horas * valorhora;
            if (Sueldo >= 2000) {
                JOptionPane.showMessageDialog(null, "El Sueldo De La Semana Laborada Del Empleado " + nombre + " Es: " + Sueldo);
            }
            if (Sueldo > 2000 && Sueldo < 2200) {

                JOptionPane.showMessageDialog(null, "El Sueldo De La Semana Laborada Del Empleado " + nombre + " Es: " + (Sueldo - 20 / 100));
            } else {
                JOptionPane.showMessageDialog(null, "El Sueldo De La Semana Laborada Del Empleado " + nombre + " Es: " + (Sueldo - 30 / 100));

            }
        }
        if (horas > 35) {
            Sueldo = (int) (horas * valorhora + (valorhora *1.5));
            if (Sueldo >= 2000) {
                JOptionPane.showMessageDialog(null, "El Sueldo De La Semana Laborada Del Empleado " + nombre + " Es: " + Sueldo);
            }
            if (Sueldo > 2000 && Sueldo < 2200) {

                JOptionPane.showMessageDialog(null, "El Sueldo De La Semana Laborada Del Empleado " + nombre + " Es: " + (Sueldo - 20 / 100));
            } else {
                JOptionPane.showMessageDialog(null, "El Sueldo De La Semana Laborada Del Empleado " + nombre + " Es: " + (Sueldo - 30 / 100));

            }
            JOptionPane.showMessageDialog(null, "Muchas Gracias Por Utilizar Nuestro Programa ┏(＾0＾)┛ ");
        }
    }
}
