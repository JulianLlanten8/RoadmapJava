package electricos;

import javax.swing.JOptionPane;

public class Nevera extends Electrodomestico{
    
    private int dimensionCongelador;
    public Nevera(double precio, String marca, int dimencionCongelador) {
        super(precio, marca);
        this.dimensionCongelador= dimencionCongelador;
        
    }
    public int getDimensionCongelador() {
        return dimensionCongelador;
    }

    public void setDimensionCongelador(int dimensionCongelador) {
        this.dimensionCongelador = dimensionCongelador;
    }
    public void obtenerIva(){
    JOptionPane.showMessageDialog(null,"El iva es:" +precio*0.19);
    }
    @Override
    public  void apagar(){
        JOptionPane.showMessageDialog(null, "Se apago la Nevera");
    }
    @Override
    public void encender(){
        JOptionPane.showMessageDialog(null, "Se encendio la Nevera");
    }
    
}
