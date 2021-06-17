package Celurares;

public class Celular {
    public String marca;
    public String modelo;
    public String color;
    public String memoria;
    public int ram;
    public Double precio;

    Celular(String marca, String modelo, String color, String memoria, int ram, Double Precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.memoria = memoria;
        this.ram = ram;
        this.precio = Precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setMemoria(String color) {
        this.color = color;
    }

    public String getMemoria() {
        return this.memoria;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

}
