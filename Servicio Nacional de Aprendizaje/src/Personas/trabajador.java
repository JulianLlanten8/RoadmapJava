package Personas;

public class trabajador extends Persona{
    protected int salario;
    public trabajador(String nombre, String cedula, String estadoCivil,int salario) {
        super(nombre, cedula, estadoCivil);
        this.salario = salario;
    }
    public int setSalario() {
        return this.salario;
    }
    public int getSalario() {
        return this.salario;
    }
    
    
}
