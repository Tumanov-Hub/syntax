import java.util.zip.Deflater;

public class Main {
    public static void main(String[] args) {
        lesson();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void lesson() {
        System.out.println("Lesson");
        int salary = 65635;
        int total = 0;
        int i = 0;
        for (; total < 1_000_000; i++) {
            total = total + total / 100;
            total = total + salary;
            if (i % 5 == 0) {
                System.out.println("Месяцев " + i + " Итог " + total);
            }
        }
    }


    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();
        for (int o = 10; o > 0; o = o - 1) {
            System.out.print(o + " ");

        }
    }

    public static void task3() {
        System.out.println("\n" + "Задача 3");
        int population = 1_000_000;
        int birthOn1000 = 17;
        int deathOn1000 = 8;
        for (int year = 1; year <= 10; year++) {
            population = ((population / 1000) * birthOn1000) - ((population / 1000) * deathOn1000) + population;
            System.out.println(" Год " + year + ", численность населения составляет " + population);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");

        double Deposit = 15_000;
        double stake = 1.07;
        int mounth = 0;
        while (Deposit < 12_000_000) {
            mounth = mounth + 1;
            Deposit = Deposit * stake;
            System.out.println("Месяц " + mounth + ", числиность накопления " + (int) Deposit);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double Deposit = 15_000;
        double stake = 1.07;
        int mounth = 0;
        while (Deposit < 12_000_000) {
            mounth = mounth + 1;
            Deposit = Deposit * stake;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + ", числиность накопления " + (int) Deposit);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double Deposit = 15_000;
        double stake = 1.07;
        int mounth = 0;
        while (mounth < 108) {
            mounth = mounth + 1;
            Deposit = Deposit * stake;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + ", числиность накопления " + (int) Deposit);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        //Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида: «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
        //В нашем месяце 31 день.
        int Friday = 7;
        int weeks = 3;
        while (weeks > 0) {
            weeks = weeks - 1;
            System.out.println("Сегодня пятница, " + Friday + "-е число. Необходимо подготовить отчет");
            Friday = Friday + 7;
            System.out.println("Сегодня пятница, " + Friday + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int i = 79;
        int lastYears = 200;
        int futureYears = 100;
        int presentYears = 2025;
        while (i < 2125) {
            i = i + 79;
            if (i >= presentYears - lastYears && i <= presentYears + futureYears) {
                System.out.println(i);
            }
        }
    }
}

