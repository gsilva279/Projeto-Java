# NOTAS DO CÓDIGO

```java
public class MinhaClass {
    public static void main(String[] args) {
        // Declaração e inicialização das variáveis
        String primeiroNome = "José";
        String segundoNome = "Silva";

        // Chamada do método nomeCompleto e armazenamento do resultado
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        // Impressão do nome completo no console
        System.out.println(nomeCompleto);
    }

    // Método que concatena o primeiro e segundo nome
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
```

## Tipos e Variáveis em Java

Em Java, as variáveis são usadas para armazenar dados que podem ser manipulados durante a execução de um programa. Cada variável tem um tipo específico que define o tamanho e o layout da memória, o intervalo de valores que pode armazenar e as operações que podem ser realizadas sobre ela.

### Tipos Primitivos

Java possui oito tipos primitivos:

| Tipo     | Tamanho (bits) | Intervalo / Descrição                        |
|----------|----------------|----------------------------------------------|
| `byte`   | 8              | -128 a 127                                   |
| `short`  | 16             | -32.768 a 32.767                             |
| `int`    | 32             | -2^31 a 2^31-1                               |
| `long`   | 64             | -2^63 a 2^63-1                               |
| `float`  | 32             | Ponto flutuante de precisão simples          |
| `double` | 64             | Ponto flutuante de precisão dupla            |
| `char`   | 16             | Representa um caractere Unicode              |
| `boolean`| 1              | Representa valores `true` ou `false`         |

### Variáveis de Referência

Além dos tipos primitivos, Java também possui variáveis de referência, que são usadas para referenciar objetos. Exemplos incluem:

- `String`: para cadeias de caracteres.
- `Arrays`: para coleções de elementos do mesmo tipo.
- Classes e interfaces definidas pelo usuário.

### Declaração de Variáveis

Para declarar uma variável, você deve especificar o tipo seguido pelo nome da variável. Por exemplo:

```java
int idade;
String nome;
```

### Inicialização de Variáveis

Você pode inicializar uma variável no momento da declaração:

```java
int idade = 25;
String nome = "Ana";
```

### Regras de Nomenclatura

- Os nomes de variáveis devem começar com uma letra, `$` ou `_`.
- Não podem começar com um dígito.
- São sensíveis a maiúsculas e minúsculas (`idade` e `Idade` são diferentes).

### Constantes

Constantes são variáveis cujo valor não pode ser alterado após a inicialização. Em Java, usamos a palavra-chave `final` para declarar uma constante. Por exemplo:

```java
final int NUMERO_MAXIMO = 100;
final String SAUDACAO = "Olá, Mundo!";
```

### A Classe String

A classe `String` é usada para representar cadeias de caracteres. Strings são imutáveis, o que significa que uma vez criadas, não podem ser alteradas. Métodos comuns da classe `String` incluem:

- `length()`: retorna o comprimento da string.
- `charAt(int index)`: retorna o caractere na posição especificada.
- `substring(int beginIndex, int endIndex)`: retorna uma substring.
- `toUpperCase()`: converte todos os caracteres para maiúsculas.
- `toLowerCase()`: converte todos os caracteres para minúsculas.

Exemplo de uso da classe `String`:

```java
String saudacao = "Olá, Mundo!";
int comprimento = saudacao.length();
char primeiraLetra = saudacao.charAt(0);
String parte = saudacao.substring(0, 3);
String maiuscula = saudacao.toUpperCase();
```

## Modo Debug

O modo debug é uma ferramenta essencial para desenvolvedores, pois permite a execução passo a passo do código, facilitando a identificação e correção de erros. No modo debug, você pode:

- **Definir Breakpoints**: Pontos no código onde a execução será pausada.
- **Inspecionar Variáveis**: Verificar o valor das variáveis em diferentes pontos da execução.
- **Executar Passo a Passo**: Avançar a execução linha por linha ou entrar em métodos específicos.
- **Avaliar Expressões**: Avaliar expressões e ver seus resultados em tempo real.

### Como Usar o Modo Debug no VS Code

