package Logica_De_La_Programacion;

import javax.swing.JOptionPane;

public class CuatroDigitosCualesPares {

    public static void main(String[] args) {
        int Digitado = 0;
        int Digito2;
        int Digito1 = 0;
        int Digito4 = 0;

        Digitado = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Un Numero de Cuatro digittos"));
        if (Digitado > 999 && Digitado < 9999) {
            Digito1 = Digitado / 1000 % 10;
            Digito2 = Digitado / 100 % 10;
            Digito4 = Digitado % 10;
            Digitado = Digitado / 10 % 10;

            if (Digito1 % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El Primer Digito Es Par ");
            } else {
                JOptionPane.showMessageDialog(null, "El Primer Digito No Es Par ");
            }
            if (Digito2 % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El Segundo Digito Es Par ");
            } else {
                JOptionPane.showMessageDialog(null, "El Segundo Digito No Es Par ");
            }
            if (Digitado % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El Tercer Digito Es Par ");
            } else {
                JOptionPane.showMessageDialog(null, "El Tercer Digito No Es Par ");
            }
            if (Digito4 % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El Cuarto Digito Es Par ");
            } else {
                JOptionPane.showMessageDialog(null, "El Cuarto Digito No Es Par ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El Numero " + Digitado + " Ingresado Tiene Menos o Más De Los digitos Requeridos: ");
        }
        JOptionPane.showMessageDialog(null, "Muchas Gracias Por Utilizar Este Algoritmo" + "\n" + "                  ┏(＾0＾)┛  " + "\n" + "By:Julian Llanten");
    }
}
