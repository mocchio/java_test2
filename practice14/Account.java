public class Account {
  private String accountNumber; // 口座番号フィールド
  private int balance; // 残高フィールド

  // セッター
  public void setAccount(String accountNumber) {
    this.accountNumber = accountNumber.trim();
  }
  public void setBalance(int balance) {
    this.balance = balance;
  }

  // toString()メソッドのオーバーライド
  public String toString() {
    return "¥" + this.balance + "(口座番号：" + this.accountNumber + ")";
  }

  // equals()メソッドのオーバーライド
  public boolean equals(Object o) {
    if (o instanceof Account) {
      Account a = (Account) o;
      if (this.accountNumber.equals(a.accountNumber)) {
        System.out.println("同じ口座です");
        return true;
      } else {
        System.out.println("違う口座です");
        System.out.println("最初からやり直してください");
        return false;
      }
    }
    return false;
  }
}