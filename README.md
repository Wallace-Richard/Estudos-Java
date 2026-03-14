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

# Aula 03 (54 - 56): Modificador de acesso private, Get e Set

Modificador private: torna o atributo ou método acessível apenas dentro da própria classe.

Getter (get): método público para acessar o valor de um atributo privado.

Setter (set): método público para modificar o valor de um atributo privado.

Encapsulamento: proteger o acesso direto aos dados da classe, mantendo o controle sobre eles, é considerado um dos 4 pilares da POO.

    public class Pessoa {
        private String nome;
        private int idade;
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public int getIdade() {
            return idade;
        }
    
        public void setIdade(int idade) {
            this.idade = idade;
        }
    }

No set, faça validações sempre que possível para proteger os dados da classe.

# Aula 04 (57 - 60): Sobrecarga, Construtores e Bloco de inicialização

## Sobrecarga:

A sobrecarga (overload) ocorre quando você cria dois ou mais métodos com o mesmo nome na mesma classe, mas com listas de parâmetros diferentes (tipos ou quantidades distintas).

## Construtores:

Os construtores são métodos especiais usados para inicializar o objeto no momento em que ele é criado com a palavra new. Eles garantem que seu objeto "nasça" com os dados necessários, como o nome de uma pessoa e a idade.

O nome do construtor deve ser exatamente o mesmo nome da classe.

Diferente dos métodos comuns, ele não tem tipo de retorno (nem mesmo void).

Se você não escrever nenhum, o Java cria um vazio automaticamente. Mas, se você criar um construtor com parâmetros, o Java "remove" esse automático, e você passa a ser obrigado a fornecer os dados na criação.

        //Construtor
        Carro(String modelo, int ano) {
            this.modelo = modelo;
            this.ano = ano;
    }

        //como iniciar com construtores
        Carro carro = new Carro("Corolla", 2023);


## Bloco de inicialização:

Blocos de inicialização são usados para executar código sempre que uma instância da classe é criada.

Existem dois tipos principais:

Bloco de inicialização de instância ({}): Executado toda vez que um objeto é instanciado.

Bloco de inicialização estático (static {}): Executado apenas uma vez, quando a classe é carregada pela primeira vez.

        String nome;
        int idade;
    
        {
            System.out.println("Bloco de inicialização chamado!");
            nome = "Nome padrão";
            idade = 18;
        }

# Aula 05 (61 - 63): Modificador static, Atributos static e Metodos static

## Modificador static

O modificador static indica que um atributo ou método pertence à classe, e não aos objetos individuais criados a partir dela. É como uma regra ou característica que vale para todos, sem exceção.

## Atributos Static

É uma variável compartilhada. Se um objeto alterar o valor de um atributo estático, essa mudança reflete para todos os outros objetos daquela classe, pois todos "olham" para o mesmo lugar na memória.

## Métodos Static

São métodos que você pode chamar diretamente pelo nome da classe, sem precisar dar um new. Eles não podem acessar atributos que não sejam estáticos (aqueles que usam o this), porque não estão ligados a um objeto específico.

# Aula 06 (64 - 69): Arrays com Objeto, Associação unidirecional um para muitos, Associação Bidirecional, Leitura de Dados pelo Console, 

## Arrays objetos

Permitem armazenar múltiplas instâncias de objetos em uma estrutura de dados linear.

Em aplicações reais, preferir coleções como ArrayList

Arrays de objetos são a forma mais simples de associação 1:N (um para muitos).

Por exemplo em em uma escola pode ter varias salas e dentro dessas salas podem ter varios alunos.

    public class Escola {
        private Sala[] salas;
        private int totalSalas;
    }
    
    public class Sala {
        private int idSala;
        private Aluno[] alunos;
    }

## Associação Unidirecional Um para Muitos

Um objeto de uma classe contém/referencia múltiplos objetos de outra classe, sem que o inverso seja verdadeiro. A relação existe apenas em uma direção.

## Associação Unidirecional Muitos para Um (N:1)

Múltiplos objetos de uma classe referenciam um único objeto de outra classe, sem que o inverso seja verdadeiro. Diferente da aula anterior (1:N), agora a "seta" aponta no sentido inverso.

    public class Aluno {
        private String nome;
        private Escola escola; // Associação muitos-para-um
    }

