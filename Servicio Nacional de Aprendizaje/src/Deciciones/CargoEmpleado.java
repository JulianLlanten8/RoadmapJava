/*
Una empresa, cada empleado debe teclear su codigo identificador de 3 crifras.
Escribir un programa que muestre la categoria del empleado, teniendo en cuenta que:
1. Si el codigo es divisible por 2,3 y 5, su categoría es director generar.
2. Si el código es divisible por 3 y 5, pero no por 2 la categoría es directivo.
3. Si el código es divisible por 2 pero no por 3 ni por 5, su categoría es Staff
4. Si el codigo no es divisible ni por 2, 3 o 5, su categoría es seguridad.
 */
package Deciciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia Llanten
 */
public class CargoEmpleado {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Porfavor digite su numero de identificacion"));

        if (numero % 2 == 0 && numero % 3 != 0 && numero % 5 != 0) {
            JOptionPane.showMessageDialog(null, "Su Categoria es  Staff");
        }
        if (numero % 2 != 0 && numero % 3 == 0 && numero % 5 == 0) {
            JOptionPane.showMessageDialog(null, "Su Categoria es  Directivo");
        }
        if (numero % 3 == 0 && numero % 2 == 0 && numero % 5 == 0) {
            JOptionPane.showMessageDialog(null, "Su categoria es Director General");
        }
        if (numero % 2 != 0 && numero % 3 != 3 && numero % 5 != 5) {
            JOptionPane.showMessageDialog(null, "Su categoria es  Seguridad");
        }
    }
}
