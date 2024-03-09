package com.mycompany.eval2_2_sobrecarga_costructores;

/**
 *
 * @author hecto
 */
public class EVAL2_2_SOBRECARGA_COSTRUCTORES {

    public static void main(String[] args) {
        Persona perso1 = new Persona();
        perso1.Prueba();
        Persona perso2 = new Persona("Pedro", "Perez", 70 );
        perso2.Prueba();
    }
}
