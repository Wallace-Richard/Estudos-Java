package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
//      Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
//      Imprima na tela as duas temperaturas. Fórmula: C = (5 * ( F-32) / 9)
        Scanner input = new Scanner(System.in);

        System.out.print("Temperatura em Fahrenheit: °");
        int f = input.nextInt();

        int c = (5 * (f - 32) / 9);

        System.out.print("Temperatura em Celsius: °" + c);
    }
}
