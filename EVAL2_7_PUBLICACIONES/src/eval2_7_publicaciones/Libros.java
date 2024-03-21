/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eval2_7_publicaciones;

/**
 *
 * @author hecto
 */
public class Libros extends Publicaciones{
    private String Autores;

    public Libros() {
        super();
        this.Autores = "Sin autores";
    }

    public Libros(String Titulo, double precio, int Copias, String Autores) {
        super(Titulo, precio, Copias);
        this.Autores = Autores;
    }

    public String getAutores() {
        return Autores;
    }

    public void setAutores(String Autores) {
        this.Autores = Autores;
    }

    
    
    public void OrdenarCopias(int cant){
        
        int Existencias = getCopias();
        setCopias(Existencias + cant);
    }
    
    @Override
    public void ImprimirDatos(){
        super.ImprimirDatos();
        System.out.println("Autor: " + Autores);
    }
}
