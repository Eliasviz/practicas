/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eval2_5_super;

/**
 *
 * @author hecto
 */
public class Persona {
        private String Nombre;
        private String Appaterno;
        private String Apmaterno;
        private int Edad;
        private char Genero; 

    public Persona(String Nombre, String Appaterno, String Apmaterno, int Edad, char Genero) {
        this.Nombre = Nombre;
        this.Appaterno = Appaterno;
        this.Apmaterno = Apmaterno;
        this.Edad = Edad;
        this.Genero = Genero;
    }

    public Persona() {
        this.Nombre = "-----------";
        this.Appaterno = "--------";
        this.Apmaterno = "--------";
        this.Edad = 0;
        this.Genero = '-';
    }

    public String getNombre() {
        return Nombre;
    }

    public String getAppaterno() {
        return Appaterno;
    }

    public String getApmaterno() {
        return Apmaterno;
    }

    public int getEdad() {
        return Edad;
    }

    public char getGenero() {
        return Genero;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setAppaterno(String Appaterno) {
        this.Appaterno = Appaterno;
    }

    public void setApmaterno(String Apmaterno) {
        this.Apmaterno = Apmaterno;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }
    
    public void ImprimirDatos(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Appaterno);
        System.out.println("Apellido: " + Apmaterno);
        System.out.println("Edad: " + Edad);
        System.out.println("Genero: " + Genero);
    }    
    
}
