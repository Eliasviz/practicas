/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval_8_costructores;

/**
 *
 * @author hecto
 */
public class EVAL_8_COSTRUCTORES {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setnomCliente("Manolo");
        cuenta.setnoCuenta(12928390);
        cuenta.Depositar(20000);
        cuenta.imprimirDatosCuenta();
    }
}
