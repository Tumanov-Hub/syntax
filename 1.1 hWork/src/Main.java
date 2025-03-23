public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        /*task0();*/
    }

    public static void task1 () {
            System.out.println("Задача 1");
        // Пишем код для задачи 1
        var dog = 8;
        var cat = 3.6;
        var papper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);

    }
    public static void task2 () {
        System.out.println("Задача 2"); 
         // Пишем код для задачи 2
        var dog = 8;
        var cat = 3.6;
        var papper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        papper = papper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 2
        var dog = 8;
        var cat = 3.6;
        var papper = 763789;

        dog = dog - 3.5;
        cat = cat - 1.6;
        papper = papper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
    }



    public static void task4 () {
        System.out.println("Задача 4");
            // Пишем код для задачи 4
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5 () {

        System.out.println("Задача 5");
        // Пишем код для задачи 5

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        var boxerWeightOne = 78.2;
        var boxerWeightTwo = 82.7;
        var allWeight = boxerWeightOne + boxerWeightTwo;
        System.out.println("Общий вес боксёров " + allWeight + " кг.");
        var differenceWeight = boxerWeightOne - boxerWeightTwo;
        System.out.println("Разница в весе " + Math.abs(differenceWeight) + " кг.");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        var boxerWeightOne = 78.2;
        var boxerWeightTwo = 82.7;
        var differenceWeight = boxerWeightTwo -  boxerWeightOne;
        System.out.println(differenceWeight);
        var overload = boxerWeightTwo % boxerWeightOne;
        System.out.println(overload);

    }

    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        var allTime = 640;
        var workTimeWorker = 8;
        var allWorker = allTime / workTimeWorker;
        System.out.println("Всего работников в компании - " + allWorker + " человек.");

        allWorker = allWorker + 94;
        var allTimeNew = allTime / allWorker;
        System.out.println("Если в компании работает " + allWorker + " человек, то всего " + allTimeNew+ " часов работы может быть поделено между сотрудниками");

    }



    /*public static void task0 () {
        System.out.println("Задача 0");
        // Пишем код для задачи 8
        var liftingCapacity = 50;
        var stuffWeight= 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Ещё можно положить " + capacityLeft + " кг вещей.");

        var appleWeight = 2;
        var orangeWeight = 3;
        var fruitsWeight = appleWeight + orangeWeight;
        System.out.println("Общий вес фруктов "+ fruitsWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumberWeight = 2;
        var papperWeight = 2;
        var zucciniWaight = 2;
        var vegetablesWeight = tomatoesWeight + cucumberWeight + papperWeight + zucciniWaight;
        var productsWeight = fruitsWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight +" кг!");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight);

        liftingCapacity = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + liftingCapacity);


        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overload + " кг!");
        //почему 8 твою мать? 64-50=-14 :с



    }*/




}

