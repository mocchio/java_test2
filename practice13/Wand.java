public class Wand {
  private String name;
  private double power;

  // ゲッターの設定
  public String getName() {
    return this.name;
  }
  public double getPower() {
    return this.power;
  }

  // セッターの設定
  public void setName(String name) {
    if (name.length() < 3) {
      throw new IllegalArgumentException("名前が短すぎる");
    }
    this.name = name;
  }
  public void setPower(double power) {
    if (power < 0.5 || 100.0 < power) {
      throw new IllegalArgumentException("増幅率が異常です");
    }
    this.power = power;
  }
}