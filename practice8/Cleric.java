public class Cleric {
  String name;
  int hp = 50;
  static final int MAX_HP = 50;
  int mp = 10;
  static final int MAX_MP = 10;

  // selfAidメソッドの定義
  public void selfAid() {
    System.out.println(this.name + "はセルフエイドを唱えた");
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println("HPが最大まで回復した");
    System.out.println(this.name + "のhpは" + this.hp);
  }

  // prayメソッドの定義
  public int pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒祈った");
    int num = new java.util.Random().nextInt(3);
    int recovery = sec + num;
    if (this.MAX_MP < this.mp + recovery) {
      this.mp = this.MAX_MP;
      System.out.println(this.name + "のmpが最大まで回復した");
      System.out.println(this.name + "のmpは" + this.mp);
      return this.mp;
    } else {
      int current_mp = this.mp + recovery;
      System.out.println(this.name + "のmpが" + recovery + "回復した");
      System.out.println(this.name + "のmpは" + current_mp);
      return current_mp;
    }
  }
}