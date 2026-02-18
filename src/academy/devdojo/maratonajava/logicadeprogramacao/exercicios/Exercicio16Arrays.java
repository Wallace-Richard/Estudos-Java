package academy.devdojo.maratonajava.logicadeprogramacao.exercicios;

public class Exercicio16Arrays {
    public static void main(String[] args) {
       /*
       Dificuldade: Facil
       Soma dos elementos
       Tenha um array com 5 números inteiros
       Calcule e mostre a soma de todos os elementos
       */

        int[] num = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int i = 0; i < num.length; i++)
        {
            soma += num[i];
        }
        System.out.println(soma);
    }
}
