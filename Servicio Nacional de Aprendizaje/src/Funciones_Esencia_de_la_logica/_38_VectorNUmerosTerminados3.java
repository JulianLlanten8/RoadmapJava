package Funciones_Esencia_de_la_logica;


import javax.swing.JOptionPane;

/*
38. Construir una función que reciba como parámetro un vector de 10 posiciones enteras y
retorne la cantidad de números terminados en 3 que contiene el vector.
 */

/**
 *
 * @author Familia Llanten
 */
public class _38_VectorNUmerosTerminados3 {
    public static int VectorTermina3(int vector[]){
    int cuantos=0;
        for (int i = 0; i < vector.length; i++) {
            vector[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su numero"));
            
        }
        for (int i = 0; i < vector.length; i++) {
            int j = vector[i];
            if (j%10==3) {
                cuantos++;
            }
        }
    
    return cuantos;
    }
    public static void main(String[] args) {
        int vector[]=new int [3];
        JOptionPane.showMessageDialog(null,VectorTermina3(vector));
    }
}
