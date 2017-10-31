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
public class Obra {
    private String Artista;
    private String NombreObra;
    private String Estilo;
    private String Tecnica;
    private double Precio;

    public Obra(String Artista, String NombreObra, String Estilo, String Tecnica, double Precio) {
        this.Artista = Artista;
        this.NombreObra = NombreObra;
        this.Estilo = Estilo;
        this.Tecnica = Tecnica;
        this.Precio = Precio;
    }

    public String getArtista() {
        return Artista;
    }

    public String getNombreObra() {
        return NombreObra;
    }

    public String getEstilo() {
        return Estilo;
    }

    public String getTecnica() {
        return Tecnica;
    }

    public double getPrecio() {
        return Precio;
    }
    
    
}
