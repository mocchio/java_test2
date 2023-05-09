public class PoisonMatango extends Matango {
  int poisonAttack = 5;

  // コンストラクタの設定
  public PoisonMatango(char suffix) {
    super(suffix);
  }

  // メソッドのオーバーライド
  public void attack(Hero h) {
    // 親クラスのattackメソッドの呼び出し
    super.attack(h);
    if (this.poisonAttack > 0) {
      System.out.println("さらに毒の胞子をばら撒いた！");
      h.hp -= h.hp / 5;
      System.out.println((h.hp / 5) + "ポイントのダメージ！");
      this.poisonAttack --;
      System.out.println("お化けキノコ" +this.suffix + "は、あと" + this.poisonAttack + "回毒胞子をばら撒くことができる");
    }
  }
}