## Associação Bidirecional 

Relação onde duas classes se referenciam mutuamente, exigindo sincronização cuidadosa para manter a consistência dos dados.

    public class Aluno {
        private String nome;
        private Turma turma;
    }

    public class Turma {
        private String nome;
        private Aluno[] alunos;
    }

## Leitura de Dados pelo Console

Para fazer a leitura de algo digitado no console e armazenar. é necessario instaciar uma classe Scanner, que pertence ao pacote java.util.

    import java.util.Scanner;

    public class LeituraDados {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String nome = scanner.nextLine();
        }
    }

# Aula 07 (70 - 79): Herança, ToString e Mofificador final 

## Herança

Herança é a capacidade de uma classe filha "herdar" comportamentos e características de uma classe pai, 
servindo para reaproveitar código e criar categorias (como um Ebook que herda de Livro). 
Ela estabelece uma relação de "é um", permitindo que você trate objetos diferentes de forma comum pela sua base.

    public class Pessoa {
        private String nome;
        private String cpf;
    }

    public class Funcionario extends Pessoa {
        private double salario;
    }

Usar @Override sempre para usar sobrescrita de metodos de classe pai

Prefira composição sobre herança herde apenas quando houver relação "é-um".

Chame super() para inicializar a superclasse no construtor da classe filha.

## toString

toString é um método que transforma o seu objeto em texto legível para humanos. 
Sem ele, ao tentar imprimir um objeto, o Java mostra apenas um código de memória
com ele você define exatamente quais informações (como título e ID) devem aparecer quando o objeto for exibido no console.

    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade + "}";
    }

## Modificador Final

funciona como um lacre de segurança no código que impede qualquer tipo de alteração posterior. Se usado em uma variável, 
o valor vira uma constante; em um método, impede que ele seja modificado por subclasses; e em uma classe, 
impede que ela tenha herdeiros, garantindo imutabilidade e segurança.

# Aula 08 (80 - 86): Classes enum e abstract

## Classe enum

O que é: Uma lista fixa de constantes (valores que não mudam).

Para que serve: Para representar categorias ou opções predefinidas (ex: Dias da Semana, 
Status de Pedido). Ele garante que ninguém use um valor inválido, como "Abertooo" em vez de "ABERTO".

Diferencial: Pode ter atributos e métodos próprios para carregar informações extras em cada opção.

    public enum Tamanho {
        P("Pequeno"), M("Médio"), G("Grande");

        private String descricao;
        Tamanho(String d) { this.descricao = d; }
        public String getDescricao() { return descricao; }
    }

## Classe abstract

O que é: Um "molde" ou contrato incompleto para outras classes.

Para que serve: Para criar uma base comum que não pode ser instanciada (você não dá new nela). 
Ela obriga as classes filhas a implementarem comportamentos específicos (métodos abstratos).

Diferencial: Define o que as filhas devem fazer, mas deixa que cada uma decida como fazer.

    public abstract class Animal {
        String nome;
        public abstract void emitirSom(); // Filhas são obrigadas a criar esse som
    }

    public class Cachorro extends Animal {
        public void emitirSom() { System.out.println("Au Au!"); }
    }
   
# Aula 09 (87 - 94): Class Interface e Polimorfismo

## Interface

A Interface é apenas uma lista de exigências. Ela não faz nada sozinha, apenas diz: "Qualquer classe que quiser ser do meu tipo, PRECISA ter esses métodos".

Exemplo: Imagine a interface ControleRemoto. Ela diz que é obrigatório ter o método apertarBotaoLigar(). Não importa se é o controle da TV, do Ar Condicionado ou do Portão; se é um controle, tem que ter esse botão.

# Polimorfismo

Polimorfismo é quando você usa uma referência genérica (a Interface) para comandar objetos diferentes. O nome vem de "muitas formas", porque o mesmo comando (ligar()) resulta em ações diferentes dependendo do objeto que está na mão.

Exemplo: Você tem uma variável do tipo ControleRemoto.

Se você apontar ela para uma TV, o comando ligar() acende a tela.

