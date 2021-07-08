package Estudiantes;

public class Estudiante {

    private String nombre;
    private int edad;
    private int identificacion;
    private String correo;
    private String entidad;

    Estudiante(String nombre, int edad, int identificacion, String correo, String entidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.correo = correo;
        this.entidad = entidad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setidentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getIdentificacion() {
        return this.identificacion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getEntidad() {
        return this.entidad;
    }
}
