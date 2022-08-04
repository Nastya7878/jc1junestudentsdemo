package Books;

import java.util.List;

public class BooksUtil {
  public static <B> void print(List<B> listForPrint) {
    for (B books : listForPrint) {
      System.out.println(books);
    }
  }
}
