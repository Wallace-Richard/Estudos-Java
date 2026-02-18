package academy.devdojo.maratonajava.logicadeprogramacao.exercicios;

public class Exercicio13 {
    public static void main(String[] args) {
        int numeroOriginal = 12345, digito, numeroiInvertido = 0;

        while (numeroiInvertido != 54321)
        {
            digito = numeroOriginal % 10;
            numeroiInvertido = (numeroiInvertido * 10) + digito;
            numeroOriginal = numeroOriginal / 10;
        }

        System.out.println(numeroiInvertido);
    }
}
