package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
//      Verificar se número é par ou ímpar, positivo ou negativo

        Scanner input = new Scanner(System.in);
        System.out.print("Numero: ");
        int num = input.nextInt();

        if (num < 0)
        {
            System.out.println("Numero negativo!");
        }
        else
        {
            System.out.println("Numero positivo!");
        }
        if (num % 2 == 0)
        {
            System.out.println("Numero par!");
        }
        else
        {
            System.out.println("Numero impar!");
        }
    }
}
