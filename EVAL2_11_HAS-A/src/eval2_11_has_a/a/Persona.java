/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eval2_11_has_a.a;

/**
 *
 * @author hecto
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private Direccion direc;

    public Persona() {
        this.Nombre = "";
        this.Apellido = "";
        this.Edad = 0;
        this.direc = null;
    }

    public Persona(String Nombre, String Apellido, int Edad, Direccion direc) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.direc = direc;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Direccion getDirec() {
        return direc;
    }

    public void setDirec(Direccion direc) {
        this.direc = direc;
    }
    
    @Override
    public String toString(){
        String cade;
        cade = "Nombre: " + Nombre + "/n" +
                "Apellido: " + Apellido + "/n" +
                "Edad: " + Edad;        
        
        return cade; 
    }
}
