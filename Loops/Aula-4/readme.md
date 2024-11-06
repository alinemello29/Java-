amação) inclui uma sintaxe específica para abordar esse padrão: forloops.

Um cabeçalho for de loop é composto das três partes a seguir, cada uma separada por ponto e vírgula:

A inicialização da variável de controle do loop.
UM
Visualização: Descrição do link de carregamento de documentos
boolean
expressão.
Uma declaração de incremento ou decremento.
A frase de abertura pode ser assim:

for (int i = 0; i < 5; i++) {

  // code that will run

}

Em um forloop, uma declaração de inicialização é executada uma vez para inicializar a variável de controle do loop. Essa variável é modificada em cada iteração, pode ser referenciada no corpo do loop e usada para testar a condição booleana. No exemplo acima, ié a variável de controle do loop.

Vamos analisar o exemplo acima:

i = 0: ié inicializado para0
i < 5: o loop recebe uma booleancondição que depende do valor de i. O loop continuará a executar até que i < 5seja false.
i++: iserá incrementado no final de cada loop e antes que a condição seja reavaliada.
Portanto, o código será executado no loop um total de cinco vezes.

Também ouviremos o termo “iteração” em referência a loops. Quando iteramos , significa apenas que estamos repetindo o mesmo bloco de código.