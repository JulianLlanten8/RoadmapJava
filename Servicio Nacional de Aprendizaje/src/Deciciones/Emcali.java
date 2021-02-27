/*
 EMCALI
Requiere recalcular la factura de energía de los consumidores. 
Para ello, se necesita de un programa que lea el estrato social y el valor de consumo del cliente, y determine el valor básico a adicionar para establecer el nuevo valor de la factura.
 */
package Deciciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Julian Llanten
 */
public class Emcali {

    public static void main(String[] args) {

        int Consumo;

        int Operacion = Integer.parseInt(JOptionPane.showInputDialog("Te Damos La Bienvenida Al Programa De Facturacion De EMCALI \n" + "Porfavor Seleciona El Estrato Al Que vas a facturar \n"
                + "1.Estrato 1\n"
                + "2.Estrato 2\n"
                + "3.Estrato 3\n"
                + "4.Estarto 4"));

        switch (Operacion) {
            case 1:
                JOptionPane.showMessageDialog(null, "Usted A Elegido Estrato 1");
                Consumo = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Ingrese El Consumo De Energia Del Cliente"));
                Consumo += 500;
                JOptionPane.showMessageDialog(null, "El Consumo Total de Energia es: " + Consumo);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Usted a elegido Estrato 2");
                Consumo = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Ingrese El Consumo De Energia Del Cliente"));
                Consumo += 700;
                JOptionPane.showMessageDialog(null, "El Consumo Total de Energia es: " + Consumo);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Usted a elegido Estrato 3");
                Consumo = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Ingrese El Consumo De Energia Del Cliente"));
                Consumo += 4800;
                JOptionPane.showMessageDialog(null, "El Consumo Total de Energia es: " + Consumo);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Usted a elegido Estrato 4");
                Consumo = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Ingrese El Consumo De Energia Del Cliente"));
                Consumo += 6700;
                JOptionPane.showMessageDialog(null, "El Consumo Total de Energia es: " + Consumo);
                break;
            default:
                JOptionPane.showMessageDialog(null, "La Categoría Seleccionada No Es Válida");
        }
        JOptionPane.showMessageDialog(null, "Muchas Gracias Por Utilizar Nuestro Algoritmo ┏(＾0＾)┛ ");
    }
}
