/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eval2_10_interfaces;

/**
 *
 * @author hecto
 */
public class Estudiantes extends Persona implements Datos, GenararAnnio{
    private String NoControl;

    public Estudiantes() {
        super();
        this.NoControl = "--------";
    }

    public Estudiantes(String NoControl) {
        this.NoControl = NoControl;
    }

    public Estudiantes(String NoControl, String Nombre, String Apellido, int Edad) {
        super(Nombre, Apellido, Edad);
        this.NoControl = NoControl;
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }

    @Override
    public void ImprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
    }

    @Override
    public String GenerarNombreCon() {
        return getNombre() + " " + getApellido();
    }

    @Override
    public int generarAnnioNac() {
        return 2024 - getEdad();
    }

    
    
}
