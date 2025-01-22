public class Main{
  public static void main(String[] args){
    Person emily = new Person(20);
    emily.hasBirthday();
    System.out.println("New age is: " + emily.age);
    System.out.println("New wisdom is: " + emily.wisdom);
    System.out.println("New fitness is: " + emily.fitness);
  }
}