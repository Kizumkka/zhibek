import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Вводите числа (для выхода введите 0):");
        int number = scanner.nextInt();

        while (number != 0) {
            sum += number;
            count++;

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

            number = scanner.nextInt();
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("\n===== СТАТИСТИКА =====");
            System.out.println("Всего чисел: " + count);
            System.out.println("Сумма: " + sum);
            System.out.println("Максимальное: " + max);
            System.out.println("Минимальное: " + min);
            System.out.println("Среднее: " + average);
        } else {
            System.out.println("Числа не были введены.");
        }

        scanner.close();
    }
}