package academy.devdojo.maratonajava.logicadeprogramacao.exercicioscursodevdojo;

public class Exercicio24ArraysMultidimensionais {
    public static void main(String[] args) {
        /*
        Tenha uma matriz 3x3 com números
        Encontre e mostre o maior número da matriz inteira
        */

        int[][] matriz = {
                {12, 45, 23},
                {67, 255, 34},
                {56, 78, 90}
        };
        int maior = 0;

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                if (maior < matriz[i][j])
                {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("Maior elemento da matriz: " + maior);
    }
}
