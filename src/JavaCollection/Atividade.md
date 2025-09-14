## LIST:

### 1. Carrinho de Compras:

<p>Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. O carrinho deve ser implementado como uma lista de itens. Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade. Implemente os seguintes métodos:

- `adicionarItem(String nome, double preco, int quantidade)`: Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
- `removerItem(String nome)`: Remove um item do carrinho com base no seu nome.
- `calcularValorTotal()`: Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
- `exibirItens()`: Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
</p>

### 2. Soma de Números: 

<p> Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

- `adicionarNumero(int numero):` Adiciona um número à lista de números.
- `calcularSoma():` Calcula a soma de todos os números na lista e retorna o resultado.
- `encontrarMaiorNumero():` Encontra o maior número na lista e retorna o valor.
- `encontrarMenorNumero():` Encontra o menor número na lista e retorna o valor.
- `exibirNumeros():` Retorna uma lista contendo todos os números presentes na lista.
</p>

### 3. Ordenação de Números
<p> Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

- `adicionarNumero(int numero):` Adiciona um número à lista.
- `ordenarAscendente():` Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
- `ordenarDescendente():` Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
</p>


### 4. Conjunto de Palavras Únicas
<p> Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra):` Adiciona uma palavra ao conjunto.
- `removerPalavra(String palavra):` Remove uma palavra do conjunto.
- `verificarPalavra(String palavra):` Verifica se uma palavra está presente no conjunto.
- `exibirPalavrasUnicas():` Exibe todas as palavras únicas do conjunto.
</p>

## SET:

### 5. Lista de Tarefas
<p> Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

- ` adicionarTarefa(String descricao):`Adiciona uma nova tarefa ao Set.
- `removerTarefa(String descricao):` Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
- `exibirTarefas():` Exibe todas as tarefas da lista de tarefas.
- `contarTarefas():` Conta o número total de tarefas na lista de tarefas.
- `obterTarefasConcluidas():` Retorna um Set com as tarefas concluídas.
- `obterTarefasPendentes():` Retorna um Set com as tarefas pendentes.
- `marcarTarefaConcluida(String descricao):` Marca uma tarefa como concluída de acordo com a descrição.
- `marcarTarefaPendente(String descricao):` Marca uma tarefa como pendente de acordo com a descrição.
- `limparListaTarefas():` Remove todas as tarefas da lista de tarefas. </p>

### 6. Lista de Alunos
<p> Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

- `adicionarAluno(String nome, Long matricula, double media):` Adiciona um aluno ao conjunto.
- `removerAluno(long matricula):` Remove um aluno ao conjunto a partir da matricula, se estiver presente.
- `exibirAlunosPorNome():` Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
- `exibirAlunosPorNota():` Exibe todos os alunos do conjunto em ordem crescente de nota.
- `exibirAlunos():` Exibe todos os alunos do conjunto. </p>

## MAP:

### 7. Agenda de Contatos
<p> Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. Cada contato possui um nome como chave e um número de telefone como valor. Implemente os seguintes métodos:

- `adicionarContato(String nome, Integer telefone):` Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
- `removerContato(String nome):` Remove um contato da agenda, dado o nome do contato.
- `exibirContatos():` Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
- `pesquisarPorNome(String nome):` Pesquisa um contato pelo nome e retorna o número de telefone correspondente. </p>
