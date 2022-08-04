package Books;

public class Book {

  String bookTitle;
  String bookAuthorName;
  String bookAuthorSurname;
  String bookAuthorPatronymic;

  public Book() {
  }

  public Book(String bookTitle, String bookAuthorName, String bookAuthorSurname, String bookAuthorPatronymic) {
    this.bookTitle = bookTitle;
    this.bookAuthorName = bookAuthorName;
    this.bookAuthorSurname = bookAuthorSurname;
    this.bookAuthorPatronymic = bookAuthorPatronymic;
  }

  public String getBookTitle() {
    return bookTitle;
  }

  public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  public String getBookAuthorName() {
    return bookAuthorName;
  }

  public void setBookAuthorName(String bookAuthorName) {
    this.bookAuthorName = bookAuthorName;
  }

  public String getBookAuthorSurname() {
    return bookAuthorSurname;
  }

  public void setBookAuthorSurname(String bookAuthorSurname) {
    this.bookAuthorSurname = bookAuthorSurname;
  }

  public String getBookAuthorPatronymic() {
    return bookAuthorPatronymic;
  }

  public void setBookAuthorPatronymic(String bookAuthorPatronymic) {
    this.bookAuthorPatronymic = bookAuthorPatronymic;
  }

  @Override
  public String toString() {
    return "Book{" +
            "bookTitle='" + bookTitle + '\'' +
            ", bookAuthorName='" + bookAuthorName + '\'' +
            ", bookAuthorSurname='" + bookAuthorSurname + '\'' +
            ", bookAuthorPatronymic='" + bookAuthorPatronymic + '\'' +
            '}';
  }
}


