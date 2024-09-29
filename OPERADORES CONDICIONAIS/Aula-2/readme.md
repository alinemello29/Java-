OPERADORES CONDICIONAIS
Condicional-E: &&
10 minutos
Vamos retornar ao nosso programa de matrícula de alunos. Adicionamos um requisito adicional: os alunos não só devem ter o pré-requisito, mas suas mensalidades também devem estar pagas. Temos duas condições que devem ser atendidas trueantes de matricularmos o aluno.

Aqui está uma maneira de escrever o código:

if (tuitionPaid) {
  if (hasPrerequisite) {
    // enroll student
  }
}

Aninhamos duas if-theninstruções. Isso faz o trabalho, mas podemos ser mais concisos com o operador AND :

if (tuitionPaid && hasPrerequisite) {
  // enroll student
}

O operador AND, &&, é usado entre dois valores booleanos e é avaliado como um único valor booleano. Se os valores em ambos os lados forem true, então o valor resultante será true, caso contrário, o valor resultante será false.

Este código ilustra cada combinação:

true && true
// true
false && true
// false
true && false
// false
false && false
// false

Instruções
Checkpoint 1 Passed
1 .
Nossa Reservationclasse tem o método confirmReservation()que valida se um restaurante pode acomodar uma determinada reserva.

Precisamos construir a lógica condicional confirmReservation()usando três variáveis ​​de instância:

restaurantCapacity
guestCount
isRestaurantOpen
Use uma if-then-elsedeclaração:

Se restaurantCapacityfor maior ou igual a guestCount e o restaurante estiver aberto, imprima "Reservation confirmed"e defina isConfirmedcomo true.

elseimprimir "Reservation denied"e definir isConfirmedcomo false.

Nota: Por enquanto, o informUser()método sempre imprimirá "Please enjoy your meal"mesmo que a reserva não tenha sido confirmada. Modificaremos esse método em um exercício futuro!