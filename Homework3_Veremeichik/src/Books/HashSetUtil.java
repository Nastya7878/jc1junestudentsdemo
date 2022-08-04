package Books;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class HashSetUtil {
  public static Set<Book> hashSetExample(boolean value) {
    Set<Book> bookSet = new LinkedHashSet<>();
    LinkedList<Book> books = LinkedListUtil.linkedListExample();
    for (int i = 0; i < books.size(); i++) {
      if (i == 19 && value) {
        for (int j = 19; j < 25; j++) {
          bookSet.add(books.get(i));
        }
      }
      bookSet.add(books.get(i));
    }
    return bookSet;
  }
}















