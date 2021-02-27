package Logica_De_La_Programacion;

import javax.swing.JOptionPane;

public class TerminaEn7 {

    public static void main(String[] args) {
        int Digitado;
        int Resultado = 7;

        Digitado = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Numero de 2 Digitos"));
        if (Digitado % 10 == Resultado) {
            JOptionPane.showMessageDialog(null, "EL Numero Digitado Termina en 7 Ya Que usted Digito: " + Digitado);
        } else {
            JOptionPane.showMessageDialog(null, "El Numero ingresado No Termina en 7 ya Que usted Digito: " + Digitado);
        }
        JOptionPane.showMessageDialog(null, "!Muchas Gracias! Por Utilizar Este Algoritmo" + "\n" + "                     ┏(＾0＾)┛  " + "\n" + "By:           Julian Llanten");
    }
}
