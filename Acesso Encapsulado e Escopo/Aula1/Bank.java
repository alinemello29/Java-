public class Bank {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    // Construtor do Bank
    public Bank() {
        accountOne = new CheckingAccount("Zeus", 100);
        accountTwo = new CheckingAccount("Hades", 200);
    }

    // Método principal
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.accountOne.getName());
        System.out.println(bank.accountOne.getBalance());
    }
}