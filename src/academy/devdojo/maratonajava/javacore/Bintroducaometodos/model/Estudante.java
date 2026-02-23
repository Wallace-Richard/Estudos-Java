package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprimir()
    {
        System.out.println("\n" + this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
