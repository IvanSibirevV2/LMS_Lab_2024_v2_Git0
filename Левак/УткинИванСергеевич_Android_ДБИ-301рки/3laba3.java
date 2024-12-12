import java.util.Scanner;

public class Main {
    
    // Метод для вычисления среднего значения без рекурсии
    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ввод размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        
        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        // Вычисление среднего значения без рекурсии
        double average = calculateAverage(array);
        System.out.printf("Среднее значение элементов массива (без рекурсии): %.2f\n", average);
        
        scanner.close();
    }
}
