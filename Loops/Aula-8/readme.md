Loops para cada
8 minutos
Às vezes, precisamos acessar os índices dos elementos ou queremos apenas iterar por uma parte de uma lista. Se esse for o caso, um forloop regular ou whileloop é uma ótima escolha.

Por exemplo, podemos usar um forloop para imprimir cada elemento em uma matriz chamada inventoryItems:

for (int inventoryItem = 0; inventoryItem < inventoryItems.length; inventoryItem++) {
  // Print element at current index
  System.out.println(inventoryItems[inventoryItem]);
}

Mas às vezes não nos importamos nem um pouco com os índices; só nos importamos com o elemento em si.

Em momentos como este, para cada
Visualização: Descrição do link de carregamento de documentos
laços
ser útil.

Os loops for-each , também conhecidos como loops aprimorados , nos permitem percorrer diretamente cada item em uma lista de itens (como uma matriz ou
Visualização: Descrição do link de carregamento de documentos
ArrayList
) e executar alguma ação com cada item.

Se quisermos usar um loop for-ach para reescrever nosso programa acima, a sintaxe ficará assim:

for (String inventoryItem : inventoryItems) {
  // Print element value
  System.out.println(inventoryItem);

}

Nosso loop aprimorado contém dois itens: uma forvariável de loop aprimorado ( inventoryItem) e uma lista para percorrer ( inventoryItems).

Podemos ler o :como “in” assim: para cada inventoryItem(que deve ser um String) em inventoryItems, imprima inventoryItem.

Se tentarmos atribuir um novo valor à forvariável de loop aprimorada, o valor armazenado no array ou ArrayListnão mudará. Isso ocorre porque, para cada iteração no loop aprimorado, a variável de loop recebe uma cópia do elemento da lista.

Nota: Podemos nomear a forvariável de loop aprimorada como quisermos; usar o singular de um plural é apenas uma convenção. Também podemos encontrar convenções como String word : sentence.

Instruções
Ponto de verificação 1 aprovado
1 .
Vamos usar um loop for-each para encontrar o item mais caro em expenses.

Crie um loop for-each que itere por each expenseem expenses. Por enquanto, deixe o corpo do loop vazio.

Ponto de verificação 2 aprovado
2 .
Dentro do loop for-ach, verifique se expenseé maior que mostExpensive.

Se for, defina mostExpensivecomo igual a expense.