import java.util.Scanner;

public class CountGroups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки
        System.out.print("Введите строку, состоящую из нулей и единиц: ");
        String input = scanner.nextLine();

        // Разделение строки на группы по пробелам
        String[] groups = input.trim().split("\\s+");
        int count = 0;

        // Подсчет групп длиной 5 символов
        for (String group : groups) {
            if (group.length() == 5) {
                count++;
            }
        }

        // Вывод результата
        System.out.println("Количество групп с пятью символами: " + count);

        scanner.close();
    }
}
