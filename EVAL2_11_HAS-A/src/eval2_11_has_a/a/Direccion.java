/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eval2_11_has_a.a;

/**
 *
 * @author hecto
 */
public class Direccion {
    private String Calle;
    private String Numero;        
    private String Colonia;
    private String CP;
    private String Ciudad;
    private String Estado;

    public Direccion() {
        this.Calle = "";
        this.Numero = "";
        this.Colonia = "";
        this.CP = "";
        this.Ciudad = "";
        this.Estado = "";
    }

    public Direccion(String Calle, String Numero, String Colonia, String CP, String Ciudad, String Estado) {
        this.Calle = Calle;
        this.Numero = Numero;
        this.Colonia = Colonia;
        this.CP = CP;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString(){
        String cade;
        cade = "Calle: " + Calle + "/n" +
                "Numero: " + Numero + "/n" + 
                "Colonia: " + Colonia + "/n" +
                "Cp: " + CP + "/n" +
                "Ciudad: " + Ciudad + "/n" +
                "Estado: " + Estado;       
        return cade;
    }
            
}
