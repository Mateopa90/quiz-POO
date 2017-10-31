/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public abstract class Usuario {
    protected String Nombre;
    protected int id;
    protected String CuentaBancaria;
    protected double Saldo;

    public Usuario(String Nombre, int id, String CuentaBancaria, double Saldo) {
        this.Nombre = Nombre;
        this.id = id;
        this.CuentaBancaria = CuentaBancaria;
        this.Saldo = Saldo;
    }

}
