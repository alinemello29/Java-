APRENDA JAVA: ARRAYS
Argumentos String[]
9 minutos
Quando escrevemosmain() 
Visualização: Descrição do link de carregamento de documentos
métodos
para nossos programas, usamos o parâmetro String[] args. Agora que sabemos sobre a sintaxe de array, podemos começar a analisar o que isso significa.

A String[]é uma matriz composta de Strings. Exemplos de Stringmatrizes:

String[] humans = {"Talesha", "Gareth", "Cassie", "Alex"};
String[] robots = {"R2D2", "Marvin", "Bender", "Ava"};

O argsparâmetro é outro exemplo de Stringarray. Neste caso, o array argscontém os argumentos que passamos do terminal quando executamos o arquivo de classe. (Até agora, argstem estado vazio.)

Então como você pode passar argumentos para main()? Digamos que temos esta classe HelloYou:

public class HelloYou {
  public static void main(String[] args) {
    System.out.println("Hello " + args[0]);  
  }
}

Quando executamos o arquivo HelloYouno terminal com um argumento de "Laura":

java HelloYou Laura

Obtemos a saída:

Hello Laura

O String[] argsseria interpretado como uma matriz com um elemento, "Laura".

Quando usamos args[0]o método main, podemos acessar esse elemento como fizemos em HelloYou.

Instruções
Ponto de verificação 1 aprovado
1 .
Vamos fazer com que os usuários tenham a opção de personalizar o objeto Newsfeed para robôs ou humanos.

O main()em Main.java aceitará “Robot” ou “Human” como argumento quando executarmos o arquivo.

Se o args[0]array contiver “Humano”, inicializaremos o feed com tópicos humanos.

Se o args[0]array contiver “Robot”, inicializaremos o feed com tópicos de robôs.

Na instrução condicional na linha 6, substitua o espaço em branco para verificar se argstem o valor Robotou não.

Ponto de verificação 2 aprovado
2 .
No terminal, execute o Main.java com o argumento Robot.

Nota: Não use aspas para o argumento. Passar “Robot” como argumento não funcionará.

Ponto de verificação 3 aprovado
3 .
Agora, execute o arquivo Main.java com o argumento Human.

Nota: Não use aspas para o argumento. Passar “Human” como argumento não funcionará.