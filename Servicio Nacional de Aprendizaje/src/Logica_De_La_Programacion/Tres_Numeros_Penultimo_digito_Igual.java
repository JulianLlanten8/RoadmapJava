package Logica_De_La_Programacion;

import javax.swing.JOptionPane;

public class Tres_Numeros_Penultimo_digito_Igual {

    public static void main(String[] args) {
        int Digitado = 0;
        int Digitado2;
        int Digitado3;

        Digitado = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Un Numero de 3 Cifras o Mas"));
        if (Digitado > 99) {
            Digitado = Digitado / 10 % 10;
        } else {
            JOptionPane.showMessageDialog(null, "El Numero no tiene 3 Cifras");
        }

        Digitado2 = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Un Numero de 3 Cifras o Mas"));
        if (Digitado2 > 99) {
            Digitado2 = Digitado2 / 10 % 10;
        } else {
            JOptionPane.showMessageDialog(null, "El Numero no tiene 2 Cifras");
        }

        Digitado3 = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Un Numero de 3 Cifras o Mas"));
        if (Digitado3 > 99) {
            Digitado3 = Digitado3 / 10 % 10;
        } else {
            JOptionPane.showMessageDialog(null, "El Numero no tiene 2 Cifras");
        }
        //Verificamos que los Ultimos digitos Son iguales y si no No son iguales
        if (Digitado == Digitado2 && Digitado2 == Digitado3) {
            JOptionPane.showMessageDialog(null, "Los Penultimos digitos Son Iguales");
        } else {
            JOptionPane.showMessageDialog(null, "Los Penultimos Digitos No Son Iguales");
        }
        JOptionPane.showMessageDialog(null, "Muchas Gracias Por Utilizar Este Algoritmo" + "\n" + "                  ┏(＾0＾)┛  " + "\n" + "By:Julian Llanten");
    }
}