1. **Definir Breakpoints**: Clique na margem esquerda ao lado do número da linha onde deseja pausar a execução.
2. **Iniciar Debug**: Clique no ícone de "Run and Debug" na barra lateral ou pressione `F5`.
3. **Controlar a Execução**:
    - **Continue (`F5`)**: Continua a execução até o próximo breakpoint.
    - **Step Over (`F10`)**: Executa a próxima linha de código, sem entrar em métodos.
    - **Step Into (`F11`)**: Entra no método chamado na linha atual.
    - **Step Out (`Shift+F11`)**: Sai do método atual e retorna para o chamador.

### Exemplo de Uso

```java
public class DebugExemplo {
     public static void main(String[] args) {
          int a = 5;
          int b = 10;
          int resultado = soma(a, b);
          System.out.println("Resultado: " + resultado);
     }

     public static int soma(int x, int y) {
          return x + y;
     }
}
```

Defina um breakpoint na linha `int resultado = soma(a, b);` e inicie o modo debug para ver como o valor de `a` e `b` são passados para o método `soma` e como o resultado é calculado.

## Operadores Aritméticos

Os operadores aritméticos são utilizados para realizar operações matemáticas entre variáveis e/ou valores. Abaixo estão os operadores aritméticos mais comuns em muitas linguagens de programação:

- **Adição (+)**: Soma dois valores.
- **Subtração (-)**: Subtrai o segundo valor do primeiro.
- **Multiplicação (*)**: Multiplica dois valores.
- **Divisão (/)**: Divide o primeiro valor pelo segundo.
- **Módulo (%)**: Retorna o resto da divisão do primeiro valor pelo segundo.
- **Incremento (++)**: Aumenta o valor de uma variável em 1.
- **Decremento (--)**: Diminui o valor de uma variável em 1.

### Exemplos

- `5 + 3` resulta em `8`
- `10 - 2` resulta em `8`
- `4 * 2` resulta em `8`
- `16 / 2` resulta em `8`
- `17 % 3` resulta em `2`
- Se `x = 5`, então `x++` resulta em `6`
- Se `y = 5`, então `y--` resulta em `4`

## Operadores Unários

Os operadores unários são utilizados com apenas um operando para realizar várias operações, como incrementar/decrementar um valor, inverter um valor booleano, ou mudar o sinal de um número. Em Java, os operadores unários incluem:

- **Incremento (`++`)**: Aumenta o valor de uma variável em 1.
- **Decremento (`--`)**: Diminui o valor de uma variável em 1.
- **Mais (`+`)**: Indica um valor positivo (geralmente implícito).
- **Menos (`-`)**: Inverte o sinal de um valor numérico.
- **Negação lógica (`!`)**: Inverte o valor de uma expressão booleana.

### Exemplos

- `int x = 5;`
    - `x++` resulta em `6`
    - `x--` resulta em `4`
    - `-x` resulta em `-5`
- `boolean flag = true;`
    - `!flag` resulta em `false`

Os operadores de incremento e decremento podem ser usados em duas formas:
- **Prefixo**: `++x` ou `--x` (incrementa/decrementa antes de usar o valor na expressão).
- **Postfixo**: `x++` ou `x--` (incrementa/decrementa depois de usar o valor na expressão).

### Exemplo de Uso

```java
int a = 10;
int b = ++a; // b é 11, a é incrementado antes de ser atribuído a b
int c = a--; // c é 11, a é decrementado após ser atribuído a c
boolean d = !false; // d é true
```

## Operador Ternário

O operador ternário é uma forma concisa de expressar uma condição que retorna um valor entre duas opções. Ele é composto por três partes: uma expressão booleana, um valor a ser retornado se a expressão for verdadeira, e um valor a ser retornado se a expressão for falsa. A sintaxe do operador ternário é:

```java
condição ? valorSeVerdadeiro : valorSeFalso;
```

### Exemplo de Uso

```java
int idade = 18;
String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
System.out.println(mensagem); // Imprime "Maior de idade"
```

No exemplo acima, a expressão `idade >= 18` é avaliada. Se for verdadeira, a variável `mensagem` recebe o valor `"Maior de idade"`, caso contrário, recebe o valor `"Menor de idade"`. O operador ternário é útil para simplificar expressões condicionais que de outra forma exigiriam uma estrutura `if-else`.

## Operadores Relacionais

