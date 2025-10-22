# Sistema de Gerenciamento de Atendimento ao Cliente
## Resumo
Esse projeto corresponde a um trabalho da disciplina Estrutura de Dados da PUCPR. 
O projeto consiste em criar um sistema de gerenciamento de atendimento ao cliente, onde se tem uma estrutura de dados do tipo fila de atendimentos e 
uma pilha de solicitações.
Estudantes: Gabriel Losekann e Danton Talles Telles da Costa

## Estrutura:
O projeto é composto por 5 arquivos java.

### Antendimento.java : Representa o meu Node da minha fila , possui os atributos do antendimento além do atributo next, apontando para o proximo na fila com lista encadeada.

### Solicitacao.java: Representa o Node da pilha.Possui os atributos da solicitação além do atributo next, apontando para o proximo na fila com lista encadeada.


### Fila.java :  Classe da minha fila, utiliza a classe Atendimento. Possui os seguintes metodos:
verificar_Fila_vazia() --> Verifica se a fila esta vazia ou não
InserirAtendimento() --> Insere um atendimento na fila 
AtenderCliente() --> Atende um cliente , ou seja move o inicio da fila pro proximo elemento.
mostrarClienteNaFila() --> Mostra os clientes presentes na minha fila. 

### Pilha.java : Classa da minha pilha, utiliza a classe Solicitação . Possui os seguintes metodos: 
removerSolicitacao() --> Remove uma solicitação da minha pilha 
adicionarSolicitacao() --> Adiciona uma solicitação na minha pilha 
mostrarHistoricoDeSolicitacoes() --> Imprime a pilha

### Main.java --> Classe main onde são criadas uma fila de antendimento, utilizando o metodo de inserção e um historico de solicitações , também utilizando o metodo de inserção. Apos isso tanto para a fila quanto para a pilha é mostrado o estado das estruturas antes e apos a remocao de um elemento.
