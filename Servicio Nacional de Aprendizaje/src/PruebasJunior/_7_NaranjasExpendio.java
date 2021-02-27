/*
Al cerrar un expendio de naranjas, 15 clientes que aun no han pagado recibirán un 15% de descuento si compran mas de 10 kilos. 
Determinar cuanto pagara cada cliente y cuanto percibirá la tienda por esas compras.
 */

package PruebasJunior;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class _7_NaranjasExpendio {
    public static void main(String[] args) {
        int valorKilo =0;
        int kilos =0;
        int  clientes=5;
        int total =0;
        int descuento =0;
        int percibido =0;
        
        valorKilo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del kilo"));
        while (clientes>0)
        {
            kilos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los kilos que lleva el cliente "+clientes));
            if (kilos>9)
            {
                descuento=((kilos*valorKilo)/100*15);
                total=(kilos*valorKilo)-descuento;
            } else
            {
                total=(kilos*valorKilo);
            }
            percibido+=total;
            clientes--;
        JOptionPane.showMessageDialog(null,"El total a pagar del cliente "+1+" es de: "+total);
        }
        JOptionPane.showMessageDialog(null,"Dinero percibido es de: "+percibido);
    }
}