Os operadores relacionais são usados para comparar dois valores. Eles retornam um valor booleano (`true` ou `false`) com base na comparação. Em Java, os operadores relacionais incluem:

- **Igual a (`==`)**: Verifica se dois valores são iguais.
- **Diferente de (`!=`)**: Verifica se dois valores são diferentes.
- **Maior que (`>`)**: Verifica se o valor à esquerda é maior que o valor à direita.
- **Menor que (`<`)**: Verifica se o valor à esquerda é menor que o valor à direita.
- **Maior ou igual a (`>=`)**: Verifica se o valor à esquerda é maior ou igual ao valor à direita.
- **Menor ou igual a (`<=`)**: Verifica se o valor à esquerda é menor ou igual ao valor à direita.

### Exemplos

- `5 == 5` resulta em `true`
- `5 != 3` resulta em `true`
- `7 > 3` resulta em `true`
- `2 < 4` resulta em `true`
- `5 >= 5` resulta em `true`
- `3 <= 6` resulta em `true`

Os operadores relacionais são frequentemente usados em estruturas de controle de fluxo, como `if`, `for`, e `while`, para tomar decisões com base nas comparações.

### Exemplo de Uso

```java
int a = 10;
int b = 20;

if (a < b) {
    System.out.println("a é menor que b");
} else {
    System.out.println("a não é menor que b");
}
```

## Uso do Método `.equals()`

Em Java, o método `.equals()` é usado para comparar a igualdade de dois objetos. Diferente do operador `==`, que compara referências de memória, o método `.equals()` compara o conteúdo dos objetos.

### Exemplo de Uso

```java
String nome1 = "Ana";
String nome2 = "Ana";

if (nome1.equals(nome2)) {
    System.out.println("Os nomes são iguais.");
} else {
    System.out.println("Os nomes são diferentes.");
}
```

No exemplo acima, `nome1.equals(nome2)` retorna `true` porque o conteúdo das duas strings é igual. Se usássemos `nome1 == nome2`, o resultado poderia ser `false` se as referências de memória fossem diferentes, mesmo que o conteúdo fosse o mesmo.

### Implementação do `.equals()`

Ao criar suas próprias classes, você pode sobrescrever o método `.equals()` para definir como dois objetos dessa classe devem ser comparados.

```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pessoa pessoa = (Pessoa) obj;
        return idade == pessoa.idade && nome.equals(pessoa.nome);
    }
}
```

No exemplo acima, a classe `Pessoa` sobrescreve o método `.equals()` para comparar o nome e a idade dos objetos `Pessoa`.

### Importância do `.equals()`

Usar o método `.equals()` corretamente é crucial para garantir que a comparação de objetos em coleções, como `List` e `Set`, funcione como esperado. Sem uma implementação adequada, a lógica de comparação pode falhar, levando a resultados inesperados.

## Operadores Lógicos

Os operadores lógicos são usados para combinar expressões booleanas e retornar um valor booleano (`true` ou `false`). Em Java, os operadores lógicos incluem:

- **E lógico (`&&`)**: Retorna `true` se ambas as expressões forem verdadeiras.
- **OU lógico (`||`)**: Retorna `true` se pelo menos uma das expressões for verdadeira.
- **NEGAÇÃO lógica (`!`)**: Inverte o valor de uma expressão booleana.

### Exemplos

- `true && true` resulta em `true`
- `true && false` resulta em `false`
- `true || false` resulta em `true`
- `false || false` resulta em `false`
- `!true` resulta em `false`
- `!false` resulta em `true`

Os operadores lógicos são frequentemente usados em estruturas de controle de fluxo, como `if`, `for`, e `while`, para tomar decisões com base em múltiplas condições.

### Exemplo de Uso

```java
int a = 10;
int b = 20;
boolean resultado = (a < b) && (b > 15);

if (resultado) {
    System.out.println("Ambas as condições são verdadeiras.");
} else {
    System.out.println("Uma ou ambas as condições são falsas.");
}
```

No exemplo acima, a variável `resultado` será `true` porque ambas as condições `(a < b)` e `(b > 15)` são verdadeiras.

## Tipos de Operadores em Java

