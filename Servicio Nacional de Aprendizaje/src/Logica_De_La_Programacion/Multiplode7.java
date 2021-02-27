package Logica_De_La_Programacion;

import javax.swing.JOptionPane;

public class Multiplode7 {

    public static void main(String[] args) {
        int Digitado;
        int Resultado = 0;

        Digitado = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Un Numero"));
        if (Digitado % 7 == Resultado) {
            JOptionPane.showMessageDialog(null, "EL Numero Digitado Es Multiplo De 7 Ya Que usted Digito: " + Digitado);
        } else {
            JOptionPane.showMessageDialog(null, "El Numero ingresado No Es Multiplo De 7 Que usted Digito: " + Digitado);
        }
        JOptionPane.showMessageDialog(null, "Muchas Gracias Por Utilizar Este Algoritmo" + Digitado + "\n" + "                     ┏(＾0＾)┛  " + "\n" + "By:           Julian Llanten");
    }
}
