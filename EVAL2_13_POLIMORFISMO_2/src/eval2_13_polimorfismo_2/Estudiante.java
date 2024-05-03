/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eval2_13_polimorfismo_2;

/**
 *
 * @author hecto
 */
public class Estudiante extends Persona{
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
    
@Override
    public void ImprimirDatos() {
        super.ImprimirDatos();
        System.out.println("Numero de Control: " + NoControl);
    }
    
}