| Tipo de Operador       | Descrição                                                                 |
|------------------------|---------------------------------------------------------------------------|
| **Aritméticos**        | Realizam operações matemáticas básicas como adição, subtração, etc.       |
| **Unários**            | Operam em um único operando, como incremento, decremento e negação lógica.|
| **Ternário**           | Utilizado para expressões condicionais que retornam um valor entre duas opções. |
| **Relacionais**        | Comparam dois valores e retornam um booleano (`true` ou `false`).         |
| **Lógicos**            | Combinam expressões booleanas e retornam um valor booleano.               |
| **Atribuição**         | Atribuem valores a variáveis.                                             |
| **Bitwise**            | Realizam operações em nível de bit.                                       |
| **Shift**              | Deslocam bits para a esquerda ou direita.                                 |
| **Instanceof**         | Verifica se um objeto é uma instância de uma classe específica.           |

## Métodos em Java
Os métodos em Java são blocos de código que realizam uma tarefa específica e podem ser chamados para executar essa tarefa. Eles ajudam a organizar e reutilizar o código, tornando-o mais modular e legível.

### Estrutura de um Método

Um método em Java é composto por:

1. **Modificadores de Acesso**: Definem a visibilidade do método (`public`, `private`, `protected`).
2. **Tipo de Retorno**: O tipo de dado que o método retorna (`void` se não retornar nada).
3. **Nome do Método**: Deve ser um identificador válido.
4. **Parâmetros**: Lista de parâmetros que o método aceita, entre parênteses.
5. **Corpo do Método**: O bloco de código que define o que o método faz, entre chaves `{}`.

### Exemplo de Método

```java
public class Calculadora {
    /**
     * Este método calcula a soma de dois números inteiros.
     *
     * @param a o primeiro número inteiro
     * @param b o segundo número inteiro
     * @return a soma dos dois números inteiros
     * @throws IllegalArgumentException se qualquer um dos parâmetros for nulo
     */
    public int soma(int a, int b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Os parâmetros não podem ser nulos");
        }
        return a + b;
    }
}
```

### Chamando um Método

Para chamar um método, você usa o nome do método seguido de parênteses, passando os argumentos necessários:

```java
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}
```

### Tipos de Métodos

- **Métodos de Instância**: Pertencem a uma instância da classe e podem acessar variáveis de instância.
- **Métodos Estáticos**: Pertencem à classe e não podem acessar variáveis de instância diretamente.

### Sobrecarga de Métodos

A sobrecarga de métodos permite definir vários métodos com o mesmo nome, mas com diferentes listas de parâmetros:

```java
public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }
}
```

### Documentação de Métodos

Usar comentários Javadoc para documentar métodos é uma prática recomendada. Eles descrevem o propósito do método, seus parâmetros, valor de retorno e exceções lançadas.

```java
/**
 * Este método calcula a soma de dois números inteiros.
 *
 * @param a o primeiro número inteiro
 * @param b o segundo número inteiro
 * @return a soma dos dois números inteiros
 * @throws IllegalArgumentException se qualquer um dos parâmetros for nulo
 */
public int soma(int a, int b) {
    if (a == null || b == null) {
        throw new IllegalArgumentException("Os parâmetros não podem ser nulos");
    }
    return a + b;
}
```

### Visibilidade dos Métodos

Os modificadores de acesso controlam a visibilidade dos métodos:

- **public**: O método pode ser acessado de qualquer lugar.
- **private**: O método só pode ser acessado dentro da própria classe.
- **protected**: O método pode ser acessado dentro da própria classe, por subclasses e por classes do mesmo pacote.
- **default** (sem modificador): O método pode ser acessado por classes do mesmo pacote.

### Exceções

Exceções são eventos que ocorrem durante a execução de um programa e interrompem o fluxo normal de instruções. Em Java, você pode usar exceções para tratar erros e outras condições excepcionais.

#### Lançando Exceções

Você pode lançar uma exceção usando a palavra-chave `throw`:

```java
public void verificaIdade(int idade) {
    if (idade < 18) {
        throw new IllegalArgumentException("Idade deve ser maior ou igual a 18");
    }
}
```

#### Tratando Exceções

Você pode tratar exceções usando blocos `try-catch`:

```java
public void exemploTratamento() {
    try {
        int resultado = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Erro: Divisão por zero");
    }
}
```

#### Declaração de Exceções

