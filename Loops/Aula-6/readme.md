Iterando sobre Arrays e ArrayLists
10 minutos
Um padrão comum que encontraremos como programadores é percorrer , ou fazer um loop, por uma lista de dados e fazer algo com cada item. Em Java, essa lista seria um
Visualização: Descrição do link de carregamento de documentos
variedade
ou
Visualização: Descrição do link de carregamento de documentos
ArrayList
e o loop pode ser um forloop. Mas espere, como isso funciona?

Para percorrer um array ou ArrayListusar um loop, precisamos encontrar uma maneira de acessar cada elemento por meio de seu índice. Podemos lembrar quefor 
Visualização: Descrição do link de carregamento de documentos
laços
são criados com uma variável de contador. Podemos usar esse contador para rastrear o índice do elemento atual conforme iteramos sobre a lista de dados.

Como o primeiro índice em um array ou ArrayListé 0, o contador começaria com um valor de 0e incrementaria até o fim da lista. Então podemos incrementar através do array ou ArrayListusando seus índices.

Por exemplo, se quiséssemos adicionar 1a cada intitem em um array secretCode, poderíamos fazer isto:

for (int i = 0; i < secretCode.length; i++) {
  // Increase value of element value by 1
  secretCode[i] += 1;
}

Observe que nossa condição neste exemplo é i < secretCode.length. Como os índices de array começam em 0, o comprimento de secretCodeé 1 maior que seu índice final. Um loop deve parar sua travessia antes que sua variável de contador seja igual ao comprimento da lista.

Para dar um exemplo concreto, se o comprimento de um array for 5, o último índice que queremos acessar é 4. Se tentássemos acessar o índice 5, obteríamos um
Visualização: Descrição do link de carregamento de documentos
ArrayIndexOutOfBoundsException
erro! Este é um erro muito comum ao começar a percorrer arrays.

Atravessar um ArrayListparece muito semelhante:

for (int i = 0; i < secretCode.size(); i++) {
  // Increase value of element value by 1
  int num = secretCode.get(i);
  secretCode.set(i, num + 1);
}

Também podemos usar whileloops para percorrer arrays e ArrayLists. Se usarmos um whileloop, precisamos criar nossa própria variável de contador para acessar elementos individuais. Também definiremos nossa condição para continuar o loop até que nossa variável de contador seja igual ao comprimento da lista.

Por exemplo, vamos usar um whileloop para percorrer uma matriz:

int i = 0; // initialize counter

while (i < secretCode.length) {
  secretCode[i] += 1;
  i++; // increment the while loop
}

Percorrer um ArrayListcom um whileloop ficaria assim:

int i = 0; // initialize counter

while (i < secretCode.size()) {
  int num = secretCode.get(i);
  secretCode.set(i, num + 1);
  i++; // increment the while loop
}

Instruções
Ponto de verificação 1 aprovado
1 .
Vamos usar um forloop para iterar expensese somar totaltodos os itens.

Comece com o esqueleto de um forloop:

Inicializa um contador icom um valor de 0.
O loop deve ser executado enquanto ifor menor que o size()de expenses.
Incremento i.
Você pode deixar o corpo vazio por enquanto.