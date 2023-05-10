import java.util.*;

public class Main {
  public static void main(String[] args) {
    // ArrayListの利用
    List<Hero> heros = new ArrayList<>();
    Hero h1 = new Hero("斉藤");
    Hero h2 = new Hero("鈴木");
    heros.add(h1);
    heros.add(h2);
    for (Hero h : heros) {
      System.out.println(h.getName());
    }
  }
}