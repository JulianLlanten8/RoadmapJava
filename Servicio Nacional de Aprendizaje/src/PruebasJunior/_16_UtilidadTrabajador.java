/*
16 Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades sí este se le asigna como un porcentaje de su 
salario mensual que depende de su antigüedad en la empresa de acuerdo con la siguiente tabla:
Tiempo Utilidad
 Menos de 1 año 5 % del salario
 1 año o más y menos de 2 años 7% del salario
 2 años o más y menos de 5 años 10% del salario
 5 años o más y menos de 10 años 15% del salario
 10 años o más 20% del salario
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _16_UtilidadTrabajador {

    public static void main(String[] args) {
        float meses = 0;
        int salario = 0;
        int utilidad = 0;

        salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del trabajador"));
        meses = Float.parseFloat(JOptionPane.showInputDialog("Ingrese los meses trabajados por el trabajador"));
        if (meses < 12)
        {
            utilidad = (salario / 100) * 5;
        } else if (meses >= 12 && meses < 24)
        {
            utilidad = (salario / 100) * 7;
        } else if (meses >= 24 && meses < 60)
        {
            utilidad = (salario / 100) * 10;
        } else if (meses >= 60 && meses < 120)
        {
            utilidad = (salario / 100) * 15;
        } else if (meses >= 120)
        {
            utilidad = (salario / 100) * 20;
        }
        JOptionPane.showMessageDialog(null,"La utilidad que recibe anualmente el trabajador es de: "+utilidad*12);
    }
}
