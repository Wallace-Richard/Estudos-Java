package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
//      Faça um algoritmo que receba um valor A e B,
//      e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
        Scanner input = new Scanner(System.in);

        System.out.print("Valor A: ");
        int a = input.nextInt();
        System.out.print("Valor B: ");
        int b = input.nextInt();
        int c = a;

        a = b;
        b = c;

        System.out.println("\nValor A: " + a);
        System.out.println("Valor B: " + b);
    }
}
