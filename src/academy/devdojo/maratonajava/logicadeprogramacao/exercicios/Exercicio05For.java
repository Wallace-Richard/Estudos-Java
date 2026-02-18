package academy.devdojo.maratonajava.logicadeprogramacao.exercicios;

public class Exercicio05For {
    public static void main(String[] args) {
        /*
        FizzBuzz clássico
        Percorra de 1 a 50. Se o número for divisível por 3, exiba "Fizz".
        Se for divisível por 5, exiba "Buzz".
        Se for divisível por ambos, exiba "FizzBuzz". Caso contrário, exiba o número.
        */

        for (int i = 1; i <= 50; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0)
            {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0)
            {
                System.out.println(i + " Buzz");
            } else
            {
                System.out.println(i);
            }
        }
    }
}
