package Automoviles;

import javax.swing.JOptionPane;

public class UsaAutomovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo");
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del vehiculo"));
        String tipo = tipo = JOptionPane.showInputDialog("Ingrese la marca del tipo");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del vehiculo"));

        Automovil auto = new Automovil(marca, modelo, tipo, precio);

        JOptionPane.showMessageDialog(null, "La marca del veiculo es: " + auto.getMarca()
                + "\nel modelo del vehiculo: " + auto.getModelo()
                + "\nel tipo de vehiculo es: " + auto.getTipo()
                + "\nel precio del vehiculo es: " + auto.getPrecio());
    }

}
