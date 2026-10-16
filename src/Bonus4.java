import java.util.Scanner;

public class Bonus4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int choice = 0;

        int mouseCount = 0;
        int keyboardCount = 0;
        int headphonesCount = 0;
        int laptopStandCount = 0;

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
                    System.out.println("🎉 5% discount applied for buying 5+ units of this item!");
                }

                total = total + itemCost;

                if (choice == 1) {
                    mouseCount += quantity;
                } else if (choice == 2) {
                    keyboardCount += quantity;
                } else if (choice == 3) {
                    headphonesCount += quantity;
                } else if (choice == 4) {
                    laptopStandCount += quantity;
                }

                System.out.println("Added to cart!");
                System.out.println("Current total:" + total + "$");
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("===== ITEMS PURCHASED =====");
        System.out.println("Mouse: " + mouseCount);
        System.out.println("Keyboard: " + keyboardCount);
        System.out.println("Headphones: " + headphonesCount);
        System.out.println("Laptop Stand: " + laptopStandCount);
        System.out.println();

        String mostPurchased = "Mouse";
        int maxQty = mouseCount;

        if (keyboardCount > maxQty) {
            maxQty = keyboardCount;
            mostPurchased = "Keyboard";
        }
        if (headphonesCount > maxQty) {
            maxQty = headphonesCount;
            mostPurchased = "Headphones";
        }
        if (laptopStandCount > maxQty) {
            maxQty = laptopStandCount;
            mostPurchased = "Laptop Stand";
        }

        System.out.println("Most purchased product: " + mostPurchased);
        System.out.println("Quantity: " + maxQty);
        System.out.println();

        System.out.println("===== CHECKOUT =====");
        System.out.println();

        int discountPercent = 0;
        if (total >= 200) {
            discountPercent = 15;
            System.out.println("$200 or more -> 15% discount.");
        } else if (total >= 100) {
            discountPercent = 10;
            System.out.println("$100 - $199 -> 10% discount.");
        } else {
            discountPercent = 0;
            System.out.println("Below $100 -> No discount.");
        }

        int discount = total * discountPercent / 100;
        int finalTotal = total - discount;

        System.out.println();
        System.out.println("Subtotal - " + total + "$");
        System.out.println("Discount (" + discountPercent + "%) - " + discount + "$");
        System.out.println("Final total - " + finalTotal + "$");

        scanner.close();
    }
}