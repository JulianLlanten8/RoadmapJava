/*
3.Suponga que se desea saber la nota promedio del curso de algoritmia,
diseñe un algoritmo que solicite la cantidad de estudiantes del curso y el promedio de cada estudiante.
solucion:
Entrada de datos: iniamos pidiendo le al usuario que ingrese el numero de estudiantes del curso y el promedio de cada uno,
Proceso: el numero de estudiantes lo ponemos en una ciclo hasta que llegue al ultimo,durante su ejecucion el usuario introduciar
el promedio de cada alumno.
Salida: Se le mostrara al usuario los resultados del promedio de notas del curso de algoritmia.
 */
package Repeticiones;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class PromedioNumeroAlumnos {

    public static void main(String[] args) {
        int numeroAlumnos = 0;
        int sumaPromedio = 0;
        int promedio = 0;
        numeroAlumnos = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor ingrese el numero de alumnos de algoritmia"));
        for (int i = 1; i <= numeroAlumnos; i++) {
            promedio = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor ingrese la #" + i + " nota"));

            sumaPromedio += promedio;
        }
        JOptionPane.showMessageDialog(null, "El promedio de de notas del curso de algoritmia es = " + (sumaPromedio / numeroAlumnos));
        JOptionPane.showMessageDialog(null, "Muchas gracias por utilizar nueestro algoritmo ♪ ┏(*^v^*)┛  ♪\n Que tengas bonito dia!");
    }

}
