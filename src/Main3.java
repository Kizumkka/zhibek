import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int choice = 0;

        while (choice != 5) {
            System.out.println("======SIMPLE STORE=======");
            System.out.println();
            System.out.println("1. Mouse        - 20$");
            System.out.println("2. Keyboard     - 40$");
            System.out.println("3. Headphones   - 50$");
            System.out.println("4. Laptop Stand - 30$");
            System.out.println("5. Checkout");
            System.out.println();
            System.out.println("Choose a product:");

            choice = scanner.nextInt();

            String name = "";
            int price = 0;

            if (choice == 1) {
                name = "Mouse";
                price = 20;
            } else if (choice == 2) {
                name = "Keyboard";
                price = 40;
            } else if (choice == 3) {
                name = "Headphones";
                price = 50;
            } else if (choice == 4) {
                name = "Laptop Stand";
                price = 30;
            } else if (choice != 5) {
                System.out.println("Wrong number!! Try again.");
                System.out.println();
            }
            if (price > 0) {
                System.out.println();
                System.out.println("You selected: " + name);
                System.out.println("Price - " + price + "$");
                System.out.println();
                System.out.println("Enter quantity: ");
                int quantity = scanner.nextInt();

                total = total + price * quantity;

                System.out.println("Added to cart!");
                System.out.println("Current total:" + total + "$");
                System.out.println();
            }
        }
        System.out.println("Checkout! Total: " + total + "$");
    }
}
