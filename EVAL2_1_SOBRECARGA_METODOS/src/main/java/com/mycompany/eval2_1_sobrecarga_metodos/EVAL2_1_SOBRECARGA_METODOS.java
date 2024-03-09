/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval2_1_sobrecarga_metodos;

/**
 *
 * @author hecto
 */
public class EVAL2_1_SOBRECARGA_METODOS {
//sout + TAP = System.out.println("");
    public static void main(String[] args) {
    System.out.println("El suma 5 + 4 = " + sumar(5,4) );
    System.out.println("El suma 5.3 + 4.1 = " + sumar(5.3,4.1) );
    System.out.println("El suma hola + mundo = " + sumar("hola"," Mundo") );
        System.out.println("");
    }
    //sumar: Metodo de sobrecarga
                //Firma nombreMetodos(tipo_Datos, tipos_Datos)
     public static int sumar(int num1, int num2){
        return num1 + num2;
    }
    public static double sumar(double num1, double num2){
        return num1 + num2;
    }
    public static String sumar(String num1, String num2){
        return num1 + num2;
    }
public static void sumar(){
    System.out.println("Suma que no hace nada ");
    }


}
