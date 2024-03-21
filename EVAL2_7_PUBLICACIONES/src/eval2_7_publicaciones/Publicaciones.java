/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eval2_7_publicaciones;

/**
 *
 * @author hecto
 */
public abstract class Publicaciones {
    private String Titulo;
    private double precio;
    private int Copias; //invetario

    public Publicaciones(String Titulo, double precio, int Copias) {
        this.Titulo = Titulo;
        this.precio = precio;
        this.Copias = Copias;
    }
    //Costructores
    public Publicaciones() {
        this.Titulo = "Sin titulo";
        this.precio = 0;
        this.Copias = 0;
    }

    public String getTitulo() {
        return Titulo;
    }
    //Get y Set
    public double getPrecio() {
        return precio;
    }

    public int getCopias() {
        return Copias;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCopias(int Copias) {
        this.Copias = Copias;
    }
            
    //Manejar el imventario
    public void VederCopias(int cant){
        //verifivar que tenemos existencias
        if (cant <= Copias)
            Copias -= cant;
    }
    
    public void ImprimirDatos(){
        System.out.println("Titulo: " + Titulo);
        System.out.println("Precio: " + precio);
        System.out.println("Copias: " + Copias);
    }
}
