/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eval_8_triangulo;

/**
 *
 * @author elias
 */
public class Triangulo {
    //Triangulo rectangulo
    private double Base;
    private double Altura;
    
    public Triangulo(){
        Base = 0;
        Altura = 0;
    }
    
    public void setBase (double base){
        Base = base;
    } 
    
    public double getBase (){
        return Base;
    }
    
    public double getAltura (){
        return Altura;
    }
    
    public void setAltura (double altura){
        Altura = altura;
    }         
    
    private double calculararea(){
        return (Base * Altura ) / 2;
    }
    
    private double calcularHip(){
       
        return Math.sqrt(Base * Base + Altura * Altura);
        
    }
    private double calcularper(){
        double Hipotenusa = calcularHip();
        return Base + Altura + Hipotenusa;
    }
    
    public void imprimirdatos(){
        System.out.println("El area en:" + calculararea());
        System.out.println("El perimetro en " + calcularper());
    }
}
