package com.mycompany.eval2_2_sobrecarga_costructores;

/**
 *
 * @author hecto
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad; 
    
    public Persona(){
        nombre = "Sin nombre";
        apellido = "Sin apellido";
        edad = 0;
    }
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void Prueba(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }
}

