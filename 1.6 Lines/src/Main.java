public class Main {
    public static void main(String[] args) {
        lesson1();
    }

    public static void lesson1() {
        String address = "Адрес, который мы хотим указать при доставке";
        String street = "манежная";
        street = "манежная площадь";                                  // String строка — неизменяемый объект. Если нужно изменить строку, то нужно создать новую.
        String streetTrue = street.replace("м", "М");
        System.out.println(street);
        System.out.println("Адрес магазина - " + streetTrue);             // не суммируются, а «склеиваются»












    }





















}
