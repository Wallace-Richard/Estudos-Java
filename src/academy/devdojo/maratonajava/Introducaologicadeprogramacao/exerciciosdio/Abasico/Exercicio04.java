package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
//      Mostrar antecessor e sucessor de um número
        Scanner input = new Scanner(System.in);

        System.out.print("Numero: ");
        int num = input.nextInt();
        System.out.println("Antecessor: " + (num - 1));
        System.out.println("Sucessor: " + (num + 1));
    }
}
