package Automoviles;

import javax.swing.JOptionPane;

public class UsaAutomovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo");
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del vehiculo"));
        String color = JOptionPane.showInputDialog("Ingrese el  color");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del vehiculo"));

        Automovil Camaro = new Automovil(marca, color, modelo, precio);

        JOptionPane.showMessageDialog(null, "La marca del veiculo es: " + Camaro.getMarca()
                + "\nel color de vehiculo es: " + Camaro.getColor()
                + "\nel modelo del vehiculo: " + Camaro.getModelo()
                + "\nel precio del vehiculo es: " + Camaro.getPrecio());
    }

}
