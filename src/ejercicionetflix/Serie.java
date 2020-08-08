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
public class Serie extends DatosGenerales {
    
    private int numeroTemporada = 1;

    public Serie() {
    }
    
    public Serie(String titulo, String creador) {
        super(titulo, creador);
    }
    
    public Serie(String titulo, int numeroTemporada, String genero, String creador, String duracion) {
        super(titulo,genero, creador, duracion);
        this.numeroTemporada = numeroTemporada;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    @Override
    public String toString() {
        return super.toString() + ", numeroTemporada=" + numeroTemporada + '}';
    }

}
