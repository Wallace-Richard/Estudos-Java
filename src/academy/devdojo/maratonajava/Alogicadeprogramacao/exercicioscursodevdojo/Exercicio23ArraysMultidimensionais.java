package academy.devdojo.maratonajava.Alogicadeprogramacao.exercicioscursodevdojo;

public class Exercicio23ArraysMultidimensionais {
    public static void main(String[] args) {
        /*
        Tenha uma matriz 4x4
        Mostre apenas os elementos da diagonal principal (onde linha == coluna)
        */

        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.print("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                if (i == j)
                {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }
}
