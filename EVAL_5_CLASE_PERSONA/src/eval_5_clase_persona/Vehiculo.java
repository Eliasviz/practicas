/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eval_5_clase_persona;

/**
 *
 * @author invitado
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private double precio;
    //AGREGAR EL GET Y SET
    public String getMarca (){
        return marca;
    }
    public void setMarca (String valor){
        marca = valor;
    }
    public String getModelo (){
        return modelo;
        
    }
    public void setModelo (String valor){
        modelo = valor;
    }
    public int getAño (){
        return año;
    }
    public void setAño (int valor){ 
        año = valor;
    }
    public String getColor () {
       return color;
    }
    public void setColor (String valor){
         color = valor;
    }
     public double getPrecio () {
       return precio;
    }
    public void setPrecio (double valor){
         precio = valor;
    }
    
    
    
}
