CONDICIONAIS E FLUXO DE CONTROLE
Introdução ao Fluxo de Controle
1 minuto
Imagine que estamos escrevendo um programa que matricula alunos em cursos.

Se um aluno tiver concluído os pré-requisitos, ele poderá se matricular em um curso.
Caso contrário , eles precisam fazer os cursos pré-requisitos.
Eles não podem cursar Física II sem terminar Física I.

Representamos esse tipo de tomada de decisão em nosso programa usando instruções de fluxo de controle ou condicionais . Antes desse ponto, nosso código roda linha por linha de cima para baixo, mas instruções condicionais nos permitem ser seletivos em quais partes serão executadas.

As instruções condicionais verificam uma booleancondição e executam um bloco de código dependendo da condição. Chaves curvas marcam o escopo de um bloco condicional semelhante a um método ou classe.

Aqui está uma declaração condicional completa:

if (true) {

  System.out.println("Hello World!");

}

Se a condição for true, então o bloco é executado. Então Hello World!é impresso.

Mas suponha que a condição seja diferente:

if (false) {

  System.out.println("Hello World!");

}

Se a condição for false, o bloco não será executado.

Este código também é chamado de instruções if-then : “Se (condition)for true, então faça alguma coisa”.