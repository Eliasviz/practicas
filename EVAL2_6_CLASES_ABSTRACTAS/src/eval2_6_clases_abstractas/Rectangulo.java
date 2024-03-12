/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eval2_6_clases_abstractas;

/**
 *
 * @author hecto
 */
public class Rectangulo extends Figuras{
    private double Altura;
    private double Base;

    public Rectangulo(double Altura, int Base) {
        this.Altura = Altura;
        this.Base = Base;
    }

    public Rectangulo() {
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

    @Override
    public double CalcularArea() {
        return Base * Altura;
        
    }

    @Override
    public double CalcularPeri() {
        return(Base * 2) + (Altura * 2);
        
    }
    


}
