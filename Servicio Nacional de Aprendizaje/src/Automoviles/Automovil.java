package Automoviles;

public class Automovil {

    public String marca;
    public int modelo;
    public String color;
    public double precio;

    Automovil(String marca, String color,int modelo , double precio) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getModelo() {
        return this.modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }
}
