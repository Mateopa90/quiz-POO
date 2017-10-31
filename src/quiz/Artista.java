/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.TreeMap;

/**
 *
 * @author Estudiante
 */
public class Artista extends Usuario{
    
    private TreeMap<Integer, Obra> ObrasArtista;
    private Obra obra; 

    public Artista(String Nombre, int id, String CuentaBancaria, double Saldo) {
        super(Nombre, id, CuentaBancaria, Saldo);
    }
    
    public void AddObra(int ied, Obra obra){
        this.ObrasArtista.put(ied, obra);
    }

    public TreeMap<Integer, Obra> getObrasArtista() {
        return ObrasArtista;
    }
    
}
