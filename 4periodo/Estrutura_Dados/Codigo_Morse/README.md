# Arvore Morse 
## Resumo 
Esse projeto consiste na criação de uma arvore binaria de busca que armazena em seus nós os codigos morses e os valores que eles representam. 
A regra core para a criação dessa arvoré é , se o proximo char do codigo for "." va para a esquerda , se for "-" va para a direita. Com essa lógica
é possivel representar todas as letras e algarismos de forma estruturada. 

## Estrutura do Projeto 
O projeto é composto por 3 classes java. São elas: 
### No.java
O No nessa arvore morse possui os ponteiros para esquerda e direita e como valor ele guarda a letra, ou melhor , o char que corresponde ao codigo morse 

### ArvoreMorse.java
Essa classe representa a arvore morse, nela estao presente os seguintes metodos:
#### Inserir 
Insere um codigo morse e a letra ou numero  correspondente a esse codigo.
#### CriarArvore 
Insere todas as letras do alfabeto e todos os numeros para a criação da arvore. 
#### buscarCodigo 
Busca se um determinado codigo esta presente na arvore, se sim retorna o char correspondente a esse codigo

#### buscarLetra\buscarLetraRec
A partir de uma letra me diz se essa letra esta presente na arvore ou nao e retorna o codigoMorse
#### remover\removerRec
Remove uma letra da arvore 
#### exibir\exibirRec
Imprime o estado da minha arovore deixando explicito os niveis e estruturas



### Main.java 

Na main é contruido a minha arvore e sao testados os metodos presentes na minha classe ArvoreMorse
Pode ser divido em 4 etapas
1 Exibição
2 Testes de Busca
3 Teste de Remoção
4 Exibição Final 
