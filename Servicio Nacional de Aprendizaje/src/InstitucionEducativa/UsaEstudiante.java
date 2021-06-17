package InstitucionEducativa;

import javax.swing.JOptionPane;

public class UsaEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante aprendiz = new Estudiante();
        
        aprendiz.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del estudiante"));
        aprendiz.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante")));
        aprendiz.setIdentificacion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificacion del estudiante")));
        aprendiz.setCorreo(JOptionPane.showInputDialog("Ingrese el correo estudiante"));

        JOptionPane.showMessageDialog(null, "El aprendiz " + aprendiz.getNombre() + "\n tiene "
                + aprendiz.getEdad() + " años \n Identificado con la cedula "
                + aprendiz.getIdentificacion()
                + "\n con correo " + aprendiz.getCorreo());
    }

}
