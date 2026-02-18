package academy.devdojo.maratonajava.logicadeprogramacao;

public class Aula07Arrays {
    public static void main(String[] args) {
        //Valores iniciais:
        //byte, short, int, long, float, double = 0
        //char '\u0000' ' '
        //boolean false;
        //reference  null
        String[] nomes = new String[3];
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";
        for (int i = 0; i < nomes.length; i++)
        {
            System.out.println((i + 1) + " nome " + nomes[i]);
        }

        // Outra forma de usar o For e amplamente ultilizada:
        int[] numeros = {1, 2, 3, 4, 5};
        for (int num : numeros)
        {
            System.out.println(num);
        }

        // "nomes" perde a referência.. é criando um novo obj. array.
        nomes = new String[4];
    }
}
