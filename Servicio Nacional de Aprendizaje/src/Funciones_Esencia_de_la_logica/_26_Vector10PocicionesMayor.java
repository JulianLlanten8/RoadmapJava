package Funciones_Esencia_de_la_logica;

import javax.swing.JOptionPane;

/*
26. Construir una función que reciba como parámetro un vector de 10 posiciones enteras y retorne el mayor de los datos del vector.
 */
/**
 * @author Familia Llanten
 */
public class _26_Vector10PocicionesMayor {

    public static int VectorNumeroMayor(int vector[]) {
        vector = new int[10];
        int mayor = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
//            JOptionPane.showMessageDialog(null, vector[i]);//imprime el valor de vector
            if (mayor < vector[i]) {
                mayor = vector[i];
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        int[] vector = new int[10];
        JOptionPane.showMessageDialog(null, "El numero mayor en el vector es: " + VectorNumeroMayor(vector));
    }
}
