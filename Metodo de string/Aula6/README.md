## MÉTODOS DE STRING

charAt()

O
Preview: Docs Loading link description
charAt()
O método retorna o caractere localizado no Stringíndice especificado de um .

Por exemplo:

String str = "qwer";

System.out.println(str.charAt(2));

Copy to Clipboard

Seria
Visualização: Descrição do link de carregamento de documentos
saída
 eporque é isso que está no índice 2. (Mais uma vez, os índices começam com 0.)

Suponha que tentamos retornar o caractere localizado no índice 4. Isso produziria um IndexOutOfBoundsExceptionerro porque o índice 4 está fora do strintervalo de :

java.lang.StringIndexOutOfBoundsException: String index out of range: 4
Instruções
Ponto de verificação 1 aprovado
1 .
Em Initials.java , adicione seu primeiro nome e sobrenome.

Ponto de verificação 2 aprovado
2 .
Imprima as iniciais de firstNamee lastName.