Se você apontar para o Ar Condicionado, o mesmo comando ligar() gela o quarto.

O seu código não muda, o que muda é o objeto que está lá dentro.

# Aula 10 (95 - 105): Errors, RuntimeException, Exception, Exception unchecked, Exception checked, Bloco Finally, Múltiplas exceções em bloco e linha, Try with resources, Exceção customizada e regras de sobrescrita

## Errors 

Representa erros graves e irrecuperáveis que não devem ser tratados pela sua aplicação. 
Geralmente são problemas da JVM (Máquina Virtual Java), 
como StackOverflowError (estouro de pilha) ou OutOfMemoryError (falta de memória). 
Você não captura ou lança Errors

## RuntimeException

São exceções que o compilador não te obriga a tratar. 
Elas geralmente indicam erros de lógica na programação, como:

NullPointerException: Tentar acessar um membro de uma variável nula.

IllegalArgumentException: Passar um argumento inválido para um método.

IndexOutOfBoundsException: Tentar acessar um índice inválido em um array ou lista.

## Exception

Representa condições anormais que uma aplicação robusta pode e deve tratar. 
Ela se divide em dois grandes grupos, um deles e o RuntimeException que Unchecked e as outras são Checked como: 

IOException: Erro ao ler um arquivo.

SQLException: Erro ao se comunicar com o banco de dados.

ParseException: Erro ao converter uma String para uma data.

## Exception unchecked

São exceções que o Java te obriga a olhar para elas. 
Se você chamar um método que lança uma Checked Exception, 
o seu código não compila enquanto você não decidir se vai usar um try-catch ou um throws.

## Exception checked

São exceções que o compilador ignora. Ele deixa você rodar o programa sem te avisar de nada. 
Se o erro acontecer, o programa explode em tempo de execução (Runtime).
Gerealmente é causado pelo erro do programador em questão.

## Bloco Finally

O bloco finally é o "Save point" do tratamento de exceções. 
Ele é um bloco que sempre será executado, não importa o que aconteça: 
se o código no try deu certo, se ele caiu no catch, 
ou até mesmo se você deu um return no meio do caminho.

## Múltiplas exceções em bloco

Você pode ter vários blocos catch, do mais específico para o mais genérico.

    try {
        // ... código ...
    } catch (FileNotFoundException e) {
        System.out.println("File not found!");
    } catch (IOException e) {
        System.out.println("Generic IO error!");
    }

## Múltiplas exceções em linha

Mais conciso que o em bloco, para quando o tratamento do erro é o mesmo para várias exceções.

    try {
         // ... código ...
    } catch (InputMismatchException | ArithmeticException e) {
        System.out.println("Invalid input error.");
        // e.printStackTrace(); // Imprime o rastro da pilha para debug
    }

## Try with resources

Introduzido no Java 7, o try-with-resources simplifica muito o gerenciamento de recursos que 
precisam ser fechados (como streams de arquivos, conexões de banco de dados, etc.).

Ele garante que o recurso declarado nos parênteses do try será fechado automaticamente 
ao final do bloco, eliminando a necessidade de um bloco finally para isso.

## Exceção customizada

Às vezes, as exceções padrão do Java não descrevem bem um erro de regra de negócio específico. 
Nesses casos, podemos criar nossas próprias exceções.

Regra: Se a exceção for um erro que o chamador do método deve tratar (checked), herde de Exception. 
Se for um erro de programação que não deveria ocorrer (unchecked), herde de RuntimeException.

## Exceção e regras de sobrescrita

Quando um método em uma subclasse sobrescreve um método da superclasse, 
existem regras sobre as exceções:

Um método sobrescrito não pode declarar uma exceção checked que não foi declarada no método original da superclasse.

Ele pode declarar exceções unchecked livremente.

Ele pode declarar exceções checked que sejam subtipos das exceções declaradas no método original.

# Aula 11 (106 - 111): Wrappers, Strings, StringsBuilder e StringsBuffer

## O que são Classes Wrapper

As Classes Wrapper são a ponte entre Tipos Primitivos e Tipos por Referência (Objetos). 
Elas são classes que "embrulham" ou "encapsulam" um valor de tipo primitivo dentro de um objeto.

    Tipo Primitivo 	Classe Wrapper Correspondente
    int 	        Integer
    double 	        Double
    char 	        Character
    boolean 	    Boolean
    long 	        Long
    float 	        Float
    short 	        Short
    byte 	        Byte

