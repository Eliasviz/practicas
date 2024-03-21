/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eval2_7_publicaciones;

/**
 *
 * @author hecto
 */
public class EVAL2_7_PUBLICACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libros libro = new Libros("En llamas", 50, 10, "Juan perez");
        libro.ImprimirDatos();
        libro.VederCopias(5);
        libro.ImprimirDatos();
        libro.OrdenarCopias(100);
        libro.ImprimirDatos();
    }
    
}
