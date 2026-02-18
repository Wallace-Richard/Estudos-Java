package academy.devdojo.maratonajava.logicadeprogramacao.exercicios;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        Cronômetro Regressivo
        Objetivo: Praticar a condição de parada do while.
        Desafio: Crie uma variável int contador = 10;.
        Regra: Enquanto o contador for maior que 0, imprima o valor e diminua 1 (contador--). Quando chegar a 0, imprima "Fogo!".
        */
        int count = 11;

        System.out.println("Tempo até o incendio: ");
        while (count >= 0)
        {
            count--;
            System.out.println(count + " segundos");
            if (count == 0)
            {
                System.out.println("Fogooooooo!!!!!!");
                break;
            }
        }
    }
}
