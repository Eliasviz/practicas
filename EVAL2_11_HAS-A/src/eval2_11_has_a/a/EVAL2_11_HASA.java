/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eval2_11_has_a.a;

/**
 *
 * @author hecto
 */
public class EVAL2_11_HASA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion direc = new Direccion("Revolucion", "2564", "villas", "3247", "Chihuahua", "Japon");
        Persona Perso = new Persona("Juan", "Perez", 50, direc);
        System.out.println(Perso.toString());
    }
    
}
