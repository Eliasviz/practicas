/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval_3_modificadores;

/**
 *
 * @author Elias
 */
public class EVAL_3_MODIFICADORES {

    public static void main(String[] args) {
        //Instanciacion de un objeto de la clase prueva
        //La instanciacion se llama objetoprueba
        Prueba objprueba = new Prueba ();
        objprueba.x = 0; //visible (protected) porque esta en el  mismo paquete
        objprueba.y = 0; //visible (public) es a todo el mundo
        objprueba.z = 0; //visible (default) esta en el mismo paquete
        
        //CLasePrueba2 esta en otro paquete diferente al el
        //de la calse EVAL_3_MODIFICADORES
        Claseprueba2 objClasePrueba2 = new Claseprueba2 ();
        objClasePrueba2.y = 0; //visible (public) a todo el 
    }
}
class Prueba{
    private int w;
    protected int x;
    public int y;
    int z;
}