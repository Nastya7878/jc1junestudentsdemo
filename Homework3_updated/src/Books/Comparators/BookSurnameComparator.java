package Books.Comparators;

import Books.Book;

import java.util.Comparator;

public class BookSurnameComparator implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    return o1.getBookAuthorSurname().compareTo(o2.getBookAuthorSurname());
  }
}
