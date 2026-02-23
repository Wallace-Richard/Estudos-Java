package academy.devdojo.maratonajava.javacore.Csobrecargametodos.model;

public class Anime {
    private String nome;
    private String genero;
    private int episodios;
    private String tipo;

    public void initClass(String nome, String genero, int episodios) {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
    }

    public void initClass(String nome, String genero, int episodios, String tipo) {
        this.initClass(nome, genero,episodios);
        this.tipo = tipo;
    }

    public void imprimir() {
        System.out.println(nome);
        System.out.println(genero);
        System.out.println(episodios);
        System.out.println(tipo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }


}
