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
}