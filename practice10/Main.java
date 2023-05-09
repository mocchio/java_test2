public class Main {
  public static void main(String[] args) {
    Hero h = new Hero("勇者");
    PoisonMatango pm = new PoisonMatango('A');

    pm.attack(h);
  }
}