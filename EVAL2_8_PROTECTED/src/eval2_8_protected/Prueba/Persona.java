/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eval2_8_protected.Prueba;

/**
 *
 * @author hecto
 */
public abstract class Persona {
    protected String nombre;
    protected String Apellido;
    protected int Edad;

    public Persona() {
        this.nombre = "Sin nombre";
        this.Apellido = "Sin apellido";
        this.Edad = 0;
    }
    

    public Persona(String nombre, String Apellido, int Edad) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
}
