package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.ImpressoraEstudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Midorya";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        estudante01.imprimir();
        estudante02.imprimir();

    }
}
