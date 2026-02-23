package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exercicioscursodevdojo;

public class Exercicio14While {
    public static void main(String[] args) {
        /*
        Achar a primeira potência de 3 maior que 500
        Comece com 3 e fique multiplicando por 3 enquanto o resultado for menor ou igual a 500.
        Exiba a potência encontrada e quantas multiplicações foram feitas.
        */

        int potencia = 3, i = 1;

        while (potencia <= 500)
        {
            potencia = potencia * 3;
            i++;
        }

        System.out.println("Potencia encontrada: " + potencia);
        System.out.println("Foram feitas: " + i);
    }
}
