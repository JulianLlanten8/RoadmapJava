/*
8. En un centro de verificación de automóviles se desea saber el promedio de puntos contaminantes de los primeros 25 automóviles 
que lleguen. Asimismo se desea saber los puntos contaminantes del carro que menos contamino y del que mas contamino.
 */
package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _8_CentroDeVerificacion {

    public static void main(String[] args) {
        int primeroAutos = 5;
        int promedioContaminantes = 0;
        int masContamina = 0;
        int menosContamina = 1000000000;
        int puntosContaminantes = 0;
        while (primeroAutos > 0)
        {
            puntosContaminantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puntos contaminantes"));
            if (menosContamina>puntosContaminantes  )
            {
                menosContamina = puntosContaminantes;
            }
            if (masContamina < puntosContaminantes)
            {
                masContamina = puntosContaminantes;
            }
            
            promedioContaminantes += puntosContaminantes;
            primeroAutos--;
            System.out.println(puntosContaminantes);
        }
        promedioContaminantes=(promedioContaminantes/25);
        JOptionPane.showMessageDialog(null, "El promedio de puntos contaminantes de los veiculos es: " + promedioContaminantes);
        JOptionPane.showMessageDialog(null, "Los puntos contaminantes del carro que menos contamino : " + menosContamina);
        JOptionPane.showMessageDialog(null, "Los puntos contaminantes del carro que mas contamino : " + masContamina);
    }
}
