CONDICIONAIS E FLUXO DE CONTROLE
Se-Então-Senão
4 minutos
Vimos como executar condicionalmente um bloco de código, mas e se houver dois blocos de código possíveis que gostaríamos de executar?

Digamos que um aluno tenha o pré-requisito necessário e se matricule no curso selecionado; caso contrário, ele será matriculado no curso pré-requisito.

Criamos um ramo condicional alternativo com a elsepalavra-chave:

if (hasPrerequisite) {

  // Enroll in course

} else {

  // Enroll in prerequisite

}

Esta declaração condicional garante que exatamente um bloco de código será executado. Se a condição, hasPrerequisite, for false, o bloco depois elseserá executado.

Agora há dois blocos de código separados em nossa declaração condicional. O primeiro bloco é executado se a condição for avaliada como true, o segundo bloco é executado se a condição for avaliada como false.

Este código também é chamado de instrução if-then-else :

Se a condição for verdadeira, então faça alguma coisa.
Caso contrário, faça algo diferente.
Instruções
Checkpoint 1 Passed
1 .
No editor de código, há um isFilledvalor que representa se o pedido está pronto para envio.

Escreva uma instrução if-then-else que:

Quando isFilledé true, imprima Shipping.
Quando isFilledé false, imprima Order not ready.