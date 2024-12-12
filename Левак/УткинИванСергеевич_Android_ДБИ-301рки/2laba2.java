import java.util.Scanner;

public class MatrixColumnCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размеров матрицы
        System.out.print("Введите количество строк (N): ");
        int N = scanner.nextInt();
        System.out.print("Введите количество столбцов (M): ");
        int M = scanner.nextInt();

        // Создание матрицы
        int[][] matrix = new int[N][M];
        
        // Ввод элементов матрицы
        System.out.println("Введите элементы матрицы (через пробел):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Ввод номера столбца
        System.out.print("Введите номер столбца (k): ");
        int k = scanner.nextInt() - 1; // Снижаем на 1 для индексации с 0

        // Проверка элементов k-го столбца
        int[] resultArray = new int[1]; // Массив B
        boolean allZeroes = true;

        for (int i = 0; i < N; i++) {
            if (matrix[i][k] != 0) {
                allZeroes = false;
                break;
            }
        }

        // Присвоение значения в массив B
        resultArray[0] = allZeroes ? 0 : 1;

        // Вывод результата
        System.out.println("Результат: " + resultArray[0]);
        
        scanner.close();
    }
}
