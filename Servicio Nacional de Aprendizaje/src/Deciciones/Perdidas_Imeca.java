/*
Una fábrica ha sido sometida a un programa de control para la cual se efectúa una revisión de los puntos imeca generados por la fábrica,
el programa de control consiste en medir los puntos imeca que emite la fábrica en 5 días de una semana, 
si el promedio es superior a los 170 puntos entonces 
tendrá la sanción de parar su producción por una semana ; una multa del 50% de las ganancias diarias cuando no se detiene la producción,
si el promedio obtenido por imeca es de 170 o superior no tendrá ninguna sanción ni multa 
el dueño de la fábrica desea saber cuanto dinero perderá después de ser sometido a la sanción.
 */
package Deciciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class Perdidas_Imeca {

    public static void main(String[] args) {
        int imeca;
        int dia1;
        int dia2;
        int dia3;
        int dia4;
        int dia5;
        dia1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese el valor IMECA del dia 1"));
        dia2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese el valor IMECA 2"));
        dia3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese el valor IMECA 3"));
        dia4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese el valor IMECA 4"));
        dia5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese el valor IMECA 5"));
        imeca = (dia1 + dia2 + dia3 + dia4 + dia5) / 5;
        if (imeca > 170) {
            int Multa = Integer.parseInt(JOptionPane.showInputDialog("la empresa esta exenta ala sancion.\n ¿Que acción tomo la empresa?\n"
                    + "1.Se detuvo? \n"
                    + "2.Continuo?\n"));

            switch (Multa) {
                case 1:
                    JOptionPane.showMessageDialog(null, "La empresa paro su producción y pierde las ganacias de una semana");
                    int Ganancia1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese la posible ganacia del dia 1"));
                    int Ganancia2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese la posible ganacia del dia 2"));
                    int Ganancia3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese la posible ganacia del dia 3"));
                    int Ganancia4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese la posible ganacia del dia 4"));
                    int Ganancia5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese la posible ganacia del dia 5"));
                    int Ganancias = Ganancia1 + Ganancia2 + Ganancia3 + Ganancia4 + Ganancia5;
                    JOptionPane.showMessageDialog(null, "La empresa perderia " + "$" + Ganancias);
                    break;
                case 2:
                    Ganancia1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese la ganacia del dia 1"));
                    Ganancia2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese la ganacia del dia 2"));
                    Ganancia3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese la ganacia del dia 3"));
                    Ganancia4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese la ganacia del dia 4"));
                    Ganancia5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese la ganacia del dia 5"));
                    Ganancias = Ganancia1 + Ganancia2 + Ganancia3 + Ganancia4 + Ganancia5;
                    JOptionPane.showMessageDialog(null, "La empresa perderia  " +"$" +Ganancias + Ganancias / 50 * 100);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Elija una opción valida; hasta la proxima ☜(ﾟヮﾟ☜)");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La empresa cumple con los requisitos establecidos y no tendra sancion $_$ ");
        }JOptionPane.showMessageDialog(null, "Muchas gracias por utilizar nueestro algoritmo ♪ ┏(*^v^*)┛  ♪\n ");
    }

}
