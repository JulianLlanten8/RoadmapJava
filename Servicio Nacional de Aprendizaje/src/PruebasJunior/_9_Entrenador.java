/*
10. Un Zoólogo pretende determinar el porcentaje de animales que 
hay en las siguientes tres categorías de edades: de 0 a 1 año, de 
mas de 1 año y menos de 3 y de 3 o mas años. El zoológico 
todavía no esta seguro del animal que va a estudiar. Si se decide 
por elefantes solo tomara una muestra de 20 de ellos; si se decide 
por las jirafas, tomara 15 muestras, y si son chimpancés tomara 40.
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _9_Entrenador {

    public static void main(String[] args) {

        float cachorros = 0;
        float jovenes = 0;
        float adultos = 0;
        int elefantes = 1;
        int jirafas = 1;
        int chimpances = 1;
        int opcion = 0;
        int edad = 0;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el numero de la categoria del animal\n"
                + "1. Elefantes\n"
                + "2. JIrafas\n"
                + "3. Chimpances\n"));
        if (opcion < 0)
        {
            opcion *= (-1);
        }
        switch (opcion)
        {

            case 1:
                while (elefantes < 20)
                {
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del elefante #" + elefantes));
                    elefantes++;
                    if (edad >= 0 && edad <= 1)
                    {
                        cachorros++;
                    }
                    if (edad > 1 && edad < 3)
                    {
                        jovenes++;
                    }
                    if (edad >= 3)
                    {
                        adultos++;
                    }
                }
                System.out.println(elefantes);
                JOptionPane.showMessageDialog(null, "El porcentaje de elefantes cachorros es: " + ((cachorros / 100) * elefantes));
                JOptionPane.showMessageDialog(null, "El porcentaje de elefantes jovenes es: " + ((jovenes / 100) * elefantes));
                JOptionPane.showMessageDialog(null, "El porcentaje de elefantes Adulto es: " + ((adultos / 100) * elefantes));
                break;
            case 2:

                while (jirafas < 15)
                {
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de las jirafa #" + jirafas));
                    jirafas++;
                    if (edad >= 0 && edad <= 1)
                    {
                        cachorros++;
                    }
                    if (edad > 1 && edad < 3)
                    {
                        jovenes++;
                    }
                    if (edad >= 3)
                    {
                        adultos++;
                    }
                }
                System.out.println(jirafas);
                System.out.println(cachorros);
                System.out.println(jovenes);
                System.out.println(adultos);
                JOptionPane.showMessageDialog(null, "El porcentaje de elefantes cachorros es: " + ((cachorros / 100) * jirafas));
                JOptionPane.showMessageDialog(null, "El porcentaje de elefantes jovenes es: " + ((jovenes / 100) * jirafas));
                JOptionPane.showMessageDialog(null, "El porcentaje de elefantes adultos es: " + ((adultos / 100) * jirafas));
                break;
            case 3:
                while (chimpances < 40)
                {
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del elefante #" + chimpances));
                    chimpances++;
                    if (edad >= 0 && edad <= 1)
                    {
                        cachorros++;
                    }
                    if (edad > 1 && edad < 3)
                    {
                        jovenes++;
                    }
                    if (edad >= 3)
                    {
                        adultos++;
                    }
                }
                System.out.println(chimpances);
                JOptionPane.showMessageDialog(null, "El porcentaje de elefantes cachorros es: " + Float.valueOf(((cachorros / 100) * chimpances)));
                JOptionPane.showMessageDialog(null, "El porcentaje de elefantes jovenes es: " + Float.valueOf((jovenes / 100) * chimpances));
                JOptionPane.showMessageDialog(null, "El porcentaje de elefantes adultos es: " + Float.valueOf((adultos / 100) * chimpances));
                break;
            default:
                JOptionPane.showMessageDialog(null, "La opcion ingresada es incorrecta");
        }
    }
}
