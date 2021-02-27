/*
4. Calcular e imprimir la tabla de multiplicar de un número cualquiera. 
Imprimir el multiplicando, el multiplicador y el producto. 
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _4_Tabla_Multiplica {

    public static void main(String[] args) {
        int multiplicado = 0;
        int multiplicador = 1;
        int producto = 0;

        multiplicado = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de la tabla que desea ver"));
        while (multiplicador <= 10)
        {
            producto = multiplicado * multiplicador;
            System.out.println(multiplicado + "x" + multiplicador + "=" + producto);
            multiplicador++;
        }
    }
}
