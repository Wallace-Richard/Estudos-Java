package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
//      Ler A e B → se iguais somar, senão multiplicar → guardar em C

        Scanner input = new Scanner(System.in);
        System.out.print("Valor a: ");
        int a = input.nextInt();
        System.out.print("Valor b: ");
        int b = input.nextInt();
        int c;

        if (a == b)
        {
            c = a + b;
            System.out.println("a + b = " + c);
        }
        else
        {
            c = a * b;
            System.out.println("a * b = " + c);
        }
    }
}
