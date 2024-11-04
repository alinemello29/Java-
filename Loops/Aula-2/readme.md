APRENDA JAVA: LOOPS
Enquanto estamos aqui
9 minutos
Um whileloop se parece um pouco com uma ifdeclaração:

while (silliness > 10) {

  // code to run

}

Como uma ifdeclaração, o código dentro de um whileloop só será executado se a condição for true. No entanto, um whileloop continuará executando o código repetidamente até que a condição seja avaliada como false. Então, o bloco de código será repetido até que sillinessseja menor ou igual a 10.

// set attempts to 0
int attempts = 0;

// enter loop if condition is true
while (passcode != 0524 && attempts < 4) {

  System.out.println("Try again.");
  passcode = getNewPasscode();
  attempts += 1;

  // is condition still true?
  // if so, repeat code block
}
// exit when condition is not true

while 
Visualização: Descrição do link de carregamento de documentos
laços
são extremamente úteis quando você quer executar algum código até que uma mudança específica aconteça. No entanto, se você não tem certeza de que a mudança ocorrerá, cuidado com o loop infinito!

Loops infinitos ocorrem quando a condição nunca será avaliada como false. Isso pode fazer com que todo o seu programa trave.

int hedgehogs = 5;

// This will cause an infinite loop:
while (hedgehogs < 6) {

  System.out.println("Not enough hedgehogs!");

}

No exemplo acima, hedgehogspermanece igual a 5, que é menor que 6. Então teríamos um loop infinito.

Instruções
Checkpoint 1 Passed
1 .
Dê uma olhada em LuckyFive.java . Nós configuramos um gerador de números aleatórios que permite simular o lançamento de um dado.

Crie um whileloop que continuará em loop enquanto dieRollNÃO for 5.

NÃO execute seu código ainda — você terá um loop infinito aqui porque o valor de dieRollnunca é alterado.

Dentro do loop, reinicie dieRollcom um novo valor aleatório entre 1e 6.

Agora você pode executar o código.