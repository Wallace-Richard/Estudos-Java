package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Random;

public class Exercicio21 {
    public static void main(String[] args) {
//      Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
        Random gerador = new Random();

        int num = gerador.nextInt(101);
        System.out.println("Numero sorteado: " + num);
    }
}
