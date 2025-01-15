# 🐶 Acesso, Encapsulamento e Escopo

## 🔑 O Keyword Public

Após executar o código do exercício anterior, você deve estar desenvolvendo uma intuição sobre o que os keywords `public` e `private` fazem. Estes keywords definem quais partes do seu código têm acesso a outras partes.

### 📚 Definindo Acesso

Podemos definir o acesso de várias partes do nosso código, incluindo:
- **Variáveis de instância** 🌟
- **Métodos** 🔧
- **Construtores** 🏗️
- Até mesmo uma **classe** 📦

Se optarmos por declarar algo como `public`, isso significa que qualquer parte do nosso código pode interagir com ele - mesmo que esse código esteja em uma classe diferente!

### 🐕 Exemplo de Classe Public

Aqui está um exemplo de uma classe `Dog`:

```java
public class Dog {
    public String name;
    public int age;

    public Dog(String input_name, int input_age) {
        name = input_name;
        age = input_age;
    }

    public void speak() {
        System.out.println("Arf Arf! My name is " + name + " and I am a good dog!");
    }
}