public class Main {
  public static void main(String[] args) {
    String title = "新規物件のご案内";
    String address = "test@test.com";
    String text = "いつもお世話になっております。新規物件のご紹介です。";
    introduceOneself();
    email(title, address, text);
    email(address, text);

    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の面積は" + triangleArea + "㎠");

    double circleArea = calcCircleArea(5.0);
    System.out.println("円の面積は" + circleArea + "㎠");
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

  // emailメソッドのオーバーロード
  public static void email(String address, String text) {
    System.out.println(address + "宛に以下のメールを送信しました。");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }

  // calcTriangleAreaメソッドの定義
  public static double calcTriangleArea(double bottom, double height) {
    return bottom * height / 2;
  }

  // calcCircleAreaメソッドの定義
  public static double calcCircleArea(double radius) {
    return radius * radius * 3.14;
  }
}