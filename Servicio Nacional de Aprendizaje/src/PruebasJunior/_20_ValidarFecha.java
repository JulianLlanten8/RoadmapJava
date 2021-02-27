/*
20. Solicitar al usuario una fecha (dd:mm:aaaa) y comprobar si es 
correcta. Para que una fecha sea correcta es necesario: • El año debe 
ser mayor que cero. • El mes debe estar entre 1 y 12. • Dependiendo del 
mes que sea, el día debe estar dentro de los límites válidos. Los meses 
que tienen 31 días son 1, 3, 5, 7, 8, 10 y 12. Los meses de 30 días son 
4, 6, 9 y 11. El mes de 28 días es 2, excepto en un año bisiesto que es 29 días.
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _20_ValidarFecha {

    public static void main(String[] args) {
        int dia = 0;
        int mes = 0;
        int año = 0;
        int meses31Dias = 0;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Año"));

        if (año > 0)
        {
            if (mes > 1 && mes < 13)
            {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                {
                    //dia mayor a 31
                    if (dia > 0 && dia < 32)
                    {
                        JOptionPane.showMessageDialog(null, "La fecha " + dia + ":" + mes + ":" + año + " esta correcta ");
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "La fecha " + dia + ":" + mes + ":" + año + " esta Incorrecta ");
                    }
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
                {
                    //dia menor a 31
                    if (dia > 0 && dia < 31)
                    {
                        JOptionPane.showMessageDialog(null, "La fecha " + dia + ":" + mes + ":" + año + " esta correcta ");
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "La fecha " + dia + ":" + mes + ":" + año + " esta Incorrecta ");
                    }
                } else if (mes == 2)
                {
                    int añoBiciesto = ((año % 100) % 4);
                    if (dia > 0 && dia <= 28)
                    {
                        JOptionPane.showMessageDialog(null, "La fecha " + dia + ":" + mes + ":" + año + " esta correcta ");
                    } else if (añoBiciesto == 0 && dia > 0 && dia <= 29)
                    {
                        JOptionPane.showMessageDialog(null, "La fecha " + dia + ":" + mes + ":" + año + " esta correcta y este año fue biciesto");
                    }
                } else
                {
                    JOptionPane.showMessageDialog(null, "La fecha " + dia + ":" + mes + ":" + año + " esta Incorrecta ");
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "La fecha " + dia + ":" + mes + ":" + año + " esta Incorrecta ");
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "La fecha " + dia + ":" + mes + ":" + año + " esta Incorrecta ");
        }
    }
}
