package academy.devdojo.maratonajava.javacore.Minterfaces.model;

public class Tv implements Controle{
    private String marca;

    public Tv(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String ligar() {
        return "Ligando...";
    }

    @Override
    public String desligar() {
        return "Desligando...";
    }
}
