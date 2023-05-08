public class Main {
  public static void main(String[] args) {
    // インスタンスの生成
    Cleric c = new Cleric();
    c.name = "クロムウェル";
    c.hp = 30;
    c.mp = 6;
    
    // メソッドの呼び出し
    c.selfAid();
    c.pray(3);
  }
}