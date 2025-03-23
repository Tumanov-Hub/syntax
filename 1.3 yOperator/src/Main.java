public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        lesson1();
        lesson2();
        lesson3();
        lesson4();
    }

    public static void lesson1() {
        char color = 'g';

        if (color == 'r') {
            System.out.println("Красный! Ехать запрещено");
        } else {
            if (color == 'y') {
                System.out.println("Желтый!");
            } else {
                System.out.println("Зелёный! Проезд разрешён");
            }
        }
    }

    public static void lesson2() {
        char color = 'g';
        if (color == 'r') {
            System.out.println("Красный! Запрещено ехать");
        } else if (color == 'y') {
            System.out.println("Желтый. Внимание.");
        } else {
            System.out.println("Зеленый! Проезд разрешен.");
        }
    }

    public static void lesson3() {
        char color = 't';
        switch (color) {
            case 'r':
                System.out.println("Красный! Ехать нельзя!");
                break;
            case 'y':
                System.out.println("Желтый! Приготовиться");
                break;
            case 'g':
                System.out.println("Зелёный! Проезд разрешён");
                break;
            case 'l':
                System.out.println("Поворот на лево");
                break;
            default:
                System.out.println("Светофор сломался");
        }
    }

    public static void lesson4() {
        System.out.println("ж");
        int age = 1;
        if (age >= 18) {
            System.out.println("Празднуй!");
            if (age < 21) {
                System.out.println("Выпей сливочного пива!");
            } else {
                System.out.println("Иди куда хочешь и делай что хочешь");
            }
        } else if (age > 7) {
                System.out.println("Иди в школу");
            } else {
                System.out.println("Иди в детский сад");
            }

        int age2 = 6;
        if (age2 == 18) {
            System.out.println("C окончанием школы");
            } else if (age2 == 21) {
            System.out.println("Теперь тебе можно пить алкоголь");
        } else if (age2 == 7) {
            System.out.println("Иди в школу");
        } else {
            System.out.println("Пока сказать нечего");
        }

        int age3 = 17;
        if (age3 >= 18) {
            System.out.println("Ты должен праздновать");
            if (age3 < 21) {
                System.out.println("Выпей сливочного пива!");
            } else {
                System.out.println("Иди куда хочешь, пей что хочешь");
            }
        } else {
            System.out.println("Пока рановато всё");
        }

        int dayOfWeekNumber = 8;

        switch (dayOfWeekNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
                default:
                    System.out.println("такого дня нет");
        }









    }





















}
