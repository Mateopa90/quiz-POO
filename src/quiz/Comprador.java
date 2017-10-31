/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Estudiante
 */
public class Comprador extends Usuario{
    private Artista artista;
    private Obra obras;

    public Comprador(String Nombre, int id, String CuentaBancaria, double Saldo) {
        super(Nombre, id, CuentaBancaria, Saldo);
    }
    
    public void RealizarCompra(int ied){
        this.artista.getObrasArtista().get(ied);
    }
}