Métodos podem declarar que lançam exceções usando a cláusula `throws`:

```java
public void metodoQueLancaExcecao() throws IOException {
    // código que pode lançar IOException
}
```

### Boas Práticas

- **Nomes Significativos**: Use nomes de métodos que descrevam claramente o que eles fazem.
- **Coesão**: Cada método deve realizar uma única tarefa ou um grupo de tarefas relacionadas.
- **Documentação**: Documente seus métodos usando Javadoc para facilitar a manutenção e o entendimento do código.
- **Tratamento de Exceções**: Sempre trate exceções de maneira adequada para evitar que o programa falhe inesperadamente.


Os métodos em Java são blocos de código que realizam uma tarefa específica e podem ser chamados para executar essa tarefa. Eles ajudam a organizar e reutilizar o código, tornando-o mais modular e legível.

### Estrutura de um Método

Um método em Java é composto por:

1. **Modificadores de Acesso**: Definem a visibilidade do método (`public`, `private`, `protected`).
2. **Tipo de Retorno**: O tipo de dado que o método retorna (`void` se não retornar nada).
3. **Nome do Método**: Deve ser um identificador válido.
4. **Parâmetros**: Lista de parâmetros que o método aceita, entre parênteses.
5. **Corpo do Método**: O bloco de código que define o que o método faz, entre chaves `{}`.

### Exemplo de Método

```java
public class Calculadora {
    /**
     * Este método calcula a soma de dois números inteiros.
     *
     * @param a o primeiro número inteiro
     * @param b o segundo número inteiro
     * @return a soma dos dois números inteiros
     * @throws IllegalArgumentException se qualquer um dos parâmetros for nulo
     */
    public int soma(int a, int b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Os parâmetros não podem ser nulos");
        }
        return a + b;
    }
}
```

### Chamando um Método

Para chamar um método, você usa o nome do método seguido de parênteses, passando os argumentos necessários:

```java
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}
```

### Tipos de Métodos

- **Métodos de Instância**: Pertencem a uma instância da classe e podem acessar variáveis de instância.
- **Métodos Estáticos**: Pertencem à classe e não podem acessar variáveis de instância diretamente.

### Sobrecarga de Métodos

A sobrecarga de métodos permite definir vários métodos com o mesmo nome, mas com diferentes listas de parâmetros:

```java
public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }
}
```

### Documentação de Métodos

Usar comentários Javadoc para documentar métodos é uma prática recomendada. Eles descrevem o propósito do método, seus parâmetros, valor de retorno e exceções lançadas.

```java
/**
 * Este método calcula a soma de dois números inteiros.
 *
 * @param a o primeiro número inteiro
 * @param b o segundo número inteiro
 * @return a soma dos dois números inteiros
 * @throws IllegalArgumentException se qualquer um dos parâmetros for nulo
 */
public int soma(int a, int b) {
    if (a == null || b == null) {
        throw new IllegalArgumentException("Os parâmetros não podem ser nulos");
    }
    return a + b;
}
```

### Boas Práticas

- **Nomes Significativos**: Use nomes de métodos que descrevam claramente o que eles fazem.
- **Coesão**: Cada método deve realizar uma única tarefa ou um grupo de tarefas relacionadas.
- **Documentação**: Documente seus métodos usando Javadoc para facilitar a manutenção e o entendimento do código.
### Gerando Documentação com Javadoc

Para gerar a documentação de um arquivo Java usando o Javadoc no terminal, siga os passos abaixo:

1. **Abra o Terminal**: Navegue até o diretório onde seu arquivo Java está localizado.

2. **Comando Javadoc**: Use o comando `javadoc` seguido do nome do arquivo Java. Por exemplo, para gerar a documentação do arquivo `MinhaClass.java`, você pode usar o seguinte comando:

    ```sh
    javadoc MinhaClass.java
    ```

3. **Especificar Diretório de Saída**: Você pode especificar um diretório de saída para os arquivos HTML gerados usando a opção `-d`. Por exemplo:

    ```sh
    javadoc -d docs MinhaClass.java
    ```

    Isso criará uma pasta chamada `docs` contendo a documentação gerada.

