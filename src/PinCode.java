import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctPin = 1234;
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Введите PIN-код: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("Доступ разрешен!");
                break;
            } else {
                attempts--;
                System.out.println("Неверный PIN. Осталось попыток: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Карта заблокирована.");
        }
        scanner.close();
    }
}
