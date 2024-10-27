APRENDA JAVA: ARRAYLISTS
Acessando um índice
4 minutos
Digamos que temos um
Visualização: Descrição do link de carregamento de documentos
matrizes
, podemos usar a notação de colchetes para acessar um valor em um índice específico:

double[] ratings = {3.2, 2.5, 1.7};

System.out.println(ratings[1]);

Este código imprime 2.5, o valor no índice 1do array.

Para
Visualização: Descrição do link de carregamento de documentos
ArrayList
s, a notação de colchetes não funcionará. Em vez disso, usamos o método get()para acessar um índice:

ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

System.out.println(shoppingCart.get(2));

Este código imprime "Magnifying Glass", que é o valor no índice 2 do ArrayList.

Instruções
Checkpoint 1 Passed
1 .
Use get()para acessar o terceiro elemento de tarefa sherlocksToDose imprimir o resultado.

Ponto de verificação 2 aprovado
2 .
Use get()para acessar o segundo elemento de tarefa poirotsToDose imprimir o resultado.