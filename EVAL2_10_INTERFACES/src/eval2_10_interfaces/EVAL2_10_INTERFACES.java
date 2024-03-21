/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eval2_10_interfaces;

/**
 *
 * @author hecto
 */
public class EVAL2_10_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiantes est = new Estudiantes("221233", "juan", "Perez", 30);
        est.generarAnnioNac();
        est.GenerarNombreCon();        
        est.ImprimirDatos();

        
    }
    
}
