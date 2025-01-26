## Variáveis e Métodos Estáticos

Atualização de Métodos Estáticos
Nesta lição, vamos nos aprofundar em como criar classes com seus próprios métodos e variáveis estáticas. 📚✨

O Que São Métodos Estáticos?
Métodos estáticos são aqueles que pertencem a uma classe inteira, não a um objeto específico da classe. Eles são chamados usando o nome da classe seguido pelo operador .. Aqui estão alguns exemplos que já vimos:


double randomNumber = Math.random();
// Armazena um número decimal aleatório entre 0.0 e 1.0 em randomNumber

double number = Double.valueOf("2.5");
// Transforma a String "2.5" em um double
No primeiro exemplo, random() é um método estático da classe Math. Não precisamos criar um objeto da classe Math para usá-lo, apenas chamamos diretamente pelo nome da classe.
Similarmente, valueOf() é um método estático da classe Double que transforma uma String em um double, sem precisar criar um objeto.
Importância do Método main()
Observe que nossos métodos main() têm sido estáticos o tempo todo. Quando o Java executa seu programa, ele chama o método principal da sua classe: YourClassName.main(). 🏁

Instruções
Configuramos um código com alguns métodos estáticos comuns. Estamos usando:

Math.random()
Math.abs()
Integer.toString()
Dê uma olhada na documentação desses métodos e tente descobrir o que eles fazem. 📖

Você também pode explorar a documentação da classe Math, que possui muitos outros métodos estáticos. Encontre um método que pareça interessante para você e experimente usá-lo em seu código! 🚀