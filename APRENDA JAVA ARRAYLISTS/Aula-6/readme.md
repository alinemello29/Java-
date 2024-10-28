APRENDA JAVA: ARRAYLISTS
Alterando um valor
5 minutos
Quando estávamos usando
Visualização: Descrição do link de carregamento de documentos
matrizes
, poderíamos reescrever entradas usando a notação de colchetes para reatribuir valores:

String[] shoppingCart = {"Trench Coat", "Tweed Houndstooth Hat", "Magnifying Glass"};

shoppingCart[0] = "Tweed Cape";

// shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]

Preview: Docs Loading link description
ArrayList
tem uma maneira um pouco diferente de fazer isso, usando o set()método:

ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

shoppingCart.set(0, "Tweed Cape");

// shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]

Instruções
Checkpoint 1 Passed
1 .
Modifique sherlocksToDospara que o valor em "play violin"se torne "listen to Dr. Watson for amusement".

Ponto de verificação 2 aprovado
2 .
Modifique poirotsToDospara que o valor em "trim mustache"se torne "listen to Captain Hastings for amusement".