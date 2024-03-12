/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eval2_6_clases_abstractas;

/**
 *
 * @author hecto
 */
public class Triangulo extends Figuras {
    //Tribotos de Base y Altura
    //Costructores (Con y sin atributos)
    //Los Get y Set 
    private double Altura;
    private double Base;

    public Triangulo(double Altura, int Base) {
        this.Altura = Altura;
        this.Base = Base;
    }

    public Triangulo() {
    }

    public double getAltura() {
        return Altura;
    }

    public double getBase() {
        return Base;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public void setBase(int Base) {
        this.Base = Base;
    }
    
    private double CalcularHip(){
        return Math.sqrt(Base * Base + Altura * Altura);
    }
    
    @Override
    public double CalcularArea() {
        return (Base + Altura) /2;
    }

    @Override
    public double CalcularPeri() {
        return Base + Altura + CalcularHip();
    }
    //public double CalcularArea(){
        
    //}
}
