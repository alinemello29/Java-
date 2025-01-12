## MÉTODOS DE STRING

paraMaiúsculas() / paraMaiúsculas()

Haverá momentos em que teremos uma palavra em um caso diferente daquele em que precisamos. Felizmente, Java tem algunsString 
Visualização: Descrição do link de carregamento de documentos
métodos
para nos ajudar:

Visualização: Descrição do link de carregamento de documentos
toUpperCase()
: retorna o valor da string convertido para maiúsculas
Visualização: Descrição do link de carregamento de documentos
toLowerCase()
: retorna o valor da string convertido para minúsculas
Por exemplo:

String input = "Cricket!";

String upper = input.toUpperCase();
// stores "CRICKET!"

String lower = input.toLowerCase();
// stores "cricket!"

Copy to Clipboard

Um bom uso dessa funcionalidade é garantir a consistência dos dados que você armazena em um banco de dados. Certificar-se de que todos os dados que você obtém de um usuário estejam em letras minúsculas antes de armazená-los em seu banco de dados tornará seu banco de dados mais fácil de pesquisar mais tarde.

Instruções
Checkpoint 1 Passed
1 .
Em Hashtag.java , use toLowerCase()para imprimir a versão em minúsculas de hashtag.


