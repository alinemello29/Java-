CONDICIONAIS E FLUXO DE CONTROLE
Instruções condicionais aninhadas
8 minutos
Podemos criar estruturas condicionais mais complexas criando instruções condicionais aninhadas , que são criadas colocando instruções condicionais dentro de outras instruções condicionais:

if (outer condition) {
  if (nested condition) {
    Instruction to execute if both conditions are true
  }
}
Quando implementamos instruções condicionais aninhadas, a instrução externa é avaliada primeiro. Se a condição externa for true, então a instrução interna aninhada é avaliada.

Vamos criar um programa que nos ajude a decidir o que vestir com base no clima:

int temp = 45;
boolean raining = true;

if (temp < 60) {
  System.out.println("Wear a jacket!");
  if (raining == true) {
    System.out.println("Bring your umbrella.");
  } else {
    System.out.println("Leave your umbrella home.");
  }
}

No trecho de código acima, nosso compilador verificará a condição na primeira if-thendeclaração: temp < 60. Como temptem um valor de 45, essa condição é true; portanto, nosso programa imprimirá Wear a jacket!.

Então, avaliaremos a condição da if-theninstrução aninhada: raining == true. Esta condição também é true, então Bring your umbrellatambém é impressa na tela.

Observe que, se a primeira condição fosse false, a condição aninhada não seria avaliada.

Instruções
Checkpoint 1 Passed
1 .
A empresa oferece uma oferta temporária: se o consumidor utilizar o cupom "ship50", a empresa reduzirá o preço do frete expresso.

Vamos reescrever o corpo da declaração else- ifdo último exercício. Dentro da declaração else- if, crie uma declaração aninhada if-thenque verifica se é couponCodeigual a "ship50".

Se a condição aninhada for true, retorne o valor .85.

Se a condição for , use uma instrução falseaninhada para retornar o valor .else1.75