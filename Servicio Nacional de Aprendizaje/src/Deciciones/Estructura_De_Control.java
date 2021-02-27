package Deciciones;

import javax.swing.JOptionPane;

/*
EJERCICIO 1 ESTRUCTURA DE CONTROL
Problema: Se requiere de un programa que permita leer: la cédula, salario básico y año de vinculación de un empleado y que permita calcular su salario neto sabiendo que:
Si gana más de $1200000 y entro a trabajar después de 1990 se le debe descontar un 8%.
Si gana menos de 550000 ó entró a trabajar en 1990 se le descuenta 2%.
En cualquier otro caso se descontará el 5% del salario.
El programa debe reportar la cédula y salario neto del empleado.
________________________________________
 */
/**
 @author Julian Llanten
 */
public class Estructura_De_Control {

    public static void main(String[] args) {
        float salario;
        int año, cedula;

        JOptionPane.showMessageDialog(null, " Te Damos La Bienvenida al Programa de Salarios");
        cedula = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite La Cedula Del EmpIntegerleado"));
        salario = Float.parseFloat(JOptionPane.showInputDialog("Porfavor Digite El Salario Basico Del Empleado"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite El año de Vinculacion"));
        if (salario > 120000 && año > 1990) { //El 8% es igal a 0.08
            JOptionPane.showMessageDialog(null, "El Empleado con Numero de Cedula: " + cedula + "\n" + "Tiene Derecho A Un Salario De:  " + "$" + (salario - 0.08));
        }
        if (salario < 550000 || año == 1990) {
            JOptionPane.showMessageDialog(null, "El Empleado con Numero de Cedula: " + cedula + "\n" + "Tiene Derecho A Un Salario De:  " + "$" + (salario - 0.2));
        } else {
            JOptionPane.showMessageDialog(null, "El Empleado con Numero de Cedula: " + cedula + "\n" + "Tiene Derecho A Un Salario De:  " + "$" + (salario - 0.5));
        }
        JOptionPane.showMessageDialog(null, "Muchas Gracias Por Utilizar Nuestro Software ┏(＾0＾)┛ ");
    }
}
