public abstract class Asset {
  // フィールドの設定
  String name;
  int price;

  // コンストラクタの設定
  public Asset(String name, int price) {
    this.name = name;
    this.price = price;
  }

  // メソッドの定義
  public String getName() {
    return this.name;
  }
  public int getPrice() {
    return this.price;
  }
}