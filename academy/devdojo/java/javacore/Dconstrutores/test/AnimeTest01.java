package academy.devdojo.java.javacore.Dconstrutores.test;

import academy.devdojo.java.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haihyuu", "TV", 12, "Ação", "Production IG");
        Anime anime2 = new Anime();

        anime.init("Akudama Drive", "TV", 12);
        anime.init("Akudama Drive", "TV", 12, "Ação");
      //  anime.setGenero("Ação");
        anime.imprime();
        anime2.imprime();
    }
}
