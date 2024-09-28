//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int salary = 15000;
        int total = 0;
        int monthCount = 0;
        while (total < 2_459_000) {
            total = total + salary;
            monthCount++;
                System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задание №2");
        int count1 = 1;
        int count2 = 10;
        while (count1 <= 10) {
            System.out.print(count1 + " ");
            count1++;
        }
        System.out.println();
        for (; count2 > 0; ) {
            System.out.print(count2 + " ");
            count2--;
        }
        System.out.println();

        System.out.println("Задание №3");
        int population = 12_000_000;
        int born = 17;
        int die = 8;
        int coefficientBornDie = population / 1000;
        for (int year = 0; year <= 10; year++) {
            population = population + (coefficientBornDie * born) - (coefficientBornDie * die);
            System.out.println("Год " + year + ", численность населения составляет" + population);
        } // возможно переменных можно было меньше, но для удобства решил так сделать и меньше вычислений всяких вписывать после for

        System.out.println("Задание №4");
        int deposit = 15_000;
        for (int month = 0; deposit < 12_000_000; month++) {
            deposit = deposit + (deposit / 100 * 7);
            System.out.println("Месяц " + month + ". На счету " + deposit + ", месячная прибыль " + (deposit / 100 * 7));
        } // не совсем понял надо ли каждый месяц выводить или только что-то конкретное?
        // удобно было иметь в задаче точный текст, в который надо вставлять значения

        System.out.println("Задание №5");
        int deposit1 = 15_000;
        for (int month = 0; deposit1 < 12_000_000; month++) {
            deposit1 = deposit1 + (deposit1 / 100 * 7);
            if (month % 6 == 0 || deposit1 >= 12_000_000) {
                System.out.println("Месяц " + month + ". На счету " + deposit1 + ", месячная прибыль " + (deposit1 / 100 * 7));
            } // каждый 6й месяц выводится, но не сказано про последний месяц, когда цель достигнута.
             // добавил вариацию небольшую в if, чтоб выводился и последний месяц тоже, когда цель достигнута, даже если он не кратный 6
        }

        System.out.println("Задание №6");
        int deposit2 = 15_000;
        for (int monthCount1 = 0; monthCount1 <= 9 * 12; monthCount1++) {
            deposit2 = deposit2 + (deposit2 / 100 * 7);
            if (monthCount1 % 6 == 0) {
                System.out.println("Полугодие "+ monthCount1 / 6 + ", сумма накоплений " + deposit2);
            } // не совсем понял отличие от прошлой задачи, суть та же про каждые 6 месяцев, только оформление чуть иное
        }

        System.out.println("Задание №7");
        int friday = 6;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт");
        }

        System.out.println("Задание №8");
        int year = 0;
        int year200ago = 1824;
        int year100ahead = 2124;
        while (year < 2124) {
            year = year + 79;
            if (year > year200ago && year < year100ahead) {
                System.out.println("Год пролёта кометы " + year);
            } // не уверен, правильно ли, ибо для изменения выведения цифр придётся менять параметр if, но работает и ладно
        }
    }
}