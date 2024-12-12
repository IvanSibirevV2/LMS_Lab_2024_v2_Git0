import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Выбор функции пользователем
        System.out.println("Выберите функцию f(x):");
        System.out.println("1. sh(x) (гиперболический синус)");
        System.out.println("2. x^2 (квадрат)");
        System.out.println("3. e^x (экспонента)");
        System.out.print("Введите номер функции (1, 2 или 3): ");
        int choice = scanner.nextInt();

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите значение y: ");
        double y = scanner.nextDouble();

        double result = 0;
        double fx = 0;
        String functionName = "";

        // Вычисление f(x)
        switch (choice) {
            case 1:
                fx = Math.sinh(x);
                functionName = "sh(x)";
                break;
            case 2:
                fx = x * x;
                functionName = "x^2";
                break;
            case 3:
                fx = Math.exp(x);
                functionName = "e^x";
                break;
            default:
                System.out.println("Неверный выбор функции.");
                return;
        }

        // Вычисление a в зависимости от xy
        if (x * y > 0) {
            result = Math.pow(fx + y, 2) - Math.cbrt(Math.abs(fx));
        } else if (x * y < 0) {
            result = Math.pow(fx + y, 2) + Math.sin(x);
        } else { // xy == 0
            result = Math.pow(fx + y, 2) + Math.pow(y, 3);
        }

        // Вывод результата
        System.out.printf("Выбранная функция: %s\n", functionName);
        System.out.printf("Результат a = %.6f\n", result);
    }
}
