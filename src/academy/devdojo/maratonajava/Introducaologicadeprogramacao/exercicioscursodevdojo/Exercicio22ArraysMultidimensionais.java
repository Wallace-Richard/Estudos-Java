package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exercicioscursodevdojo;

public class Exercicio22ArraysMultidimensionais {
    public static void main(String[] args) {
        /*
        Tenha uma matriz 2x4 com números
        Calcule e mostre a soma de TODOS os elementos da matriz
        */

        int[][] matriz = {
                {10, 20, 30, 40},
                {50, 60, 70, 80}
        };
        int soma = 0;

        System.out.print("Matriz original: ");

        for (int[] array : matriz)
        {
            for (int numbers : array)
            {
                System.out.print(numbers + " ");
                soma += numbers;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Soma de todos os elementos: " + soma);
    }
}
