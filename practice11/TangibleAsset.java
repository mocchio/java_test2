public abstract class TangibleAsset {
  // フィールドの設定
  String name;
  int price;
  String color;

  // コンストラクタの設定
  public TangibleAsset(String name, int price, String color) {
    this.name = name;
    this.price = price;
    this.color = color;
  } 

  // メソッドの設定
  public String getName() {
    return this.name;
  }
  public int getPrice() {
    return this.price;
  }
  public String getColor() {
    return this.color;
  }
}