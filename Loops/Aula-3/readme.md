APRENDA JAVA: LOOPS
Incrementando loops While
7 minutos
Ao fazer um loop pelo código, é comum usar uma variável de contador. Um contador (também conhecido como iterador ) é uma variável usada na lógica condicional do loop e (geralmente) incrementada em valor durante cada iteração pelo código. Por exemplo:

// counter is initialized
int wishes = 0;

// conditional logic uses counter
while (wishes < 3) {

  System.out.println("Wish granted.");
  // counter is incremented
  wishes++;

}

No exemplo acima, o contador wishesé inicializado antes do loop com um valor de 0, então o programa continuará imprimindo "Wish granted."e adicionando 1enquanto wishestiver wishesum valor menor que 3. Quando wishesatingir um valor de 3ou mais, o programa sairá do loop.

Então o
Visualização: Descrição do link de carregamento de documentos
saída
ficaria assim:

Wish granted.
Wish granted.
Wish granted.

Também podemos decrementar contadores assim:

int pushupsToDo = 10;

while (pushupsToDo > 0) {

  doPushup();
  pushupsToDo--;

}

No código acima, o contador, pushupsToDo, começa em 10 e incrementa para baixo um de cada vez. Quando ele atinge 0, o loop sai.

Instruções
Ponto de verificação 1 aprovado
1 .
Em Coffee.java , inicialize uma intvariável chamada cupsOfCoffeecom um valor de 1.

Ponto de verificação 2 aprovado
2 .
Crie um whileloop que seja executado enquanto cupsOfCoffeefor menor ou igual a 100.

Importante: Dentro do whileloop, incremente cupsOfCoffeeem 1para evitar um loop infinito.

Ponto de verificação 3 aprovado
3 .
Dentro do whileloop acima, onde você incrementou, cupsOfCoffeeimprima o seguinte:

Fry drinks cup of coffee #1

O 1nesta declaração deve corresponder ao valor atual de cupsOfCoffee. Quando cupsOfCoffeefor 100, isto deve ser impresso:

Fry drinks cup of coffee #100
