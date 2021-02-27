package Logica_De_La_Programacion;

import javax.swing.JOptionPane;

public class Tres_Numeros_Ultimo_digito_Igual {

    public static void main(String[] args) {
        int Digitado = 0;
        int Digitado2;
        int Digitado3;

        Digitado = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Un Numero de 2 Cifras"));
        if (Digitado > 9) {
            Digitado = Digitado % 10;
        } else {
            JOptionPane.showMessageDialog(null, "El Numero no tiene 2 Cifras");
        }

        Digitado2 = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Un Numero de 2 Cifras"));
        if (Digitado2 > 9) {
            Digitado2 = Digitado2 % 10;
        } else {
            JOptionPane.showMessageDialog(null, "El Numero no tiene 2 Cifras");
        }

        Digitado3 = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Digite Un Numero de 2 Cifras"));
        if (Digitado3 > 9) {
            Digitado3 = Digitado3 % 10;
        } else {
            JOptionPane.showMessageDialog(null, "El Numero no tiene 2 Cifras");
        }

        if (Digitado == Digitado2 && Digitado2 == Digitado3) {
            JOptionPane.showMessageDialog(null, "Los Ultimos digitos Son Iguales");
        } else {
            JOptionPane.showMessageDialog(null, "Los Ultimos Digitos No Son Iguales");
        }
        JOptionPane.showMessageDialog(null, "Muchas Gracias Por Utilizar Este Algoritmo" + "\n" + "                  ┏(＾0＾)┛  " + "\n" + "By:Julian Llanten");
    }
}
