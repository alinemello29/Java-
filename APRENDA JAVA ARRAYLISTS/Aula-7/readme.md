APRENDA JAVA: ARRAYLISTS
Removendo um item
4 minutos
E se quiséssemos nos livrar de uma entrada completamente? Para
Visualização: Descrição do link de carregamento de documentos
matrizes
, teríamos que criar um array completamente novo sem o valor.

Felizmente, ArrayLists nos permite remover um item especificando o índice para
Preview: Docs Removes a specified element from an ArrayList.
remover
:

ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

shoppingCart.remove(1);
// shoppingCart now holds ["Trench Coat", "Magnifying Glass"]

Também podemos remover um item especificando o valor a ser removido:

ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

shoppingCart.remove("Trench Coat");
// shoppingCart now holds ["Tweed Houndstooth Hat", "Magnifying Glass"]

Nota: Este comando remove a PRIMEIRA instância do valor "Trench Coat".

Instruções
Checkpoint 1 Passed
1 .
Sherlock Holmes e Hercule Poirot já visitaram suas respectivas cenas de crime.

Remova "visit the crime scene"de sherlocksToDose poirotsToDosusando remove().

Além disso, Sherlock Holmes também tocou um pouco de violino.

Então você pode remover "play violin"também sherlocksToDos.