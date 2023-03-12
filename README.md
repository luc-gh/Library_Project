# Library_Project
Simulação de sistema de biblioteca usando listas duplamente encadeadas em Java, para um projeto da matéria de Estrutura de Dados do curso 
de Ciência da computação, na UFAL Arapiraca.

**Sobre os códigos**
---
> [**Main**](src/Main.java)
>
> Classe de execução, que faz a chamada para a inicialização da biblioteca com a função ```startLibrary()```, 
> que realiza as operações possíveis na biblioteca.

> [**Book**](src/Book.java)
> 
> Classe que define como os livros serão caracterizados, e nesse caso, forama definidos como nós de uma lista encadeadas, 
> possuindo um nome e um ID, como valores definidos, e dois ponteiros: para o nó anterior e para o próximo.

> [**Library**](src/Library.java)
> 
> Classe que estrutura a biblioteca e define 7 funções:
> - ```isEmpty()```: retorna verdadeiro se a biblioteca não possuir itens;
> - ```isEmptyText()```: imprime uma mensagem sobre a função acima;
> - ```length()```: retorna a quantidade de livros na biblioteca;
> - ```existenceId()```: verifica se um ID já existe na biblioteca;
> - ```insert()```: adiciona um livro à biblioteca;
> - ```remove()```: remove um livro da biblioteca; 
> - ```showBooks()```: lista e imprime os livros da biblioteca.


Autoria:
---
Arnaldo Lucas (luc-gh)
