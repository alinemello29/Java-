APRENDA JAVA: ARRAYLISTS
Tamanho da ArrayList
6 minutos
Digamos que temos um
Visualização: Descrição do link de carregamento de documentos
ArrayList
que armazena itens no carrinho de compras online do usuário. Conforme o usuário navega pelo site e adiciona itens, seu carrinho fica cada vez maior.

Se quiséssemos exibir o número de itens no carrinho, poderíamos descobrir o tamanho dele usando o size()método:

ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
System.out.println(shoppingCart.size());
// 1 is printed
shoppingCart.add("Tweed Houndstooth Hat");
System.out.println(shoppingCart.size());
// 2 is printed
shoppingCart.add("Magnifying Glass");
System.out.println(shoppingCart.size());
// 3 is printed

Em objetos dinâmicos como ArrayLists, é importante saber como acessar a quantidade de objetos que armazenamos.

Instruções
Ponto de verificação 1 aprovado
1 .
Os detetives fazem muito para resolver um caso. Mas quem tem mais a fazer?

Imprima o tamanho da tarefa de cada detetive ArrayList:

sherlocksToDospara Sherlock Holmes
poirotsToDospara Hercule Poirot
Ponto de verificação 2 aprovado
2 .
Então, quem tem mais a fazer? Imprima o nome do detetive cuja lista de afazeres é maior. Era Sherlock ou Poirot?