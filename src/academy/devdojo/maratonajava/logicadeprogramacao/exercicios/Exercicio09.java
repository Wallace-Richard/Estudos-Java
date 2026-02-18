package academy.devdojo.maratonajava.logicadeprogramacao.exercicios;

public class Exercicio09 {
    public static void main(String[] args) {
        //Pirâmide de asteriscos
        //Exiba uma pirâmide com 5 andares
/*
        Forma que eu fiz

        String a = "*";

        for (int i = 0; i < 5; i++)
        {
            System.out.println(a);
            a += "*";

        }
*/
        //Forma mais correta

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
