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
public class EVAL_5_CLASE_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNombre("juan");
        perso.setApellido("perez");
        perso.setEdad(50);
        
        
        
        
    }

}
class Persona{
        //ATIBUTOS:Deben de ser privados (por diseño)
        private String nombre;
        private String apellido;
        private int edad; 
        
        //Metodos:deben hacer metodos publicos (interfaz)
        //que nos permitan manipular los atributos.
        //JAVA : ESTOS METODOS SON LOS METODOS GET Y SET 
        //METODO GET   : NOS PERMITE recuperar un valor   (lectura)      
        //metodo set  :nos permite asignar un valor   (escritura)
        public String getNombre (){
            return nombre;
        }
        public void setNombre(String valor){
            nombre = valor;
        }
        public String getApellido (){
            return apellido;
        }
        public void setApellido(String valor){
            apellido = valor;
        }
        public int getEdad (){
            return edad;
            
        }
        public void setEdad(int valor){
            edad = valor;
        }
    }
