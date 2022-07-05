package homework1;

public class Task4 {
    //4.Вывести на экран все четные числа от 1 до 100, используя остаток от деления.
    public static void task4() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}