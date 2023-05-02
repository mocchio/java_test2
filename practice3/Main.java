public class Main {
  public static void main(String[] args) {
    // if文の練習
    int isHungry = 1;
    String food = "バナナ";
    System.out.println("こんにちは");
    if (isHungry == 0) {
      System.out.println("お腹がいっぱいです");
    } else {
      System.out.println("腹ペコです");
      System.out.println(food + "をいただきます");
    }
    System.out.println("ごちそうさまでした");
  }
}