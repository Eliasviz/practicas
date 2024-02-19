/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval_6_metodos;

import java.util.Scanner;

/**
 *
 * @author hecto
 */
public class EVAL_6_METODOS {

    public static void main(String[] args) {
    
        Persona perso = new Persona();
        perso.getNombtre("juan");
        perso.getApellido("perez");
        perso.getEdad(50);
        System.out.println("El nombre completo es: " + perso.generararNombreComp());
        System.out.println("La fecha de nacimineto es: " + perso.calcularAñioNac());
        
        //Se declara y crea un arreglo para 5 poersonas
        //En este mentodo, mo existen los 5 objetos 
        Persona [] grupo = new Persona [5];
        for (int i = 0; i < grupo.length; i++){
            grupo[i] = new Persona();//Creamos cada objeto
            //Pedir los datos del teclado
            Scanner input = new Scanner(System.in);
            
            System.out.println("Captura el nombre");
            String Nombre = input.nextLine();
            grupo[i].getNombtre(Nombre);
            
             System.out.println("Captura el apellido");
            String Apellido = input.nextLine();
            grupo[i].getApellido(Apellido);
            
             System.out.println("Captura el Edad");
            int Edad = input.nextInt();
            grupo[i].getEdad(Edad);
        }
    }
}

