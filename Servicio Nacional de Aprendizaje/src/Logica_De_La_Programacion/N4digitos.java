package Logica_De_La_Programacion;

import javax.swing.JOptionPane;

public class N4digitos {

    public static void main(String[] args) {
        int Digitado;
        int Maximo = 9999;
        Digitado = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Un Numero Menor a 10.000 Digitos"));
        if (Digitado < Maximo) {
            Digitado = (int) (Math.log10(Digitado) + 1); //Me da la base del Numero digitado
            JOptionPane.showMessageDialog(null, "EL Numero Digitado Tiene: " + Digitado + " Digitos ");
        } else {
            JOptionPane.showMessageDialog(null, "EL Numero:" + Digitado + "Tiene Mas de 4 digitos ");
        }
        JOptionPane.showMessageDialog(null, "Muchas Gracias Por Utilizar Este Algoritmo" + "\t" + "┏(＾0＾)┛  " + "\n" + "  By:      Julian Llanten");
        JOptionPane.showMessageDialog(null, args);
    }
}
