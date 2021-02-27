package Tareas_En_Base_A_Casos;


import java.util.Scanner;

public class ProblemaMatematicos {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        float a, b, c;
        float x1 = 0;
        float x2 = 0;

        System.out.println("Porfavor ingrese a");
        a = obj.nextFloat();
        System.out.println("Porfavor ingrese b");
        b = obj.nextFloat();
        System.out.println("Porfavor ingrese c");
        c = obj.nextFloat();
        x1 = (float) (((-1)*b) + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);

        System.out.println("Porfavor ingrese a");
        a = obj.nextFloat();
        System.out.println("Porfavor ingrese b");
        b = obj.nextFloat();
        System.out.println("Porfavor ingrese c");
        c = obj.nextFloat();
        x2 = (float) (((-1)*b) - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);

        System.out.println("El resultado de x1 es:"+x1);
        System.out.println("El resultado de x1 es:"+x2);

    }
}
