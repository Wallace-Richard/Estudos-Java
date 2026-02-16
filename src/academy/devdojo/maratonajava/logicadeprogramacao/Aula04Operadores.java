package academy.devdojo.maratonajava.logicadeprogramacao;

public class Aula04Operadores
{
    public static void main(String[] args)
    {
        //Diferentes funções do + em java
        int numero1 = 10;
        int numero2 = 20;
        System.out.println(numero1+numero2);
        System.out.println("A Soma é " + numero1+numero2);
        System.out.println(numero1+numero2 + "   SOMANDO...   " + numero1 + numero2);
        System.out.println(numero1+numero2 + "   SOMANDO...   " + (numero1 + numero2));

        //Operador que deixa o resto da divisão ( % )
        double numeroDouble = 10.0;
        int resto = 20 % 2;
        System.out.println("Resto é " + resto);
        System.out.println(numeroDouble);

        //Operadores de comparação ( == | != | < | > | <= | >= )
        boolean dezMaiorqueVinte = 10 >= 20;
        boolean dezMenorqueVinte = 10 <= 20;
        System.out.println(dezMaiorqueVinte);
        System.out.println(dezMenorqueVinte);
        System.out.println(5 == 5);
        System.out.println(5 != 5);

        //Operadores logico ( && | || | ! | ^ )
        int idade = 18;
        float salario = 5000f;

        System.out.println(idade >= 21 && salario >= 2000);
        System.out.println(idade <= 16 && salario <= 2000);
        // false
        // false

        System.out.println(idade >= 21 || salario >= 2000);
        System.out.println(idade <= 21 || salario >= 2000);
        // true
        // true

        //Operadores de atribuição ( += | -= | *= | /= | %= )
        salario = 2000;
        int numero = 11;

        numero %= 2;
        numero = numero % 2;
        System.out.println(numero);

        //Adendo aos ++ e -- que somam 1 ou diminuem 1

    }
}
