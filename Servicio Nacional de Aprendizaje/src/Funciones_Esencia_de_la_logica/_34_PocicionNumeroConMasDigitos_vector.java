package Funciones_Esencia_de_la_logica;


import javax.swing.JOptionPane;

/*
34. Construir una función que reciba como parámetro un vector de 10 posiciones enteras y 
retorne la posición del número entero que tenga mayor cantidad de dígitos.
 */
/**
 *
 * @author Familia Llanten
 */
public class _34_PocicionNumeroConMasDigitos_vector {

    public static int PocicionMayorDigitos(int vector[]) {
        int pocicion = 0;
        int contador = 0;
        int mayor = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus numeros"));
        }
        for (int i = 0; i < vector.length; i++) {
            int j = vector[i];
            while (j != 0) {
                j /= 10;
                contador++;
            }
            if (mayor < contador) {
                mayor = contador;
                //nos escribe la pocicion mas alta del arreglo si requiere se le suma +1 para suponer que empezo desde 1.
                pocicion = i;
            }
            contador = 0;
        }
        return pocicion;
    }

    public static void main(String[] args) {
        int vector[] = new int[5];
        JOptionPane.showMessageDialog(null, "El numero mayor se encunetra en la pocicon: " + PocicionMayorDigitos(vector));
    }
}
