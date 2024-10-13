APRENDA JAVA: ARRAYS
Comprimento
3 minutos
E se tivermos um array armazenando todos os nomes de usuários para nosso programa, e quisermos ver rapidamente quantos usuários temos? Para obter o comprimento de um array, podemos acessar o lengthcampo do objeto array:

String[] menuItems = new String[5];
System.out.println(menuItems.length);

Este comando imprimiria 5, já que o menuItemsarray tem 5slots, mesmo que todos estejam vazios.

Se imprimirmos o comprimento do pricesarray:

double[] prices = {13.1, 15.87, 14.22, 16.66};

System.out.println(prices.length);

Veríamos 4, já que há quatro itens na pricesmatriz!

Instruções
Checkpoint 1 Passed
1 .
Criamos um método getNumTopics()para buscar quantos tópicos existem no array.

Dentro de getNumTopics(), retorne o comprimento do topicsarray.