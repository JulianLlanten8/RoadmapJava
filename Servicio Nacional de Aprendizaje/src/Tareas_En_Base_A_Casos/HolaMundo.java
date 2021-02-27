package Tareas_En_Base_A_Casos;
import javax.swing.JOptionPane;
public class HolaMundo {

  public static void main(String[] args) {
     int edad;
     double estatura;
     String cas;
     boolean casado=false;
     String nombre;
   
     nombre=JOptionPane.showInputDialog("Porfavor ingrese su nombre");
     estatura=Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese su Estatura"));
     edad=Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese su edad"));
     cas= JOptionPane.showInputDialog(" Es usted casado 1.si/2.no");
     if(cas.equalsIgnoreCase("si" ))
     {casado=true;}
     JOptionPane.showMessageDialog(null,nombre+"\n"+edad+"\n"+casado);
    }
    
}
