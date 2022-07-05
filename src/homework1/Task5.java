package homework1;

public class Task5 {
    public static void task5() {
        //5.Выведите на экран все нечетные числа от 1 до 15 (используйте остаток от деления)
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
