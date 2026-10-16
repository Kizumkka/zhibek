import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1; // Число от 1 до 100
        int guess = 0;

        System.out.println("Угадайте число от 1 до 100.");

        while (guess != targetNumber) {
            System.out.print("Ваше число: ");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("Больше!");
            } else if (guess > targetNumber) {
                System.out.println("Меньше!");
            } else {
                System.out.println("Поздравляю, вы угадали! 🎉");
            }
        }
        scanner.close();
    }
}