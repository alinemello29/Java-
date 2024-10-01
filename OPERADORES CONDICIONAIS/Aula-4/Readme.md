OPERADORES CONDICIONAIS
NÃO lógico: !
5 minutos
O operador unário! NOT, , funciona em um único valor. Este operador avalia o booleano oposto ao qual é aplicado:

!false
// true
!true
// false

NOT é útil para expressar nossa intenção claramente em programas. Por exemplo, às vezes precisamos do comportamento oposto de um if-then: executar um bloco de código somente se a condição for false.

boolean hasPrerequisite = false;

if (hasPrerequisite) {
  // do nothing
} else {
  System.out.println("Must complete prerequisite course!");
}

Este código faz o que queremos, mas é estranho ter um bloco de código que não faz nada!

O operador lógico NOT limpa nosso exemplo:

boolean hasPrerequisite = false;

if (!hasPrerequisite) {
  System.out.println("Must complete prerequisite course!");
}

Podemos escrever uma declaração condicional sucinta sem um bloco de código vazio.

Instruções
Checkpoint 1 Passed
1 .
Vamos tornar informUser()mais informativo. Se a reserva deles não for confirmada, eles devem saber!

Escreva uma if-then-elsedeclaração e use !with isConfirmedcomo condição.

Caso a reserva não seja confirmada, escrevaUnable to confirm reservation, please contact restaurant.

Caso contrário, escreva:Please enjoy your meal!