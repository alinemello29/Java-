APRENDA JAVA: LOOPS
Usando For Loops
6 minutos
Mesmo que possamos escreverwhile 
Visualização: Descrição do link de carregamento de documentos
laços
que realizam a mesma tarefa, foros loops são úteis porque nos ajudam a lembrar de incrementar nosso contador — algo que é fácil de esquecer quando incrementamos com um whileloop.

Deixar de fora essa linha de código causaria um loop infinito — caramba!

Felizmente, equipados com nossa nova compreensão de forloops, podemos ajudar a evitar loops infinitos em nosso próprio código.

É importante estar ciente de que, se não criarmos o forcabeçalho de loop correto, podemos fazer com que a iteração seja repetida uma ou poucas vezes; essa ocorrência é conhecida como erro “off by one”.

Por exemplo, imagine que queremos encontrar a soma dos dez primeiros números e escrevemos o seguinte código:

int sum = 0;
for (int i = 0; i < 10; i++) {
  sum += i
}

Este código produziria um valor incorreto de 45. Pulamos a adição 10de sumporque nossa variável de controle de loop começou com um valor de 0e parou a iteração depois que ela teve um valor de 9. Estávamos errados por um! Poderíamos consertar isso alterando a condição do nosso loop para ser i <= 10;ou i < 11;.

Esses
Visualização: Descrição do link de carregamento de documentos
erros
pode ser complicado porque, embora nem sempre produzam um erro no terminal, eles podem causar alguns erros de cálculo em nosso código. Esses são chamados de erros lógicos — o código roda bem, mas não fez o que você esperava que fizesse.

Instruções
Ponto de verificação 1 aprovado
1 .
Nós fornecemos um whileloop que faz um loop de 1para 100produzindo uma string em cada iteração. Refatore (reescreva) esse código como um forloop.

Lembre-se, a sintaxe de um forloop se parece com:

for (int i = 0; i < 5; i++) {

  // code that will run

}
