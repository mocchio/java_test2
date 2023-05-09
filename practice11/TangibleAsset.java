public abstract class TangibleAsset extends Asset implements Thing {
  // フィールドの設定
  String color;
  
  // フィールドの実装（継承元：Thing）
  double weight;

  // コンストラクタの設定
  public TangibleAsset(String name, int price, String color) {
    super(name, price);
    this.color = color;
  } 

  // メソッドの設定
  public String getColor() {
    return this.color;
  }

  // メソッドの実装（継承元：Thing）
  public double getWeight() {
    return this.weight;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }
}