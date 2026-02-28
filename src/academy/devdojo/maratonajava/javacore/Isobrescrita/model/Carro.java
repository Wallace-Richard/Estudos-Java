package academy.devdojo.maratonajava.javacore.Isobrescrita.model;

public class Carro {
    private String nome;
    private String marca;

    public Carro(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Marca: " + marca;
    }
}
