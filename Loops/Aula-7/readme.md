quebrar e continuar
9 minutos
Se quisermos sair de um loop antes que ele termine todas as suas iterações ou quisermos pular uma das iterações, podemos usar as palavras-chave breake continue.

A breakpalavra-chave é usada para sair, ou quebrar, um loop. Uma vez breakexecutado, o loop parará de iterar. Por exemplo:

for (int i = 0; i < 10; i++) {
  System.out.println(i);
  if (i == 4) {
    break;
  }
}

Mesmo que o loop tenha sido definido para iterar até que a condição i < 10seja false, o código acima irá
Visualização: Descrição do link de carregamento de documentos
saída
o seguinte porque usamos break:

0
1
2
3
4

A continuepalavra-chave pode ser colocada dentro de um loop se quisermos pular uma iteração. Se continuefor executado, a iteração atual do loop terminará imediatamente, e a próxima iteração começará. Podemos usar a continuepalavra-chave para pular qualquer iteração de valor par:

int[] numbers = {1, 2, 3, 4, 5};
    
for (int i = 0; i < numbers.length; i++) {
  if (numbers[i] % 2 == 0) {
    continue;
  }
  System.out.println(numbers[i]);
}

Este programa produziria o seguinte:

1
3
5

Neste caso, se um número for par, atingimos uma continuedeclaração, que pula o resto daquela iteração, então a declaração print é pulada. Como resultado, vemos apenas números ímpares impressos.

Continue lendo: Alunos do curso de Ciência da Computação A da AP

Loops podem existir em todo o nosso código - inclusive dentro de um método. Se a returnpalavra-chave fosse executada dentro de um loop contido em um método, então a iteração do loop seria interrompida e o método/construtor seria encerrado.

Por exemplo, temos um método chamado checkForJacket()que recebe um array de Strings. Se algum dos elementos for equivalente ao Stringvalor "jacket", o método retornará true:

public static boolean checkForJacket(String[] lst) {
  for (int i = 0; i < lst.length; i++) {
    System.out.println(lst[i]);
    if (lst[i] == "jacket") {
      return true;
    }
  }
  return false;
} 

public static void main(String[] args) {
  String[] suitcase = {"shirt", "jacket", "pants", "socks"};   
  System.out.println(checkForJacket(suitcase));
}

Assim que um elemento for igual a "jacket", return true;é executado. Isso faz com que o loop pare e o
Visualização: Descrição do link de carregamento de documentos
compilador
para sair checkForJacket(). Executar este código produziria o seguinte:

shirt
jacket
true

Instruções
Checkpoint 1 Passed
1 .
Dê uma olhada no forloop no editor de código. Ele começa sua iteração em 0e continua a iterar até i < 100que seja false.

Dentro do loop, crie uma condição que verifica se nãoi é divisível por . Se a condição for , pule a iteração. Fora da declaração de condição, imprima . A solução final não deve conter uma declaração.5trueielse

Os únicos números que devem ser impressos são aqueles que são divisíveis por 5!