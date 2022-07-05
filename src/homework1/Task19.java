package homework1;

import java.util.Scanner;

public class Task19 {
  //19.	Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.
  public static void task19() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Number of days: ");
    double days = scanner.nextDouble();
    double hours = days * 24;
    System.out.println("Number of hours: " + hours);
    double minutes = hours * 60;
    System.out.println("Number of minutes: " + minutes);
    double seconds = minutes * 60;
    System.out.println("Number of seconds: " + seconds);
  }
}




