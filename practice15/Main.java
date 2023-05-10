public class Main {
  public static void main(String[] args) {
    // StringBuilderを用いた文字列の連結
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < 101; i++) {
      sb.append(i).append(",");
    }
    String s = sb.toString();
    
    // splitメソッドの使用
    String[] numbers = s.split("[,]");
    for (String num : numbers) {
      System.out.print(num + "->");
    }
  }
}