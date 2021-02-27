package Tareas_En_Base_A_Casos;

import java.util.Scanner;

public class ComisionVentas {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int SueldoBase;
        float Porcentaje = 10;
        float ValoraGanar;//1 cop se cotiza al dia de hoy 16/09/2020 en 0.0002713 dolares.

        System.out.print("Bienvenido al programa Para ver La Comision A Ganar Y Su Total Mas Comicion\n");
        System.out.println("Porfavor Ingrasa Su Sueldo Base");
        SueldoBase = obj.nextInt();
        ValoraGanar = (float) (SueldoBase * Porcentaje / 100 * 3);
        System.out.println("El valor a Ganar con un porcentaje de:" + Porcentaje + "% Mensual Es: $" + ValoraGanar + " El Total Mas comicion Sería:\n" + "$" + (SueldoBase + ValoraGanar));
        System.out.print(" Muchas gracias por utilizar El algoritmo De Comiciones ヽ(^o^)ノ     ");
    }
}
