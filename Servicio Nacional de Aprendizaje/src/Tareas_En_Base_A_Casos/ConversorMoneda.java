package Tareas_En_Base_A_Casos;

import java.util.Scanner;

public class ConversorMoneda {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int peso;
        float dolar;
        double tasacambio = 0.0002713;//1 cop se cotiza al dia de hoy 16/09/2020 en 0.0002713 dolares.
        
        System.out.print("Bienvenido al programa de convercion de moneda da la casa de cambio\n");
        System.out.println("Porfavor Ingrasa la cantidad en Pesos que quieres convertir a Dolares");
        peso = obj.nextInt();
        dolar = (float) (peso * tasacambio);//se multiplica la cantidad de pesos ingresados por su cotizacion vigente.
        System.out.println("La Cantidad  De " + peso + " Pesos A Dolares Es: " + dolar + " Usd $ ");
        System.out.print(" Muchas gracias por utilizar la calculadora de divisas\n");
    }
}