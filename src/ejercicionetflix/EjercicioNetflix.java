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
public class EjercicioNetflix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pelicula [] peliculas = new Pelicula[5];
        Serie [] series = new Serie[5];
        
        peliculas[0] = new Pelicula("Batman El Caballero de la Noche", "DC Comics");
        peliculas[1] = new Pelicula("Jumanji 2", "Familiar, Infantil", "Productora Inglesa", "2020",  "Hrs:2 min:55 seg:25");
        peliculas[2] = new Pelicula("Aterrados", "Terror", "Productora España", "2020",  "Hrs:1 min:30 seg:55");
        peliculas[3] = new Pelicula("Avenger Infinity War", "Marvel Studios");
        peliculas[4] = new Pelicula("Pequeño Demonio", "Desconocido");
        
        peliculas[2].marcarVisto(true);
        peliculas[3].marcarVisto(true);
        
        /* Descomentar para imprimir todas las Peliculas
        System.out.println("***** PELICULAS *****");
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println("");
            System.out.println(peliculas[i].toString());                        
        }
        System.out.println("---------------------------");
        */
        
        series[0] = new Serie("Look y Key", "Productora Multinacional");
        series[1] = new Serie("La Casa de Papel", 4, "Accion, Atracos", "EspañaMovieFilms", "Hrs:80 min:30 seg:55");
        series[2] = new Serie("Siete pecados Capitales", 4, "Anime", "JaponoFilms", "Hrs:30 min:30 seg:55");
        series[3] = new Serie("Mejores que Nosotros", "RusiaProducRush");
        series[4] = new Serie("Vikingos", "MiltiRecords");
        
        series[3].marcarVisto(true);
        series[4].marcarVisto(true);
        
        /* Descomentar para imprimir todas las Series
        System.out.println("");
        System.out.println("***** SERIES *****");        
        for (int i = 0; i < series.length; i++) {
            System.out.println("");
            System.out.println(series[i].toString());                        
        }
        System.out.println("---------------------------");
        */
        
        System.out.println("");
        System.out.println("***** PELICULAS VISTAS*****");
        System.out.println("");
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].esVisto() == true) {
                System.out.println("Titulo : " + peliculas[i].getTitulo() + " Duracion : " + peliculas[i].getDuracion());
            }                                    
        }
        System.out.println("---------------------------");
        System.out.println("");
        System.out.println("***** SERIES VISTAS*****");
        System.out.println("");
        for (int i = 0; i < series.length; i++) {
            if (series[i].esVisto() == true) {
                System.out.println("Titulo : " + series[i].getTitulo() + " Duracion : " + series[i].getDuracion());
            }                                    
        }
        System.out.println("---------------------------");
        
        
        System.out.println("");
        System.out.println("***** SERIES CON MAS TEMPORADAS*****");
        System.out.println("");
        int temporal = 0;  
        for (int i = 0; i < series.length; i++) {
            if (i>0){ 
                if (series[i].getNumeroTemporada() > series[(i-1)].getNumeroTemporada()) {
                    temporal = i;                    
                }
            }
        }
        for (int i = 0; i < series.length; i++) {
            if (series[i].getNumeroTemporada() >= series[temporal].getNumeroTemporada()){ 
                System.out.println(series[i].toString());
            }
        }
        
        
        System.out.println("");
        System.out.println("***** PELICULAS MAS RECIENTE*****");
        System.out.println("");
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].getAnio().equals("2020")) {
                System.out.println(peliculas[i].toString());
            }                                    
        }
        
    }
    
}
