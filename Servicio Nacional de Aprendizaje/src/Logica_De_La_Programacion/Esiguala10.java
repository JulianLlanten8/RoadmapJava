package Logica_De_La_Programacion;

import javax.swing.JOptionPane;

public class Esiguala10 {

    public static void main(String[] args) {
        int Digitar;
        int Numero = 10;

        Digitar = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Un Numero"));
        if (Digitar == Numero) {
            JOptionPane.showMessageDialog(null, "El Numero ingresado Es igual a 10 Ya Que usted Digito: " + Digitar);
        } else {
            JOptionPane.showMessageDialog(null, "EL Numero digitado Es Diferente a 10 Ya Que usted Digito " + Digitar);
        }
        JOptionPane.showMessageDialog(null, "Muchas Gracias Por Utilizar Este Algoritmo" + "\n" + "                    ┏(＾0＾)┛  ");
    }
}
