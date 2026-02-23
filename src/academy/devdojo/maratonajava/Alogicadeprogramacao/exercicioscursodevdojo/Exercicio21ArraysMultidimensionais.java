package academy.devdojo.maratonajava.Alogicadeprogramacao.exercicioscursodevdojo;

public class Exercicio21ArraysMultidimensionais {
    public static void main(String[] args) {
        /*
        Tenha uma matriz 3x3 com números inteiros
        Mostre todos os elementos da matriz formatados
         */

        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] array : numbers)
        {
            System.out.print("{");
            for (int nums : array)
            {
                System.out.print(nums);
            }
            System.out.print("}");
            System.out.println();
        }
    }
}
