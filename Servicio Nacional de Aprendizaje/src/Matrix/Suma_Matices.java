package Matrix;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * suma de matrices
 */
public class Suma_Matices {

    public static void main(String[] args) {

        JTextArea miArea = new JTextArea(10, 35); //El area de texto a visualizar en pantalla
        JScrollPane miscroll = new JScrollPane(miArea); //Si salen muchos numeros se muestran con el scroll
        miArea.append(""); //Area de visualización.

        int numeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas para las matrices"));

        int matrizM[][] = new int[numeroFilas][3];
        int matrizN[][] = new int[numeroFilas][3];
        int sumaMatriz[][] = new int[numeroFilas][3];

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[0].length; j++) {
                matrizM[i][j] = Integer.parseInt(JOptionPane.
                        showInputDialog("Ingrese los numeros de la MatrizM en la pocicion \n"));
            }
        }
        miArea.append("MatrizM \n");
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[0].length; j++) {
                miArea.append(matrizM[i][j] + "\t");
            }
            miArea.append("\n");
        }
        for (int i = 0; i < matrizN.length; i++) {
            for (int j = 0; j < matrizN[0].length; j++) {
                matrizN[i][j] = Integer.parseInt(JOptionPane.
                        showInputDialog("Ingrese los numeros de la MatrizN en la pocicion \n"));
            }
        }
        miArea.append("MatrizN \n");
        for (int i = 0; i < matrizN.length; i++) {//Escribimos en area lo que guardamos en las matrices
            for (int j = 0; j < matrizN[0].length; j++) {
                miArea.append(matrizN[i][j] + "\t");
            }
            miArea.append("\n");
        }
        miArea.append("El resultado de la suma de las matrices es: \n");
        for (int i = 0; i < matrizN.length; i++) { //hacemos la suma de las matrices
            for (int j = 0; j < matrizN[0].length; j++) {
                sumaMatriz[i][j] = matrizM[i][j] + matrizN[i][j];
                miArea.append(sumaMatriz[i][j] + "\t");
            }
        }
        JOptionPane.showMessageDialog(null, miscroll, "Suma de Matrices", JOptionPane.INFORMATION_MESSAGE);
    }
}
