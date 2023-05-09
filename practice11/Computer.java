public class Computer extends TangibleAsset {
  // フィールドの設定
  String makerName;

  // コンストラクタの設定
  public Computer(String name, int price, String color, String makerName) {
    super(name, price, color);
    this.makerName = makerName;
  }

  // メソッドの定義
  public String getMakeName() {
    return this.makerName;
  }
}