# Maratona Java - DevDojo

Este repositório foi criado para documentar minha evolução no curso de Java do DevDojo.
Aqui registro exercícios, conceitos e exemplos práticos aplicados durante os estudos.

## Aula 01: Como JAVA funciona
<img width="829" height="427" alt="image" src="https://github.com/user-attachments/assets/89403c4b-c3eb-4b9c-8de6-83ef4738fe91" />

## Aula 02 e 03 (10 - 14): Tipos primitivos, convenções de código e comentários
<img width="1900" height="812" alt="image" src="https://github.com/user-attachments/assets/44100eae-0d93-4d92-8f3e-36385ee13d3d" />

## Aula 04 (15 - 19): Operador resto, Operadores de comparação, Operadores Lógicos e Operadores de Atribuição

### Operadores de comparação: 

<img width="707" height="186" alt="image" src="https://github.com/user-attachments/assets/54368b5e-0036-4df3-a679-e89f52ae3be5" />

### Operadores Lógicos:

<img width="708" height="135" alt="image" src="https://github.com/user-attachments/assets/f138e89e-85d7-4f51-93a3-4ae6c178f61d" />

### Operadores de Atribuição:

<img width="514" height="167" alt="image" src="https://github.com/user-attachments/assets/ac344c53-953f-4471-847c-925c32270bb5" />

## Aula 05 (20 - 26): Estruras condicionais if, else if, else, switch e operador ternario

Estruturas condicionais servem para tomar decisões dentro do código.
Elas permitem que o programa execute um bloco de código somente se uma condição for verdadeira.

As principais são:
if → executa algo se a condição for verdadeira
else if → testa uma nova condição
else → executa se a condição for falsa
switch → usado quando temos várias opções possíveis

### if, else if, else:
        
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

### Operador Ternário

O operador ternário é uma forma simplificada de escrever uma condição if-else em uma única linha.
        
        //int resultado = condicao ? valorSeVerdadeiro : valorSeFalso;

        int idade = 15;
        String status;

        status = idade < 18 ? "Não Adulto" : "Adulto";
        System.out.println(status);

### Switch

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

