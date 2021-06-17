package Automoviles;

public class Automovil {

    public String marca;
    public int modelo;
    public String tipo;
    public double precio;

    Automovil(String marca, int modelo, String tipo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }
}
