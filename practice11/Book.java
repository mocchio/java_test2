public class Book extends TangibleAsset {
  // フィールドの設定
  String isbn;

  // コンストラクタの設定
  public Book(String name, int price, String color, String isbn) {
    super(name, price, color);
    this.isbn = isbn;
  }

  // メソッドの定義
  public String getIsbn() {
    return this.isbn;
  }
}