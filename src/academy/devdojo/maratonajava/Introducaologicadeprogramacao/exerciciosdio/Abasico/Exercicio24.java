package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
//      Faca ium programa que some todos os números inteiros de 1 até um valor que o usuário escolher.
//      Por exemplo, se o usuário digitar 5, o programa deve calcular: 1+2+3+4+5=15.
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        int soma = 0;

        for (int i = 1; i <= num; i++)
        {
            soma += i;
        }

        System.out.println("Soma total: " + soma);
    }
}
