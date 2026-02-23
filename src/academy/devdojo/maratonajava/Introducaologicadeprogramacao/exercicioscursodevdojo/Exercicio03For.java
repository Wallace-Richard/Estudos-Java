package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exercicioscursodevdojo;

public class Exercicio03For {
    public static void main(String[] args) {
        /*
        Cronômetro Regressivo
        Objetivo: Praticar a condição de parada do while.
        Desafio: Crie uma variável int contador = 10;.
        Regra: Enquanto o contador for maior que 0, imprima o valor e diminua 1 (contador--). Quando chegar a 0, imprima "Fogo!".
        */

        System.out.println("Tempo até o incendio: ");
        for (int i = 10; i >= 0; i--)
        {
            System.out.println(i + " segundos");
            if (i == 0)
            {
                System.out.println("Fogooooooo!!!!!!");
                break;
            }
        }
    }
}
