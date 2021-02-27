/*
3) La Universidad del Valle requiere un programa que le permita conocer cómo califican los estudiantes la comida de la cafetería central. 
Para ello definió una escala de 1 a 10 (1 denota horrible y 10 denota excelente). El programa debe ser capaz capturar la calificación 
de cualquier número de estudiantes (no se sabe cuántos estudiantes se encuestarán, así que cuando el encuestador ingrese la calificación de O, 
se sabrá que la encuesta habrá concluido). El programa deberá mostrar en su salida cuántos estudiantes fueron encuestados,
así como el resumen de la encuesta con histograma así:
Estudiantes encuestados: 111 
Frecuencia de las calificaciones:
Calificacion    numero_estudiantes historigrama.
1               3                       ***
2               2                       **
3               10                     **********

 */
package Arreglos_Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class CafeteriaCalificación {

    public static void main(String[] args) {
        int estudiantes = 0;
        String[] votacion = new String[11];
        int[] calificacionF = new int[11];
        int calificacion = -1;
        for (int i = 1; i < votacion.length; i++) {
            votacion[i]="";
        }

        do {
            calificacion = Integer.parseInt(JOptionPane.showInputDialog("porfavor ingrese su calificaion"));
            estudiantes++;
            if (calificacion == 1) {
                calificacionF[1] = calificacionF[1] + 1;
                votacion[1]= votacion[1]+"*";
            }
            if (calificacion == 2) {
                calificacionF[2] = calificacionF[2] + 1;
                votacion[2]= votacion[2]+"*";
            }
            if (calificacion == 3) {
                calificacionF[3] = calificacionF[3] + 1;
                votacion[3]= votacion[3]+"*";
            }
            if (calificacion == 4) {
                calificacionF[4] = calificacionF[4] + 1;
                votacion[4]= votacion[4]+"*";
            }
            if (calificacion == 5) {
                calificacionF[5] = calificacionF[5] + 1;
                votacion[5]= votacion[5]+"*";
            }
            if (calificacion == 6) {
                calificacionF[6] = calificacionF[6] + 1;
                votacion[6]= votacion[6]+"*";
            }
            if (calificacion == 7) {
                calificacionF[7] = calificacionF[7] + 1;
                votacion[7]= votacion[7]+"*";
            }
            if (calificacion == 8) {
                calificacionF[8] = calificacionF[8] + 1;
                votacion[8]= votacion[8]+"*";
            }
            if (calificacion == 9) {
                calificacionF[9] = calificacionF[9] + 1;
                votacion[9]= votacion[9]+"*";
            }
            if (calificacion == 10) {
                calificacionF[10] = calificacionF[10] + 1;
                votacion[10]= votacion[10]+"*";
            }
        } while (calificacion != 0);
        System.out.println("calificacion \t num. estudiantes \t Historigrama");
        for(int x=1; x<calificacionF.length;x++){
            System.out.println(x+"\t"+calificacionF[x]+"\t"+votacion[x]);
        }
        System.out.println("Estudiantes encuestados: "+(estudiantes-1));
    }
}
