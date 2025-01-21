## Introdução
Este documento aborda o uso da palavra-chave this em Java, que é fundamental para referenciar a variável de instância atual dentro de uma classe. Vamos explorar como ela é usada em construtores e métodos, além de apresentar exemplos práticos. 🐶✨

public class Dog {
  public String name;

  public Dog(String inputName) {
    name = inputName; // Atribui o nome passado como parâmetro
  }

  public void speakNewName(String name) {
    System.out.println("Hello, my new name is " + this.name); // Usa a variável de instância
  }

  public static void main(String[] args) {
    Dog a = new Dog("Fido");
    Dog b = new Dog("Odie");

    a.speakNewName("Winston"); // "Fido" é impresso; "Winston" é ignorado
    b.speakNewName("Darla"); // "Odie" é impresso; "Darla" é ignorado
  }
}
