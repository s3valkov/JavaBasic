import java.util.Scanner;

public class P02_FriendlyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km = Double.parseDouble(scanner.nextLine());
        double kmH = Double.parseDouble(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double sum = Double.parseDouble(scanner.nextLine());

        double lv = (km / 100) * kmH * price;

        if (sum >= lv) {
            System.out.printf("You can take a trip. %.02f money left." ,sum - lv);
        }
        else {
            System.out.printf("Sorry, you cannot take a trip. Each will receive %.02f money." ,sum / 5);

        }
    }
}
