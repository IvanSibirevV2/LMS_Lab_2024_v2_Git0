import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Пример добавления товаров
        products.add(new Product("Товар A", 10, 15000, LocalDate.of(2023, 1, 15)));
        products.add(new Product("Товар B", 5, 25000, LocalDate.of(2023, 2, 20)));
        products.add(new Product("Товар C", 3, 40000, LocalDate.of(2023, 3, 10)));
        products.add(new Product("Товар D", 2, 60000, LocalDate.of(2023, 5, 5))); // Слишком дорого
        products.add(new Product("Товар E", 8, 30000, LocalDate.of(2023, 6, 1))); // Слишком дорого

        // Текущая дата
        LocalDate currentDate = LocalDate.now();

        // Вывод товаров, которые хранятся больше месяца и стоимость которых превышает 100000 р.
        System.out.println("Список товаров, хранящихся больше месяца и стоимость которых превышает 100 000 р.:");
        products.stream()
                .filter(product -> currentDate.minusMonths(1).isAfter(product.getArrivalDate()) && product.getTotalValue() > 100000)
                .sorted(Comparator.comparing(product -> product.name))
                .forEach(System.out::println);

        // Ожидание нажатия кнопки
        System.out.println("Нажмите Enter, чтобы закрыть программу...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Ожидание ввода от пользователя
        scanner.close();
    }
}

public class Product {
    String name;
    int quantity;
    double price;
    LocalDate arrivalDate;

    public Product(String name, int quantity, double price, LocalDate arrivalDate) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.arrivalDate = arrivalDate;
    }

    public double getTotalValue() {return quantity * price;}

    public LocalDate getArrivalDate() {return arrivalDate;}

    @Override
    public String toString() {return name + " - Количество: " + quantity + ", Цена: " + price + ", Дата поступления: " + arrivalDate;}
}
