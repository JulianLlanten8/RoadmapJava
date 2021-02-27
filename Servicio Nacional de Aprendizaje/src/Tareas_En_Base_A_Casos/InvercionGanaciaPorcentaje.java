package Tareas_En_Base_A_Casos;

import java.util.Scanner;

public class InvercionGanaciaPorcentaje {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int Invercion;
        float Porcentaje=(float) 2.6;
        float ValoraGanar;//1 cop se cotiza al dia de hoy 16/09/2020 en 0.0002713 dolares.
        
        System.out.print("Bienvenido al programa Para ver los Resultados De Su Futura Invercion\n");
        System.out.println("Porfavor Ingrasa la cantidad Que Dese invetir");
        Invercion = obj.nextInt();
        ValoraGanar = (float) (Invercion * Porcentaje/100);//se multiplica la cantidad de pesos ingresados por su cotizacion vigente.
        System.out.println("El valor a Ganar con un porcentaje de: " + Porcentaje + " Mensual Es: " + ValoraGanar + " En Total serian:\n"+(Invercion+ValoraGanar));
        System.out.print(" Muchas gracias por utilizar la calculadora de divisas ヽ(^o^)ノ  ");
    }
}