package homework1;

import java.util.Scanner;

public class Task11 {
  public static void task11() {
   //11. Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a: ");
    int a = scanner.nextInt();
    System.out.println("Enter b: ");
    int b = scanner.nextInt();
    System.out.println("Enter c: ");
    int c = scanner.nextInt();
    int max = a > b ? a : b;
    max = max > c ? max : c;
    System.out.println("The maximum num is: " + max);




  }
}
