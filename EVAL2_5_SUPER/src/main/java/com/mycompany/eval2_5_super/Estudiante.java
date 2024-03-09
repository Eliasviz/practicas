/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eval2_5_super;

/**
 *
 * @author hecto
 */
public class Estudiante extends Persona{
    private String NoControl;
    private String Carrera;
    
    //La llamdad al constructor de la super clase es obligatoria
    //SIEMPRE debe ser la  primera istruccion
    public Estudiante(){
        super();
        this.NoControl = "--------";
        this.Carrera = "---------";
    }

    public Estudiante(String Nombre, String Appaterno, String Apmaterno, int Edad, char Genero,String NoControl, String Carrera) {
        super(Nombre, Appaterno, Apmaterno, Edad, Genero);
        this.NoControl = NoControl;
        this.Carrera = Carrera;
    }

    public Estudiante(String NoControl, String Carrera) {
        this.NoControl = NoControl;
        this.Carrera = Carrera;
    }
      
    public String getNoControl() {
        return NoControl;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
    @Override
    public void ImprimirDatos(){
        super.ImprimirDatos();
        System.out.println("Numero de control: " + NoControl);
        System.out.println("Carrera: " + Carrera);
    }
    
}
