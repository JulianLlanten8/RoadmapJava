/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dedicacion;

/**
 *
 * @author Familia Llanten
 */
public class Dedicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dedicacion = 0, persistencia = 0, magia;
        boolean Pasion = true;
        dedicacion+=1;
        persistencia+=1;
        if (Pasion == true) {
            magia = dedicacion + persistencia;
            System.out.println(magia);
        } else {
            magia = 0;
        }
        System.out.println(magia);
    }

}
