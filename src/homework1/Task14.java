package homework1;

import java.util.Scanner;

public class Task14 {
  //14. Создайте программу с двумя переменными целого типа, присвойте им значения, если первая переменная больше второй,
  // то увеличьте её значение на 3, иначе увеличьте значение второй переменной на 8.
  // В конце программы выведите значения обоих чисел на экран.
  public static void task14() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a: ");
    int a = scanner.nextInt();
    System.out.println("Enter b: ");
    int b = scanner.nextInt();
    if(a>b){ a = a + 3;
    } else {b = b + 8; }
    System.out.println("Значение a после сравнения " + a);
    System.out.println("Значение b после сравнения " + b);
  }

}
