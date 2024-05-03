/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eval2_13_polimorfismo_2;

/**
 *
 * @author hecto
 */
public class EVAL2_13_POLIMORFISMO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona per1 = new Persona("Peres", "Martinez");
        Persona per2 = new Persona("Bob", "Zulieta");
        Persona per3 = new Persona("Ana", "Lechuga");
        
        Estudiante estu1 = new Estudiante("1234", "Gina", "Folio");
        Estudiante estu2 = new Estudiante("4321", "Moli", "Gerardo");
        Estudiante estu3 = new Estudiante("2341", "Alizon", "Xulieta");
        //MostrarDatos dat = new MostrarDatos();
        ImprimirDatos(per1);
        ImprimirDatos(per2);
        ImprimirDatos(per3);
        ImprimirDatos(estu1);
        ImprimirDatos(estu2);
        ImprimirDatos(estu3);
    }
    
    public static void ImprimirDatos(MostrarDatos datos){
        datos.ImprimirDatos();
        
    }
    
}
