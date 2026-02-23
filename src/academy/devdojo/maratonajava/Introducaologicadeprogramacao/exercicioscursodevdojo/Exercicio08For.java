package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exercicioscursodevdojo;

public class Exercicio08For {
    public static void main(String[] args) {
        //Sequência de Fibonacci
        //Gere os primeiros 15 números da sequência de Fibonacci (0, 1, 1, 2, 3, 5...).

        int proximo, ultimo, penultimo;
        penultimo = 0;
        ultimo = 1;

        System.out.println(penultimo);
        System.out.println(ultimo);

        for (int i = 0; i < 13; i++)
        {
            proximo = ultimo + penultimo;
            System.out.println(proximo);
            penultimo = ultimo;
            ultimo = proximo;
        }
    }
}
