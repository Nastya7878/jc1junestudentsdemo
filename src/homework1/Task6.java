package homework1;

public class Task6 {
    //6. Вывести на экран все четные числа от 1 до 100, не используя остаток от деления (используя только цикл for).
    public static void task6() {

        for (int i = 1; i <= 100; i++) {
            String str = Integer.toString(i);
            char[] chars = str.toCharArray();
            char lastNum = chars[chars.length - 1];

            if (lastNum == '0' || lastNum == '2' || lastNum == '4' || lastNum == '6' || lastNum == '8') {
                System.out.println(str);
            }
        }
    }
}
