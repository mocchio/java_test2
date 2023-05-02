public class Main {
  public static void main(String[] args) {
    // 命令実行文の練習
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    // 文字列入力
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
    // 数値入力
    String ageString = new java.util.Scanner(System.in).nextLine();
    // 文字列を数値に変換
    int age = Integer.parseInt(ageString);
    // 0~3の乱数の設定
    int fortune = new java.util.Random().nextInt(4);
    // インクリメント演算子の利用
    fortune ++;
    System.out.println("占い結果が出ました");
    System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
    System.out.println("1:大吉 2:中吉 3:吉 4:凶");
  }
}