package Tareas_En_Base_A_Casos;
import javax.swing.JOptionPane;
public class MasaCorporal {

  public static void main(String[] args) {
     int Peso;
     double estatura = 0;
     
     String nombre;
   
     nombre=JOptionPane.showInputDialog("Porfavor ingrese su nombre");
     Peso=Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese su Peso"));
     estatura=Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese su Estatura"));
     double resultado = (int) Math.pow(estatura,2);
     double MasaCorporal = Peso/resultado;
     
     JOptionPane.showMessageDialog(null,nombre+"\n"+"Su indice de masa corporal es equivalente a:"+"\n"+MasaCorporal);
    }   
}
