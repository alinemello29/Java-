<h1>APRENDA JAVA: VARIÁVEIS</h1>

<h2>String</h2>

<p>Até agora, aprendemos os tipos de dados primitivos , que são os tipos de dados mais simples, sem comportamento integrado. Nossos programas também usarão Strings, que são objetos , em vez de primitivos. Os objetos têm comportamento integrado.</p>

<p>Strings contém sequências de caracteres. Já vimos instâncias de a String, por exemplo, quando imprimimos "Hello World". Existem duas maneiras de criar um Stringobjeto: usando um Stringliteral ou chamando a Stringclasse para criar um novo Stringobjeto.</p>

<p>Um literal de String é qualquer sequência de caracteres entre aspas duplas ( ""). Assim como as variáveis ​​de tipo primitivo , declaramos uma Stringvariável especificando primeiro o tipo:</p>

<img src="java1.png">

<p>Também poderíamos criar um novo objeto String chamando a Stringclasse ao declarar algo Stringassim:</p>

<img src="java2.png">

<p>Existem diferenças sutis no comportamento dependendo se você cria um Stringobjeto Stringliteral ou novo String. Iremos nos aprofundar nisso mais tarde, mas por enquanto, quase sempre usaremos Stringliterais.</p>

<p>Continue lendo: Alunos AP de Ciência da Computação A</p>

<p>Certos símbolos, conhecidos como sequências de escape, têm um uso alternativo em instruções de impressão Java. As sequências de escape são interpretadas de maneira diferente pelo compilador do que outros caracteres. Os caracteres de escape começam com o caractere \.</p>

<p>Existem três sequências de escape que você deve conhecer no exame AP.</p>

<p>A \"sequência de escape nos permite adicionar aspas "a um Stringvalor. :</p>

<img src="java3.png">

<p>Se não usássemos uma sequência de escape, Java pensaria que estamos usando "para finalizar a String!</p>

<p>Usar a \\sequência de escape nos permite colocar barras invertidas em nosso Stringtexto:</p>

<img src="java4.png">

<p>Isto é semelhante ao último exemplo - assim como ", \geralmente tem um significado especial. Neste caso, \é usado para iniciar uma sequência de escape. Bem, se não quisermos iniciar uma sequência de escape e quisermos apenas a \em nossa String, então usaremos \\- estamos usando uma sequência de escape para dizer que não queremos \ser interpretados como o início de uma sequência de escape. sequência de fuga. É um pouco alucinante!</p>

<p>Finalmente, se colocarmos uma \nsequência de escape em a String, o compilador produzirá uma nova linha de texto:</p>

<img src="java5.png">

<p>Você pode pensar nisso \ncomo a sequência de escape para “nova linha”.</p>

<h1>Instruções</h1>

<p>Ponto de verificação 1 ativado
1 .
Crie uma variável chamada openingLyricsque tenha um valor de:"Yesterday, all my troubles seemed so far away"
</p>
