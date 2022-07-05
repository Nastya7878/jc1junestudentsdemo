package homework1;

import java.util.Scanner;

public class Task9 {
  //9. Объявить 2 переменных целого типа. Необходимо поменять значения переменных так, чтобы значение первой оказалось во второй, а второй - в первой.
  public static void task9() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a: ");
    int a = scanner.nextInt();
    System.out.println("Enter b: ");
    int b = scanner.nextInt();
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    int temp = a;
    a = b;
    b = temp;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}
