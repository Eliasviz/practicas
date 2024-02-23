/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eval_8_costructores;

/**
 *
 * @author hecto
 */
public class CuentaBancaria {
    private double saldo;
    private int noCuenta;
    private String nomCliente;
    
    //Costructor Default:
    public CuentaBancaria(){
        noCuenta = 0;
        nomCliente = "Sin cliente";
        saldo = 1000000;
    }
    
    //Retiran 
    public void retirar(double monto){
        //Si esta en tu saldo
            //Retirar 10 millones (o cualquier monto)
        if (monto <= saldo)
            saldo = saldo - monto;
        
    }
    //Depositar
    public void Depositar (double monto){
        saldo = saldo + monto;
    }
    //get y set para el nombre del cliente y numero de cunta
    public void setnomCliente (String Cliente){
        nomCliente = Cliente;
    }
    public String getnomCliente (){
        return nomCliente;
    }
    public void setnoCuenta (int Cuenta){
        noCuenta = Cuenta;
    }
    public int getnoCuenta (){
        return noCuenta;
    }
    
    public void imprimirDatosCuenta(){
        System.out.println("El clienate es: " + nomCliente);
        System.out.println("El numero de cuenta es: " + noCuenta);
        System.out.println("El saldo es: " + saldo);
        

    }
}
