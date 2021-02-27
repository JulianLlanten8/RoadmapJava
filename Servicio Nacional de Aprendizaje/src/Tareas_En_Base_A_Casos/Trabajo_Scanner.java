package Tareas_En_Base_A_Casos;


import java.util.Scanner;

public class Trabajo_Scanner {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String nombre = " Jose ";
        int edad;
        double estatura=0 ;
    
        System.out.println("Porfavor ingrese su apellido");
        nombre = nombre + "" + obj.nextLine() + "";

        System.out.println("Porfavor ingrese su edad");
        edad = obj.nextInt();
        System.out.println("porfavor ingrese su estatura" + edad);
        System.out.println("Su estatura es: " + estatura);

    }
}
