public class Main {
  public static void main(String[] args) {
    String title = "新規物件のご案内";
    String address = "test@test.com";
    String text = "いつもお世話になっております。新規物件のご紹介です。";
    introduceOneself();
    email(title, address, text);
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

  // emailメソッドの定義
  public static void email(String title, String address, String text) {
    System.out.println(address + "宛に以下のメールを送信しました。");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}