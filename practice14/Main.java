public class Main {
  public static void main(String[] args) {
    Account a = new Account();
    a.setAccount("4649");
    a.setBalance(1592);
    System.out.println(a);

    Account b = new Account();
    b.setAccount(" 4549");
    b.equals(a);
  }
}