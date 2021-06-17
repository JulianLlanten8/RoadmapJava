/*
 * Llamar las Operaciones de claculadora
 */
package POO;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class calculatorBasicJoplinPane {

    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));

        int seleccionador = Integer.parseInt(
                JOptionPane.showInputDialog("Selecione la operacion que desea realizar \n"
                        + "1.Sumar \n"
                        + "2.Restar \n"
                        + "3.Multiplicar \n"
                        + "4.dividir \n"
                        + "5.Modulo"));

        Calculadora calc = new Calculadora();

        switch (seleccionador) {
            case 1:
                JOptionPane.showMessageDialog(null, "La suma de: \n" + numero1 + " + " + numero2 + " = " + calc.suma(numero1, numero2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "La resta de: \n" + numero1 + " - " + numero2 + " = " + calc.resta(numero1, numero2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "La multiplicacion de: \n" + numero1 + " * " + numero2 + " = " + calc.multiplicacion(numero1, numero2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "La divicion de: \n" + numero1 + "  / " + numero2 + " = " + calc.divicion(numero1, numero2));
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "La modulo de: \n" + numero1 + " mod " + numero2 + " = " + calc.modulo(numero1, numero2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Elija una operacion que este en la lista");
        }
    }
}
