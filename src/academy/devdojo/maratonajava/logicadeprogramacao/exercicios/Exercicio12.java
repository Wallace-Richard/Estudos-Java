package academy.devdojo.maratonajava.logicadeprogramacao.exercicios;

public class Exercicio12
{
    public static void main(String[] args)
    {
        /*
        Soma até passar de 100
        Comece somando 1 + 2 + 3 + 4... e pare assim que a soma ultrapassar 100.
        Exiba a soma final e qual foi o último número somado.
        */

        int i = 0, j = 1;
        while (i <= 100)
        {
            i += j;
            j++;
            System.out.println(i);
        }
    }
}
