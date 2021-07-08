package electricos;

import javax.swing.JOptionPane;

public class Electrodomestico {

    protected  double precio;
    protected  String marca;

    Electrodomestico(double precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }
    public   void setPrecio(double precio) {
        this.precio = precio;
    }
    public   double getPrecio() {
        return this.precio;
    }
    public   void setMarca(String marca) {
        this.marca = marca;
    }
    public  String getMarca() {
        return this.marca;
    }
    public  void apagar(){
        JOptionPane.showMessageDialog(null, "Se apago el electrodomestico");
    }
    public void encender(){
        JOptionPane.showMessageDialog(null, "Se encendio el electrodomestico");
    }
}
