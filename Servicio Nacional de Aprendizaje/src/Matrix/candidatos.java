package Matrix;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Familia Llanten
 */
public class candidatos {

    public static void main(String[] args) {

        JTextArea miArea = new JTextArea(10, 35); //El area de texto a visualizar en pantalla
        JScrollPane miscroll = new JScrollPane(miArea); //Si salen muchos numeros se muestran con el scroll
        miArea.append("");

        int eleciones[][] = new int[4][3]; //El arreglo es de 4 filas por 3 columnas para los votos
        String candidatos[] = new String[3];//Arreglo con los tres candidadatos
        String sedes[] = new String[4]; //El numero de sedes
        int maxVoto = 0;
        int sumaVoto = 0;
        String nomMaxVoto = "";

        for (int i = 0; i < candidatos.length; i++) {
            candidatos[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre del candidato: " + (i + 1));
        }

        for (int i = 0; i < sedes.length; i++) {
            sedes[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre del la sede: " + (i + 1));
        }
        for (int i = 0; i < eleciones.length; i++) {
            for (int j = 0; j < eleciones[0].length; j++) {

                eleciones[i][j] = Integer.parseInt(JOptionPane.
                        showInputDialog("Ingrese los votos del candidato: " + candidatos[j]  +" para la sede "+ sedes[i]));
            }
        }
        miArea.append("Sedes \t");

        for (int i = 0; i < candidatos.length; i++) {
            miArea.append(candidatos[i] + "\t");
        }
        miArea.append("\n");

        for (int i = 0; i < eleciones.length; i++) {
            miArea.append("" + sedes[i] + "\t");
            for (int j = 0; j < eleciones[0].length; j++) {
                miArea.append(eleciones[i][j] + "\t");
            }
            miArea.append("\n");
        }
        for (int j = 0; j < eleciones[0].length; j++) {
            for (int i = 0; i < eleciones.length; i++) {
                sumaVoto=sumaVoto+eleciones[i][j];
            }
            if (sumaVoto>maxVoto) {
                maxVoto=sumaVoto;
                nomMaxVoto=candidatos[j];
            }
        }
        miArea.append("El ganador es: "+nomMaxVoto);

        JOptionPane.showMessageDialog(null, miscroll, "Resultados Eleciones", JOptionPane.INFORMATION_MESSAGE);
    }
}
