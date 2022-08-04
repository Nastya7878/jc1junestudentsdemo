package Books;

import Books.Comparators.BookNameComparator;
import Books.Comparators.BookPatronymicComparator;
import Books.Comparators.BookSurnameComparator;

import java.util.List;
import java.util.TreeSet;

public class TreeSetUtil {
  public static TreeSet<Book> bookComparator(String value) {
    List<Book> books = LinkedListUtil.linkedListExample();
    TreeSet<Book> bookCompared = new TreeSet<>();
    switch (value) {
      case ("name") -> {
        BookNameComparator comp1 = new BookNameComparator();
        TreeSet<Book> bookCompared1 = new TreeSet<>(comp1);
        bookCompared1.addAll(books);
        bookCompared = bookCompared1;
      }
      case ("surname") -> {
        BookSurnameComparator comp2 = new BookSurnameComparator();
        TreeSet<Book> bookCompared2 = new TreeSet<>(comp2);
        bookCompared2.addAll(books);
        bookCompared = bookCompared2;
      }
      case ("partonymic") -> {
        BookPatronymicComparator comp3 = new BookPatronymicComparator();
        TreeSet<Book> bookCompared3 = new TreeSet<>(comp3);
        bookCompared3.addAll(books);
        bookCompared = bookCompared3;
      }
      default -> System.out.println("неверное значение");
    }
    return bookCompared;
  }
}







