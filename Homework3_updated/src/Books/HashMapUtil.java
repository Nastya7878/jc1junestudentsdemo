package Books;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class HashMapUtil {
  public static Map<Integer, Book> hashMapExample(boolean value) {

    Map<Integer, Book> bookHashMap = new HashMap<>();

    LinkedList<Book> books = LinkedListUtil.linkedListExample();
    for (int i = 0; i < books.size(); i++) {
      if (i == 19 && value) {
        for (int j = 19; j < 25; j++) {
          bookHashMap.put(j, books.get(i));
        }
      }
      bookHashMap.put(i, books.get(i));
    }
    return bookHashMap;
  }
}
