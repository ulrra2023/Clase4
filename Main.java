package org.example;

import java.time.Year;

class Main {
    public static void main(String[] args) {

        Song cancion1 = new Song (new Normal(),"The Scientist", "Coldplay", "A Rush of Blood to the head", 1000, 250, 76, Year.of(2002));
        Song cancion2 = new Song(null,"Titulo2", "Artista2", "Album2", 4, 5, 6, Year.of(2021));

        System.out.println(Icono.ROCKET.texto() + Icono.MUSICAL_NOTE.texto() + Icono.FIRE.texto() +"The tittle of the first song is: "+ cancion1.getTitulo() + cancion1.getTrendingState());

    }
}