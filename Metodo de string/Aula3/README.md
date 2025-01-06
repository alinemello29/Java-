## MÉTODOS DE STRING

concat()

O
Visualização: Descrição do link de carregamento de documentos
concat()
método concatena uma string ao final de outra string. Concatenação é a operação de juntar duas strings.

Suponha que temos um Stringchamado str1e outro Stringchamado str2, usando str1.concat(str2)retornaria str1com str2anexado ao final dele.

Por exemplo:

String name = new String("Code");

name = name.concat("cademy");

System.out.println(name);

Copy to Clipboard

Codecademyseria impresso.

Strings são objetos imutáveis, o que significa queString 
Visualização: Descrição do link de carregamento de documentos
métodos
, como concat()não alterar realmente um Stringobjeto.

Nossa variável, namecontém uma referência ao Stringobjeto, "Code". Quando usamos concat()on name, mudamos seu valor para que ele faça referência a um novo objeto — "Code", combinado com o literal String, "cademy".

Suponha que façamos algo ligeiramente diferente. Usaremos concat()on namesem reatribuir seu valor:

String name = "Code";

name.concat("cademy");

System.out.println(name);

Copy to Clipboard

Codeseria impresso em vez disso. O valor do Stringnão pode mudar! Em vez disso, criamos um novo objeto e precisamos atribuir esse novo objeto a alguma variável.

Continue lendo: Alunos do curso de Ciência da Computação A da AP

Quando discutimos Objetos pela primeira vez, aprendemos que se tentássemos imprimir um Objeto, obteríamos um
Visualização: Descrição do link de carregamento de documentos
saída
do nome da classe e do endereço de memória do Objeto. Se quiséssemos obter uma impressão mais útil, teríamos que chamar o toString()método do Objeto.

Este toString()método entra em jogo com concat(). Se concatenarmos uma String com outro Object, estamos realmente adicionando o resultado do toString()método daquele Object à nossa String original. Podemos até ver isso quando concatenamos duas Strings juntas (lembre-se de que uma String é um Object). Quando usamos concat()em outra String, não concatenamos seu endereço de memória à String original. Em vez disso, combinamos o resultado de seu toString()método à String original.

Você pode relembrar o toString()método neste exercício .

Instruções
Ponto de verificação 1 aprovado
1 .
Armazene seu primeiro nome em firstNamee seu sobrenome em lastName.

Imprima seu nome completo usando concat().

