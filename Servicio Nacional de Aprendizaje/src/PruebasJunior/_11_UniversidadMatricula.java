/*
11 Cierta Universidad para liquidar el pago de matricula de un 
estudiante le exige los siguientes datos: Numero de inscripción, 
nombre, patrimonio, estrato social. La universidad cobra un valor 
constante de $500.000. Sí el patrimonio es mayor de $2.000.000 y 
el estrato es superior a 3 se le incrementa un porcentaje del 3% 
sobre el patrimonio. Hacer un algoritmo que muestre: nombre y 
pago de la matricula de un estudiante.
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _11_UniversidadMatricula {

    public static void main(String[] args) {
        int inscripcion = 0;
        String nombre = "";
        int patrimonio = 0;
        int estrato = 0;
        int porcentaje = 3;
        int matricula = 500000;

        inscripcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la inscripcion"));
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        patrimonio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el patrimonio del estudiante " + nombre));
        estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato del estudiante " + nombre));

        if (patrimonio > 2000000 && estrato > 3)
        {
            matricula += (patrimonio / 100) * porcentaje;
        }
        JOptionPane.showMessageDialog(null, "El pago de la matricula del estudiante " + nombre + " con la inscripcion "
                + inscripcion + " es de: " + matricula);
    }
}
