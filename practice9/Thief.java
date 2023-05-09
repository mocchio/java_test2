public class Thief {
  String name;
  int hp;
  int mp;

  // コンストラクタ①の定義
  public Thief(String name, int hp, int mp) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }

  // コンストラクタ②の定義
  public Thief(String name, int hp) {
    // コンストラクタ①の呼び出し
    this(name, hp, 5);
  }

  // コンストラクタ③の定義
  public Thief(String name) {
    // コンストラクタ③の呼び出し
    this(name, 40);
  }
}