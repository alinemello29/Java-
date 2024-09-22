CONDICIONAIS E FLUXO DE CONTROLE
Declaração If-Then
4 minutos
A declaração if-then é o fluxo de controle mais simples que podemos escrever. Ela testa uma expressão para veracidade e executa algum código baseado nela.

if (flip == 1) {

  System.out.println("Heads!");

}

A ifpalavra-chave marca o início da declaração condicional, seguida por parênteses ().
Os parênteses contêm um booleantipo de dado.
Para a condição entre parênteses, também podemos usar variáveis ​​que fazem referência a um booleano ou comparações que são avaliadas como um booleano.

A condição booleana é seguida por chaves de abertura e fechamento que marcam um bloco de código. Este bloco é executado se, e somente se, o booleano for true.

boolean isValidPassword = true;

if (isValidPassword) {

  System.out.println("Password accepted!");

}

// Prints "Password accepted!"

int numberOfItemsInCart = 9;

if (numberOfItemsInCart > 12) {

  System.out.println("Express checkout not available");

}

// Nothing is printed.

Se uma condicional for breve, podemos omitir as chaves completamente:

if (true) System.out.println("Brevity is the soul of wit");

Observação: instruções condicionais não terminam com ponto e vírgula.

Instruções
Checkpoint 1 Passed
1 .
O editor de código contém uma Orderclasse para rastrear remessas de varejo.

Escreva uma if-theninstrução que imprima High value item!quando itemCostfor maior que 24.00.