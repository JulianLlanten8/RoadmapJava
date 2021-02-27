package Logica_De_La_Programacion;

import javax.swing.JOptionPane;

public class Cuatro_Digitos_Segundo_igual_Penultimo {

    public static void main(String[] args) {
        int Digitado = 0;
        int Digito2;
        int Resultado;

        Digitado = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Un Numero de Cuatro Digitos"));
        if (Digitado > 999 && Digitado < 9999) {
            Digito2 = Digitado / 100 % 10;
            Digitado = Digitado / 10 % 10;

            if (Digito2 == Digitado) {
                JOptionPane.showMessageDialog(null, "El Segundo Digito Es Igual Al Penultimo ");
            } else {
                JOptionPane.showMessageDialog(null, "El Segundo Digito No Es Igual Al Penultimo ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El Numero " + Digitado + " Ingresado Tiene Menos o Más De Los digitos Requeridos: ");
        }
        JOptionPane.showMessageDialog(null, "Muchas Gracias Por Utilizar Este Algoritmo" + "\n" + "                  ┏(＾0＾)┛  " + "\n" + "By:Julian Llanten");
    }
}
