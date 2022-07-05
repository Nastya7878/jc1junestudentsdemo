package homework1;

import java.util.Scanner;

public class Task18 {
  //18. Напишите метод переводящий рубли в доллары по заданному курсу. В качестве аргументов укажите кол-во рублей и курс.
  public static void task18() {
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("Number of rubles: ");
    double a = scanner1.nextDouble();                // number of rubles

    Scanner scanner2 = new Scanner(System.in);
    System.out.println("Dollar exchange rate: ");
    double b = scanner2.nextDouble();
    double c = a / b;                                // number of dollars
    System.out.println("Amount in dollars: " + c);
  }
}
