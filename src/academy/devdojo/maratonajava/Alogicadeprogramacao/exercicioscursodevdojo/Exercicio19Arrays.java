package academy.devdojo.maratonajava.Alogicadeprogramacao.exercicioscursodevdojo;

public class Exercicio19Arrays {
    public static void main(String[] args) {
        /*
        Dificuldade: Medio
        Contar números pares e ímpares
        Tenha um array com 10 números inteiros
        Conte quantos números são pares e quantos são ímpares
        Mostre os resultados
        */

        int[] num = {5, 12, 3, 45, 23, 8, 15, 23, 78, 79};
        int par = 0, impar = 0;

        for (int i = 0; i < num.length; i++)
        {
            if (num[i] % 2 == 0)
            {
                par++;
            }
            else
            {
                impar++;
            }
        }
        System.out.println(par + " numeros pares");
        System.out.println(impar + " numeros impares");
    }
}
