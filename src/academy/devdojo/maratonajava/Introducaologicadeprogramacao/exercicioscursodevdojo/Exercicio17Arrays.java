package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exercicioscursodevdojo;

public class Exercicio17Arrays {
    public static void main(String[] args) {
        /*
        Dificuldade: Facil
        Encontrar o maior número
        Tenha um array com 7 números inteiros
        Encontre e mostre o maior número do array
        */

        int[] num = {5, 12, 3, 45, 23, 8, 15};
        int maior = num[0];

        for (int i = 0; i < num.length; i++)
        {
            if (maior < num[i])
            {
                maior = num[i];
            }
        }
        System.out.println(maior);
    }
}
