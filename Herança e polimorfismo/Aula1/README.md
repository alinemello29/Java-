HERANÇA E POLIMORFISMO
Apresentando a herança
1 minuto
Quando você ouve a palavra “herança”, código pode não ser a primeira coisa que vem à mente; você provavelmente pensa mais em herdar características genéticas, como a cor dos olhos da sua mãe ou um sorriso do seu avô. Mas
Visualização: Descrição do link de carregamento de documentos
herança
também é um recurso importante da programação orientada a objetos em Java.

Suponha que estamos construindo uma Shapeclasse em Java. Podemos dar a ela alguns pontos em 2D, um método para calcular a área e outro método para exibir a forma. Mas o que acontece se quisermos uma classe para um triângulo que tenha alguns métodos específicos do triângulo? Precisamos redefinir todos os mesmos
Visualização: Descrição do link de carregamento de documentos
métodos
que criamos para Shape?

Não! (Ufa.) Para nossa sorte, uma classe Java também pode herdar características de outra classe. Como a Triangleé a Shape, podemos definir Trianglepara que ela herde campos e métodos diretamente de Shape. Uma referência de tipo Shapepode se referir a um objeto de Shapeou a um objeto de Triangle. O princípio de herança orientado a objetos nos poupa da dor de cabeça de redefinir os mesmos membros de classe novamente.

Nossa Triangleclasse herdará todas as características de Shape, mas Triangletambém pode conter seus próprios métodos exclusivos e
Visualização: Descrição do link de carregamento de documentos
variáveis
. Por exemplo, poderíamos ter uma variável de instância chamada hypotenusee um método chamado findHypotenuse()que só pode ser acessado por Trianglereferências de classe. Objetos de Trianglepodem chamar qualquer método contido em Triangleou Shape. Isso nos dá um monte de possibilidades!

Há vários termos que você encontrará com frequência:

Classe pai , superclasse e classe base referem-se à classe da qual outra classe herda (como Shape).
Classe filha , subclasse e classe derivada referem-se a uma classe que herda de outra classe (como Triangle).