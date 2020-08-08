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
public class DatosGenerales implements Visualizable{
    
    private String titulo;
    private String genero = "Todo Publico";    
    private String creador = "Desconocido";   
    private String duracion = "Hrs:1 Min:30 Aproximadamente";    
    private boolean visto = false;
    
    public DatosGenerales() {
    }

    public DatosGenerales(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }
    
    public DatosGenerales(String titulo, String genero, String creador, String duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "DatosGenerales{" + "titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", duracion=" + duracion + ", visto=" + visto;
    }

    @Override
    public void marcarVisto(boolean visto) {
        this.visto = visto;
    }

    @Override
    public boolean esVisto() {
        return this.visto;
    }

    @Override
    public String tiempoVisto() {
        return this.duracion;
    }
    
}
