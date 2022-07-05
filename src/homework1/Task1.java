package homework1;

import java.util.Scanner;

public class Task1 {
    public static void task1 (){
        //1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести равна 16% от силы тяжести на Земле.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in the Earth:  ");
        float weight = scanner.nextFloat();
        float moonGravity = 0.16f * 9.8f;
        float result = moonGravity * weight;
        System.out.println("Your weight in the Moon:  ");
        System.out.println(result);
    }
}
