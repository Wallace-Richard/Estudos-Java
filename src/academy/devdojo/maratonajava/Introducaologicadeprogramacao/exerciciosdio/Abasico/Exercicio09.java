package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Altura: ");
        double altura = input.nextDouble();
        System.out.print("Peso: ");
        double peso = input.nextDouble();

        double imc = peso / (altura * altura);

        if (imc <= 18.5)
        {
            System.out.println("IMC Abaixo de 18,5, considerado abaixo do peso");
        }
        else if (imc <= 24.9)
        {
            System.out.println("IMC Entre 18,6 e 24,9, considerado peso ideal ");
        }
        else if (imc <= 29.9)
        {
            System.out.println("IMC entre 25,0 e 29,9, considerado levemente acima do peso ");
        }
        else if (imc <= 34.9)
        {
            System.out.println("IMC entre 30,0 e 34,9, considerado obesidade grau I ");
        }
        else if (imc <= 39.9)
        {
            System.out.println("IMC entre 35,0 e 39,9, considerado obesidade grau II (severa) ");
        }
        else
        {
            System.out.println("IMC Maior ou igual a 40, considerado obesidade grau III (mórbida) ");
        }
    }
}
