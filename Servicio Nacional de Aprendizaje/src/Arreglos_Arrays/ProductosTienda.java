/*
Desarrolle un programa en JAVA que permita leer el nombre de 10 productos de una tienda y su correspondiente precio. 
La aplicación debe decir cuántos de ellos cuestan más de 3000 pesos y mostrar su nombre, precio y posición en pantalla.
Utilice arreglos para almacenar los precios y nombres de productos.
 */
package Arreglos_Arrays;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class ProductosTienda {

    public static void main(String[] args) {
        //int nombreProductos; 
        String[] nombreProductos = new String[5];
        float[] precio = new float[5];
        for (int i = 0; i < nombreProductos.length; i++) {
            nombreProductos[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto " + (i + 1));
        }
        for (int i = 0; i < precio.length; i++) {
            precio[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el precio del producto " + (i + 1)));
        }
        for (int i = 0; i < precio.length; i++) {
            float f = precio[i];
            System.out.println("El producto: " + nombreProductos[i] + " tiene un precio de: " + f);
            System.out.println("los numeros mayores a 3000 son:" + nombreProductos[i] + " con un precio de:" + precio[i]);
        }
        for (int i = 0; i < precio.length; i++) {
            if (precio[i] > 3000) {
                System.out.println("los numeros mayores a 3000 son: " + nombreProductos[i] + " con un precio de:" + precio[i]);
            }
        }
    }
}
