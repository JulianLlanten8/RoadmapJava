package Tareas_En_Base_A_Casos;

import java.util.Scanner;

public class FacturamasIva {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String n = " Factura  ";
        int iva = 16;
        float Total;
        float valor;
        double valortotal = 0;

        System.out.println("Porfavor ingrese el total de los articulos");
        Total = obj.nextInt();
        valor = (Total * iva / 100);
        valortotal = (Total + valor);
        System.out.println("El valor Total del monto " + n + valortotal);
        System.out.println("Muchas Gracias por Utilizar este Programa de Facturas ヽ(^o^)ノ " );
    }
}