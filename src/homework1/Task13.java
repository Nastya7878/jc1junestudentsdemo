package homework1;

import java.util.Scanner;

public class Task13 {
  //13. Напишите программу, где двум строковым переменным присваиваются значения,
  // третей же строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк. Затем напечатайте значение третьей строковой переменной.
  public static void task13() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter firstName: ");
    String firstName = scanner.nextLine();

    System.out.println("Enter lastName: ");
    String lastName = scanner.nextLine();

    String fullName = "The fullname is : " + firstName + " " + lastName;
    System.out.println(fullName);

  }
}
