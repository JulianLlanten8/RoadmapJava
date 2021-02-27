package Tareas_En_Base_A_Casos;

import javax.swing.JOptionPane;

public class Switch_Seleccionar {

    public static void main(String[] args) {
        int numero, numero1 = 0, resultado = 0;

        int Operacion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al sistema digite el numero de la operación que operación desea realizar?\n"
                + "1.  Suma\n"
                + "2.  Resta\n"
                + "3.  Multiplicación\n"
                + "4.  División"));

        switch (Operacion) {
            case 1:
                JOptionPane.showMessageDialog(null, "Usted a elegido hacer una suma entre 2 numeros");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese su primer sumando"));
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese su segundo sumando"));
                resultado = numero + numero1;
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Usted a elegido hacer una Resta entre 2 numeros");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el numero a Restar"));
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el Restador"));
                resultado = numero - numero1;
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Usted a elegido hacer una Multiplicacion entre 2 numeros");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el numero a Multiplicar"));
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el multiplicador"));
                resultado = numero * numero1;
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Usted a elegido hacer una Divicion entre 2 numeros");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el dividendo "));
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese su primer Divisor"));
                resultado = numero / numero1;
                break;
        }
        JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado);
    }
}
