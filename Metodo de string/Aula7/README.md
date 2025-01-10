## MÉTODOS DE STRING

substring()

Pode haver momentos em que queremos apenas uma parte de uma string. Em tais casos, podemos querer extrair uma substring de uma string.

O
Preview: Docs Loading link description
substring()
método faz exatamente isso. Por exemplo:

String line = "The Heav'ns and all the Constellations rung";

System.out.println(line.substring(24));

Copy to Clipboard

Seria
Visualização: Descrição do link de carregamento de documentos
saída
 Constellations rungporque é o que começa no índice 24 e termina no final de line. A substring começa com o caractere no índice especificado e se estende até o final da string.

Suponha que queremos uma substring do meio da string. Em vez disso, podemos incluir dois argumentos neste método. Por exemplo:

String line = "The Heav'ns and all the Constellations rung";

System.out.println(line.substring(27, 33));

Copy to Clipboard

Quando substring()é chamado com dois argumentos, o primeiro argumento é inclusivo e o segundo é exclusivo . Isso significa que a substring resultante começará no índice 27 e se estenderá até, mas não incluindo, o índice 33. Portanto, o exemplo acima produziria stellaporque essa é a substring que começa no índice 27 e termina no índice 32, um índice antes de 33.

Podemos usar esse método para retornar uma substring de elemento único em um índice específico. Fazemos isso chamando substring()com o valor de índice desejado como o primeiro argumento e então o valor de índice mais um como o segundo argumento.

Por exemplo, podemos usar este método para produzir apenas C:

String line = "The Heav'ns and all the Constellations rung";

System.out.println(line.substring(24, 25));
// Prints: C

Copy to Clipboard

Instruções
Checkpoint 1 Passed
1 .
Altere os argumentos do line.substring()método para que ele imprima Heav'ns.
