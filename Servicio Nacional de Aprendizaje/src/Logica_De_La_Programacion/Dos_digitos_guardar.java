package Logica_De_La_Programacion;

import javax.swing.JOptionPane;

public class Dos_digitos_guardar {

    public static void main(String[] args) {
        int Digitado = 0;
        int Digito2;

        Digitado = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Un Numero"));
        if (Digitado < 100) {
            Digito2 = Digitado / 10;
            JOptionPane.showMessageDialog(null, "EL Primer Numero Digitado Fue: " + Digito2);
            Digitado = Digitado % 10;
            JOptionPane.showMessageDialog(null, "EL Segundo Numero Digitado Fue: " + Digitado);
        } else {
            JOptionPane.showMessageDialog(null, "El Numero " + Digitado + " Ingresado Tiene Más de Dos Digitos: ");
        }
        JOptionPane.showMessageDialog(null, "Muchas Gracias Por Utilizar Este Algoritmo" + "\n" + "                  ┏(＾0＾)┛  " + "\n" + "By:Julian Llanten");
    }
}
