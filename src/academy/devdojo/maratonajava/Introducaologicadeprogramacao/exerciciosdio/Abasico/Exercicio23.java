package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
//      Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
//      As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS.
//      Imprima na tela o salário líquido final.
        Scanner input = new Scanner(System.in);

        System.out.print("Valor da hora aula: R$");
        double valor = input.nextDouble();
        System.out.print("Numero de aulas lecionadas: ");
        int aulas = input.nextInt();
        double inss = 0.93;

        double salarioLiquido = aulas * valor * inss;
        System.out.println("Salario final de R$" + salarioLiquido);
    }
}
