APRENDA JAVA: ARRAYLISTS
Criando ArrayLists
6 minutos
Para criar um ArrayList, precisamos declarar o tipo de objetos que ele conterá, assim como fazemos com arrays:

ArrayList<String> babyNames;

Usamos colchetes angulares <e >para declarar o tipo do ArrayList. Esses símbolos são usados ​​para genéricos . Genéricos são uma construção Java que nos permite definir classes e objetos como parâmetros de um ArrayList. Por esse motivo, não podemos usar tipos primitivos em um ArrayList:

// This code won't compile:
ArrayList<int> ages;

// This code will compile:
ArrayList<Integer> ages;

O <Integer>genérico tem que ser usado em an ArrayListem vez disso. Você também pode usar <Double>and <Character>para tipos que normalmente declararia como doubles ou chars.

Podemos inicializar para um vazio ArrayListusando a newpalavra-chave:

// Declaring:
ArrayList<Integer> ages;
// Initializing:
ages = new ArrayList<Integer>();

// Declaring and initializing in one line:
ArrayList<String> babyNames = new ArrayList<String>();

Instruções
Checkpoint 1 Passed
1 .
Importe o ArrayListpacote de java.util.

Ponto de verificação 2 aprovado
2 .
Crie um novo ArrayListque conterá Stringelementos e chame-o de toDoList.