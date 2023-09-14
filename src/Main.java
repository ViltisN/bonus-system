// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Стоимость билета в рублях
        double ticketPrice = 13676;

        // Количество рублей для одной бонусной мили
        int rublesPerMile = 20;

        // Расчитываем количество начисленных миль
        int miles = (int) (ticketPrice / rublesPerMile);

        // Выводим результат на экран
        System.out.println("Количество начисленных миль: " + miles);
    }
}