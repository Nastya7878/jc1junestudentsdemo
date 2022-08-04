package Books;

import java.util.LinkedList;


public class LinkedListUtil {

  public static LinkedList<Book> linkedListExample() {

    LinkedList<Book> books = new LinkedList<>();

    Book book1 = new Book("Антоновские яблоки", "Иван", "Бунин", "Алексеевич");
    Book book2 = new Book("Старуха Изергиль", "Максим", "Горький", "Максимович");
    Book book3 = new Book("Анна Снегина", "Сергей", "Есенин", "Александрович");
    Book book4 = new Book("Облако в штанах", "Владимир", "Маяковский", "Владимирович");
    Book book5 = new Book("Доктор Живаго", "Борис", "Пастернак", "Леонидович");
    Book book6 = new Book("Мастер и Маргарита", "Михаил", "Булгаков", "Афанасьевич");
    Book book7 = new Book("Тихий Дон", "Михаил", "Шолохов", "Александрович");
    Book book8 = new Book("Один день Ивана Денисовича", "Александр", "Солженицын", "Исаевич");
    Book book9 = new Book("Белая гвардия", "Михаил", "Булгаков", "Афанасьевич");
    Book book10 = new Book("Аристократка", "Михаил", "Зощенко", "Михайлович");
    Book book11 = new Book("Миль пардон, мадам!", "Василий", "Шукшин", "Макарович");
    Book book12 = new Book("Утиная охота", "Александр", "Вампилов", "Валентинович");
    Book book13 = new Book("Ева внутри своей кошки", "Габриэль", "Маркес", "Гарсиа");
    Book book14 = new Book("Любишь — не любишь", "Татьяна", "Толстая", "Никитична");
    Book book15 = new Book("Последний бой майора Пугачёва", "Варлам", "Шаламов", "Тихонович");
    Book book16 = new Book("Привычное дело", "Василий", "Белов", "Иванович");
    Book book17 = new Book("Ложится мгла на старые ступени", "Александр", "Чудаков", "Павлович");
    Book book18 = new Book("Прокуратор Иудеи", "Варлам", "Шаламов", "Тихонович");
    Book book19 = new Book("Вываливающиеся старухи", "Даниил", "Хармс", "Иванович");
    Book book20 = new Book("Конармия", "Исаак", "Бабель", "Эммануилович");

    books.add(book1);
    books.add(book2);
    books.add(book3);
    books.add(book4);
    books.add(book5);
    books.add(book6);
    books.add(book7);
    books.add(book8);
    books.add(book9);
    books.add(book10);
    books.add(book11);
    books.add(book12);
    books.add(book13);
    books.add(book14);
    books.add(book15);
    books.add(book16);
    books.add(book17);
    books.add(book18);
    books.add(book19);
    books.add(book20);


    return books;
  }

}

