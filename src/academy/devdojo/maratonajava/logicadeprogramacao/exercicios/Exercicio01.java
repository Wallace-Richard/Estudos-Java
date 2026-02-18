package academy.devdojo.maratonajava.logicadeprogramacao.exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
        O Contador Seletivo
        Objetivo: Praticar a exclusão de dados.
        Desafio: Escreva um programa que conte de 1 a 20.
        Regra: O programa deve imprimir todos os números, exceto os múltiplos de 5 (5, 10, 15, 20).
        */

        for (int i = 0; i < 20; i++)
        {
            if (i % 5 == 0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
