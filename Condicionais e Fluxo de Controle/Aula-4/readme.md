CONDICIONAIS E FLUXO DE CONTROLE
Se-Então-Senão-Se
10 minutos
A estrutura condicional que aprendemos pode ser encadeada para verificar quantas condições forem necessárias pelo nosso programa.

Imagine que nosso programa agora está selecionando o curso apropriado para um aluno. Verificaremos o envio dele para encontrar a matrícula correta no curso.

A declaração condicional agora tem várias condições que são avaliadas de cima para baixo:

String course = "Theatre";

if (course.equals("Biology")) {

  // Enroll in Biology course

} else if (course.equals("Algebra")) {

  // Enroll in Algebra course

} else if (course.equals("Theatre")) {

  // Enroll in Theatre course

} else {

  System.out.println("Course not found!");

}

A primeira condição a ser avaliada trueterá aquele bloco de código executado. Aqui está um exemplo demonstrando a ordem:

int testScore = 72;

if (testScore >= 90) {

  System.out.println("A");

} else if (testScore >= 80) {

  System.out.println("B");

} else if (testScore >= 70) {

  System.out.println("C");

} else if (testScore >= 60) {

  System.out.println("D");

} else {

  System.out.println("F");

}
// prints: C

Esta declaração condicional encadeada tem duas condições que avaliam true. Como testScore >= 70vem antes de testScore >= 60, apenas o bloco de código anterior é executado.

Observação: somente um dos blocos de código será executado.

Instruções
Checkpoint 1 Passed
1 .
Precisamos calcular os custos de envio dos nossos pedidos.

Há um novo campo de instância, String shipping, que usamos para calcular o custo.

Use um encadeado if-then-elsepara verificar valores diferentes dentro do calculateShipping()método.

Quando o shippingcampo de instância for igual a "Regular", o método deverá retornar 0.

Quando o shippingcampo de instância for igual a "Express", o método deverá retornar 1.75.

Caso contrário, o método deve retornar .50.