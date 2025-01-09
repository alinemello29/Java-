## MÉTODOS DE STRING

índiceDe()

Se quisermos saber o índice da primeira ocorrência de um caractere em uma string, podemos usar o
Preview content is loading
indexOf()
método em uma string.

Lembre-se de que os índices em Java começam com 0:

String letters = "ABCDEFGHIJKLMN";

System.out.println(letters.indexOf("C"));

Copy to Clipboard

Isso seria
Visualização: Descrição do link de carregamento de documentos
saída
 2.

Embora Cseja a terceira letra do alfabeto inglês, ela está localizada no segundo índice da string.

Suponha que queremos saber o índice da primeira ocorrência de uma substring inteira. O indexOf()método de instância também pode retornar onde a substring começa (o índice do primeiro caractere na substring):

String letters = "ABCDEFGHIJKLMN";

System.out.println(letters.indexOf("EFG"));

Copy to Clipboard

Isso produziria 4, porque EFGcomeça no índice 4.

Se o indexOf()não encontrar o que procura, ele retornará um -1.

Instruções
Checkpoint 1 Passed
1 .
Em MorseCode.java , há uma string chamada codeque tem alguns caracteres engraçados.

Encontre o índice onde a substring . .- -(que significa “comer”) começa!