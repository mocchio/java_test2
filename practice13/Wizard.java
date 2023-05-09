public class Wizard {
  // フィールドの定義
  private int hp;
  private int mp;
  private String name;
  private Wand wand;

  // メソッドの定義
  public void heal(Hero h) {
    int basePoint = 10;
    int recovPoint = (int)(basePoint * this.wand.getPower());
    h.setHp(h.getHp() + recovPoint);
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
  }

  // ゲッターの設定
  public int getHp() {
    return this.hp;
  }
  public int getMp() {
    return this.mp;
  }
  public String getName() {
    return this.name;
  }
  public Wand getWand() {
    return this.wand;
  }

  // セッターの設定
  public void setName(String name) {
    if (name == null || name.length() < 3) {
      throw new IllegalArgumentException("名前が短すぎる");
    }
    this.name = name;
  }
  public void setWand(Wand wand) {
    if (wand == null) {
      throw new IllegalArgumentException("杖は必ず必要");
    }
    this.wand = wand;
  }
  public void setHp(int hp) {
    if (hp < 0) {
      this.hp = 0;
    } else {
      this.hp = hp;
    }
  }
  public void setMp(int mp) {
    if (mp < 0) {
      throw new IllegalArgumentException("MPは0以上でなければならない");
    }
    this.mp = mp;
  }
}