/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eval2_3_vehiculo;

/**
 *
 * @author Elias
 */
public class Vehiculo {
    private String Marca;
    private String Modelo;
    private int Año;
    private String Color;
    
    public Vehiculo(){
    Marca = "Sin marca";
    Modelo = "Sin modelo";
    Año = 0;
    Color = "Sin color";
    }
    
    public Vehiculo(String Marca, String Modelo, int Año, String Color){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Año = Año;
        this.Color = Color;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getAño() {
        return Año;
    }

    public String getColor() {
        return Color;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    public void ImprimirDatos(){
        System.out.println("La marca: " + Marca);
        System.out.println("El modelo: " + Modelo);
        System.out.println("El año: " + Año);
        System.out.println("El color: " + Color);       
    }
}