APRENDA JAVA: ARRAYS
Criando uma matriz vazia
11 minutos
Também podemos criar espaços vazios
Visualização: Descrição do link de carregamento de documentos
matrizes
e então preencha os itens um por um. Arrays vazios devem ser inicializados com um tamanho fixo:

String[] menuItems = new String[5];

Uma vez que você declara esse tamanho, ele não pode ser alterado! Este array sempre será de tamanho 5.

Depois de declarar e inicializar, podemos definir cada índice do array como um item diferente:

menuItems[0] = "Veggie hot dog";
menuItems[1] = "Potato salad";
menuItems[2] = "Cornbread";
menuItems[3] = "Roasted broccoli";
menuItems[4] = "Coffee ice cream";

Este grupo de comandos tem o mesmo efeito que atribuir o array inteiro de uma só vez:

String[] menuItems = {"Veggie hot dog", "Potato salad", "Cornbread", "Roasted broccoli", "Coffee ice cream"};

Também podemos mudar um item depois que ele foi atribuído! Digamos que este restaurante está mudando seu prato de brócolis para um de couve-flor:

menuItems[3] = "Baked cauliflower";

Agora, a matriz se parece com:

["Veggie hot dog", "Potato salad", "Cornbread", "Baked cauliflower", "Coffee ice cream"]

Continue lendo: Alunos do curso de Ciência da Computação A da AP

Quando criamos newum array vazio, cada elemento do array é inicializado com um valor específico dependendo do tipo do elemento:

Tipo de dados	Valor Inicializado
Inteiro	0
dobro	0.0
booleano	false
Referência	null
Por exemplo, considere as seguintes matrizes:

String[] my_names = new String[5];
int[] my_ages = new int[5];

Como uma String é uma referência a um Objeto, my_namesconterá cinco nulls. my_agesconterá cinco 0s para começar.

Instruções
Ponto de verificação 1 aprovado
1 .
Declaramos um Stringarray chamado favoriteArticlescomo um campo de instância.

Acompanharemos os 10 artigos favoritos do usuário nessa matriz de strings.

No construtor, Newsfeed(), inicialize favoriteArticlescomo uma nova matriz String vazia de tamanho 10.

Ponto de verificação 2 aprovado
2 .
Criamos um setFavoriteArticle()método que aceita favoriteIndexe newArticlecomo parâmetros.

Dentro de setFavoriteArticle(), defina o valor da favoriteArticlesmatriz no índice favoriteIndexpara o valor de newArticle.

Por exemplo, se chamássemos setFavoriteArticle(2, "Celebrity Hands Throughout the Decades"), o valor de favoriteArticlesno índice 2 seria definido como “Mãos de celebridades ao longo das décadas”.

Mude para Main.java e execute o código.