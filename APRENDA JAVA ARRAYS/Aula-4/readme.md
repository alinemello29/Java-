APRENDA JAVA: ARRAYS
Obter elemento por índice
12 minutos
Agora que temos um array declarado e inicializado, queremos ser capazes de obter valores dele.

Usamos colchetes, [e ], para acessar dados em um determinado índice:

double[] prices = {13.1, 15.87, 14.22, 16.66};

System.out.println(prices[1]);

Este comando imprimiria:

15.87

Isso acontece porque 15.87é o item no 1índice do array. Lembre-se, o índice de um array começa 0e termina em um índice de um a menos que o número de elementos no array.

Se tentarmos acessar um elemento fora de seu intervalo de índice apropriado, receberemos um
Preview: Docs Loading link description
ArrayIndexOutOfBoundsException
erro.

Por exemplo, se executássemos o comando System.out.println(prices[5]), obteríamos a seguinte saída:

java.lang.ArrayIndexOutOfBoundsException: 5
Instruções
Checkpoint 1 Passed
1 .
Dentro da Newsfeedclasse, crie um método chamado getFirstTopic()que retorna a Stringe não aceita parâmetros.

Dentro do getFirstTopic()método, retorne o primeiro elemento do topicsarray.

Ponto de verificação 2 aprovado
2 .
Adicionamos uma matriz chamada viewspara monitorar quantos espectadores visitam um tópico.

Toda vez que alguém visualiza um tópico, queremos aumentar o valor do elemento correspondente em views1.

Por exemplo, se alguém visualizar um artigo de “Opinião” (índice 0 em tópicos), aumentaremos o valor do índice 0views em 1.

Dentro do viewTopic()método, implemente esta funcionalidade. O parâmetro topicIndexrepresenta a localização do elemento em topicsque foi visualizado.

Observação: vá para o arquivo Main.java para ver a saída do programa que você escreveu.