package Funciones_Esencia_de_la_logica;


import javax.swing.JOptionPane;

/*
35. Construir una función que reciba como parámetro un vector de 10 posiciones enteras y retorne la posición
en la que se encuentre el mayor número primo que termine en 3 almacenado en el vector.
 */
/**
 * @author Familia Llanten
 */
public class _35_MayorPrimoT3_vector {

    public static int MayorPrimo3(int vector[]) {
        int mayor3 = 0;
        int primos = 0;
        int primo = 0;
        int mayor = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        }

        for (int i = 0; i < vector.length; i++) {
            int j = vector[i];

            for (int k = 1; k <= j; k++) {
                if (j % k == 0) {
                    primos++;
                }
            }
            if (primos == 2) {
                primo = vector[i];
            }
            if (mayor < primo) {
                if (primo % 10 == 3) {
                    JOptionPane.showMessageDialog(null, primo);//imprime el mayor primo terminado en 3
                    mayor = primo;
                    mayor3 = i;
                }
            }
            primos = 0;
        }
        return mayor3;
    }

    public static void main(String[] args) {
        int vector[] = new int[3];
        JOptionPane.showMessageDialog(null, "La pocición del mayor número primo terminado en 3 almacenado en el vector es: \n" + MayorPrimo3(vector));

    }
}
