package Tareas_En_Base_A_Casos;


import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String n = "POOTriangulo  ";
        int Base;
        int Altura;
        float Area;

        System.out.println("Porfavor ingrese la base");
        Base = obj.nextInt();
        System.out.println("Porfavor ingrese la altura");
        Altura = obj.nextInt();
        Area = (Base * Altura/2);
        System.out.println("El Area de un  " + n +" Es: "+ Area);

    }
}
