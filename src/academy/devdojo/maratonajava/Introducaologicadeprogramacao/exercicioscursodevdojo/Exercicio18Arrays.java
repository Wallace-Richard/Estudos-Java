package academy.devdojo.maratonajava.Introducaologicadeprogramacao.exercicioscursodevdojo;

public class Exercicio18Arrays {
    public static void main(String[] args) {
        /*
        Dificuldade: Medio
        Inverter o array
        Tenha um array com 6 números
        Inverta a ordem dos elementos (sem criar um novo array)
        Mostre o array antes e depois
        */
        int[] num = {1, 2, 3, 4, 5, 6};
        int j = 7;

        System.out.print("Arrays antes: ");
        for (int i = 0; i < num.length; i++)
        {
            System.out.print(num[i]);
        }

        System.out.println();
        System.out.print("Array depois: ");
        for (int i = 0; i < num.length; i++)
        {
            j--;
            num[i] = j;
            System.out.print(num[i]);
        }
    }
}
