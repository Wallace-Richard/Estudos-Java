package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Exercicio05 {
    public static void main(String[] args) {
//      Calcular quantos salários mínimos (R$ 1.621) a pessoa recebe

        Scanner input = new Scanner(System.in);
        double salario = input.nextInt();
        double salarioMinimo = 1621;

        double counterSalario =  salario / 1621 ;
        System.out.printf("Seu salario equivale a: %.2f salarios minimos%n", counterSalario);
    }
}
