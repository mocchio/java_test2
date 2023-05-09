public class PoisonMatango extends Matango {
  int poisonAttack = 5;

  // メソッドのオーバーライド
  public void attack(Hero h) {
    // 親クラスのattackメソッドの呼び出し
    super.attack(h);
    if (this.poisonAttack > 0) {
      System.out.println("さらに毒の胞子をばら撒いた！");
      h.hp -= h.hp / 5;
      System.out.println((h.hp / 5) + "ポイントのダメージ！");
      this.poisonAttack --;
    }
  }
}