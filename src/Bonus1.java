import java.util.Scanner;

public class Bonus1 {
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
            } else if (choice > 5) {
                System.out.println("INVALID OPTION.");
                System.out.println("Please choose number from 1 to 5.😡");
                System.out.println();
            } else if (choice < 1 && choice != 5) {
                System.out.println("INVALID QUANTITY.");
                System.out.println("Quantity must be greater than 0.");
                System.out.println();
            }

            if (price > 0) {
                System.out.println();
                System.out.println("You selected: " + name);
                System.out.println("Price - " + price + "$");
                System.out.println();
                System.out.println("Enter quantity: ");
                int quantity = scanner.nextInt();

                int itemCost = price * quantity;

                if (quantity >= 5) {
                    itemCost = (int)(itemCost * 0.95);
                    System.out.println("🎉 5% discount applied for buying 5+ units!");
                }

                total = total + itemCost;

                System.out.println("Added to cart!");
                System.out.println("Current total:" + total + "$");
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("===== CHECKOUT =====");
        System.out.println("Final total - " + total + "$");

        scanner.close();
    }
}