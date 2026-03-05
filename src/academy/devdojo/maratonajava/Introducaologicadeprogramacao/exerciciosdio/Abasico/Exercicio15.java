package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
//      Faça um algoritmo que leia o ano em que uma pessoa nasceu,
//      imprima na tela quantos anos, meses e dias essa pessoa ja viveu.
//      Leve em consideração o ano com 365 dias e o mês com 30 dias.
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o ano em que você: ");
        int anoDeNascimento = input.nextInt();
        int ano, meses, dias;

        ano = 2026 - anoDeNascimento;
        meses = ano * 12;
        dias = meses * 30;
        System.out.println(ano + " anos");
        System.out.println(meses  + " meses");
        System.out.println(dias + " dias");
    }
}
