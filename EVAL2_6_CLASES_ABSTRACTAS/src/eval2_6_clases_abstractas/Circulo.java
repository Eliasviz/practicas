/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eval2_6_clases_abstractas;

/**
 *
 * @author hecto
 */
public class Circulo extends Figuras {
    private double Radio;

    public Circulo(double Radio) {
        this.Radio = Radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    @Override
    public double CalcularArea() {
        return Math.pow(Radio, Radio) * Math.PI;
    }

    @Override
    public double CalcularPeri() {
        return (Radio * 2) * Math.PI;
    }
    
    
}
