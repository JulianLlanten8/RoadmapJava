package Estudiantes;

public class EstudianteSena extends Estudiante {
    private String programa;
    private int numero_ficha;

    public EstudianteSena(String nombre, int edad, int identificacion, String correo, String entidad, String programa) {
        super(nombre, edad, identificacion, correo, entidad);
        this.programa = programa;
        this.numero_ficha = numero_ficha;
    }
    EstudianteSena(){}

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
