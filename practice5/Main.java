public class Main {
  public static void main(String[] args) {
    introduceOneself();
  }

  // introduceOneselfメソッドの定義
  public static void introduceOneself() {
    String name = "hoge";
    int age = 24;
    double height = 189.8;
    char zodiac = '寅';
    System.out.println("私の名前は" + name + "です。年齢は" + age + "歳です。");
    System.out.println("身長は" + height + "cm、干支は" + zodiac + "です。");
  }
}