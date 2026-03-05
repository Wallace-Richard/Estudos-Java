package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
//      Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
//      Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara seja maior que Francisco.
        Scanner input = new Scanner(System.in);

        int francisco = 150;
        int sara = 110;
        int counter = 0;

        while (sara < francisco)
        {
            francisco += 2;
            sara += 3;
            counter++;
        }
        System.out.println("Levara " + counter + " anos para Sara ser maior que Francisco");
    }
}
