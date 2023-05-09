public abstract class TangibleAsset extends Asset {
  // フィールドの設定
  String color;

  // コンストラクタの設定
  public TangibleAsset(String name, int price, String color) {
    super(name, price);
    this.color = color;
  } 

  // メソッドの設定
  public String getColor() {
    return this.color;
  }
}