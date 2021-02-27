package Tareas_En_Base_A_Casos;


import java.util.Scanner;

public class CentigradosAFahrenheit {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        float Centigrados;
        float Fahrenheit;

        System.out.print("Este Algoritmo Es Para convertir Grados Centirados A Fahrenheit \n");
        System.out.println("Porfavor Ingrase Los Grados Centigrados");
        Centigrados = obj.nextInt();
        Fahrenheit = (float) (Centigrados * 1.800 + 32);//La Formula es Multiplicar Grados centigrados por 1.800+32.
        System.out.println(Centigrados + " C° = " + Fahrenheit + "°F");
        System.out.print(" Muchas gracias  Por Utilizar Este Algortimo ヽ(^o^)ノ    ");
    }
}