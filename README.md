# Library_Project
Simulação de sistema de biblioteca usando listas duplamente encadeadas em Java, para um projeto da matéria de Estrutura de Dados do curso 
de Ciência da computação, na UFAL Arapiraca.

**Docker image**
---
Como o arquivo gerado no Docker é muito grande, deixarei [***este link***](https://drive.google.com/file/d/1j9Niw2J8hQF3ENFzb_TV0F3yNyk04oTV/view?usp=sharing) do GDrive para fazer o download. O arquivo tem 101MB e gera uma imagem que deve executar o arquivo [Library.jar](out/artifacts/Library_jar/Library.jar), deste repositório. Caso ele não funcione, seria preciso instalar o Java 8 para executar tal arquivo.

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
