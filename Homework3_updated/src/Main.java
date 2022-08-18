import Books.*;

import java.util.*;


public class Main {
  public static void main(String[] args) {
    LinkedList<Book> books = LinkedListUtil.linkedListExample();
    BooksUtil.print(books);
    System.out.println("Collection size is: " + books.size());
    books.remove(7);
    System.out.println("Collection size is: " + books.size());

    System.out.println("===================After deletion====================");
    BooksUtil.print(books);

    System.out.println("===================For HashMapClass====================");
    Map<Integer, Book> mapBooks = HashMapUtil.hashMapExample(true);
    for (Map.Entry<Integer, Book> entry : mapBooks.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    System.out.println("===================For First Symbol in the Books Title Using Map====================");
    List<Character> value = VowelsSymbol.getValues();
    for (Map.Entry<Integer, Book> entry : mapBooks.entrySet()) {
      String str = entry.getValue().getBookTitle();
      char ch = str.charAt(0);
      if (value.contains(ch)) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
      }
    }

    System.out.println("===================For HashSet Class==================================================");

    Set<Book> bookSet = HashSetUtil.hashSetExample(true);
    for (Book book : bookSet) System.out.println(book);

    System.out.println("==================For First Symbol in the Books Title Using Hashset====================");
    List<Character> values = VowelsSymbol.getValues();
    for (Book book : bookSet) {
      String title = book.getBookTitle();
      char ch = title.charAt(0);
      if (values.contains(ch)) {
        System.out.println(book);
      }
    }
    System.out.println("==================Sorting with Name, Surname, Partonymic====================");

    for (Book book : TreeSetUtil.bookComparator("name")) {
      System.out.println(book);
    }
    System.out.println();
    for (Book book : TreeSetUtil.bookComparator("surname")) {
      System.out.println(book);
    }
    System.out.println();
    for (Book book : TreeSetUtil.bookComparator("partonymic")) {
      System.out.println(book);
    }

    System.out.println("==================StudentsInfo - Print Even Numbers====================");
    TreeSet<Student> students = StudentUtil.studentsExample();
    students.removeIf(student -> student.number % 2 != 0);
    for (Student student : students) System.out.println(student);

    System.out.println("==================Users=====================================");
   /* List<User> users = UserUtil.usersExamples();
    for (User print : users) {
      System.out.println(print);
    } */
    List<User> usersAndFriends = UserUtil.friendCreation();
    for (User user : usersAndFriends) {
      System.out.println(user);
      user.toString();
    }
  }
}














