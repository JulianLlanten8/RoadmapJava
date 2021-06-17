package Celurares;

import javax.swing.JOptionPane;

/**
 * @param args the command line arguments
 */
public class Celularsmarphone {

    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog("Ingrese la marca del celular");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo");
        String color = JOptionPane.showInputDialog("Ingrese el color");
        String memoria = JOptionPane.showInputDialog("Ingrese la memoria");
        int ram = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de memoria ram"));
        Double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del celular"));

        Celular smarphone = new Celular(marca, modelo, color, memoria, ram, precio);

        JOptionPane.showMessageDialog(null, 
                "La marca del Celular es: " + smarphone.getMarca()
                + "\nel modelo del Celular: " + smarphone.getModelo()
                + "\nel color del Celular: " + smarphone.getColor()
                + "\nla memoria del Celular: " + smarphone.getMemoria()
                + "\nla ram de Celular es: " + smarphone.getRam()
                + "\nel precio del Celular es: " + smarphone.getPrecio());
    }

}
