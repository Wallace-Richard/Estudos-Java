package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model;

public class ImpressoraEstudante {
    public void imprimir(Estudante estudante)
    {
        System.out.println("\n" + estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
