package POOTriangulo;/*
 * Perimetro y Area de un rectangulo.
 */

/**
 * @author Familia Llanten
 */
public class Triangulo {

    float altura = 1;
    float base = 1;

    public float perimetro(int altura, int base) {
        return (this.altura * this.altura) + this.base;
    }

    public float area(int altura, int base) {
        return (this.altura * this.base) / 2;
    }

}
