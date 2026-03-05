package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
//      Faça um algoritmo que leia dois valores inteiros A e B,
//      imprima na tela o quociente e o resto da divisão inteira entre eles.
        Scanner input = new Scanner(System.in);

        System.out.print("Valor A: ");
        double a = input.nextInt();
        System.out.print("Valor B: ");
        double b = input.nextInt();

        System.out.println("\nQuociente: " + (a / b));
        System.out.println("Resto: " + (a % b));
    }
}
