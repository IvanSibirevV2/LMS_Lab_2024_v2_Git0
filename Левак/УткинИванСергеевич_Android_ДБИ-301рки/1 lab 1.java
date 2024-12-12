public class Main {
    public static void main(String[] args) {
        // Задаем значения переменных
        double x = 14.26;
        double y = -1.22;
        double z = 0.035; // 3.5 * 10^2 = 350

        // Вычисляем значение s
        double cosPart = 2 * Math.cos(x - (2.0 / 3.0)); // 2 * cos(x - 2/3)
        double sinPart = 0.5 + Math.sin(y) * Math.sin(y); // 1/2 + sin^2(y)
        double zSquared = z * z; // z^2
        double denominator = 3 - (zSquared / 5); // 3 - z^2/5
        double fractionPart = 1 + (zSquared / denominator); // 1 + z^2 / (3 - z^2/5)

        // Полное значение s
        double s = cosPart / sinPart * fractionPart;

        // Выводим результат
        System.out.printf("Результат s = %.6f%n", s);
    }
}