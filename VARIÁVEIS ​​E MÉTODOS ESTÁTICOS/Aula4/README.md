## Variáveis e Métodos Estáticos

Escrevendo Seus Próprios Métodos Estáticos

Agora que já criamos algumas variáveis estáticas, vamos aprender a escrever nossos próprios métodos estáticos. 🛠️✨

O Que São Métodos Estáticos?
Métodos estáticos pertencem à classe como um todo, e não a um objeto específico. Isso significa que você pode acessá-los sem precisar criar uma instância da classe. Abaixo está um exemplo básico de como declarar um método estático:

java

Copiar
public static void myFirstStaticMethod() {
  // Algum código aqui
}
Muitos métodos estáticos funcionam como acessadores ou modificadores de variáveis estáticas:


public static int getMyStaticVariable() {
  return myStaticVariable;
}

public static void setMyStaticVariable(int newValue) {
  myStaticVariable = newValue;
}
Limitações dos Métodos Estáticos
Uma regra importante a ser observada é que métodos estáticos não podem interagir com variáveis de instância não estáticas. Por exemplo, considere uma classe Dog com uma variável de instância chamada age. Se tentarmos usar this.age em um método estático, receberemos um erro, pois this refere-se a um objeto específico, enquanto métodos estáticos estão associados à classe inteira. ⚠️

Instruções
Checkpoint 1
Vamos escrever um método estático chamado averageMoney que imprime a quantia média de dinheiro em todas as máquinas de venda automática do sistema.
O método deve ser void, pois não retorna nada.
Ele deve imprimir totalMoney dividido por numATMs. Lembre-se de que ambas as variáveis são estáticas.
Após escrever o método, chame-o no final do main(). Como este é um método estático, use o nome da classe para chamá-lo, e não um objeto da classe. 💵

public static void averageMoney() {
  System.out.println(totalMoney / numATMs);
}
Checkpoint 2
Agora, vamos tentar fazer averageMoney() interagir com uma variável de instância não estática. Dentro de averageMoney(), tente imprimir this.money. Você deverá ver uma mensagem de erro, pois um método estático não pode interagir com uma variável de instância não estática. ❌
Conclusão
Aprender a escrever e usar métodos estáticos é fundamental para gerenciar dados e funcionalidades que são comuns a todas as instâncias de uma classe. Se tiver dúvidas ou precisar de ajuda, sinta-se à vontade para perguntar! 😊💻