/*
Suponga que el administrador de una tienda desea calcular el total de ventas del día, para ello
debe registrar el nombre del producto, el valor del producto y la cantidad de unidades vendidas.
Al final el sistema debe mostrar la lista de productos digitados, el total de ventas por cada producto,
el total de ventas del día y el valor global cobrado por concepto del IVA.
El administrador puede registrar productos hasta que él decida que ha terminado para cuando digite un dato negativo.
 */
package DoWhile;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Familia Llanten
 */
public class Administrador_de_una_Tienda {

    public static void main(String[] args) {
        String producto = "\n";
        float valorProducto;
        int cantidad;
        int iva;
        float precioproductos;
        int ventasDía = 0;
        float totalVentas = 0;
        int otraVenta = 0;
        JTextArea miArea = new JTextArea(10, 50); //El area de texto a visualizar en pantalla ^.^
        JScrollPane miscroll = new JScrollPane(miArea); //Si salen muchos numeros se muestran con el scroll

        //Los titulos u contenido dentro del area de texto a visualizar
        miArea.append("\nReporte de productos vendidos\nNombre del producto\t Valor del producto\t Cantidad\t Total+Iva\n");
        do {
            producto = JOptionPane.showInputDialog("Porfavor ingrese el nombre del producto");
            valorProducto = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el valor del producto"));
            iva = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el iva de los anteriores productos"));
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese la cantidad de productos"));
            precioproductos = valorProducto * cantidad + (valorProducto * iva / 100);
            ventasDía++;
            miArea.append( producto + "\t" + "\t" + valorProducto + "\t" + "\t" + cantidad + "\t"
                    +"$"+ precioproductos + "\n" + " Ventas realizadas en el dia: " + ventasDía);
            
            otraVenta = Integer.parseInt(JOptionPane.showInputDialog("¿Desea registrar Venta? "
                    + "\n Digite un numero negativo ej:(-1) \nSi, no quiere hacer otra suma"));
            
         //El algoritmo termina cuando digitamos un numero negativo numero menor a cero.
        } while (valorProducto < 0 && cantidad < 0 && otraVenta>0);
        JOptionPane.showMessageDialog(null, miscroll, "Informe del dia", JOptionPane.INFORMATION_MESSAGE);
    }
}
    