4. **Gerar Documentação para um Pacote**: Para gerar a documentação de todos os arquivos em um pacote, você pode usar o comando:

    ```sh
    javadoc -d docs pacote/*.java
    ```

5. **Incluir Comentários Javadoc**: Certifique-se de que seus arquivos Java contenham comentários Javadoc adequados para que a documentação gerada seja útil e informativa.

### Exemplo Completo

Suponha que você tenha um arquivo `Calculadora.java` e deseja gerar a documentação:

```sh
javadoc -d docs Calculadora.java
```

Após executar o comando, a documentação será gerada na pasta `docs`, e você poderá abrir os arquivos HTML no seu navegador para visualizar a documentação.

### Opções Adicionais

O Javadoc oferece várias opções adicionais para personalizar a geração da documentação. Você pode ver todas as opções disponíveis usando o comando:

```sh
javadoc -help
```

Isso exibirá uma lista de todas as opções que você pode usar com o comando `javadoc`.

### Referência

Para mais informações sobre o uso do Javadoc, consulte a [documentação oficial do Javadoc](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html).

## Executando Arquivos Java no Terminal

Para compilar e executar arquivos Java no terminal, siga os passos abaixo:

### Compilando um Arquivo Java

1. **Abra o Terminal**: Navegue até o diretório onde seu arquivo Java está localizado.
2. **Comando `javac`**: Use o comando `javac` seguido do nome do arquivo Java para compilar o código. Por exemplo, para compilar `MinhaClass.java`, use o comando:

    ```sh
    javac MinhaClass.java
    ```

    Isso gerará um arquivo `MinhaClass.class` no mesmo diretório.

### Executando um Arquivo Java

1. **Comando `java`**: Use o comando `java` seguido do nome da classe (sem a extensão `.class`) para executar o programa. Por exemplo, para executar a classe `MinhaClass`, use o comando:

    ```sh
    java MinhaClass
    ```

    Isso iniciará a execução do programa e exibirá a saída no terminal.

### Exemplo Completo

Suponha que você tenha um arquivo `MinhaClass.java` com o seguinte conteúdo:

```java
public class MinhaClass {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
    }
}
```

Para compilar e executar este arquivo, siga os passos:

1. Compile o arquivo:

    ```sh
    javac MinhaClass.java
    ```

2. Execute o arquivo compilado:

    ```sh
    java MinhaClass
    ```

    A saída será:

    ```
    Olá, Mundo!
    ```

### Referência

Para mais informações sobre o uso dos comandos `javac` e `java`, consulte a [documentação oficial do Java](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javac.html).

## Principais Comandos do CMD

| Comando       | Descrição                                                                 |
|---------------|---------------------------------------------------------------------------|
| `cd`          | Altera o diretório atual.                                                 |
| `dir`         | Lista os arquivos e diretórios no diretório atual.                        |
| `copy`        | Copia arquivos de um local para outro.                                    |
| `move`        | Move arquivos de um local para outro.                                     |
| `del`         | Exclui arquivos.                                                          |
| `mkdir`       | Cria um novo diretório.                                                   |
| `rmdir`       | Remove um diretório vazio.                                                |
| `cls`         | Limpa a tela do terminal.                                                 |
| `echo`        | Exibe mensagens ou ativa/desativa a exibição de comandos.                 |
| `exit`        | Fecha a janela do CMD.                                                    |
| `ipconfig`    | Exibe informações de configuração de rede.                                |
| `ping`        | Testa a conectividade com um endereço IP específico.                      |
| `tasklist`    | Lista todos os processos em execução.                                     |
| `taskkill`    | Encerra um processo em execução.                                          |
| `chkdsk`      | Verifica e repara erros no disco.                                         |
| `sfc`         | Verifica e repara arquivos de sistema corrompidos.                        |
| `netstat`     | Exibe conexões de rede e estatísticas de protocolo.                       |
| `shutdown`    | Desliga ou reinicia o computador.                                         |
| `systeminfo`  | Exibe informações detalhadas sobre a configuração do sistema.             |
| `help`        | Fornece ajuda sobre comandos do CMD.                                      |

## Wrapper Classes em Java

As Wrapper Classes em Java são usadas para encapsular tipos primitivos em um objeto. Isso permite que os tipos primitivos sejam usados em contextos que requerem objetos, como em coleções do framework Java Collections.

