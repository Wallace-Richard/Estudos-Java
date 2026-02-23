# Maratona Java - DevDojo

## Este repositório foi criado para documentar minha evolução no curso de Java do DevDojo.
## Aqui registro exercícios, conceitos e exemplos práticos aplicados durante os estudos.

------------------------

# Logica de programação: 

------------------------

# Aula 01: Como JAVA funciona
<img width="829" height="427" alt="image" src="https://github.com/user-attachments/assets/89403c4b-c3eb-4b9c-8de6-83ef4738fe91" />

# Aula 02 e 03 (10 - 14): Tipos primitivos, convenções de código e comentários
<img width="1900" height="812" alt="image" src="https://github.com/user-attachments/assets/44100eae-0d93-4d92-8f3e-36385ee13d3d" />

# Aula 04 (15 - 19): Operador resto, Operadores de comparação, Operadores Lógicos e Operadores de Atribuição

## Operadores de comparação: 

<img width="707" height="186" alt="image" src="https://github.com/user-attachments/assets/54368b5e-0036-4df3-a679-e89f52ae3be5" />

## Operadores Lógicos:

<img width="708" height="135" alt="image" src="https://github.com/user-attachments/assets/f138e89e-85d7-4f51-93a3-4ae6c178f61d" />

## Operadores de Atribuição:

<img width="514" height="167" alt="image" src="https://github.com/user-attachments/assets/ac344c53-953f-4471-847c-925c32270bb5" />

# Aula 05 (20 - 26): Estruras condicionais if, else if, else, switch e operador ternario

Estruturas condicionais servem para tomar decisões dentro do código.
Elas permitem que o programa execute um bloco de código somente se uma condição for verdadeira.

As principais são:

if → executa algo se a condição for verdadeira

else if → testa uma nova condição

else → executa se a condição for falsa

switch → usado quando temos várias opções possíveis

## if, else if, else:
        
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

## Operador Ternário

O operador ternário é uma forma simplificada de escrever uma condição if-else em uma única linha.
        
        //int resultado = condicao ? valorSeVerdadeiro : valorSeFalso;

        int idade = 15;
        String status;

        status = idade < 18 ? "Não Adulto" : "Adulto";
        System.out.println(status);

## Switch

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

# Aula 06 (27 - 31): Estruturas de Repetição while, do while, for e comandos break and continue

## While

Executa enquanto a condição for verdadeira. A verificação acontece antes da execução.

        int i = 0
        while (i < 10)
        {
            System.out.println(++i);
        }

## Do while

Parecido com o while, mas executa pelo menos uma vez, pois a verificação acontece depois.

        int count = 0
        do
        {
            System.out.println("dentro do do while: "+ count++);
        } while (count < 10);

## For

Usado quando sabemos a quantidade de repetições. É mais organizado para loops com contador.

        int i = 0
        for (i = 0; i <= 1000; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }

## Break

Para tudo, sai do laço de repetição imediatamente.

        System.out.println("\n--- Testando BREAK (Parar no 3) ---");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Número: " + i);
            }

## Continue

Pula este. Ignora o código restante apenas nesta volta e vai para o próximo item.

        System.out.println("--- Testando CONTINUE (Pular o 3) ---");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Pula o resto do código e vai para o i = 4
            }
            System.out.println("Número: " + i);
        }

# Aula 07 (32 - 38): Array e Array multidimensional

## Array

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

## Foreach

O foreach é uma versão simplificada do laço for usada para percorrer arrays e coleções de forma direta e legível. Ele elimina a necessidade de contadores ou controle de índices, extraindo cada elemento automaticamente para uma variável temporária. É a escolha ideal para leitura de dados, pois evita erros de limites de memória e torna o código mais limpo, embora não permita modificar o array original ou percorrê-lo de trás para frente.

        String[] nomes = {"Java", "Python", "C++"};
        
        //Para cada 'nome' do tipo String dentro do array 'nomes'
        for (String nome : nomes) {
        System.out.println(nome);
        }
        
## Arrays multidimensionais

Os Arrays Multidimensionais (também conhecidos como Matrizes) são basicamente "arrays de arrays". Uma matriz funciona como uma tabela composta por linhas e colunas. Em Java, cada linha da matriz pode ser tratada como um array independente, permitindo organizar dados complexos de forma estruturada, como coordenadas em um mapa ou valores em uma planilha.

        //Declaração de uma matriz de 2 linhas e 2 colunas
        int[][] dias = new int[2][2];

        dias[0][0] = 31; // Linha 0, Coluna 0
        dias[0][1] = 28; // Linha 0, Coluna 1
        dias[1][0] = 31; // Linha 1, Coluna 0
        dias[1][1] = 30; // Linha 1, Coluna 1

        // Percorrendo a matriz com for aninhado
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("Posição [" + i + "][" + j + "]: " + dias[i][j]);
            }
        }

