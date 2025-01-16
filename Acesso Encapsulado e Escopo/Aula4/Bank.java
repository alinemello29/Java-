public class Bank{
  public static void main(String[] args){
    CheckingAccount accountOne = new CheckingAccount("Zeus", 100);
    CheckingAccount accountTwo = new CheckingAccount("Hades", 200);
    CheckingAccount myAccount = new CheckingAccount("Mike", 300);
    myAccount.printBalance();  
  }
}