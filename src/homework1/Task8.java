package homework1;

import java.util.Scanner;

public class Task8 {
  //8. Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее каждому числу (используя цикл и оператор if else)
  public static void task8() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the months number:  ");
    int i = scanner.nextInt();
    String[] months = new String[13];
    months[1] = "Январь";
    months[2] = "Февраль";
    months[3] = "Март";
    months[4] = "Апрель";
    months[5] = "Май";
    months[6] = "Июнь";
    months[7] = "Июль";
    months[8] = "Август";
    months[9] = "Сентябрь";
    months[10] = "Октябрь";
    months[11] = "Ноябрь";
    months[12] = "Декабрь";

    if (i > 0 && i < months.length)
    {
      System.out.println(months[i]);
    } else {
      System.out.println("Month not found");
    }
  }
}