### Tipos de Wrapper Classes

Java fornece uma classe wrapper para cada tipo primitivo:

| Tipo Primitivo | Classe Wrapper |
|----------------|-----------------|
| `byte`         | `Byte`          |
| `short`        | `Short`         |
| `int`          | `Integer`       |
| `long`         | `Long`          |
| `float`        | `Float`         |
| `double`       | `Double`        |
| `char`         | `Character`     |
| `boolean`      | `Boolean`       |

### Autoboxing e Unboxing

- **Autoboxing**: É o processo de conversão automática de um tipo primitivo para o tipo correspondente da classe wrapper.
- **Unboxing**: É o processo de conversão automática de um objeto da classe wrapper para o tipo primitivo correspondente.

#### Exemplo de Autoboxing

```java
int num = 10;
Integer numWrapper = num; // Autoboxing
```

#### Exemplo de Unboxing

```java
Integer numWrapper = 10;
int num = numWrapper; // Unboxing
```

### Métodos Úteis das Wrapper Classes

As classes wrapper fornecem vários métodos úteis para manipulação e conversão de valores.

#### Exemplo com a Classe `Integer`

```java
Integer num = Integer.valueOf(10); // Criação de um Integer
int valor = num.intValue(); // Conversão para int
String str = num.toString(); // Conversão para String
int parsed = Integer.parseInt("123"); // Conversão de String para int
```

### Comparação de Objetos Wrapper

Para comparar objetos das classes wrapper, use o método `.equals()` em vez do operador `==`, que compara referências de memória.

#### Exemplo de Comparação

```java
Integer num1 = 100;
Integer num2 = 100;

if (num1.equals(num2)) {
    System.out.println("Os valores são iguais.");
} else {
    System.out.println("Os valores são diferentes.");
}
```

### Uso em Coleções

As classes wrapper são frequentemente usadas em coleções, como `ArrayList`, que não suportam tipos primitivos.

#### Exemplo com `ArrayList`

```java
ArrayList<Integer> lista = new ArrayList<>();
lista.add(10); // Autoboxing
int valor = lista.get(0); // Unboxing
```

### Benefícios das Wrapper Classes

- **Compatibilidade com Coleções**: Permitem o uso de tipos primitivos em coleções.
- **Métodos Utilitários**: Fornecem métodos para conversão e manipulação de valores.
- **Imutabilidade**: Objetos das classes wrapper são imutáveis, o que significa que seu valor não pode ser alterado após a criação.

### Considerações de Desempenho

Embora as classes wrapper ofereçam muitos benefícios, elas podem introduzir sobrecarga de desempenho devido à criação de objetos. Use tipos primitivos quando o desempenho for crítico.

### Conclusão

## Wrapper Classes em Java

As Wrapper Classes em Java são usadas para encapsular tipos primitivos em um objeto. Isso permite que os tipos primitivos sejam usados em contextos que requerem objetos, como em coleções do framework Java Collections.

### Tipos de Wrapper Classes

Java fornece uma classe wrapper para cada tipo primitivo:

| Tipo Primitivo | Classe Wrapper |
|----------------|-----------------|
| `byte`         | `Byte`          |
| `short`        | `Short`         |
| `int`          | `Integer`       |
| `long`         | `Long`          |
| `float`        | `Float`         |
| `double`       | `Double`        |
| `char`         | `Character`     |
| `boolean`      | `Boolean`       |

### Autoboxing e Unboxing

- **Autoboxing**: É o processo de conversão automática de um tipo primitivo para o tipo correspondente da classe wrapper.
- **Unboxing**: É o processo de conversão automática de um objeto da classe wrapper para o tipo primitivo correspondente.

#### Exemplo de Autoboxing

```java
int num = 10;
Integer numWrapper = num; // Autoboxing
```

#### Exemplo de Unboxing

```java
Integer numWrapper = 10;
int num = numWrapper; // Unboxing
```

### Métodos Úteis das Wrapper Classes

As classes wrapper fornecem vários métodos úteis para manipulação e conversão de valores.

#### Exemplo com a Classe `Integer`

```java
Integer num = Integer.valueOf(10); // Criação de um Integer
int valor = num.intValue(); // Conversão para int
String str = num.toString(); // Conversão para String
int parsed = Integer.parseInt("123"); // Conversão de String para int
```

