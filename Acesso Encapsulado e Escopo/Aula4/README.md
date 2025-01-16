# 🔒 Acesso, Encapsulamento e Escopo

## 🔑 A Palavra-Chave Private e Encapsulamento

Até agora, você deve ter percebido o que a palavra-chave `private` faz. Quando uma variável de instância ou método de uma classe é marcada como `private`, isso significa que você só pode acessar essas estruturas de dentro da mesma classe. Vamos revisar nosso exemplo com a classe `DogSchool`:

```java
public class DogSchool {
    public void makeADog() {
        Dog cujo = new Dog("Cujo", 7);
        System.out.println(cujo.age);
        cujo.speak();
    }
}