é usado em estruturas do Java, como as Collections (List, Map, Set), 
que só conseguem armazenar Objetos. Elas não podem armazenar tipos primitivos diretamente.

## String 

Em Java, String não é um tipo primitivo, mas sim uma classe. 
Um dos seus conceitos mais importantes é a imutabilidade.

Uma vez que um objeto String é criado, ele nunca pode ser alterado. 
Qualquer operação que pareça modificar uma string (como replace ou toUpperCase) 
na verdade cria um novo objeto String em memória com o resultado da modificação.

A imutabilidade, que traz segurança, tem um custo de performance em cenários específicos: 
concatenação de strings em loop.

As strings são armazenadas em uma área especial da memória chamada "String Pool". 
Quando você cria uma string literal como String s1 = "Olá";, 
a JVM primeiro verifica se "Olá" já existe no pool.
Se sim, ela reutiliza a mesma referência.

## StringsBuilder e StringBuffer

Para resolver o problema da concatenação em loop, 
o Java oferece as classes StringBuilder e StringBuffer. 
Ambas são mutáveis, ou seja, permitem modificar a sequência de caracteres sem criar novos objetos.

StringBuilder: Mais rápida, mas não é "thread-safe". 
É a escolha ideal para a maioria dos casos em que a manipulação da string 
ocorre em uma única thread (o que é 99% das vezes).

StringBuffer: Um pouco mais lenta porque seus métodos são sincronizados, o que a torna "thread-safe". 
Use apenas se a mesma string for ser modificada por múltiplas threads simultaneamente.

# Aula 12 (112 - 129): Internacionalização de Datas e Moeda com Locale, LocalDate, LocalTime, LocalDateTime, Instant, ChronoUnit, TemporalAdjusters e Adjuster, DateTimeFormatter

## Internacionalização de Datas e Moeda com Locale

Um Locale é um objeto que representa uma região geográfica, 
política ou cultural específica. Ele não é um formatador em si, 
mas sim um identificador que informa a outras classes (como DateFormat) 
como elas devem se comportar para se adequar àquela região.

USE A API java.time PARA INTERNACIONALIZAÇÃO: A prática definitiva é 
usar DateTimeFormatter com o método .withLocale(). É thread-safe, imutável e muito mais claro.

    public static void main(String[] args) {
        // Use ZonedDateTime para incluir informações de fuso horário
        ZonedDateTime now = ZonedDateTime.now(); // MUDANÇA AQUI
        Locale localeItaly = new Locale("it", "IT");
    
        // Cria um formatador para um estilo localizado e aplica o Locale
        DateTimeFormatter formatter = DateTimeFormatter
        .ofLocalizedDateTime(FormatStyle.FULL)
        .withLocale(localeItaly);
    
        System.out.println(now.format(formatter)); //mercoledì 25 giugno 2025 22:23:58 Ora standard di Brasilia
        }

Use getCurrencyInstance para Dinheiro: 
É a forma correta e segura de garantir que todos os aspectos da formatação monetária
(símbolo, posição, separadores, casas decimais) sejam respeitados de acordo com o Locale.

Use BigDecimal para Cálculos Financeiros: Esta é a prática mais importante.
NUNCA use double ou float para representar ou calcular valores monetários em aplicações reais. 
Esses tipos sofrem de imprecisão de ponto flutuante. BigDecimal foi criado para cálculos exatos.

## LocalDate

LocalDate é uma das principais classes da nova API de Data e Hora do Java.
Ela representa uma data no formato ISO (ano-mês-dia), como "2025-06-28",
sem a parte de hora, minuto, segundo ou fuso horário.

É a classe ideal para representar aniversários, feriados, 
ou qualquer evento em que a hora e o fuso horário não são relevantes.

Existem várias formas de se obter um objeto LocalDate.

Data Atual (now) A forma mais simples de obter a data corrente.

Data Específica (of) Para criar uma data específica, use o método estático of.

