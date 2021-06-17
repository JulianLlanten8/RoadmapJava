/*
 * Perimetro y Area de un rectangulo.
 */
package POORectangulo;

/**
 * @author Familia Llanten
 */
public class Rectangulo {

    int largo = 1;
    int ancho = 1;

    public int perimetro(int largo, int ancho) {
        int perimetro = 2 * (this.largo + this.ancho);
        return perimetro;
    }

    public int area(int largo, int ancho) {
        int area = this.largo * this.ancho;
        return area;
    }
}
