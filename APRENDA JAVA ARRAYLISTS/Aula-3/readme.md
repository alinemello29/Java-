APRENDA JAVA: ARRAYLISTS
Adicionando um item
8 minutos
Agora temos um vazio ArrayList, mas como fazemos para que ele armazene valores?

ArrayListvem com um
Visualização: Descrição do link de carregamento de documentos
add()
método que insere um elemento na estrutura. Existem duas maneiras de usar add().

Se quisermos adicionar um elemento ao final do ArrayList, chamaremos add()usando apenas um argumento que representa o valor que estamos inserindo. Neste exemplo, adicionaremos objetos da Carclasse a um ArrayListchamado carShow:

ArrayList<Car> carShow = new ArrayList<Car>();

carShow.add(ferrari);
// carShow now holds [ferrari]
carShow.add(thunderbird);
// carShow now holds [ferrari, thunderbird]
carShow.add(volkswagen);
// carShow now holds [ferrari, thunderbird, volkswagen]

Se quisermos adicionar um elemento em um índice específico do nosso ArrayList, precisaremos de dois argumentos na chamada do método: o primeiro argumento definirá o índice do novo elemento, enquanto o segundo argumento definirá o valor do novo elemento:

// Insert object corvette at index 1
carShow.add(1, corvette);
// carShow now holds [ferrari, corvette, thunderbird, volkswagen]

// Insert object porsche at index 2
carShow.add(2, porsche);
// carShow now holds [ferrari, corvette, porsche, thunderbird, volkswagen]

Ao inserir um valor em um índice especificado, qualquer elemento que apareça depois desse novo elemento terá seu valor de índice deslocado em 1.

Observe também que ocorrerá um erro se tentarmos inserir um valor em um índice que não existe.

Continue lendo: Alunos do curso de Ciência da Computação A da AP

Ao usarArrayList 
Visualização: Descrição do link de carregamento de documentos
métodos
(como add()), os parâmetros de referência e o tipo de retorno de um método devem corresponder ao tipo de elemento declarado do ArrayList. Por exemplo, não podemos adicionar um Integervalor de tipo a um ArrayListde Stringelementos.

Discutimos como especificar o tipo de elemento de um ArrayList; no entanto, é possível criar um ArrayListque contenha valores de tipos diferentes.

No snippet a seguir, assortmenthá um ArrayListque pode armazenar valores diferentes porque não especificamos seu tipo durante a inicialização.

ArrayList assortment = new ArrayList<>();
assortment.add("Hello"); // String
assortment.add(12); // Integer
assortment.add(ferrari); // reference to Car
// assortment holds ["Hello", 12, ferrari]

Neste caso, os itens armazenados neste ArrayListserão considerados Objects. Como resultado, eles não terão acesso a alguns de seus métodos sem fazer alguma conversão sofisticada. Embora esse tipo de ArrayListseja permitido, usar um ArrayListque especifique seu tipo é preferível.

Instruções
Checkpoint 1 Passed
1 .
Criamos um vazio ArrayListchamado toDoList. Hora de adicionar algumas tarefas!

Abaixo de onde inicializamos toDo1, inicialize duas novas Stringvariáveis: toDo2e toDo3.

Defina os valores para qualquer tarefa que você desejar.

Ponto de verificação 2 aprovado
2 .
Use .add()para adicionar toDo1, toDo2, toDo3e toDoList.