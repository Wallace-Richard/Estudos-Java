package academy.devdojo.maratonajava.logicadeprogramacao.exercicios;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        Localizador de Alvo
        Objetivo: Interromper o processamento assim que encontrar o que precisa.
        O Desafio: Imagine que você tem uma contagem de 1 a 100.
        Regra: O laço deve rodar, mas assim que atingir o número 7, deve imprimir "Alvo encontrado!" e usar o break para não contar até 100.
        */

        for (int i = 1; i <= 100; i++)
        {
            int numeroEsperado = 7;

            if (i == numeroEsperado)
            {
                System.out.println("Numero encontrado: " + i);
                break;
            }
            System.out.println(i);
        }
    }
}
