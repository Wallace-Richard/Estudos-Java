package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
//      Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int media = (a + b + c) / 3;
        System.out.println("Media: " + media);
    }
}
