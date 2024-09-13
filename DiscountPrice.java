import java.util.Scanner;

public class DiscountPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] levelmember = { "Silver", "Gold", "Platinum" };

        System.out.println("Enter your Member level:");
        for (int i = 0; i < levelmember.length; i++) {
            System.out.println((i) + ": " + levelmember[i]);
        }
        System.out.print("Enter your Member level:");
        int level = scanner.nextInt();

        System.out.print("How much price:");
        int price = scanner.nextInt();

        scanner.close();

        int priceall = mathdiscount(level, price);
        System.out.println("Your price is " + priceall + " in your level: " + levelmember[level]);

    }

    public static int mathdiscount(int level, int price) {
        int discount = 0;

        if (level == 2) {
            discount = 5;
        } else if (level == 1 && price >= 1000) {
            discount = 3;
        } else if (level == 0 && price >= 1000) {
            discount = 2;
        }
    
        price -= (price * discount / 100);
        return price;
    }
}