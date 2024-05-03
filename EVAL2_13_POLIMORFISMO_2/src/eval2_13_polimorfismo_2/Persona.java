/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eval2_13_polimorfismo_2;

/**
 *
 * @author hecto
 */
public class Persona implements MostrarDatos{
    
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
    
    @Override
    public String toString(){
        return Nombre + " " + Apellido;
    }

    @Override
    public void ImprimirDatos() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
    }

}