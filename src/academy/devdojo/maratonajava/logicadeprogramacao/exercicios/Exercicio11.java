package academy.devdojo.maratonajava.logicadeprogramacao.exercicios;

public class Exercicio11
{
    public static void main(String[] args)
    {
        /*
        Dividindo até chegar em 1
        Comece com o número 256.
        Fique dividindo por 2 enquanto o resultado for maior que 1.
        Conte e exiba quantas divisões foram necessárias.
        */

        int i = 256, j = 0;

        while (i > 1)
        {
            i /= 2;
            j++;
        }
        System.out.println(j);
    }
}
