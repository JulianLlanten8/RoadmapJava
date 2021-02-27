package Tareas_En_Base_A_Casos;


import java.util.Scanner;

public class AreaDeUnCirculo {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        float radio;
        double area;
        double pi = 3.141592653589;//π= 3.141592653589.
        System.out.print("Este Algoritmo Es Para Hallar el Area De un Circulo Conociendo El Radio \n");
        System.out.println("Porfavor Ingrase El Radio Del Circulo");
        radio = obj.nextInt();
        area = (float) (pi * Math.pow(radio,2));//La formula es π*R elevado ala 2(Math.pow eleva el numero por el otro despues de la coma.
        System.out.println("El Area De Un circulo Es " + area );
        System.out.print(" Muchas gracias  Por Utilizar Este Algortimo ヽ(^o^)ノ \n");
    }
}