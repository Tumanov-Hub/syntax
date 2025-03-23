import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        lesson2();

    }


    public static void task1() {
        System.out.println("Решение задачи №1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;

        double[] two = new double[3];
        two[0] = 1.57;
        two[1] = 7.654;
        two[2] = 9.986;

        int[] three = {10, 11, 12, 13, 14, 15, 16, 17, 18};

        System.out.println("\nРешение задачи №2");
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i]);
            if (i != one.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i]);
            if (i != two.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i]);
            if (i != three.length - 1)
                System.out.print(", ");
        }

        System.out.println("\n \nРешение задачи №3");
        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = two.length - 1; i >= 0; i--) {
            System.out.print(two[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = three.length - 1; i >= 0; i--) {
            System.out.print(three[i]);
            if (i != 0)
                System.out.print(", ");
        }


        System.out.println("\n \nРешение задачи №4");
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i] += 1;
            }
        }
        System.out.println(Arrays.toString(one));
        System.out.println("\n");
    }

    public static void lesson2() {
        int[] rack = new int[10];
// Объявляем массив на 4 элемента
        rack[0] = 12;
        rack[1] = 9;
        rack[2] = 11;
        rack[3] = 13;
        rack[4] = 16;
        rack[5] = 31;
        rack[6] = 0;
        rack[7] = 32;
        rack[8] = 51;
        rack[9] = 0;
// Заполняем значениями 12, 9, 11 и 10

        int[] rack2 = new int[4];
        rack2[0] = 12;
        rack2[1] = 9;
        rack2[2] = 11;
        rack2[3] = 10;

        boolean rackAreEqual = true;
        rackAreEqual = rack.length == rack2.length;


        // Сравниваем длину массива rack с длинной массива rack2
        if (rackAreEqual) {
            for (int i = 0; i < rack.length; i++) {
                if (rack[i] != rack2[i]) {
                    // Если значения внутри массивов не равны
                    rackAreEqual = false;
                    // то rackAreEqual (стеллажиРавны) — false
                }
            }
            if (rackAreEqual) {
                System.out.println("Стеллажи одинаковые");
            } else {
                System.out.println("Стеллажи разные");
            }
        }

        int[] rack3 = {12, 9, 11, 10};
        int sum = 0;
        for (int index = 0; index < rack3.length; index++) {
            sum = sum + rack3[index];
        }

        System.out.println("\n"+ sum);

        int[] rack4 = {12, 9, 11, 10};
        int sum4 = 0;
        for (int element : rack) {
            sum4 = sum4 + element;
        }
        System.out.println(sum4);

        int maxWeight = -1;
        for (final int current : rack) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);
        System.out.println("\n \n \n ");
        for (int i = 0; i < rack.length - 1 && rack[i + 1] != 0; i++) {
            System.out.println(rack[i + 1] - rack[i]);
        }




    }


}



