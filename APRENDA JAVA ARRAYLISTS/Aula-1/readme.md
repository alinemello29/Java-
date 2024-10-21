APRENDA JAVA: ARRAYLISTS
Introdução
3 minutos
Quando trabalhamos com
Preview: Docs Arrays are used for storing elements of the same data type in a fixed-sized collection, ordered by insertion.
matrizes
em Java, fomos limitados pelo fato de que, uma vez que um array é criado, ele tem um tamanho fixo. Não podemos adicionar ou remover elementos.

Mas e se precisássemos adicionar às listas de livros, feeds de notícias e outras estruturas que estávamos usando matrizes para representar?

Para criar listas mutáveis ​​e dinâmicas, podemos usar o Java
Visualização: Descrição do link de carregamento de documentos
ArrayList
classe. ArrayListnos permite:

Armazene referências de objetos como elementos
Armazena elementos do mesmo tipo (assim como matrizes)
Acessar elementos por índice (assim como matrizes)
Adicionar elementos
Remover elementos
Lembra como tivemos que importar java.util.Arrayspara usar métodos de array adicionais? Para usar um ArrayList, precisamos importá-los do utilpacote do Java também:

import java.util.ArrayList;

Vamos aprender a utilizar este poderoso objeto…

Instruções
Ponto de verificação 1 aprovado
1 .
Em Shopping.java definimos dois arrays:

groceryItems, uma Stringmatriz
prices, uma doublematriz
Tentamos adicionar um novo item ao final de cada um. Execute o código — funciona?