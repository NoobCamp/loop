//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
            for (int a = 0; a <= 10; a++) {
                System.out.println("Итерация цикла " + a);
            }

        System.out.println("Задание №2");
        for (int b = 10; b >= 0; b--) {
            System.out.println("Итерация цикла " + b);
        }

        System.out.println("Задание №3");
        for (int c = 0; c <= 17; c = c + 2) {
            System.out.println("Только чётные числа от 0 до 17: " + c); // а 0 считается чётным или нет? его тоже выводит ведь
        }
        System.out.println("Задание №4");
        for (int d = 10; d >= -10; d--) {
            System.out.println("Все числа от 10 до -10: " + d);
        }

        System.out.println("Задание №5");
        for (int e = 1904; e <= 2096; e = e + 4) {
            System.out.println(e + " год является високосным");
        }

        System.out.println("Задание №6");
        for (int f = 7; f <= 98; f = f + 7) {
            System.out.println(f);
        }

        System.out.println("Задание №7");
        for (int g = 1; g <= 512; g = g * 2) {
            System.out.println(g);
        }

        System.out.println("Задание №8");
        int salary = 29000;
        int total = 0;
        for (int h = 1; h < 12; h++) {
            total = total + salary;
            System.out.println("Месяц " + h + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задание №9");
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 1; i < 12; i++) {
            total1 = total1 + (total1 / 100);
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }

        System.out.println("Задание №10");
        for (int j = 1; j <= 10; j++) {
            int result = 0;
            result = 2 * j;
            System.out.println("2 * " + j + " = " + result);
        }
    }
}