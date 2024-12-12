import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] array = {'a', '1', 'b', '3', 'c', '2', 'd', '4', 'e'}; // Пример массива
        transformArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void transformArray(char[] array) {
        int n = array.length;
        char[] result = new char[n];
        int digitIndex = 0;
        int charIndex = n - 1;

        // Перемещаем цифры в начало массива
        for (char c : array) {
            if (Character.isDigit(c)) {
                result[digitIndex++] = c;
            } else {
                result[charIndex--] = c;
            }
        }

        // Копируем результат обратно в исходный массив
        System.arraycopy(result, 0, array, 0, n);
    }
}
