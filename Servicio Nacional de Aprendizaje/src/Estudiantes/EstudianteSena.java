package Estudiantes;

public class EstudianteSena extends Estudiante {
    
    private String programa;
    private int numero_ficha;

    EstudianteSena(String programa, int numero_ficha, String nombre, int edad, int identificacion, String correo, String entidad) {
        super(nombre, edad, identificacion, correo, entidad);
        this.programa = programa;
        this.numero_ficha = numero_ficha;
    }

    EstudianteSena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPrograma() {
        return programa;
    }
    public void setPrograma(String programa){
        this.programa=programa;
    }
    public int getNumero_ficha() {
        return numero_ficha;
    }
    public void setNumero_ficha(int numero_ficha){
        this.numero_ficha=numero_ficha;
    }
}
