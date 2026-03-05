package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
//      Ler A, B, C → somar A + B e verificar se é menor que C

        Scanner input = new Scanner(System.in);

        System.out.print("Valor a: ");
        int a = input.nextInt();
        System.out.print("Valor b: ");
        int b = input.nextInt();
        System.out.print("Valor c: ");
        int c = input.nextInt();
        int soma = a + b;

         if (soma == c)
        {
            System.out.println("a soma de a e b é igual a c");
        }
        else if (soma > c)
        {
            System.out.println("\nA soma de a e b é maior que c");
        }
        else
        {
            System.out.println("\nc é maior que a soma de a e b");
        }
    }
}
