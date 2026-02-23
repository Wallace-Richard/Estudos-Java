package academy.devdojo.maratonajava.javacore.Dconstrutoresmetodos.test;

import academy.devdojo.maratonajava.javacore.Dconstrutoresmetodos.model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Kuroko no basket", "Ação", 24, "TV");

        anime.imprimir();
    }
}
