/*
12 Hacer un algoritmo que lea los siguientes datos: nombre, dirección y número de estrato al que pertenece. El algoritmo 
deberá imprimir nombre y valor de la cuenta de servicios. Para calcular el valor de los servicios públicos se cobra un cargo fijo 
de $80.000 más un porcentaje sobre el cargo fijo que depende del número del estrato, sí el estrato es 1 ó 2 el porcentaje a 
cobrar es del 5%, sí es 3 ó 4 el porcentaje será el 10% y sí es 5 ó 6 el porcentaje es del 20%.
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _12_ServiciosPublicos {

    public static void main(String[] args) {
        int estrato = 0;
        int cargofijo = 80000;
        String nombre = "";
        String direccion = "";

        estrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el estrato del cliente"));
        nombre=JOptionPane.showInputDialog("Ingrese el nombre del usuario");
        direccion=JOptionPane.showInputDialog("Ingrese el nombre del usuario");
        
        if (estrato >= 1 && estrato <= 2)
        {
            cargofijo += ((cargofijo / 100) * 5);
            JOptionPane.showMessageDialog(null, "El valor de los servicos publicos del cliente " + nombre + " es de: $" + cargofijo);
        } else if (estrato > 2 && estrato < 5)
        {
            cargofijo += ((cargofijo / 100) * 10);
            JOptionPane.showMessageDialog(null, "El valor de los servicos publicos del cliente " + nombre + " es de: $" + cargofijo);
        } else if (estrato > 4 && estrato < 7)
        {
            cargofijo += ((cargofijo / 100) * 20);
            JOptionPane.showMessageDialog(null, "El valor de los servicos publicos del cliente " + nombre + " es de: $" + cargofijo);
        } else
        {
            JOptionPane.showMessageDialog(null, "El estrato del cliente no es valido ");
        }
    }
}
