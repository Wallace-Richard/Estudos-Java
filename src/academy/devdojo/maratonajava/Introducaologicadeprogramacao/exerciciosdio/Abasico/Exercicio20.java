package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
//      Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da tabuada: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