### Comparação de Objetos Wrapper

Para comparar objetos das classes wrapper, use o método `.equals()` em vez do operador `==`, que compara referências de memória.

#### Exemplo de Comparação

```java
Integer num1 = 100;
Integer num2 = 100;

if (num1.equals(num2)) {
    System.out.println("Os valores são iguais.");
} else {
    System.out.println("Os valores são diferentes.");
}
```

### Uso em Coleções

As classes wrapper são frequentemente usadas em coleções, como `ArrayList`, que não suportam tipos primitivos.

#### Exemplo com `ArrayList`

```java
ArrayList<Integer> lista = new ArrayList<>();
lista.add(10); // Autoboxing
int valor = lista.get(0); // Unboxing
```

### Benefícios das Wrapper Classes

- **Compatibilidade com Coleções**: Permitem o uso de tipos primitivos em coleções.
- **Métodos Utilitários**: Fornecem métodos para conversão e manipulação de valores.
- **Imutabilidade**: Objetos das classes wrapper são imutáveis, o que significa que seu valor não pode ser alterado após a criação.

### Considerações de Desempenho

Embora as classes wrapper ofereçam muitos benefícios, elas podem introduzir sobrecarga de desempenho devido à criação de objetos. Use tipos primitivos quando o desempenho for crítico.

### Conclusão

As wrapper classes são uma parte essencial da linguagem Java, permitindo que tipos primitivos sejam tratados como objetos. Elas facilitam a manipulação de dados e a integração com APIs que requerem objetos, ao mesmo tempo em que fornecem métodos utilitários para conversão e manipulação de valores.

## Controle de Fluxo em Java

O controle de fluxo em Java permite que você controle a execução do programa com base em condições e repetições. Ele é dividido em três categorias principais: **estruturas condicionais**, **estruturas de repetição** e **estruturas de interrupção**.

### Estruturas Condicionais

As estruturas condicionais permitem executar diferentes blocos de código com base em condições.

#### `if-else`

A estrutura `if-else` é usada para executar um bloco de código se uma condição for verdadeira e outro bloco se for falsa.

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

#### `else if`

O `else if` permite verificar múltiplas condições.

```java
int nota = 85;

if (nota >= 90) {
    System.out.println("Aprovado com excelência");
} else if (nota >= 70) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}
```

#### `switch`

O `switch` é usado para selecionar um bloco de código a ser executado com base no valor de uma variável.

```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    default:
        System.out.println("Dia inválido");
}
```

### Estruturas de Repetição

As estruturas de repetição permitem executar um bloco de código várias vezes.

#### `for`

O `for` é usado quando o número de iterações é conhecido.

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Contagem: " + i);
}
```

#### `while`

O `while` é usado quando o número de iterações não é conhecido e depende de uma condição.

```java
int contador = 0;

while (contador < 5) {
    System.out.println("Contagem: " + contador);
    contador++;
}
```

#### `do-while`

O `do-while` garante que o bloco de código seja executado pelo menos uma vez.

```java
int contador = 0;

do {
    System.out.println("Contagem: " + contador);
    contador++;
} while (contador < 5);
```

### Estruturas de Interrupção

As estruturas de interrupção permitem alterar o fluxo de execução dentro de loops ou `switch`.

#### `break`

O `break` interrompe a execução do loop ou do `switch`.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println("Número: " + i);
}
```

#### `continue`

O `continue` pula para a próxima iteração do loop.

```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue;
    }
    System.out.println("Número ímpar: " + i);
}
```

#### `return`

O `return` encerra a execução de um método e retorna um valor (se aplicável).

```java
public int soma(int a, int b) {
    return a + b;
}
```

### Boas Práticas

- Use `if-else` para condições simples e `switch` para múltiplos casos.
- Evite loops infinitos, a menos que sejam intencionais.
- Sempre use `break` em um `switch` para evitar a execução de casos subsequentes.
- Prefira `for` quando souber o número de iterações e `while` quando depender de uma condição.

O controle de fluxo é essencial para criar programas dinâmicos e flexíveis, permitindo que você tome decisões e repita ações com base em condições específicas.
