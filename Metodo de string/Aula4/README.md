## MÉTODOS DE STRING

é igual a()

Com objetos, como Strings, não podemos usar o operador de igualdade primitivo ==para verificar a igualdade entre duas strings. Para testar a igualdade com strings, usamos um método interno chamado
Visualização: Descrição do link de carregamento de documentos
equals()
.

Por exemplo:

String flavor1 = "Mango";
String flavor2 = "Peach";

System.out.println(flavor1.equals("Mango"));
// prints true

System.out.println(flavor2.equals("Mango"));
// prints false

Copy to Clipboard

Nota lateral, há também uma
Visualização: Descrição do link de carregamento de documentos
equalsIgnoreCase()
método que compara duas strings sem considerar letras maiúsculas/minúsculas.

Continue lendo: Alunos do curso de Ciência da Computação A da AP

Também podemos comparar Stringvalores lexicograficamente (pense na ordem do dicionário) usando o
Visualização: Descrição do link de carregamento de documentos
.compareTo()
método. Quando chamamos o .compareTo()método, cada caractere no Stringé convertido para Unicode; então o caractere Unicode de cada um Stringé comparado.

O método retornará um intque representa a diferença entre as duas Strings.

Por exemplo:

String flavor1 = "Mango";
String flavor2 = "Peach";

System.out.println(flavor1.compareTo(flavor2)); 

Copy to Clipboard

Nosso programa acima irá
Visualização: Descrição do link de carregamento de documentos
saída
 -3.

Quando usamos .compareTo(), devemos prestar atenção ao valor de retorno:

Se o método retornar 0, os dois Strings serão iguais.
Se o valor for menor que 0, então o Stringobjeto será lexicograficamente menor que o Stringargumento do objeto.
Se o valor for maior que 0, então o Stringobjeto será lexicograficamente maior que o Stringargumento do objeto.
No exemplo acima, "Mango"vem antes de "Peach", então obtemos um número negativo (obtemos especificamente -3porque os valores Unicode de "M"e "P"diferem por 3). Se fizéssemos flavor2.compareTo(flavor1), obteríamos 3, significando que "Peach"é maior que "Mango".

Nota: Certifique-se de prestar atenção à capitalização ao usar .compareTo(). Letras maiúsculas e minúsculas têm valores Unicode diferentes. Por exemplo, ao comparar "Mango"e "Peach", obtivemos -3, o que significa que "Mango"era menor. Mas se compararmos "mango"e "Peach"obtemos 29. O valor Unicode para minúsculas "m"é, na verdade, maior do que para maiúsculas "P". Usando
Visualização: Descrição do link de carregamento de documentos
.compareToIgnoreCase()
executará a mesma tarefa, mas não considerará letras maiúsculas/minúsculas.

Instruções
Checkpoint 1 Passed
1 .
Em Password.java , há um passwordcom valor de "correcthorsebatterystaple".

Use equals()para imprimir se é o mesmo que outra string.
