package PruebasJunior;

/*
5. Simular el comportamiento de un reloj digital, imprimiendo la hora, 
minutos y segundos de un día desde las 0:00:00 horas hasta las 23:59:59 horas
 */
/**
 *
 * @author Familia Llanten
 */
public class _5_Reloj {

    public static void main(String[] args) throws InterruptedException {
        int segundos = 0;
        int minutos = 0;
        int horas = 0;

        while (horas < 24)
        {
            System.out.println("la hora es " + horas + ":" + minutos + ":" + segundos);
            Thread.sleep(900);//tiempo de espera para ejecutar lo proximo.
            segundos++;
            if (segundos == 60)
            {
                minutos++;
                segundos = 0;
            }
            if (minutos == 60)
            {
                horas++;
                minutos = 0;
            }
        }
    }
}
