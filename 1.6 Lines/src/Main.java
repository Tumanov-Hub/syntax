public class Main {
    public static void main(String[] args) {
        lesson1();
        task1();
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




    }

    public static void task1() {









    }





    }






















