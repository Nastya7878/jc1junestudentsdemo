package homework1;

import java.util.Scanner;
public class Task3 {
    //3.Напишите метод, который будет проверять является ли число палиндромом (одинаково читающееся в обоих направлениях).

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the data:  ");
        String data = scanner.nextLine();
        int length = data.length();
        for (int i = 0; i < (length / 2); i++) {
            if (data.charAt(i) != data.charAt(length - i - 1)) {
               System.out.println("The data " + data + " not palidrome");
            }
        }
        System.out.println("The data " + data + " is palidrome");
    }
}








