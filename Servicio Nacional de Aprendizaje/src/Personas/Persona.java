package Personas;

public class Persona {
    protected String nombre;
    protected String cedula;
    protected String estadoCivil;

    Persona(String nombre, String cedula, String estadoCivil) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.estadoCivil = estadoCivil;
    }
    public   void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public   String getNombre() {
        return this.nombre;
    }
    public   void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public   String getCedula() {
        return this.cedula;
    }
    public   void EstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public   String getEstadoCivil() {
        return this.estadoCivil;
    }
    public void cambiarEstadoCivil(){
        
    }
    public void obtenerEstadocivil(){
        
    }
    
}
