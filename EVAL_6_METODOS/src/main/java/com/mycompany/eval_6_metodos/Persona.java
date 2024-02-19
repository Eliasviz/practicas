/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eval_6_metodos;

/**
 *
 * @author hecto
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    
    public String setNombre (){
        return Nombre;
    }
    public void getNombtre(String valor) {
        Nombre = valor;
    }
    public String setApellido (){
        return Apellido;
    
    }
    public void getApellido (String valor){
        Apellido = valor;
    }
    public int setEdad (){
        return Edad;
        
    } 
    public void getEdad (int valor){
        Edad = valor;
    }
    //-----------------------------------
    public String generararNombreComp(){
        
        return Nombre + " " + Apellido;
    }
    
    public int calcularAñioNac(){
        return 2024 - Edad;
    }

}

