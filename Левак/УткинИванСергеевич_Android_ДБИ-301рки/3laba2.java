import java.util.Scanner;

public class Main {
    
    // Функция для вычисления S(x)
    public static double S(double x, double epsilon) {
        double sum = 0;
        double term;
        int k = 0;
        
        do {
            term = Math.pow(x, 2 * k + 1) / (2 * k + 1);
            sum += term;
            k++;
        } while (Math.abs(term) > epsilon);
        
        return sum;
    }

    // Функция для вычисления Y(x)
    public static double Y(double x) {
        return 0.5 * Math.log(1 + x) / (1 - x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Задаем точность
        double epsilon = 1e-4;

        // Запрашиваем ввод a и b
        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        System.out.printf("%-5s %-10s %-10s %-10s %-10s\n", "№", "x", "S(x)", "Y(x)", "Итерации");
        System.out.println("--------------------------------------------------");

        // Вычисляем значения для заданного диапазона от a до b
        for (double x = a; x <= b; x += 0.1) {
            double sValue = S(x, epsilon);
            double yValue = Y(x);
            int iterations = (int) Math.ceil(Math.log(1 / epsilon) / Math.log(2)); // Примерное количество итераций

            System.out.printf("%-5d %-10.2f %-10.6f %-10.6f %-10d\n", (int)((x - a) / 0.1) + 1, x, sValue, yValue, iterations);
        }

        scanner.close();
    }
}
