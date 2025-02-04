## HERANÇA E POLIMORFISMO 🍝

Herança na Prática 🛠️


Neste tutorial, vamos explorar como definir uma classe filha para que ela herde de uma classe pai em Java. Usamos a palavra-chave extends para isso, como mostrado abaixo:


class Shape {
  // Membros da classe Shape
}

class Triangle extends Shape {
  // Membros adicionais da classe Triangle
}


Aqui, a classe Triangle herda características da classe Shape, o que significa que ela copia os membros da classe pai. Ao usar herança para estender uma subclasse, criamos um relacionamento "é-um". Por exemplo, um objeto de Triangle é um membro da classe Shape, mas um objeto de Shape não é necessariamente um objeto de Triangle.

## Estrutura de Arquivos 📁
Até agora, trabalhamos apenas com uma classe e um arquivo. A maioria dos programas Java utiliza várias classes, cada uma requerendo seu próprio arquivo. Apenas um arquivo precisa conter o método main(), que é o arquivo executável.

Nota: As várias classes em nosso pacote Java — mesmo que estejam em arquivos diferentes — terão acesso uma à outra, permitindo que possamos instanciar uma classe dentro de outra.