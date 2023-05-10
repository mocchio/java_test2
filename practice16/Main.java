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

    // LinkedHashMapの利用
    Map<Hero, Integer> scores = new LinkedHashMap<>();
    scores.put(h1, 3);
    scores.put(h2, 7);
    for (Hero key : scores.keySet()) {
      int value = scores.get(key);
      System.out.println(key.getName() + "が倒した敵=" + value);
    }
  }
}