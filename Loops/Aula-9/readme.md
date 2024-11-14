Removendo elementos durante a travessia
13 minutos
Se quisermos remover elementos de um
Preview: Docs Loading link description
ArrayList
ao percorrer um, podemos facilmente incorrer em um erro se não tomarmos cuidado.

Quando um elemento é removido de um ArrayList, todos os itens que aparecem depois do elemento removido terão seu valor de índice deslocado em menos um — é como se todos os elementos fossem deslocados para a esquerda! Teremos que ter muito cuidado com a forma como usamos nossa variável de contador para evitar pular elementos.

Removendo um elemento usandowhile
Ao usar um whileloop e remover elementos de um , nãoArrayList devemos incrementar o contador do loop sempre que removermos um elemento. Não precisamos aumentar o contador porque todos os outros elementos agora se deslocaram para a esquerda.while

Por exemplo, se removermos o elemento no índice 3, então o elemento que estava no índice 4será movido para o índice 3. Se aumentarmos nosso contador para 4, pularemos esse elemento!

Dê uma olhada neste bloco de código que removerá todos os números ímpares de um ArrayList. Pense sobre qual ié o valor de , quando estamos aumentando o valor de i, e quando i < lst.size()se torna False.

int i = 0; // initialize counter

while (i < lst.size()) {
  // if value is odd, remove value
  if (lst.get(i) % 2 != 0){
    lst.remove(i);
  } else {
    // if value is even, increment counter
    i++;
  }
}

Removendo um elemento usandofor
Podemos usar uma estratégia semelhante ao remover elementos usando um forloop. Ao usar um whileloop, decidimos não aumentar nossa variável de controle de loop sempre que removêssemos um elemento. Isso garantiu que não pularíamos um elemento quando todos os outros elementos se deslocassem para a esquerda.

Ao usar um forloop, infelizmente, precisamos aumentar nossa variável de controle de loop — a variável de controle de loop sempre mudará quando chegarmos ao final do loop (e geralmente mudará 1porque geralmente usamos algo como i++). Como não podemos evitar aumentar nossa variável de controle de loop, podemos resolver o problema por conta própria e diminuir a variável de controle de loop sempre que removermos um item.

Por exemplo:

for (int i = 0; i < lst.size(); i++) {
  if (lst.get(i) == "value to remove"){
    // remove value from ArrayList
    lst.remove(lst.get(i));
    // Decrease loop control variable by 1
    i--;    
  }
}

Agora, sempre que removermos um item, diminuiremos iem 1. Então, quando chegarmos ao fim do loop, iaumentaremos em 1. Será como ise nunca tivesse mudado!

Nota: Evite manipular o tamanho de um ArrayListao usar um loop aprimorado for. Ações como adicionar ou remover elementos de um ArrayListao usar um for eachloop podem causar um
Preview: Docs Loading link description
ConcurrentModificationException
erro.

Instruções
Checkpoint 1 Passed
1 .
Dê uma olhada no código colocado no main()método da Lunchclasse.

Dentro do método removeAnts(), use um forloop ou um whileloop para iterar lunchBoxe remover qualquer elemento que tenha o valor "ant".

Fora do loop, retorne o valor de lunchBox.