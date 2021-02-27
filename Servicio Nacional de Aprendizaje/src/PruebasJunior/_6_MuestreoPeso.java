/*
6. Una persona debe realizar un muestreo con 50 personas para determinar el promedio de peso de los niños, jóvenes, adultos y
viejos que existen en su zona habitacional. Se determinan las categorías con base en la sig, tabla:
CATEGORIA EDAD
Niños 0 - 12
Jóvenes 13 - 29
Adultos 30 - 59
Viejos 60 en adelante
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _6_MuestreoPeso {

    public static void main(String[] args) {
        int personas = 1;
        int peso = 0;
        int edad = 0;
        int pesoNiños = 0;
        int contadorNiños = 0;
        int pesoJovenes = 0;
        int contadorJovenes = 0;
        int pesoAdultos = 0;
        int contadorAdultos = 0;
        int pesoViejos = 0;
        int contadorViejos = 0;

        while (personas <= 50)
        {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona: #" + personas));
            peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de la persona: #" + personas));

            if (edad > -1 && edad <= 12)
            {
                contadorNiños++;    //7
                pesoNiños += peso;
            }
            if (edad > 12 && edad <= 29)
            {
                contadorJovenes++; //15
                pesoJovenes += peso;
            }
            if (edad > 29 && edad <= 59)
            {
                contadorAdultos++; //33
                pesoAdultos += peso;
            }
            if (edad > 59)
            {
                contadorViejos++;//66
                pesoViejos += peso;
            }

            personas++;
        }

        JOptionPane.showMessageDialog(null, "El  promedio de peso de los niños es: " + (pesoNiños / contadorNiños) + "\n"
                + "El  promedio de peso de los jovenes es: " + (pesoJovenes / contadorJovenes) + "\n"
                + "El  promedio de peso de los adultos es: " + (pesoJovenes / contadorAdultos) + "\n"
                + "El  promedio de peso de los viejos es: " + (pesoViejos / contadorViejos));
    }
}
