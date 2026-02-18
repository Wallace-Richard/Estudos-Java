# Maratona Java - DevDojo

Este repositório foi criado para documentar minha evolução no curso de Java do DevDojo.
Aqui registro exercícios, conceitos e exemplos práticos aplicados durante os estudos.

## Logica de programação  


## Aula 01: Como JAVA funciona
<img width="829" height="427" alt="image" src="https://github.com/user-attachments/assets/89403c4b-c3eb-4b9c-8de6-83ef4738fe91" />

## Aula 02 e 03 (10 - 14): Tipos primitivos, convenções de código e comentários
<img width="1900" height="812" alt="image" src="https://github.com/user-attachments/assets/44100eae-0d93-4d92-8f3e-36385ee13d3d" />

## Aula 04 (15 - 19): Operador resto, Operadores de comparação, Operadores Lógicos e Operadores de Atribuição

Operadores de comparação: 

<img width="707" height="186" alt="image" src="https://github.com/user-attachments/assets/54368b5e-0036-4df3-a679-e89f52ae3be5" />

Operadores Lógicos:

<img width="708" height="135" alt="image" src="https://github.com/user-attachments/assets/f138e89e-85d7-4f51-93a3-4ae6c178f61d" />

Operadores de Atribuição:

<img width="514" height="167" alt="image" src="https://github.com/user-attachments/assets/ac344c53-953f-4471-847c-925c32270bb5" />

## Aula 05 (20 - 26): Estruras condicionais if, else if, else, switch e operador ternario

Estruturas condicionais servem para tomar decisões dentro do código.
Elas permitem que o programa execute um bloco de código somente se uma condição for verdadeira.

As principais são:
if → executa algo se a condição for verdadeira
else if → testa uma nova condição
else → executa se a condição for falsa
switch → usado quando temos várias opções possíveis

if, else if, else:
        
        int idade = 18;
        String categoria;

        if(idade < 15)
        {
            categoria = "infantil";
        }
        else if(idade >=15 && idade < 18)
        {
            categoria = "Juvenil";
        }
        else
        {
            categoria = "Adulto";
        }
        System.out.println(categoria);

Operador Ternário

O operador ternário é uma forma simplificada de escrever uma condição if-else em uma única linha.
        
        //int resultado = condicao ? valorSeVerdadeiro : valorSeFalso;

        int idade = 15;
        String status;

        status = idade < 18 ? "Não Adulto" : "Adulto";
        System.out.println(status);

Switch

O Switch é uma estrutura condicional usada quando temos várias opções baseadas no mesmo valor. 
Cada opção é definida com "case", e o "break" é usado para impedir que os próximos casos sejam executados.  
O "default" funciona como um "else"        
byte dia = 8;
       
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FINAL DE SEMANA!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("DIA ÚTIL");
                break;
            default:
                System.out.println("Opção inválida");

## Aula 06 (27 - 31): Estruturas de Repetição while, do while, for e comandos break and continue

While

Executa enquanto a condição for verdadeira. A verificação acontece antes da execução.

        int i = 0
        while (i < 10)
        {
            System.out.println(++i);
        }

Do while

Parecido com o while, mas executa pelo menos uma vez, pois a verificação acontece depois.

        int count = 0
        do
        {
            System.out.println("dentro do do while: "+ count++);
        } while (count < 10);

For

Usado quando sabemos a quantidade de repetições. É mais organizado para loops com contador.

        int i = 0
        for (i = 0; i <= 1000; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }

break

Para tudo, sai do laço de repetição imediatamente.

        System.out.println("\n--- Testando BREAK (Parar no 3) ---");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Número: " + i);
            }

continue

Pula este. Ignora o código restante apenas nesta volta e vai para o próximo item.

        System.out.println("--- Testando CONTINUE (Pular o 3) ---");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Pula o resto do código e vai para o i = 4
            }
            System.out.println("Número: " + i);
        }

## Aula 07 (32 - 38): Array e Array multidimensional

Array

Arrays são estruturas de dados que nos permitem armazenar múltiplos valores de um mesmo tipo em uma única variável. Em vez de criar variáveis isoladas como nota1, nota2 e nota3, utilizamos um Array para organizar esses dados em "compartimentos".

Obs! 

Ele é fixo: Um array de int só armazena números inteiros.

Tem Tamanho Imutável: Uma vez definido o tamanho do array (ex: 5 posições), ele não pode ser alterado dinamicamente.

E tem Índice Zero: Em Java, a contagem sempre começa no 0. Portanto, um array de tamanho 3 possui os índices

        // Declaração e inicialização
        int[] numeros = new int[5]; 

        // Atribuição de valor
        numeros[0] = 10; 

        // Acessando o tamanho do array
        int tamanho = numeros.length;
