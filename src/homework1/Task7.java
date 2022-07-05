package homework1;

public class Task7 {
    //7. Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)
    public static void task7() {
        int sum = 0;
        for (int i = 20; i <= 200; i++) {
        sum = sum + i; }
        System.out.println(sum);
    }
}
