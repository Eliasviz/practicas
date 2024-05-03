/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eval2_12_polimorfismo;

/**
 *
 * @author hecto
 */
public class EVAL2_12_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("0011", "Juan", "Perez");
        System.out.println("estudiante");
        Persona persona = estudiante;
    }
    
}
class Persona {
private String Nombre;
private String Apellido;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

}
class Estudiante extends Persona{
private String NoControl;

    public Estudiante() {
    }

    public Estudiante(String NoControl) {
        this.NoControl = NoControl;
    }

    public Estudiante(String NoControl, String Nombre, String Apellido) {
        super(Nombre, Apellido);
        this.NoControl = NoControl;
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        NoControl = NoControl;
    }
    
@Override
    public String toString(){
        return super.toString() + " " + NoControl;
    }
}