package homework1;

public class Task15 {
  //15. Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной программе):
  //for
  //while
  //do while
  public static void task15For() {
    for (int i = 1; i <= 100; i++) {
      System.out.println(i);
    }
  }

  public static void task15While() {
    int i = 1;
    while (i <= 100) {
      System.out.println(i);
      i++;
    }
  }

  public static void task15DoWhile() {
    int i = 1;
    do
    { System.out.println(i++); }
    while (i <= 100);
  }
}


