/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval_2_istanciacion;

/**
 *
 * @author Elias
 */
public class EVAL_2_ISTANCIACION {

    public static void main(String[] args) {
        //Clase objeto = new Constructor ();
        //Constructor -->metodo que se llama igual que la clase
        //instanciacion : asignar memoria a un objeto
        Persona person1 = new Persona ();
        System.out.print(person1);
        //El operador "." sirve para trasladornos a la direcion de
        //Memoria y acceder al contenido del objeto
        person1.Nombre = "juan";
        person1.Apellido = "perez";
        person1.Edad = 50;
    }
}
class Persona {
    String Nombre;
    String Apellido;
    int Edad;
    
}
