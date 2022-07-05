package homework1;

import java.util.Scanner;

public class Task2 {
    //2.Напишите метод, который будет увеличивать каждый элемент массива на 10%.
    public static void task2() {
        int[] num = new int[4];
        num[0] = 20;
        num[1] = 55;
        num[2] = 10;
        num[3] = 105;
        double delta = 1.1;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (num[i] * delta);
            System.out.println(num[i]);
        }
    }
}
