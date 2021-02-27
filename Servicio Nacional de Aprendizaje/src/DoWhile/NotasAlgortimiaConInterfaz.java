/*
El curso de algortimia se califica con dos parciales el primero tiene un peso del 30%
y el segundo 35%, una nota de laboratorios 25% y una nota de trabajo final del curso 10%.
calcular la nota definitiva para un grupo de n estudiantes.
 */
package DoWhile;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Familia Llanten
 */
public class NotasAlgortimiaConInterfaz {

    public static void main(String[] args) {
        float par1;
        float par2;
        float lab;
        float tar;
        double notadefinitiva = 0;

        String nombre = "\n";
        DecimalFormat forma = new DecimalFormat("0,0");
        JTextArea miArea = new JTextArea(15, 30);
        JScrollPane miscroll = new JScrollPane(miArea);

        miArea.append("\n nombre \t" + "parcial 1 \t" + "parcial 2\t" + "laboratorio \t" + "tareas\t" + "notadefinitiva");
        nombre = JOptionPane.showInputDialog("nombre");
        do {
            par1 = Float.parseFloat(JOptionPane.showInputDialog("La nota pacial 1"));
            par2 = Float.parseFloat(JOptionPane.showInputDialog("La nota pacial 2"));
            lab = Float.parseFloat(JOptionPane.showInputDialog("La nota laboratorio"));
            tar = Float.parseFloat(JOptionPane.showInputDialog("La nota de las tareas"));
            notadefinitiva = (par1 * 0.30 + par2 * 0.35 + lab * 0.25 + tar * 0.10);
            miArea.append("\n" + nombre + "\t" + forma.format(par1) + "\t" + forma.format(par2) + "\t" + forma.format(lab)
                    + "\t" + forma.format(tar) + "\t" + forma.format(notadefinitiva));
            nombre = JOptionPane.showInputDialog("nombre");
        } while (!nombre.equals("Final"));
        JOptionPane.showMessageDialog(null, miscroll, "calculo de la nota fianal del curso", JOptionPane.INFORMATION_MESSAGE);
    }
}
