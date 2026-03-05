package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exerciciosdio.Abasico;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /*      Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
         *      conforme a escolha da forma de pagamento
         *      pelo comprador e imprima na tela o valor final do produto a ser pago.
         *      Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
         *
         *      1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
         *      2 - À Vista no cartão de crédito, recebe 10% de desconto
         *      3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
         *      4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
         *
         *
         *
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valor = input.nextDouble();

        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");

        String opcao = input.next();
        switch (opcao)
        {
            case "1":
                valor *= 0.85;
                System.out.println("Valor com 15% de desconto: " + valor);
                break;
            case "2":
                valor *= 0.90;
                System.out.println("Valor com 10% de desconto: " + valor);
                break;
            case "3":
                valor /= 2;
                System.out.println("Você vai pagar duas parcelas de " + valor);
                break;
            case "4":
                valor /= 3;
                valor *= 1.10   ;
                System.out.println("Você vai pagar tres parcelas mais 10% de juros:  " + valor);
                break;
        }
    }
}
