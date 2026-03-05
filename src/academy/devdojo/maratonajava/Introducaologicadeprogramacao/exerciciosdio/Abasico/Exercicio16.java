package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
//      Faça um algoritmo que leia três valores que representam os três lados de um triângulo e
//      verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
        Scanner input = new Scanner(System.in);

        System.out.print("Lado 1: ");
        int a = input.nextInt();
        System.out.print("Lado 2: ");
        int b = input.nextInt();
        System.out.print("Lado 3: ");
        int c = input.nextInt();

        if (a == b && b == c)
        {
            System.out.println("Triangulo equilatero!");
        }
        else if (a != b && b != c)
        {
            System.out.println("Triangulo escaleno!");
        }
        else
        {
            System.out.println("Triangulo isósceles!");
        }
    }
}
