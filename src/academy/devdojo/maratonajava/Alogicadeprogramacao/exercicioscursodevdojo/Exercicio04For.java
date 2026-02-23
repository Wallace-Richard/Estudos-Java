package academy.devdojo.maratonajava.Alogicadeprogramacao.exercicioscursodevdojo;

public class Exercicio04For {
    public static void main(String[] args) {
        /*
        Potências de 2
        Exiba todas as potências de 2 (2¹, 2², 2³...) menores que 1000.
        */

        for (int i = 2; i < 1000; )
        {
            System.out.println(i);
            i *= 2;
        }
    }
}
