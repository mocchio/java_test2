public class Main {
  public static void main(String[] args) {
    // 配列練習
    int[] moneyList = {121902, 8302, 55100};

    // 配列のfor文での取り出し
    for (int i = 0; i < moneyList.length; i ++) {
      System.out.println(moneyList[i]);
    }

    // 配列の拡張for文での取り出し
    for (int money : moneyList) {
      System.out.println(money);
    }
  }
}