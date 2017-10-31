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
public class WebGalery {
    private String Nombre;
    private ArrayList<Comprador> Compradores;
    private ArrayList<Artista> Artistas;
    private Artista artista; 
    private Usuario usuario;

    public WebGalery(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void AddComprador(Comprador comprador){
        this.Compradores.add(comprador);
    }
    
    public void AddArtista(Artista artista){
        this.Artistas.add(artista);
    }
    
    public void ListarObras(){
        this.artista.getObrasArtista();
    }
    

}
