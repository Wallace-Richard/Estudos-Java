package academy.devdojo.maratonajava.logicadeprogramacao.exercicios;

public class Exercicio15While {
    public static void main(String[] args) {
        /*
        Sequência de Collatz
        Pegue o número 27. Se for par divida por 2, se for ímpar multiplique por 3 e some 1.
        Repita enquanto o número for diferente de 1. Exiba cada passo e a contagem total.
        */

        long collatz = 27;
        int i = 1;
        System.out.println("Valor inicial: " + collatz);

        while (collatz != 1)
        {
            if (collatz % 2 == 0)
            {
                System.out.println("Valor par: " + collatz);
                collatz /= 2;
            }
            else
            {
                System.out.println("Valor impar: " + collatz);
                collatz = collatz * 3 + 1;
            }
            i++;
        }
        System.out.println("Foram feitos " + i + " passos");
    }
}
