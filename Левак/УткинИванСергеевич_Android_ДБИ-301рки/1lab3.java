public class TaylorSeries {

    // Функция для вычисления факториала
    public static double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Функция для вычисления синуса с использованием ряда Тейлора
    public static double sin(double x, int terms) {
        double sinValue = 0;
        for (int n = 0; n < terms; n++) {
            double term = Math.pow(-1, n) * Math.pow(x, 2 * n + 1) / factorial(2 * n + 1);
            sinValue += term;
        }
        return sinValue;
    }

    public static void main(String[] args) {
        double x = 0.1; // Значение, для которого вычисляем синус
        int n = 5; // Количество членов ряда

        double result = sin(x, n);
        System.out.println("Синус " + x + " равен: " + result);
    }
}