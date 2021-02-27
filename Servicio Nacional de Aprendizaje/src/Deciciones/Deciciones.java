/*
Algoritmo para determinar si tiene menos de 18 años y si es mayor de 18 años
 */
package Deciciones;

import java.util.Scanner;

/**
 *
 * @author Familia Llanten
 */
public class Deciciones {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int edad, requisito = 18;
        System.out.println("Bienvenido porfavor ingrese su edad");
        edad = obj.nextInt();
        if (edad < requisito) {
            System.out.println("Tiene Menos De 18 Años");
        } else {
            System.out.println("Tiene Mas De 18 Años");
        }
        
    }
}
