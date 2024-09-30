OPERADORES CONDICIONAIS
Condicional-Ou: ||
6 minutos
Os requisitos do nosso programa de matrícula mudaram novamente. Certos cursos têm pré-requisitos que são satisfeitos por vários cursos. Desde que os alunos tenham feito pelo menos um pré-requisito, eles devem ser autorizados a se matricular.

Aqui está uma maneira de escrever o código:

if (hasAlgebraPrerequisite) {
  // Enroll in course
}

if (hasGeometryPrerequisite) {
  // Enroll in course
}

Estamos usando duas if-thendeclarações diferentes com o mesmo bloco de código . Podemos ser mais concisos com o operador OR :

if (hasAlgebraPrerequisite || hasGeometryPrerequisite) {
  // Enroll in course
}

O operador OR, ||, é usado entre dois valores booleanos e é avaliado como um único valor booleano. Se qualquer um dos dois valores for true, então o valor resultante é true, caso contrário, o valor resultante é false.

Este código ilustra cada combinação:

true || true
// true
false || true
// true
true || false
// true
false || false
// false

Continue lendo: Alunos do curso de Ciência da Computação A da AP

Em algumas ocasiões, o compilador pode determinar o valor verdade de uma expressão lógica avaliando apenas o primeiro booleanoperando; isso é conhecido como avaliação em curto-circuito . A avaliação em curto-circuito só funciona com expressões que usam &&ou ||.

Em uma expressão que usa ||, o valor resultante será truetão longo quanto um dos operandos tiver um truevalor. Se o primeiro operando de uma expressão for true, não precisamos ver qual é o valor do outro operando para saber que o valor final também será true.

Por exemplo, podemos executar o código a seguir sem erro, apesar de dividir um número por 0no segundo operando porque o primeiro operando tinha um truevalor:

if (1 > 0 || 2 / 0 == 7) {
  System.out.println("No errors here!");
}

Uma expressão que usa &&só resultará em truese ambos os operandos forem true. Se o primeiro operando na expressão for false, o valor inteiro será false.

Instruções
Checkpoint 1 Passed
1 .
Vamos escrever uma mensagem dentro do Reservation()construtor que avise sobre entradas incorretas.

Nossos restaurantes não podem acomodar grupos com mais de 8pessoas, e não queremos reservas para pessoas 0menores ou iguais, porque isso seria bobagem.

Dentro de Reservation(), escreva uma condicional que use ||.

Se countfor menor que 1 OU maior que 8queremos escrever a seguinte mensagem: Invalid reservation!.