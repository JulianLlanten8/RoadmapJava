/*
*Introduccion a objetos con java creando una calculadora.
 */
package POO;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class Calculadora {

    /**
     * Atributos.
     */
    int suma;
    int resta;
    int multiplicacion;
    int divicion;
    int modulo;

    /**
     * Metodos, Funciones , Acciones.
     */
    public int suma(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    public int resta(int numero1, int numero2) {
        int resta = numero1 + numero2;
        return resta;
    }
    public int multiplicacion(int numero1, int numero2) {
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }
    public int divicion(int numero1, int numero2) {
        int divicion = numero1 / numero2;
        return divicion;
    }
    public int modulo(int numero1, int numero2) {
        int modulo = numero1 % numero2;
        return modulo;
    }

}
