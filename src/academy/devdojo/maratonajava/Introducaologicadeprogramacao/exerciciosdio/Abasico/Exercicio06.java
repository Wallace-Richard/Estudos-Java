package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
//      Aplicar reajuste de 5% em um valor

        Scanner input = new Scanner(System.in);
        int salario = input.nextInt();

        System.out.println("Imposto de 5%: " + (salario * 0.95));
    }
}
