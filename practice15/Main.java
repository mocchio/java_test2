import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    // // StringBuilderを用いた文字列の連結
    // StringBuilder sb = new StringBuilder();
    // for (int i = 1; i < 101; i++) {
    //   sb.append(i).append(",");
    // }
    // String s = sb.toString();
    
    // // splitメソッドの使用
    // String[] numbers = s.split("[,]");
    // for (String num : numbers) {
    //   System.out.print(num + "->");
    // }

    // // 文字列検索
    // File f = new File();
    // f.setFolder("c:¥user¥");
    // f.setFile("readme.txt");
    // System.out.println(f.getFolder() + f.getFile());

    // Date型とCalendarクラスを用いた日付の出力
    // Date now = new Date();
    // Calendar c = Calendar.getInstance();
    // c.setTime(now);
    // int day = c.get(Calendar.DAY_OF_MONTH);
    // day += 100;
    // c.set(Calendar.DAY_OF_MONTH, day);
    // Date future = c.getTime();
    // SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    // String s = f.format(future);
    // System.out.println("現在から100日後の日付は" + s + "です");

    // TimeAPIを用いた日付の出力
    LocalDate now = LocalDate.now();
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    LocalDate future = now.plusDays(100);
    String s = future.format(fmt);
    System.out.println("現在から100日後の日付は" + s + "です");
  }
}