_______________________________________

# POO: 

# Aula 01 (39 - 43): Introdução a classes, objetos e atributos.

## Classes

Uma classe é uma estrutura que define um tipo de objeto, incluindo seus atributos (variáveis) e comportamentos (métodos).

        public class Estudante {
            public String nome;
            public int idade;
            public char sexo;
        }
        
Essa classe Estudante define os dados de um estudante padrão, com seus atributos básicos.

## Objetos

Um objeto é uma instância de uma classe. Após definir a estrutura com a classe, você pode criar objetos a partir dela

Para criar um objeto a partir de uma classe, usamos a palavra-chave new

        public static void main(String[] args) {
                Estudante estudante = new Estudante();

                estudante.nome = "Luffy";
                estudante.idade = 18;
                estudante.sexo = 'M';

                System.out.println(estudante.nome);
                System.out.println(estudante.idade);
                System.out.println(estudante.sexo);
    }

Os atributos são as variáveis que descrevem o estado de um objeto. No exemplo acima: nome, idade, e sexo são atributos da classe Estudante.

## Referência de Objetos

Em Java, variáveis de tipo objeto não armazenam o valor diretamente, mas sim uma referência (endereço) para um espaço de memória onde o objeto está armazenado.

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";

        Pessoa pessoa2 = pessoa1; // pessoa2 aponta para o mesmo objeto de pessoa1

        pessoa2.nome = "Maria";

        System.out.println(pessoa1.nome); // Maria
        System.out.println(pessoa2.nome); // Maria

pessoa2 = pessoa1 não cria uma nova cópia do objeto.

Ambas variáveis (pessoa1 e pessoa2) apontam para o mesmo objeto na memória.

Alterar o atributo nome por meio de pessoa2 também altera o que é visto por pessoa1.

# Aula 02 (44 - 53): Introdução aos metodos, returns, paremetros, this e varags

## Método

Um método é um bloco de código que realiza uma ação. Pode receber parâmetros (entradas) e pode retornar um valor (saída). Os métodos ajudam a manter o código organizado, reutilizável e mais fácil de manter.

    // Método sem retorno (void) e sem parâmetros
        void exibirMensagem() {
        System.out.println("Bem-vindo à Calculadora!");
    }

    // Método com retorno e com parâmetros
    int somar(int a, int b) {
        return a + b;   
    }

## Parâmetros

Parâmetros são variáveis declaradas na assinatura de um método. Eles permitem a passagem de dados para dentro do método no momento da chamada, tornando-o mais flexível.

    void exibirMensagem(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

## Retorno de um Método

Um método pode retornar um valor após sua execução.

O tipo de retorno é declarado na assinatura do método.

O comando return é usado para devolver o valor.

    public class Calculadora {
        int somar(int a, int b) {
            return a + b;
        }
    }

Se um método não precisar retornar nada, use o tipo void:

## Parâmetros Tipos Primitivos

Em Java, todos os parâmetros são passados por valor. Para tipos primitivos, isso significa que o método recebe uma cópia do valor original, e alterações dentro do método não afetam a variável original.

## Parâmetros Tipo Referência

Tipos de Referência incluem todas as classes, interfaces, arrays e enumeradores.

Em Java, todos os parâmetros são passados por valor. No caso de objetos, o valor passado é a referência ao objeto, permitindo que métodos modifiquem o estado interno do objeto, mas não a referência em si.

## This

A palavra-chave this é uma referência ao objeto atual da classe. Ela é usada para:

Diferenciar variáveis de instância de parâmetros com o mesmo nome.

Chamar outro construtor dentro da mesma classe (this(...)).

Retornar o próprio objeto, permitindo encadeamento de métodos.

    String nome;

    public void setNome(String nome) {
        this.nome = nome; // "this.nome" se refere à variável de instância
    }

Sem this, o Java entende que nome = nome se refere ao parâmetro da função, causando erro lógico. Com this.nome, deixamos claro que estamos acessando o atributo do objeto.

## Varargs

Varargs (introduced in Java 5) permitem que métodos aceitem um número variável de argumentos do mesmo tipo, utilizando a sintaxe tipo... nomeParametro.

Internamente, o compilador Java trata os varargs como arrays, permitindo iteração e manipulação como em arrays comuns.

Um método pode ter apenas um parâmetro varargs, e este deve ser o último na lista de parâmetros.

     public static void imprimirNomes(String... nomes) {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }


