package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
//      Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa
//      e se ela é maior ou menor de idade.
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade > 18)
        {
            System.out.println("\nSeu nome é " + nome);
            System.out.println("VOCE É MAIOR DE IDADE!");
        }
        else
        {
            System.out.println("\nSeu nome é " + nome);
            System.out.println("VOCE É MENOR DE IDADE!");
        }
    }
}
