public class Account {
  private String accountNumber; // 口座番号フィールド
  private int balance; // 残高フィールド

  // セッター
  public void setAccount(String accountNumber) {
    this.accountNumber = accountNumber;
  }
  public void setBalance(int balance) {
    this.balance = balance;
  }

  // toString()メソッドのオーバーライド
  public String toString() {
    return "¥" + this.balance + "(口座番号：" + this.accountNumber + ")";
  }
}