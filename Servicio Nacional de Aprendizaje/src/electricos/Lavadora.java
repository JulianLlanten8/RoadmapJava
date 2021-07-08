package electricos;

import javax.swing.JOptionPane;

public class Lavadora extends Electrodomestico{
    private int cantidadCiclos;
    public Lavadora(double precio, String marca, int cantidadCiclos) {
        super(precio, marca);
        this.cantidadCiclos = cantidadCiclos;
    }
    public int getCantidadCiclos() {
        return cantidadCiclos;
    }

    public void setCantidadCiclos(int cantidadCiclos) {
        this.cantidadCiclos = cantidadCiclos;
    }
    @Override
    public  void apagar(){
        JOptionPane.showMessageDialog(null, "Se apago la Lavadora");
    }
    @Override
    public void encender(){
        JOptionPane.showMessageDialog(null, "Se encendio la Lavadora");
    }
}
