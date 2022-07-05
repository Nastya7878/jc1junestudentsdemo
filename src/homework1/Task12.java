package homework1;

import java.util.Scanner;

public class Task12 {
  //12. Напишите программу, в которой используются две переменные логического типа (boolean),
  // присвойте им значения и выведете для каждой переменной на экран строку "истина", если переменная имеет значение true и "ложь", если переменная имеет значение false.
  public static void task12() {
    boolean expression1 = 35000 < 3500;
    boolean expression2 = 55 > 5;

    if (expression1) {
      System.out.println("Первое выражение правдивое.");
    } else {
      if (expression2) {
        System.out.println("Первое выражение ложное, а второе — правдивое.");
      } else {
        System.out.println("Оба выражения ложные.");
      }
    }


  }



}
