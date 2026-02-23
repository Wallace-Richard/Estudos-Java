package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.model;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++)
        {
            episodios[i] = i+1;
        }
    }
    public Anime() {
        for (int ep : episodios)
        {
            System.out.print(ep + " ");
        }
    }
}
