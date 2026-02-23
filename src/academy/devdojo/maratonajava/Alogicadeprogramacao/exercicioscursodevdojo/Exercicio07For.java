package academy.devdojo.maratonajava.Alogicadeprogramacao.exercicioscursodevdojo;

public class Exercicio07For {
    public static void main(String[] args) {
        //Números primos
        //Exiba todos os números primos entre 2 e 50.


        for (int i = 2; i <= 50; i++)
        {
            boolean isPrimo = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo)
            {
                System.out.println(i);
            }
        }
    }
}
