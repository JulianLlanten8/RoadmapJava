/*
construir un programa que calcule y muestre por pantalla el signo del zodiaco,
a partir de la introducción por teclado del día y el mes de nacimiento como numeros enteros.
 */
package Deciciones;

import javax.swing.JOptionPane;

/**
 * @author Familia Llanten
 */
public class Zodiaco {

    public static void main(String[] args) {
        int mes, dia;
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese el Mes de nacimiento"));
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor Ingrese el Dia de nacimiento"));
        if (mes > 0 && mes < 12 && dia > 0 && dia > 0 && dia < 32) {

            if (mes == 1) {
                if (dia > 19 && dia < 31) {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Acuario \n Su planeta rigente es Urano");
                } else {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Capricornio \n Su planeta rigente es Saturno");
                }
            }
            if (mes == 2) {
                if (dia > 18 && dia < 29) {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Pisis \n Su planeta rigente es Neptuno");
                } else {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Acuario \n Su planeta rigente es Urano");
                }
            }
            if (mes == 3) {
                if (dia > 20 && dia < 31) {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Aries \n Su planeta rigente es Marte");
                } else {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Pisis \n Su planeta rigente es Neptuno");
                }
            }
            if (mes == 4) {
                if (dia > 19 && dia < 30) {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Tauro \n Su planeta rigente es Venus");
                } else {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Aries \n Su planeta rigente es Marte");
                }
            }
            if (mes == 5) {
                if (dia > 20 && dia < 30) {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Geminis \n Su planeta rigente es Mercurio");
                } else {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Tauro \n Su planeta rigente es Venus");
                }

            }
            if (mes == 6) {
                if (dia > 20 && dia < 31) {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Cancer \n Su planeta rigente es Luna");
                } else {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Geminis \n Su planeta rigente es Mercurio");
                }
            }
            if (mes == 7) {
                if (dia > 22 && dia < 30) {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Leo \n Su Planeta rigente es Sol");
                } else {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Cancer \n Su planeta rigente es Luna");
                }
            }
            if (mes == 8) {
                if (dia > 23 && dia < 30) {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Virgo \n Su Planeta rigente es Mercurio");
                } else {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Leo \n Su Planeta rigente es Sol");
                }
            }
            if (mes == 9) {
                if (dia > 23 && dia < 30) {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Libra \n Su Planeta rigente es Venus");
                } else {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Virgo \n Su Planeta rigente es Mercurio");
                }
            }
            if (mes == 10) {
                if (dia > 23 && dia < 30) {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Escorpion \n Su Planeta rigente es Plutón");
                } else {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Libra \n Su Planeta rigente es Venus");
                }
            }
            if (mes == 11) {
                if (dia > 21 && dia < 30) {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Sagitario \n Su Planeta rigente es Júpiter");
                } else {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Escorpion \n Su Planeta rigente es Plutón");
                }
            }
            if (mes == 12) {
                if (dia > 21 && dia < 30) {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Capricornio \n Su Planeta rigente es Saturno");
                } else {
                    JOptionPane.showMessageDialog(null, "Su signo zodiacal es Sagitario \n Su Planeta rigente es Júpiter");
                }
            }
            JOptionPane.showMessageDialog(null, "Muchas gracias por utilizar nueestro algoritmo ♪ ┏(*^v^*)┛  ♪\n ");
        } else {
            JOptionPane.showMessageDialog(null, "Usted digito un Mes o un Dia no valido");
        }
    }
}
