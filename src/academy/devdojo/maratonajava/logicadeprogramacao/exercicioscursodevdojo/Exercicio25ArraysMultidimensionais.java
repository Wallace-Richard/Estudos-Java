package academy.devdojo.maratonajava.logicadeprogramacao.exercicioscursodevdojo;

public class Exercicio25ArraysMultidimensionais {
    public static void main(String[] args) {
        /*
        Tenha uma matriz 3x4 com números
        Conte quantos números pares existem na matriz
        */

        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int pares = 0;

        System.out.print("Os pares da matriz são: ");
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[0].length; j++)
            {
                if (matriz[i][j] % 2 == 0)
                {
                    System.out.print(matriz[i][j] + " ");
                    pares++;
                }
            }
        }
        System.out.println();
        System.out.println("Total de números pares: " + pares);
    }
}