A partir de uma String (parse) Converte uma string para LocalDate.
Por padrão, a string deve estar no formato ISO "yyyy-MM-dd".

Uma vez que você tem um objeto LocalDate, pode extrair facilmente suas partes

    LocalDate hoje = LocalDate.now();

    int ano = hoje.getYear();
    Month mes = hoje.getMonth(); // Retorna o enum Month
    int numeroDoMes = hoje.getMonthValue(); // Retorna o mês como int (1-12)
    int diaDoMes = hoje.getDayOfMonth();
    int diaDoAno = hoje.getDayOfYear();
    DayOfWeek diaDaSemana = hoje.getDayOfWeek(); // Retorna o enum DayOfWeek

## LocalTime

LocalTime é a classe que representa uma hora no formato ISO 
(HH:mm:ss.nano), como "21:52:30.123456789". Ela é o par da LocalDate e,
assim como ela, é "local", ou seja, não possui informação de data ou fuso horário.

É a classe ideal para representar horários de funcionamento, alarmes, 
ou qualquer evento em que a data e o fuso horário não são relevantes.

As formas de se obter um um objeto são as mesma do LocalDate

Uma vez que você tem um objeto LocalTime, pode extrair facilmente suas partes.

    LocalTime agora = LocalTime.now();

    int hora = agora.getHour();
    int minuto = agora.getMinute();
    int segundo = agora.getSecond();
    int nano = agora.getNano(); 


## LocalDateTime

LocalDateTime é a classe que representa uma data e hora, como "2025-07-02T21:45:30". Ela é, literalmente, a combinação de um LocalDate com um LocalTime.

Assim como suas partes, ela é "local", o que significa que não armazena informações de fuso horário
(timezone). Ela representa a data e hora em um ponto genérico, 
sem especificar onde no mundo aquela data e hora se aplicam.

As formas de se obter um um objeto são as mesma do LocalDate e LocalTime

## Instant

Instant representa um ponto único e instantâneo na linha do tempo. 
Pense nele como um carimbo de data/hora (timestamp) universal.

A principal característica do Instant é que ele é sempre representado em UTC 
(Coordinated Universal Time), também conhecido como "Zulu time" ou GMT. 
Ele não tem conceito de fuso horário, pois representa o mesmo momento para todos no mundo.

Internamente, ele armazena o tempo como um número de segundos e nanossegundos desde a 
Época Unix (01 de janeiro de 1970, 00:00:00 UTC). Isso o torna o sucessor direto e muito mais 
seguro do long de milissegundos da antiga classe java.util.Date.

Como manipular um Instant:

O Momento Atual (now)

    Instant agora = Instant.now();
    System.out.println("Instante atual (UTC): " + agora);

A partir de Segundos/Milissegundos da Época

Isso é útil para interoperabilidade com sistemas que usam timestamps Unix.

    // Criando a partir de milissegundos (similar a new Date(long))
    Instant deMilis = Instant.ofEpochMilli(1000L);
    System.out.println("1 segundo após a Época: " + deMilis);

    // Criando a partir de segundos
    Instant deSegundos = Instant.ofEpochSecond(3600);
    System.out.println("1 hora após a Época: " + deSegundos);

## ChronoUnit

ChronoUnit é um enum que implementa a interface TemporalUnit. 
Ele representa um conjunto padrão de unidades de data e hora, desde nanossegundos até milênios.

Enquanto Period nos dá a diferença quebrada em anos, meses e dias 
(ex: "1 ano, 2 meses e 15 dias") e Duration nos dá em segundos e nanossegundos, 
ChronoUnit responde a uma pergunta diferente: 
"Qual é a quantidade total de tempo entre dois pontos, medida em uma única unidade específica?".

A principal forma de usar ChronoUnit é através do seu método estático between
(Temporal startInclusive, Temporal endExclusive).

Ele calcula a quantidade total daquela unidade entre dois objetos temporais.

    LocalDate aniversario = LocalDate.of(1990, Month.AUGUST, 15);
    LocalDate hoje = LocalDate.now();

    System.out.println("Total de Anos: " + ChronoUnit.YEARS.between(aniversario, hoje));
    System.out.println("Total de Meses: " + ChronoUnit.MONTHS.between(aniversario, hoje));
    System.out.println("Total de Semanas: " + ChronoUnit.WEEKS.between(aniversario, hoje));
    System.out.println("Total de Dias: " + ChronoUnit.DAYS.between(aniversario, hoje));

