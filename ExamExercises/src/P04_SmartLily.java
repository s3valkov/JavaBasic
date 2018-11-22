import java.util.Scanner;

public class P04_SmartLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());
        double money = 0;
        double toy = 0;
        double present = 10;
        for (double i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money += present - 1;
                present += 10;
            } else {
                toy++;
            }
        }
        double sum = money + toy * toyPrice;
        if (sum >= price) {
            System.out.printf("Yes! %.2f\n", sum - price);
        } else {
            System.out.printf("No! %.2f", price - sum);
        }
    }
}
