public class CheckingAccount {
    private String name;
    private int balance;

    public CheckingAccount(String inputName, int inputBalance) {
        name = inputName;
        balance = inputBalance;
    }

    // Método público para acessar o nome
    public String getName() {
        return name;
    }

    private void addFunds(int fundsToAdd) {
        balance += fundsToAdd;
    }

    private void getInfo() {
        System.out.println("This checking account belongs to " + name + ". It has " + balance + " dollars in it.");
    }
}