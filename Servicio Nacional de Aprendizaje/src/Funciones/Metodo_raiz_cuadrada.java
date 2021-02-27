/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

/**
 *
 * @author Familia Llanten
 */
public class Metodo_raiz_cuadrada {
    public static double cuadrado(double a, double b) {
        double resulatdo;
        resulatdo =Math.sqrt((a*a)+(b*b));
        return resulatdo;
    }
    public static void main(String[] args) {
        double m =2;
        double c =6;
        System.out.println("La raiz cuadrada es "+cuadrado(m,c));
    }
}
