package academy.devdojo.maratonajava.logicadeprogramacao.exercicios;

public class Exercicio06For {
    public static void main(String[] args) {
        //Fatorial
        //Calcule o fatorial de 10 (10!) sem usar funções prontas.

        int fatorial = 10;

        for (int i = 9; i > 0; i--)
        {
            fatorial *= i;

            if (i == 1)
            {
                System.out.println(fatorial);
            }
        }
    }
}
