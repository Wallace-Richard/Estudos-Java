package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        /**
         * 1. O programa deve ler a altura de 5 pessoas diferentes.
         * 2. Somar as alturas em uma variável 'somaAlturas'.
         * 3. Ao final, calcule a média (soma / 5) e imprima:
         * - A média de altura do grupo.
         * - O valor da maior altura encontrada.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Digite as alturas: Ex. 150");

        int somaAltura = 0;
        for (int i = 0; i < 5; i++)
        {
            int altura = input.nextInt();
            somaAltura += altura;
        }

        somaAltura /= 5;
        System.out.println("Altura media: " + somaAltura + " cm");


    }
}
