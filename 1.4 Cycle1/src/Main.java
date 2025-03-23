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

    public static void lesson () {
        for(int i = 0; i <= 5; i++) {
            System.out.println("Итерация цикла " + i);}
//        for(int vesYear = 2020; vesYear <= 2070; vesYear = vesYear + 4) {
//            System.out.println("Високосный год " + vesYear);
//        }
    }

    public static void task1 () {
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        for (int i = 2; i < 17; i=i+2) {
            System.out.println(i);
        }

    }

    public static void task4 () {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i=i-1) {
            System.out.println(i);
        }

    }

    public static void task5 () {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i=i+4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        for (int i = 7; i < 100; i = i + 7) {
            System.out.println(i);
        }

    }

    public static void task7 () {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }


        public static void task8 () {
            System.out.println("Задача 8");

        }


    }



