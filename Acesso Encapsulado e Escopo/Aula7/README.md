## Acesso, Encapsulamento e Escopo

Usando this com Métodos
Neste documento, exploraremos como a palavra-chave this pode ser utilizada não apenas com variáveis, mas também com métodos em Java. 🔍✨

O Que é this?
A palavra-chave this é uma referência ao objeto atual e pode ser usada para chamar métodos dentro da mesma classe. Aqui está um exemplo básico:

public class Dog {
  public void speak() {
    System.out.println("Woof!");
  }

  public static void main(String[] args) {
    Dog myDog = new Dog(); // Criação de uma instância
    myDog.speak(); // Chamando o método speak()
  }
}
