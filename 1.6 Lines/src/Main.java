public class Main {
    public static void main(String[] args) {
        lesson1();
        task1();
        task2();
        task3();
    }

    public static void lesson1() {
//        String address = "Адрес, который мы хотим указать при доставке";
//        String street = "манежная";
//        street = "манежная площадь";                                  // String строка — неизменяемый объект. Если нужно изменить строку, то нужно создать новую.
//        String streetTrue = street.replace("м", "М");
//        System.out.println(street);
//        System.out.println("Адрес магазина - " + streetTrue);             // не суммируются, а «склеиваются»

        String phone = "+960-876 98 45";
        phone = phone.replace("-","");                     //метод .replace - замента
        phone = phone.replace("+", "");
        phone = phone.replace(" ", "");
        if (phone.length() == 10) {                                         //равенство длинны строки - .lenght() - это метод, обязательно с ()
            phone = '7' + phone;                                            // Конкатенируем (складываем) строки
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");          //Сообщение об ошибке
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {        // Если в строке ровно 11 символов И если 1-й элемент строки не равен 7
            throw new RuntimeException("Среди нас посторонний");            // Метод .charAt() - берёт определённый символ из строки. Номер символа указывается в ()
        }
        System.out.println("phone = " + phone);
        String expectingPhone = "79608769845";
        if (phone.equals(expectingPhone)) {                                 // Сравниваем phone с expectedPhone с помощью метода equals()
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }

        if (phone.equalsIgnoreCase(expectingPhone)) {                                 // Метод equalsIgnoreCase без учёта регистра
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
//        if (phone.isEmpty()) { Печатаем ошибку и просим пользователя ввести телефон}
//          Метод isBlank() тоже проверяет, равна ли длина строки 0. Но в отличии от isEmpty(), isBlank()  проверяет еще на наличие пробелов:

//        Метод contains() проверяет последовательность символов:
//        Метод endsWith() / startsWith проверяет, на что заканчивается / начинается строка:


    }

    public static void task1() {
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }
    public static void task2() {
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }
    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }





    }






















