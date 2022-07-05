package homework1;

import java.util.Scanner;

public class Task16 {
  //16. Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
  // Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35.
  // Минимум, максимум и шаг указываются пользователем (можно захардкодить).

  public static void task16() {
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("Enter min value: ");
    int a = scanner1.nextInt();
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("Enter max value: ");
    int b = scanner2.nextInt();
    Scanner scanner3 = new Scanner(System.in);
    System.out.println("Enter the gap: ");
    int c = scanner3.nextInt();

    for (int i = a; i <= b; i += c) {
      System.out.println(i);

    }
  }
}


