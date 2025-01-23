##  Acesso, Encapsulamento e Escopo
Outros Métodos Privados
Neste documento, vamos explorar o conceito de métodos privados em Java, que muitas vezes são utilizados como métodos auxiliares dentro de uma classe. 🔧✨

O Que São Métodos Privados?
Métodos privados são métodos que não podem ser acessados de fora da classe em que são definidos. Eles são comumente usados para dividir métodos maiores em partes menores e mais gerenciáveis, sem expor esses métodos auxiliares para outras classes.

Exemplo: Classe CheckingAccount
Vamos considerar um exemplo prático usando uma classe CheckingAccount. Um método público, como getAccountInformation(), pode ser usado para imprimir informações sobre a conta, enquanto métodos privados podem realizar cálculos auxiliares.

public class CheckingAccount {
  private String ownerName;
  private double balance;
  private double interestRate;

  public void getAccountInformation() {
    double nextMonthInterest = calculateNextMonthInterest(); // Chamando o método privado
    System.out.println("Owner: " + ownerName);
    System.out.println("Balance: " + balance);
    System.out.println("Next Month Interest: " + nextMonthInterest);
  }

  private double calculateNextMonthInterest() {
    return balance * interestRate; // Cálculo dos juros do próximo mês
  }
}
