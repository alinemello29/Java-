APRENDA JAVA: ARRAYS
Importando matrizes
7 minutos
Quando imprimimos o array que criamos no último exercício, vimos um endereço de memória que não nos ajudou a entender o que estava contido no array.

Se quisermos ter uma impressão mais descritiva do próprio array, precisamos de um toString()método fornecido pelo
Visualização: Descrição do link de carregamento de documentos
Arrays
 pacote em Java.

import java.util.Arrays;

Colocamos isso no topo do arquivo, antes mesmo de definir a classe!

Quando importamos um pacote em Java, estamos fazendo todo o
Visualização: Descrição do link de carregamento de documentos
métodos
desse pacote disponível em nosso código.

O Arrayspacote tem muitos métodos úteis, incluindo Arrays.toString(). Quando passamos um array para Arrays.toString(), podemos ver o conteúdo do array impresso:

import java.util.Arrays;

public class Lottery(){
  
  public static void main(String[] args){
    int[] lotteryNumbers = {4, 8, 15, 16, 23, 42};
    String betterPrintout = Arrays.toString(lotteryNumbers);
    System.out.println(betterPrintout);
  }

}

Este código imprimirá:

[4, 8, 15, 16, 23, 42]

Instruções
Ponto de verificação 1 aprovado
1 .
Se você executar o código agora, verá algo assim: [Ljava.lang.String;@2aae9190.

Este é o endereço de memória do array e não o Stringarray propriamente dito.

Para fazer o código imprimir os elementos reais, use o toString()método do Arrayspacote.

Importe o Arrayspacote do java.utiltopo do arquivo Main.java .

Ponto de verificação 2 aprovado
2 .
Agora, use o toString()método do Arrayspacote para imprimir o array topicsno main()método Main.java .