package academy.devdojo.maratonajava.Alogicadeprogramacao.exercicioscursodevdojo;

public class Exercicio20Arrays {
    public static void main(String[] args) {
        /*
        Dificuldade: Dificil
        Remover elementos duplicados
        Tenha um array com números repetidos
        Remova todos os elementos duplicados
        Crie um novo array apenas com valores únicos
        Mostre o array original e o array sem duplicatas
        */

        int tamanho = 0;
        int[] originalArray = {5, 2, 8, 2, 9, 5, 3, 8, 1};
        int[] auxiliarArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++)
        {
            boolean isExiste = false;

            for (int j = 0; j < tamanho; j++)
            {
                if (originalArray[i] == auxiliarArray[j] )
                {
                    isExiste = true;
                    break;
                }
            }

            if (!isExiste)
            {
                auxiliarArray[tamanho] = originalArray[i];
                tamanho++;
            }
        }
        int[] semDupArray = new int[tamanho];

        for (int i = 0; i < tamanho; i++)
        {
            semDupArray[i] = auxiliarArray[i];
        }

        System.out.print("Array original: ");
        for (int num : originalArray)
        {
            System.out.print("[" + num + "]" );
        }
        System.out.println();

        System.out.print("Array sem duplicatas: ");
        for (int num : semDupArray)
        {
            System.out.print("[" + num + "]" );
        }
    }
}
