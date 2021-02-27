package Tareas_En_Base_A_Casos;
import javax.swing.JOptionPane;
public class Mayorde3Numeros {

  public static void main(String[] args) {
     int Numero;
     int Numero1;
     int Numero2;
     
     
     Numero=Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el primer numero"));
     Numero1=Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el segundo numero"));
     Numero2=Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el tercer numero"));
     
      if (Numero== Numero1 && Numero1== Numero2) {
          JOptionPane.showMessageDialog(null,"Los tres numeros Son iguales: ");
      }else if (Numero>Numero1 && Numero> Numero2) {  
          JOptionPane.showMessageDialog (null,"El numero mayor es "+Numero);
          System.out.println("El numero mayor es"+Numero);
      }else if (Numero1>Numero && Numero1> Numero2) {
           JOptionPane.showMessageDialog (null,"El numero mayor es "+Numero1);
          System.out.println("El numero mayor es"+Numero1);
      }else if (Numero2>Numero && Numero2> Numero1) {
           JOptionPane.showMessageDialog (null,"El numero mayor es "+Numero2);
          System.out.println("El numero mayor es"+Numero2);
      }
      JOptionPane.showMessageDialog(null,"Muchas Gracias Por Utilizar Este Algoritmo"+"\t"+"┏(＾0＾)┛  "+"\n"+"  By:      Julian Llanten");
  }
}