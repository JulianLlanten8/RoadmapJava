package Funciones;

/**
 * @author Familia Llanten
 */
public class Metodo_Numero_mayor {

    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        }
        else if (b > a) {
            return b;
        } 
        return a;
    }
    public static void main(String[] args) {
        int z= 20;
        int l=24;
        System.out.println("El numero mayor es: "+mayor(z,l));
    }
}
