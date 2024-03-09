/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval2_4_herencia;

import java.util.logging.Logger;

/**
 *
 * @author hecto
 */
public class EVAL2_4_HERENCIA {

    public static void main(String[] args) {
        persona per1 =  new persona();
        //TODAS las clases en java deciende de la clase oobjetos 
        System.out.println(per1.toString());
        //el metdo toString no es implementado por nosotros
        //viene por herencia
        Estudiante est = new Estudiante();
        System.out.println("Nombre: " + est.getApellido());
        System.out.println("Apellido: " + est.getNombre());
        System.out.println("Edad: " + est.getEdad());
    }
}
//super Clase
class persona{
    private String nombre;
    private String apellido;
    private int edad;

    public persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public persona() {
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.edad = 0;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
//Sup Clase
class Estudiante extends persona{
    private String NOM;

    public Estudiante() {
    NOM = "Sin numero de control";
    }
    public Estudiante(String NOM) {
    this.NOM = NOM;
    }
    public String getNOM() {
        return NOM;
    }

    public void setNOM(String NOM) {
        this.NOM = NOM;
    }
    
}