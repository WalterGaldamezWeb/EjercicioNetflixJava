/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionetflix;

/**
 *
 * @author Walter Gdmz
 */
public class Pelicula extends DatosGenerales {
    
    private String anio = "Desconocido";

    public Pelicula() {
        super();
    }       

    public Pelicula(String titulo, String creador) {
        super(titulo, creador);
    }

    public Pelicula(String titulo, String genero, String creador, String anio, String duracion) {
        super(titulo, genero, creador, duracion);
        this.anio = anio;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return super.toString() + ", año=" + anio + '}';
    }

}
