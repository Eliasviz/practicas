/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eval2_8_protected;

import eval2_8_protected.Prueba.Persona;

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

    public Estudiante(String NoControl, String nombre, String Apellido, int Edad) {
        super(nombre, Apellido, Edad);
        this.NoControl = NoControl;
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }

    public void ImprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Edad: " + Edad);
        System.out.println("Numero de Control: " + NoControl);
    }

    
    
}
