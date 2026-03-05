package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
//      Faça um algoritmo que leia quatro notas obtidas por um aluno,
//      calcule a média das nota obtidas, imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado.
//      Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int media = (a + b + c + d) / 4;

        if (media  >= 7)
        {
            System.out.println("APROVADO!");
        }
        else
        {
            System.out.println("REPROVADO!");
        }
    }
}
