public class Main {
    public static void main(String[] args) {
        //newLesson();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

//    public static void newLesson () {
//        System.out.println("Задача 1");
//         // Пишем код для задачи 1
//        short bananas = 200;
//        System.out.println("Бананов " + bananas + " кг.");
//
//        float suger = 3;
//        float onePorstinon = suger / 4;
//        System.out.println("Одна порция сахара весит " + onePorstinon + " кг.");
//
//        byte a = 1;
//        short b = 1;
//        int c = 1;
//        int d = a + b + c;
//        System.out.println("Ответ " + d);
//
//        float g = a + 2f;
//        System.out.println(g);
//    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи

        byte a = 127;
        System.out.println("Значение переменной а с типом byte равно " + a);
        short b = 32767;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 2147483647;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 9223372036854775807L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 1.223f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 2.3332;
        System.out.println("Значение переменной f с типом double равно " + f);
    }


    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        float all = a + b + c + d + e + f + g;
        System.out.println(all);
    }

    public static void task3() {
        System.out.println("Задача 3");
        // У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short allPappers = 480;
        int oneStudent = allPappers / (LP + AS + EA);
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги.");

    }

    public static void task4() {
        System.out.println("Задача 4");
        // Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
        //за 20 минут, в сутки, за 3 дня, за 1 месяц?

        byte bottlesTwoMin = 16;
        byte twoMin = 2;
        byte oneMin = 1;
        int bottlesOneMin = bottlesTwoMin / twoMin;
        System.out.println("За " + oneMin + " минуту машина произвела " + bottlesOneMin + " штук бутылок».");

        int timeOne = oneMin * 20;
        int productOneTime = bottlesOneMin * timeOne;
        System.out.println("За 20 минут машина произвела " + productOneTime + " штук бутылок».");

        int timeTwo = oneMin * 60 * 24;
        int productTwoTime = bottlesOneMin * timeTwo;
        System.out.println("За сутки машина произвела " + productTwoTime + " штук бутылок».");

        int timeThree = oneMin * 60 * 24 * 3;
        int productThreeTime = bottlesOneMin * timeThree;
        System.out.println("За три дня машина произвела " + productThreeTime + " штук бутылок».");

        int timeFour = oneMin * 60 * 24 * 30;
        int productFourTime = bottlesOneMin * timeFour;
        System.out.println("За месяц машина произвела " + productFourTime + " штук бутылок».");
    }

    public static void task5() {
        System.out.println("Задача 5");
        // На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        // На один класс уходит 2 банки белой и 4 банки коричневой краски.
        // Сколько банок каждой краски было куплено?

        byte allPots = 120;
        byte witePotsOneClass = 2;
        byte brownPotsOneClass = 4;
        int PotsInClass = witePotsOneClass + brownPotsOneClass;

        int howManyClasses = allPots / PotsInClass;
        int allWitePots = howManyClasses * witePotsOneClass;
        int allBrownPots = howManyClasses * brownPotsOneClass;

        System.out.println("В школе, где " + howManyClasses + " классов, нужно " + allWitePots + " банок белой краски и " + allBrownPots + " банок коричневой краски.");
    }

    public static void task6() {
        System.out.println("Задача 6");
        // Пишем код для задачи
        byte banana = 5;
        byte weightBanana = 80;
        short milk = 200;
        byte weightMilk100ml = 105;
        float weightMilk1ml = weightMilk100ml / 100f;
        byte iceCream = 2;
        byte weightIceCream = 100;
        byte eag = 4;
        byte weightEag = 70;

        float allWeightGram = (banana * weightBanana) + (milk * weightMilk1ml) + (iceCream * weightIceCream) + (eag * weightEag);
        System.out.println("Вес спортзавтрака " + allWeightGram + " грамм.");

        float allWeightKg = allWeightGram / 1000;
        System.out.println("Вес спортзавтрака " + allWeightKg + " килограмм.");

    }

    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи
        short weightLossMinG = 250;
        short weightLossMaxG = 500;
        byte weightLossNeedKG = 7;
        int weightLossNeedG = weightLossNeedKG * 1000;

        int maxLossDay = weightLossNeedG / weightLossMinG;
        System.out.println("Долго худеть придётся " + maxLossDay + " дней.");
        int minLossDay = weightLossNeedG / weightLossMaxG;
        System.out.println("А вот быстро за " + minLossDay + " дней!");
        int mediumLossDay = (maxLossDay + minLossDay) / 2;
        System.out.println("В среднем где-то за " + mediumLossDay + " дня с:");

    }

    public static void task8() {
        System.out.println("Задача 8");
        // Пишем код для задачи
//        Маша получает 67 760 рублей в месяц.
//                Денис получает 83 690 рублей в месяц.
//                Кристина получает 76 230 рублей в месяц.
        int payMasha = 67760;
        int payDenis = 83690;
        int payKristina = 76230;

        float payMashaNew = payMasha * 1.1f;
        float payDenisNew = payDenis * 1.1f;
        float payKristinaNew = payKristina * 1.1f;

        int payMashaNewYear = (int) payMashaNew * 12;
        int payDenisNewYear = (int) payDenisNew * 12;
        int payKristinaNewYear = (int) payKristinaNew * 12;

        int payMashaYearOld = payMasha * 12;
        int payDenisYearOld = payDenis * 12;
        int payKristinaYearOld = payKristina * 12;

        int differenceMashaForYear = payMashaNewYear - payMashaYearOld;
        System.out.println("Маша теперь получает " + (int) payMashaNew + " рублей. Годовой доход вырос на " + differenceMashaForYear + " рублей");
        int differenceDenisForYear = payDenisNewYear - payDenisYearOld;
        System.out.println("Денис теперь получает " + (int) payDenisNew + " рублей. Годовой доход вырос на " + differenceDenisForYear + " рублей");
        int differenceKrisinaForYear = payKristinaNewYear - payKristinaYearOld;
        System.out.println("Кристина теперь получает " + (int) payKristinaNew + " рублей. Годовой доход вырос на " + differenceKrisinaForYear + " рублей");

        long number = 123_456_789L;
        System.out.println(number);

    }

}