## TemporalAdjusters e Adjuster

Muitas vezes, precisamos fazer cálculos de data que vão além de simplesmente adicionar ou 
subtrair dias, como "encontrar a próxima sexta-feira" ou "o último dia do mês".

A interface TemporalAdjuster é uma interface funcional que define uma estratégia para 
ajustar um objeto temporal. A classe TemporalAdjusters (com "s" no final) é uma classe utilitária 
que contém métodos de fábrica estáticos que retornam implementações comuns dessa interface.

A forma de usar um ajustador é através do método with() de uma classe temporal como LocalDate.

    LocalDate hoje = LocalDate.now();
    LocalDate proximoMes = hoje.with(TemporalAdjusters.firstDayOfNextMonth());

A classe TemporalAdjusters oferece uma vasta gama de métodos estáticos para os cenários mais comuns.

    LocalDate agora = LocalDate.now();
    System.out.println("Data de hoje: " + agora);
    System.out.println("Dia da semana: " + agora.getDayOfWeek());

    System.out.println("\n--- Ajustes Comuns ---");

    // Próxima terça-feira (não inclui hoje se hoje for terça)
    LocalDate proximaTerca = agora.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
    System.out.println("Próxima terça-feira: " + proximaTerca);

A verdadeira força da API é a capacidade de criar seus próprios ajustadores para regras 
de negócio específicas. Como TemporalAdjuster é uma interface funcional,
podemos implementá-la facilmente usando uma expressão lambda.

Exemplo: criar uma regra que, dada uma data, retorna o próximo dia. Se o próximo dia for sábado, 
ele ajusta para a próxima segunda. Se for domingo, também ajusta para a próxima segunda.

    class ObterProximoDiaUtil implements TemporalAdjuster {
        @Override
        public Temporal adjustInto(Temporal temporal) {
            // Pega o dia da semana do temporal passado como argumento
            DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

            int diasParaAdicionar;
            if (dayOfWeek == DayOfWeek.FRIDAY) {
                diasParaAdicionar = 3; // Se for sexta, pula para segunda
            } else if (dayOfWeek == DayOfWeek.SATURDAY) {
                diasParaAdicionar = 2; // Se for sábado, pula para segunda
            } else {
                diasParaAdicionar = 1; // Para os outros dias, apenas adiciona 1
            }
        return temporal.plus(diasParaAdicionar, ChronoUnit.DAYS);
        }
    }

## DateTimeFormatter

DateTimeFormatter é a classe usada para duas operações essenciais:

Formatação (Formatting): Converter um objeto da API java.time (LocalDate, LocalDateTime, ZonedDateTime, etc.) em uma String. 

Parsing: Converter uma String que representa uma data/hora de volta para um objeto da API java.time.

A classe DateTimeFormatter já vem com várias constantes estáticas para os formatos mais comuns, como o padrão ISO.

    LocalDate hoje = LocalDate.now(); 
    LocalDateTime agora = LocalDateTime.now();

    // Formatando com padrões ISO pré-definidos
    System.out.println("ISO DATE: " + hoje.format(DateTimeFormatter.ISO_DATE));
    System.out.println("ISO WEEK DATE: " + hoje.format(DateTimeFormatter.ISO_WEEK_DATE));
    System.out.println("ISO DATE TIME: " + agora.format(DateTimeFormatter.ISO_DATE_TIME));

Para a maioria dos casos, você precisará de um formato específico.
Para isso, usamos o método de fábrica ofPattern(String pattern).

Formatação (Objeto para String)

    // Criando um formatador com um padrão brasileiro
    DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime agora = LocalDateTime.now();

    String dataFormatada = agora.format(formatterBR);

Parsing (String para Objeto)

    String dataEmTexto = "25/12/2025 10:30:00";
    DateTimeFormatter parserBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    // Fazendo o parse do texto para um objeto LocalDateTime
    LocalDateTime dataParseada = LocalDateTime.parse(dataEmTexto, parserBR);











