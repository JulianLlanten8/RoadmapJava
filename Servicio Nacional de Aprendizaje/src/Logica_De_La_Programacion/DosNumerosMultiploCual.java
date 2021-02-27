package Logica_De_La_Programacion;

import javax.swing.JOptionPane;

public class DosNumerosMultiploCual {

    public static void main(String[] args) {
        int Numero1;
        int Numero2;

        Numero1 = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Un Numero "));
        if (Numero1 >0) {
        } else {
            JOptionPane.showMessageDialog(null, "El Numero no Corresponde a lo Requerido");
        }

        Numero2 = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Un Numero"));
        if (Numero2 > 0) {
        } else {
            JOptionPane.showMessageDialog(null, "El Numero no Corresponde a lo Requerido");
        }
        //Para saber si un Numero es multiplo de otro se le extrae el modulo entre el segundo y si el resutado es cero quiere decie que es multiplo
        if (Numero1 % Numero2 == 0) {
            JOptionPane.showMessageDialog(null, "El primer Numero "+Numero1+ " Es Multiplo de "+Numero2+" El Segundo Numero");
        } else {
            JOptionPane.showMessageDialog(null, "El primer Numero "+Numero1+ " No Es Multiplo de "+Numero2+" El Segundo Numero");
        }
        JOptionPane.showMessageDialog(null, "Muchas Gracias Por Utilizar Este Algoritmo" + "\n" + "                  ┏(＾0＾)┛  " + "\n" + "By:Julian Llanten");
    }
}
