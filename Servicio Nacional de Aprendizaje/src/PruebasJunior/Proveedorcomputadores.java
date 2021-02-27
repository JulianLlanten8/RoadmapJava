/*
13 Un proveedor de computadores ofrece un descuento del 10% sin IVA, sí el computador cuesta $1.000.000 o más. 
Además, independientemente ofrece el 5% de descuento sí la marca del computador es ABACO. 
Determinar cuánto pagará un cliente por un computador de cualquier marca teniendo en cuenta que se cobra el IVA.
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class Proveedorcomputadores {

    public static void main(String[] args) {
        int costo = 0;
        int iva = 0;
        String marca = "";

        costo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del computador"));
        iva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el iva del computador"));
        marca = JOptionPane.showInputDialog("Ingrese la marca del computador");
        marca = marca.toUpperCase();
        System.out.println(marca);

        if ("ABACO".equals(marca))
        {
            costo -= ((costo / 100) * 5);
        }
        if (costo >= 1000000)
        {
            costo -= ((costo / 100) * 10);
        }
        System.out.println("El costo del computador es de: $" + (costo + iva));
    }
}
